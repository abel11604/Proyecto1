
/*
	Trigger que verifica que tipo de transaccion es, cuando se realiza una transaccion, esta funcion se ejecuta y si 
    la transaccion es por folio y pw (0) se generan las pw y el folio. 
    
    Si no, se ejecuta pero no hae nada
*/

DELIMITER $$
CREATE TRIGGER tipo_transaccion
 AFTER INSERT ON transaccion
 FOR EACH ROW
 BEGIN
	DECLARE id int;
    
	SET id = NEW.id_transaccion;
	IF NEW.tipo_transaccion = false THEN
    INSERT INTO TransaccionFolioCliente (id_transaccion,estado) VALUES (NEW.id_transaccion, 0); # crea la transaccion por folio y pw
    CALL folio(id); # a la transaccion creada, inserta el folio
    CALL passw(id); # a la transaccion creada, inserta el pw
	END IF;
    
 END$$

DELIMITER ;

/*
Procedimiento almacenado para generar una password aleatoria
*/
DELIMITER $$
CREATE PROCEDURE passw(IN idtransaccion int) # Recibe como parametro el id de la transaccion insertada, el cual viene de un trigger
BEGIN 
	DECLARE caracteres VARCHAR(100) DEFAULT 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'; # La password es una combinacion de todos estos caracteres
	DECLARE passsword VARCHAR(255) DEFAULT ''; # Declaramos la que sera la password, empieza estando vacia, adelante se agregan los caracteres
	DECLARE i INT DEFAULT 0; # contador, en este caso sera menor a 8, ya que el requerimiento es que la pw sea de 8 caracteres
WHILE i < 8 DO
SET passsword := CONCAT(passsword,     SUBSTRING(caracteres, FLOOR(1 + RAND() * LENGTH(caracteres)), 1)         ); 
	#CONCAT: concatena cadenas de texto
    #SUBSTRING: Extrae una parte del texto, en este caso, va extraer una letra de indice aleatorio. La longitud es especificada de un solo caracter
			# caracteres es la cadena a subtraer texto 
			#FLOOR( 1 -> se le suma uno, por si sale cero, ya que RAND() es un valor aleatorio entre 0 y 1, multiplicado por long caracteres, tenemos un indice, de tam 1
    #FLOOR: Redondea y da el numero entero mas bajo. En este caso, el entero abajo de 1 + num aleatorio * longitud de los caracteres
    #LENGTH: Devuelve el numero de caracteres, en este caso de la variable "caracteres"
    # := -> asignar valor
SET i := i + 1; # Aumentamos el contador
END WHILE;
UPDATE TransaccionFolioCliente SET password_transaccion = passsword WHERE id_transaccion = idtransaccion; # Actualizamos la transferencia que se realizo, seteamos la pw a la que creamos
END $$
DELIMITER ; 








/*
	Mismo procedimiento que en el procedimiento passw(), pero para crear el folio
*/
DELIMITER $$
CREATE PROCEDURE folio(IN idtransaccion int)

BEGIN 
	DECLARE caracteresFolio VARCHAR(100) DEFAULT 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
	DECLARE folio VARCHAR(255) DEFAULT '';
DECLARE i INT DEFAULT 0;
WHILE i < 20 DO  # La unica diferencia, es que, en este caso vamos a hacer un folio de 20 caracteres, el problema no especifico del folio
	SET folio := CONCAT(folio, SUBSTRING(caracteresFolio, FLOOR(1 + RAND() * LENGTH(caracteresFolio)), 1));
	SET i := i + 1;
END WHILE;
UPDATE TransaccionFolioCliente SET folio_transaccion = folio WHERE id_transaccion = idtransaccion;

END$$
DELIMITER ;






/*
	Este procedimiento es solo para mostrar la informacion de un cliente, sus transacciones
    se pasa como parametro el id de la cuenta, el cual pertenece a un cliente.
    Si el cliente tiene varias cuentas, aqui se introduce la cuenta que quiera ver.
    
    No utilizamos funcion aqui porque una funcion no puede retornar una tabla, puede retornar
    valores en linea sin formato, pero no era muy presentable, asi que usamos un procedure
    
*/

DELIMITER $$ 
CREATE PROCEDURE verHistorial(IN id INT)
BEGIN
	SELECT
		id_transaccion AS 'Id',
        fecha_transaccion AS 'Fecha',
        hora_transaccion AS 'Hora',
        cantidad AS 'Monto',
			CASE 
				# para que no se muestren 0 y 1, le damos formato usando WHEN
                # tambien se pudo cambiar el atributo de la columna tipo_transaccion a un ENUM
                # que guarde valores de 'folio' y 'cliente' pero es mas facil operar con true y false
				WHEN tipo_transaccion = 0 THEN 'Folio'
                WHEN tipo_transaccion = 1 THEN 'Cliente'
			END AS 'Tipo de Transacción'

    FROM
		transaccion
	WHERE id = transaccion.id_cuenta;
END$$
DELIMITER ;





/*
	Trigger para calcular la edad cuando se inserte un cliente
*/
DELIMITER $$
CREATE TRIGGER calcularEdad
BEFORE INSERT ON cliente
FOR EACH ROW 
BEGIN
    SET NEW.edad = TIMESTAMPDIFF(YEAR,NEW.fecha_nacimiento,CURDATE());
    # metodo NEW y atributo edad, sql sabe cual editar, y le setea la edad
