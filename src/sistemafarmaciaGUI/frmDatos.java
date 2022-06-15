package sistemafarmaciaGUI;

import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemafarmacia.ComunicacionBD;
import sistemafarmacia.Conexion;
import sistemafarmacia.Pedidos;

public class frmDatos extends javax.swing.JDialog {        
    frmPedido pedido;
    Pedidos objPedido;

    public frmDatos(java.awt.Frame parent, boolean modal, Pedidos objPedido) {
        super(parent, modal);
        initComponents();
        
        this.objPedido = objPedido;                
        
        txtProducto.setText(objPedido.getNombreProducto());
        txtTipo.setText(objPedido.getTipoProducto());
        txtCantidad.setText(String.valueOf(objPedido.getCantidad()));
        txtProveedor.setText(objPedido.getProveedor());
        txtSucursal.setText(objPedido.getSucursal());                                                                            
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProducto3 = new javax.swing.JTextField();
        panFondo = new javax.swing.JPanel();
        panFondo2 = new javax.swing.JPanel();
        lblIconFarmacia = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        panSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panFondo.setBackground(new java.awt.Color(255, 255, 255));
        panFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panFondo2.setBackground(new java.awt.Color(180, 221, 127));

        lblIconFarmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carritoFarmacia.png"))); // NOI18N

        javax.swing.GroupLayout panFondo2Layout = new javax.swing.GroupLayout(panFondo2);
        panFondo2.setLayout(panFondo2Layout);
        panFondo2Layout.setHorizontalGroup(
            panFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panFondo2Layout.setVerticalGroup(
            panFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondo2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblIconFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        panFondo.add(panFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 420));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblTitulo.setText("Datos Pedido");
        panFondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        lblProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProducto.setText("Producto:");
        panFondo.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        lblTipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");
        panFondo.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        lblCantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCantidad.setText("Cantidad:");
        panFondo.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        lblProveedor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProveedor.setText("Proveedor:");
        panFondo.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, 20));

        lblSucursal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblSucursal.setText("Sucursal:");
        panFondo.add(lblSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        txtSucursal.setEditable(false);
        txtSucursal.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panFondo.add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 190, 30));

        txtProducto.setEditable(false);
        txtProducto.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panFondo.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, 30));

        txtTipo.setEditable(false);
        txtTipo.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panFondo.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, 30));

        txtCantidad.setEditable(false);
        txtCantidad.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panFondo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 190, 30));

        txtProveedor.setEditable(false);
        txtProveedor.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        panFondo.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 190, 30));

        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        panFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, 30));

        btnAceptar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        panFondo.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, 30));

        lblSalir.setFont(new java.awt.Font("Roboto", 0, 33)); // NOI18N
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("x");
        lblSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panSalirLayout = new javax.swing.GroupLayout(panSalir);
        panSalir.setLayout(panSalirLayout);
        panSalirLayout.setHorizontalGroup(
            panSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panSalirLayout.setVerticalGroup(
            panSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panFondo.add(panSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked

        String[] subir = {objPedido.getNombreProducto(),objPedido.getTipoProducto(),String.valueOf(objPedido.getCantidad()),objPedido.getProveedor(),objPedido.getSucursal()};
                try {
                    ComunicacionBD.subirBD("pedidos", subir);
                } catch (SQLException ex) {
                    Logger.getLogger(frmPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        JOptionPane.showMessageDialog(
                    this, 
                    "Pedido registrado exitosamente.",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        
        dispose();                 
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(
                this, 
                "¿Desea cancelar el pedido?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
                
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        panSalir.setBackground(Color.red);
        lblSalir.setForeground(Color.white);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        panSalir.setBackground(Color.white);
        lblSalir.setForeground(Color.black);
    }//GEN-LAST:event_lblSalirMouseExited

           
    /**
     * @param args the command line arguments
    */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList datosPedido = null;
                frmDatos dialog = new frmDatos(new javax.swing.JFrame(), true, ArrayList datosPedido);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblIconFarmacia;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panFondo2;
    private javax.swing.JPanel panSalir;
    private javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProducto3;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtSucursal;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
