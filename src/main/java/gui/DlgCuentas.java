package gui;

import control.Control;
import dao.ConexionDB;
import dao.CuentaDAO;
import dao.TransaccionDAO;
import dao.interfaces.IConexion;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.Cliente;
import objetos.Cuenta;
import objetos.Transaccion;

/**
 *
 * @author fabri
 */
public class DlgCuentas extends javax.swing.JDialog {

<<<<<<< HEAD
 
=======
    private final DefaultTableModel modelTable;
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
    private final Cliente cliente;
    private final CuentaDAO cuentaDao;
    private final IConexion con;
    private final Cuenta cuenta;
<<<<<<< HEAD
    private final Control control;
    
    
=======
    private final TransaccionDAO transaccionDao;
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69

    public DlgCuentas(java.awt.Frame parent, boolean modal, Cliente cliente, Cuenta cuenta, CuentaDAO cuentaDao) {
        super(parent, modal);
        control=new Control();
         this.cliente = cliente;
        this.cuenta=cuenta;
        initComponents();
        con = new ConexionDB("jdbc:mysql://localhost:3306/banco", "root", "root");
<<<<<<< HEAD
       
        cuentaDao = new CuentaDAO(con);
        //lista.setSelectionForeground(Color.red);
        getContentPane().add(panelTransf);
        panelTransf.setBounds(300, 170, 687, 415);
        getContentPane().add(panelConfig);
        panelConfig.setBounds(300,170,687,415);
        panelConfig.setVisible(false);
        // x,   y,  WIDTH, HEIGHT
=======
        this.cliente = cliente;
        this.cuenta = cuenta;
        this.cuentaDao=cuentaDao;
        modelTable = new DefaultTableModel();
        transaccionDao = new TransaccionDAO(con);

        String ids[] = {"Transaccion ", "Fecha ", "Cantidad "};
        modelTable.setColumnIdentifiers(ids);
        tablaHistorial.setModel(modelTable);


        getContentPane().add(componentTransferencia);
        componentTransferencia.setBounds(300, 170, 687, 415);
        getContentPane().add(componentTablaHistorial);
        componentTablaHistorial.setBounds(300, 170, 687, 415);
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        panelTransf = new javax.swing.JPanel();
=======
        componentTransferencia = new javax.swing.JPanel();
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
        jLabel4 = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JTextField();
        labelDestino = new javax.swing.JTextField();
<<<<<<< HEAD
        panelConfig = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cerrarSesionBtn = new javax.swing.JLabel();
        regresarBtn = new javax.swing.JLabel();
        cancelarCuentaBtn = new javax.swing.JLabel();
        ActualizarBtn = new javax.swing.JLabel();
=======
        componentPanelConfig = new javax.swing.JPanel();
        componentTablaHistorial = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        btnAceptar2 = new javax.swing.JLabel();
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
        btnTransf = new javax.swing.JLabel();
        txtBienvenido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JLabel();
        btnFolio1 = new javax.swing.JLabel();
        btnAjustes = new javax.swing.JLabel();

<<<<<<< HEAD
        panelTransf.setVisible(false);
=======
        componentTransferencia.setVisible(false);
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel4.setText("Saldo Actual:");

        txtSaldoActual.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        txtSaldoActual.setBackground(new Color(176, 186, 195));

        btnRegresar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel6.setText("Monto");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel7.setText("Numero de Cuenta");

        labelCantidad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 17)); // NOI18N
        labelCantidad.setBorder(null);
        labelCantidad.setBackground(new Color(176, 186, 195));
        labelCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelCantidadActionPerformed(evt);
            }
        });

        labelDestino.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        labelDestino.setBorder(null);
        labelDestino.setBackground(new Color(176, 186, 195));
        labelDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout componentTransferenciaLayout = new javax.swing.GroupLayout(componentTransferencia);
        componentTransferencia.setLayout(componentTransferenciaLayout);
        componentTransferenciaLayout.setHorizontalGroup(
            componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentTransferenciaLayout.createSequentialGroup()
                .addGroup(componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(componentTransferenciaLayout.createSequentialGroup()
                        .addGroup(componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componentTransferenciaLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addGroup(componentTransferenciaLayout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componentTransferenciaLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componentTransferenciaLayout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(78, 78, 78)))
                .addGroup(componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(componentTransferenciaLayout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(54, 54, 54)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        componentTransferenciaLayout.setVerticalGroup(
            componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentTransferenciaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(componentTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnRegresar))
                .addGap(32, 32, 32))
        );

<<<<<<< HEAD
        setVisible(false);
        panelConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 17)); // NOI18N
        jLabel1.setText("Mi cuenta");
        panelConfig.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 17)); // NOI18N
        jLabel2.setText("Numero de cuenta: "+cuenta.getIdCuenta());
        panelConfig.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 17)); // NOI18N
        jLabel3.setText("Propietario: "+cliente.getNombre()+" "+cliente.getApellido_paterno()+" "+cliente.getApellido_materno());
        panelConfig.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cerrarSesionBtn.setBackground(new java.awt.Color(255, 255, 153));
        cerrarSesionBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 17)); // NOI18N
        cerrarSesionBtn.setText("Cerrar sesión");
        cerrarSesionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionBtnMouseClicked(evt);
            }
        });
        panelConfig.add(cerrarSesionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        regresarBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 17)); // NOI18N
        regresarBtn.setText("Regresar");
        regresarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarBtnMouseClicked(evt);
            }
        });
        panelConfig.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cancelarCuentaBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 17)); // NOI18N
        cancelarCuentaBtn.setText("Cancelar cuenta");
        panelConfig.add(cancelarCuentaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        ActualizarBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 17)); // NOI18N
        ActualizarBtn.setText("Actualizar Datos");
        ActualizarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarBtnMouseClicked(evt);
            }
        });
        panelConfig.add(ActualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
=======
        javax.swing.GroupLayout componentPanelConfigLayout = new javax.swing.GroupLayout(componentPanelConfig);
        componentPanelConfig.setLayout(componentPanelConfigLayout);
        componentPanelConfigLayout.setHorizontalGroup(
            componentPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        componentPanelConfigLayout.setVerticalGroup(
            componentPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69

        componentTablaHistorial.setVisible(false);
        componentTablaHistorial.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                componentTablaHistorialformComponentShown(evt);
            }
        });

        jScrollPane1.setBorder(null);

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Monto", "Transaccion"
            }
        ));
        jScrollPane1.setViewportView(tablaHistorial);

        btnAceptar2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        btnAceptar2.setText("Aceptar");
        btnAceptar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout componentTablaHistorialLayout = new javax.swing.GroupLayout(componentTablaHistorial);
        componentTablaHistorial.setLayout(componentTablaHistorialLayout);
        componentTablaHistorialLayout.setHorizontalGroup(
            componentTablaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentTablaHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(componentTablaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, componentTablaHistorialLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar2)))
                .addContainerGap())
        );
        componentTablaHistorialLayout.setVerticalGroup(
            componentTablaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentTablaHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnAceptar2)
                .addGap(17, 17, 17))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnTransf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 27)); // NOI18N
        btnTransf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTransf.setText("Transferir");
        btnTransf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransfMouseClicked(evt);
            }
        });

        txtBienvenido.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 31)); // NOI18N
        txtBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 31)); // NOI18N
        jLabel5.setText("¿Qué operación desea realizar?   ");
        //jLabel5.setLocation(625, 100);

        btnHistorial.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 27)); // NOI18N
        btnHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHistorial.setText("Estado de Cuenta");
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistorialMouseClicked(evt);
            }
        });

        btnFolio1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 27)); // NOI18N
        btnFolio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFolio1.setText("Generar Folio");
        btnFolio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFolio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFolio1MouseClicked(evt);
            }
        });

