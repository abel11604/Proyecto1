package gui;

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

    private final DefaultListModel model;
    private final Cliente cliente;
    private final CuentaDAO cuentaDao;
    private final IConexion con;
    private Cuenta cuentaSeleccionada;
    private ArrayList<Cuenta> cuentas;

    public DlgCuentas(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        initComponents();
        con = new ConexionDB("jdbc:mysql://localhost:3306/banco", "root", "root");
        this.cliente = cliente;
        cuentaDao = new CuentaDAO(con);
        //lista.setSelectionForeground(Color.red);
        model = new DefaultListModel();
        lista.setModel(model);
        lista.setSelectionBackground(new Color(176, 186, 195));
        lista.setFont(new Font("Yu Gothic UI Semilight", 18, 18));
        getContentPane().add(panelSeleccionarCuenta);
        panelSeleccionarCuenta.setBounds(200, 170, 687, 415);
        getContentPane().add(panelTransf);
        panelTransf.setBounds(300, 170, 687, 415);
        // x,   y,  WIDTH, HEIGHT
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSeleccionarCuenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelTransf = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JTextField();
        labelDestino = new javax.swing.JTextField();
        btnTransf = new javax.swing.JLabel();
        txtBienvenido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFolio = new javax.swing.JLabel();

        panelSeleccionarCuenta.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel1.setText("Seleccione una cuenta");

        jScrollPane1.setViewportView(lista);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel2.setText("Seleccionar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel3.setText("Regresar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSeleccionarCuentaLayout = new javax.swing.GroupLayout(panelSeleccionarCuenta);
        panelSeleccionarCuenta.setLayout(panelSeleccionarCuentaLayout);
        panelSeleccionarCuentaLayout.setHorizontalGroup(
            panelSeleccionarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionarCuentaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionarCuentaLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionarCuentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(225, 225, 225))
        );
        panelSeleccionarCuentaLayout.setVerticalGroup(
            panelSeleccionarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionarCuentaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelSeleccionarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18))
        );

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1250, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnTransf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        btnTransf.setText("Transferir");
        btnTransf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransfMouseClicked(evt);
            }
        });
        getContentPane().add(btnTransf);
        btnTransf.setBounds(560, 220, 95, 32);

        txtBienvenido.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        getContentPane().add(txtBienvenido);
        txtBienvenido.setBounds(490, 50, 249, 32);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel5.setText("¿Qué operación desea realizar?   ");
        //jLabel5.setLocation(625, 100);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 100, 363, 32);

        btnFolio.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        btnFolio.setText("Generar Folio");
        btnFolio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFolioMouseClicked(evt);
            }
        });
        getContentPane().add(btnFolio);
        btnFolio.setBounds(540, 320, 137, 32);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransfMouseClicked

        mostrarPanelSeleccionarCuenta();
    }//GEN-LAST:event_btnTransfMouseClicked


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtBienvenido.setText("Bienvenido " + cliente.getNombre());


    }//GEN-LAST:event_formWindowOpened

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        mostrarDlgPrincipal();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (lista.getSelectedIndex() == -1) {
            System.out.println("");
            return;
        }
        cuentaSeleccionada = (Cuenta) model.getElementAt(lista.getSelectedIndex());
        mostrarPanelTransferencias();
    }//GEN-LAST:event_jLabel2MouseClicked


    private void btnFolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFolioMouseClicked


    }//GEN-LAST:event_btnFolioMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked

        mostrarDlgPrincipal();

    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // long idDestino = Long.parseLong(labelDestino.getText());
        String idDestino = labelDestino.getText();
        int cantidad = Integer.parseInt(labelCantidad.getText());
        if (cantidad > cuentaSeleccionada.getSaldo()) {
            JOptionPane.showMessageDialog(this, "No tienes suficiente saldo, la operacion ha sido revertida");
        } else {

            cuentaDao.transferencia(cuentaSeleccionada.getIdCuenta(), cantidad, idDestino);
            JOptionPane.showMessageDialog(this, "Operacion Exitosa");
            mostrarDlgPrincipal();
        }

        // buscamos el id en bd
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void labelDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelDestinoActionPerformed


    }//GEN-LAST:event_labelDestinoActionPerformed

    private void mostrarDlgPrincipal() {
        panelSeleccionarCuenta.setVisible(false);
        panelTransf.setVisible(false);
        btnTransf.setVisible(true);
        btnFolio.setVisible(true);

    }

    private void mostrarPanelSeleccionarCuenta() {

        panelSeleccionarCuenta.setVisible(true);
        btnTransf.setVisible(false);
        btnFolio.setVisible(false);
        panelSeleccionarCuenta.setVisible(true);
        cuentas = cuentaDao.buscarCuentaPorCliente(cliente.getId());
        model.removeAllElements();

        for (int i = 0; i < cuentas.size(); i++) {
            model.addElement(cuentas.get(i));

        }
    }

    private void mostrarPanelTransferencias() {
        panelSeleccionarCuenta.setVisible(false);
        panelTransf.setVisible(true);
        txtSaldoActual.setText(String.valueOf(cuentaSeleccionada.getSaldo()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnFolio;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnTransf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField labelCantidad;
    private javax.swing.JTextField labelDestino;
    private javax.swing.JList<String> lista;
    private javax.swing.JPanel panelSeleccionarCuenta;
    private javax.swing.JPanel panelTransf;
    private javax.swing.JLabel txtBienvenido;
    private javax.swing.JLabel txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
