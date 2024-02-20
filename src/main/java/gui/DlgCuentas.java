package gui;

import control.Control;
import dao.ConexionDB;
import dao.CuentaDAO;
import dao.interfaces.IConexion;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import objetos.Cliente;
import objetos.Cuenta;

/**
 *
 * @author fabri
 */
public class DlgCuentas extends javax.swing.JDialog {

 
    private final Cliente cliente;
    private final CuentaDAO cuentaDao;
    private final IConexion con;
    private final Cuenta cuenta;
    private final Control control;
    
    

    public DlgCuentas(java.awt.Frame parent, boolean modal, Cliente cliente,Cuenta cuenta) {
        super(parent, modal);
        control=new Control();
         this.cliente = cliente;
        this.cuenta=cuenta;
        initComponents();
        con = new ConexionDB("jdbc:mysql://localhost:3306/banco", "root", "root");
       
        cuentaDao = new CuentaDAO(con);
        //lista.setSelectionForeground(Color.red);
        getContentPane().add(panelTransf);
        panelTransf.setBounds(300, 170, 687, 415);
        getContentPane().add(panelConfig);
        panelConfig.setBounds(300,170,687,415);
        panelConfig.setVisible(false);
        // x,   y,  WIDTH, HEIGHT
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTransf = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JTextField();
        labelDestino = new javax.swing.JTextField();
        panelConfig = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cerrarSesionBtn = new javax.swing.JLabel();
        regresarBtn = new javax.swing.JLabel();
        cancelarCuentaBtn = new javax.swing.JLabel();
        ActualizarBtn = new javax.swing.JLabel();
        btnTransf = new javax.swing.JLabel();
        txtBienvenido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JLabel();
        btnFolio1 = new javax.swing.JLabel();
        btnAjustes = new javax.swing.JLabel();

        panelTransf.setVisible(false);

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

        javax.swing.GroupLayout panelTransfLayout = new javax.swing.GroupLayout(panelTransf);
        panelTransf.setLayout(panelTransfLayout);
        panelTransfLayout.setHorizontalGroup(
            panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransfLayout.createSequentialGroup()
                .addGroup(panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransfLayout.createSequentialGroup()
                        .addGroup(panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransfLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addGroup(panelTransfLayout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransfLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransfLayout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(78, 78, 78)))
                .addGroup(panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTransfLayout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(54, 54, 54)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelTransfLayout.setVerticalGroup(
            panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransfLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panelTransfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnRegresar))
                .addGap(32, 32, 32))
        );

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnTransf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 27)); // NOI18N
        btnTransf.setText("Transferir");
        btnTransf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransfMouseClicked(evt);
            }
        });
        getContentPane().add(btnTransf);
        btnTransf.setBounds(50, 200, 110, 41);

        txtBienvenido.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 31)); // NOI18N
        getContentPane().add(txtBienvenido);
        txtBienvenido.setBounds(230, 10, 330, 32);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 31)); // NOI18N
        jLabel5.setText("¿Qué operación desea realizar?   ");
        //jLabel5.setLocation(625, 100);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 60, 470, 42);

        btnHistorial.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 27)); // NOI18N
        btnHistorial.setText("Estado de Cuenta");
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistorialMouseClicked(evt);
            }
        });
        getContentPane().add(btnHistorial);
        btnHistorial.setBounds(190, 200, 210, 37);

        btnFolio1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 27)); // NOI18N
        btnFolio1.setText("Generar Folio");
        btnFolio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFolio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFolio1MouseClicked(evt);
            }
        });
        getContentPane().add(btnFolio1);
        btnFolio1.setBounds(440, 200, 160, 37);

        btnAjustes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 27)); // NOI18N
        btnAjustes.setText("Ajustes");
        btnAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjustesMouseClicked(evt);
            }
        });
        getContentPane().add(btnAjustes);
        btnAjustes.setBounds(650, 200, 130, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransfMouseClicked
mostrarPanelTransferencias();
    }//GEN-LAST:event_btnTransfMouseClicked


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtBienvenido.setText("Bienvenido " + cliente.getNombre());


    }//GEN-LAST:event_formWindowOpened


    private void btnHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialMouseClicked


    }//GEN-LAST:event_btnHistorialMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked

        mostrarDlgPrincipal();

    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // long idDestino = Long.parseLong(labelDestino.getText());
        String idDestino = labelDestino.getText();
        int cantidad = Integer.parseInt(labelCantidad.getText());
        if (cantidad > cuenta.getSaldo()) {
            JOptionPane.showMessageDialog(this, "No tienes suficiente saldo, la operacion ha sido revertida");
        } else {

            cuentaDao.transferencia(cuenta.getIdCuenta(), cantidad, idDestino);
            JOptionPane.showMessageDialog(this, "Operacion Exitosa");
            mostrarDlgPrincipal();
        }

        // buscamos el id en bd
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void labelDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelDestinoActionPerformed


    }//GEN-LAST:event_labelDestinoActionPerformed

    private void btnFolio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFolio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFolio1MouseClicked

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
        btnTransf.setVisible(true);
        btnFolio1.setVisible(true);
        btnHistorial.setVisible(true);
        btnAjustes.setVisible(true);

    }

   

    private void mostrarPanelTransferencias() {
        btnAjustes.setVisible(false);
        btnTransf.setVisible(false);
        btnFolio1.setVisible(false);
        btnHistorial.setVisible(false);
        panelTransf.setVisible(true);
        txtSaldoActual.setText(String.valueOf(cuenta.getSaldo()));
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
    private javax.swing.JLabel btnAjustes;
    private javax.swing.JLabel btnFolio1;
    private javax.swing.JLabel btnHistorial;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnTransf;
    private javax.swing.JLabel cancelarCuentaBtn;
    private javax.swing.JLabel cerrarSesionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField labelCantidad;
    private javax.swing.JTextField labelDestino;
    private javax.swing.JPanel panelConfig;
    private javax.swing.JPanel panelTransf;
    private javax.swing.JLabel regresarBtn;
    private javax.swing.JLabel txtBienvenido;
    private javax.swing.JLabel txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