<<<<<<< HEAD
        btnAjustes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 27)); // NOI18N
        btnAjustes.setText("Ajustes");
        btnAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjustesMouseClicked(evt);
            }
        });
        getContentPane().add(btnAjustes);
        btnAjustes.setBounds(650, 200, 130, 30);
=======
        btnAjustes.setFont(new java.awt.Font("Yu Gothic UI", 0, 27)); // NOI18N
        btnAjustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAjustes.setText("Ajustes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnTransf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(btnFolio1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(btnAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFolio1)
                    .addComponent(btnAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistorial)
                    .addComponent(btnTransf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(383, Short.MAX_VALUE))
        );
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransfMouseClicked
<<<<<<< HEAD
mostrarPanelTransferencias();
=======
        mostrarPanelTransferencias();
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
    }//GEN-LAST:event_btnTransfMouseClicked


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtBienvenido.setText("Bienvenido " + cliente.getNombre());


    }//GEN-LAST:event_formWindowOpened


    private void btnHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialMouseClicked
        mostrarHistorial();
        componentTablaHistorial.setVisible(true);

    }//GEN-LAST:event_btnHistorialMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked

        mostrarDlgPrincipal();


    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        String idDestino = labelDestino.getText();
        int cantidad = Integer.parseInt(labelCantidad.getText());
        if (cantidad > cuenta.getSaldo()) {
            JOptionPane.showMessageDialog(this, "No tienes suficiente saldo, la operacion ha sido revertida");
        } else {

            cuentaDao.transferencia(cuenta.getIdCuenta(), cantidad, idDestino);
            transaccionDao.registrarTransaccion(new Transaccion(true, cantidad, cuenta));
            JOptionPane.showMessageDialog(this, "Operacion Exitosa");
            mostrarDlgPrincipal();
        }

    }//GEN-LAST:event_btnAceptarMouseClicked

    private void labelDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelDestinoActionPerformed


    }//GEN-LAST:event_labelDestinoActionPerformed

    private void btnFolio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFolio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFolio1MouseClicked