END$$

DELIMITER ;





/*
	Este trigger establece automaticamente la hora y la fecha cuando se genera una transaccion
*/

DELIMITER $$
CREATE TRIGGER establecer_fecha_hora_transaccion
BEFORE INSERT ON transaccion
FOR EACH ROW 
BEGIN
	
	SET NEW.fecha_transaccion = CURDATE();
    SET NEW.hora_transaccion = CURTIME();

END$$

DELIMITER ;



/*
	Procedimiento almacenado para realizar transferencias. Pide como parametros cuenta destino, monto, y cuenta origen
    
	Tambien esta la opcion de hacer este metodo de transferencia en la capa de aplicacion, pero optamos por hacerlo 
		aqui para usar transacciones directamente en la bd y hacerlo un poco mas seguro
*/

DELIMITER $$
CREATE PROCEDURE transferencia(IN id_cuenta_origen INT, monto INT, id_cuenta_destino INT)
BEGIN 
			# Declaramos las variables que seran los saldos de las cuentas
		DECLARE saldo_origen INT; 
        
        # Inicializamos esas variables al saldo que tengan las cuentas
        SELECT saldo INTO saldo_origen FROM cuenta WHERE id_cuenta = id_cuenta_origen;
        
			# Si el saldo de la cuenta origen, es mayor al monto, significa que si tiene dinero suficiente para la transferencia
        IF saldo_origen >= monto THEN
        
				# Hacemos una transaccion para cumplir con el principio ACID
			START TRANSACTION;
            UPDATE cuenta SET saldo = saldo - monto WHERE id_cuenta = id_cuenta_origen;
            UPDATE cuenta SET saldo = saldo + monto WHERE id_cuenta = id_cuenta_destino;
				# El usuario tiene dinero, y no hubo errores, guardamos todos los cambios
            COMMIT; 
            
		else
				# El usuario no tiene suficiente dinero, revertimos todos los cambios
			ROLLBACK;
		END IF;
        
	

END$$

DELIMITER ;


















-- ---------------------------------------------------------- TABLAS ------------------------------------------------------------------------------------

/*
	Datos del cliente, al ser un banco, todos los datos son necesarios
    FALTA CALCULAR LA EDAD
*/
CREATE TABLE Cliente(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	apellido_paterno VARCHAR(50) NOT NULL,
	apellido_materno VARCHAR(50) NOT NULL,
	calle VARCHAR(255) NOT NULL,
	colonia VARCHAR(255),
	codigo_postal VARCHAR(255) NOT NULL,
	fecha_nacimiento DATE NOT NULL,
	edad INT NULL DEFAULT 0
    
);


/*
	Datos de la cuenta del cliente
    Un cliente puede tener una cuenta
    La cuenta no se puede borrar, puede ser cancelada o actualizada, pero no borrada
*/
CREATE TABLE Cuenta(
	id_cuenta INT PRIMARY KEY NOT NULL,     -- numero de cuenta
	fecha_apertura DATE NOT NULL,
	saldo BIGINT,	
    id_cliente INT NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id)
);



/*
	Una cuenta puede generar 1:N transacciones
    Una transaccion, puede ser de un cliente, o puede ser generada por folio y pw
    
		TIPO OPERACION:
			0 = NO ES CLIENTE -> SE DESENCADENA TRIGGER, SE GENERA PW Y FOLIO
            1 = ES CLIENTE -> TRANSFERENCIA NORMAL
*/
CREATE TABLE Transaccion(
	id_transaccion INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	fecha_transaccion DATE NULL DEFAULT NULL,
	hora_transaccion TIME NULL DEFAULT NULL, 
	cantidad INT NOT NULL, 
    tipo_transaccion BOOLEAN DEFAULT TRUE, -- 0 NO ES CLIENTE, 1 ES CLIENTE. La funcion verHistorial() le da el formato para que se vea el tipo de transaccion
    id_cuenta INT NOT NULL,
    FOREIGN KEY (id_cuenta) REFERENCES Cuenta(id_cuenta)
    
);
# TIME: 'HH:MM:SS'
# DATE: 'YYYY-MM-DD'

/*
	En caso de que sea una transferencia normal de un cliente
*/
CREATE TABLE TransaccionNormalCliente(
id_transaccion INT, -- guardamos sin pk, solo referenciamos a la entidad padre
FOREIGN KEY  (id_transaccion) REFERENCES   Transaccion(id_transaccion)
);




/*
	Si noe s cliente, guardamos los datos
		folio_transaccion = empieza siendo null, trigger se activa -> se genera folio y se asigna a este atributo
        password_transaccion = lo mismo
        estado = 
			0 -> no se ha cobrado, deberia de empezar un timer, si 'estado' no cambia a '1', el timer va seguir hasta expirar y eliminar los datos por seguridad
            1 -> ya se cobro, la transaccion se guarda en el historial
		tiempo = aqui  se deberia guardar el tiempo actual, con 10 minutos mas, y se valida que no hayan pasado los 10 minutos. NOW() > tiempo -> expira y se elimina
*/
CREATE TABLE TransaccionFolioCliente(
id_transaccion INT,
folio_transaccion VARCHAR(255),
password_transaccion VARCHAR(8),
estado boolean DEFAULT FALSE,
-- tiempo TIMESTAMP,
FOREIGN KEY  (id_transaccion) REFERENCES Transaccion(id_transaccion )
);