<<<<<<< HEAD
    private void labelCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelCantidadActionPerformed

    private void cerrarSesionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionBtnMouseClicked
       dispose();
    }//GEN-LAST:event_cerrarSesionBtnMouseClicked

    private void ActualizarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarBtnMouseClicked
    control.actualizarCliente(cliente);
    }//GEN-LAST:event_ActualizarBtnMouseClicked

    private void regresarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarBtnMouseClicked
        mostrarDlgPrincipal();
    }//GEN-LAST:event_regresarBtnMouseClicked

    private void btnAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjustesMouseClicked
        mostrarPanelAjustes();
    }//GEN-LAST:event_btnAjustesMouseClicked

    private void mostrarDlgPrincipal() {
        panelTransf.setVisible(false);
        panelConfig.setVisible(false);
=======
    private void componentTablaHistorialformComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_componentTablaHistorialformComponentShown

        ArrayList<Transaccion> transacciones = transaccionDao.verHistorial(cuenta.getIdCuenta());

        for (Transaccion i : transacciones) {
            modelTable.addRow(new Object[]{i.getFormatoTipoTransaccion(), i.getFechahora_transaccion(), i.getCantidad()});
        }


    }//GEN-LAST:event_componentTablaHistorialformComponentShown

    private void btnAceptar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptar2MouseClicked
        mostrarDlgPrincipal();


    }//GEN-LAST:event_btnAceptar2MouseClicked

    private void mostrarDlgPrincipal() {
        componentTransferencia.setVisible(false);
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
        btnTransf.setVisible(true);
        btnFolio1.setVisible(true);
        btnHistorial.setVisible(true);
        btnAjustes.setVisible(true);
<<<<<<< HEAD
=======
        componentTablaHistorial.setVisible(false);
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69

    }

    private void mostrarHistorial() {
        btnTransf.setVisible(false);
        btnFolio1.setVisible(false);
        btnHistorial.setVisible(true);
        btnAjustes.setVisible(false);
        componentTransferencia.setVisible(false);
        btnHistorial.setVisible(false);

    }

    private void mostrarPanelTransferencias() {
<<<<<<< HEAD
        btnAjustes.setVisible(false);
        btnTransf.setVisible(false);
        btnFolio1.setVisible(false);
        btnHistorial.setVisible(false);
        panelTransf.setVisible(true);
=======
        componentTransferencia.setVisible(true);
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
        txtSaldoActual.setText(String.valueOf(cuenta.getSaldo()));
        btnAjustes.setVisible(false);
        btnHistorial.setVisible(false);
        btnFolio1.setVisible(false);
    }
    
    private void mostrarPanelAjustes(){
          btnAjustes.setVisible(false);
        btnTransf.setVisible(false);
        btnFolio1.setVisible(false);
        btnHistorial.setVisible(false);
        panelConfig.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualizarBtn;
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnAceptar2;
    private javax.swing.JLabel btnAjustes;
    private javax.swing.JLabel btnFolio1;
    private javax.swing.JLabel btnHistorial;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnTransf;
<<<<<<< HEAD
    private javax.swing.JLabel cancelarCuentaBtn;
    private javax.swing.JLabel cerrarSesionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
=======
    private javax.swing.JPanel componentPanelConfig;
    private javax.swing.JPanel componentTablaHistorial;
    private javax.swing.JPanel componentTransferencia;
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField labelCantidad;
    private javax.swing.JTextField labelDestino;
<<<<<<< HEAD
    private javax.swing.JPanel panelConfig;
    private javax.swing.JPanel panelTransf;
    private javax.swing.JLabel regresarBtn;
=======
    private javax.swing.JTable tablaHistorial;
>>>>>>> 2c2b04e650d2baca3ea139608cb52715f3278b69
    private javax.swing.JLabel txtBienvenido;
    private javax.swing.JLabel txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
