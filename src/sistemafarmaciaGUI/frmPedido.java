package sistemafarmaciaGUI;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemafarmacia.Conexion;
import sistemafarmacia.Pedidos;

public class frmPedido extends javax.swing.JFrame {

    public frmPedido() {
        initComponents();   
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icon.png")));
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proveedores = new javax.swing.ButtonGroup();
        sucursales = new javax.swing.ButtonGroup();
        panFondo = new javax.swing.JPanel();
        panFondo2 = new javax.swing.JPanel();
        lblIconFarmacia = new javax.swing.JLabel();
        btnVerPedidos = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        cmbTipo = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jrbProveedor1 = new javax.swing.JRadioButton();
        jrbProveedor2 = new javax.swing.JRadioButton();
        cbxSucursal1 = new javax.swing.JCheckBox();
        cbxSucursal2 = new javax.swing.JCheckBox();
        panSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        panFondo.setBackground(new java.awt.Color(255, 255, 255));
        panFondo.setMinimumSize(new java.awt.Dimension(700, 500));
        panFondo.setPreferredSize(new java.awt.Dimension(700, 500));
        panFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panFondo2.setBackground(new java.awt.Color(252, 215, 112));

        lblIconFarmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/farmacia.png"))); // NOI18N

        btnVerPedidos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFondo2Layout = new javax.swing.GroupLayout(panFondo2);
        panFondo2.setLayout(panFondo2Layout);
        panFondo2Layout.setHorizontalGroup(
            panFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondo2Layout.createSequentialGroup()
                .addGroup(panFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIconFarmacia))
                    .addGroup(panFondo2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnVerPedidos)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panFondo2Layout.setVerticalGroup(
            panFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFondo2Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(lblIconFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnVerPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        panFondo.add(panFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 500));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblTitulo.setText("Nuevo Pedido");
        panFondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        lblProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProducto.setText("Producto:");
        panFondo.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        lblTipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");
        panFondo.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        lblCantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCantidad.setText("Cantidad:");
        panFondo.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        lblProveedor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProveedor.setText("Proveedor:");
        panFondo.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        lblSucursal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblSucursal.setText("Sucursal:");
        panFondo.add(lblSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));
        panFondo.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 220, 30));

        btnBorrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });
        panFondo.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 90, 30));

        btnConfirmar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        panFondo.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, 30));

        cmbTipo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona uno", "Tabletas", "Capsulas", "Solución", "Inyectable" }));
        panFondo.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 220, 30));

        txtCantidad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        panFondo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 90, 30));

        proveedores.add(jrbProveedor1);
        jrbProveedor1.setText("Medley");
        jrbProveedor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbProveedor1MouseClicked(evt);
            }
        });
        jrbProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbProveedor1ActionPerformed(evt);
            }
        });
        panFondo.add(jrbProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 120, 30));

        proveedores.add(jrbProveedor2);
        jrbProveedor2.setText("Biomep");
        jrbProveedor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbProveedor2MouseClicked(evt);
            }
        });
        panFondo.add(jrbProveedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 120, 30));

        sucursales.add(cbxSucursal1);
        cbxSucursal1.setText("Las Palmas");
        panFondo.add(cbxSucursal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 120, 30));

        sucursales.add(cbxSucursal2);
        cbxSucursal2.setText("Puerto México");
        panFondo.add(cbxSucursal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 120, 30));

        panSalir.setBackground(new java.awt.Color(255, 255, 255));

        lblSalir.setBackground(new java.awt.Color(255, 255, 255));
        lblSalir.setFont(new java.awt.Font("Roboto", 0, 33)); // NOI18N
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("x");
        lblSalir.setPreferredSize(new java.awt.Dimension(24, 35));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panFondo.add(panSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, -1));
        panFondo.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        panSalir.setBackground(Color.red);
        lblSalir.setForeground(Color.white);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        panSalir.setBackground(Color.white);
        lblSalir.setForeground(Color.black);
    }//GEN-LAST:event_lblSalirMouseExited

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //Pedidos objPedido = recuperarDatos();
        
        Pedidos objPedido = new Pedidos();
        
        int ID = (txtId.getText().isEmpty()) ?0: Integer.parseInt(txtId.getText());
        objPedido.setId(ID);
        
        if( txtProducto.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese nombre del producto.",
                    "Validación",
                    JOptionPane.ERROR_MESSAGE);
            txtProducto.requestFocus();
            return;
        }else {
            String producto = txtProducto.getText();
            objPedido.setNombreProducto(producto);            
        }                
        
        if( (String)cmbTipo.getSelectedItem() == "Selecciona uno" ) {
            JOptionPane.showMessageDialog(
                    this,
                    "Seleccione un tipo de producto.",
                    "Validación",
                    JOptionPane.ERROR_MESSAGE);
            cmbTipo.requestFocus();
            return;
        }else {
            try {
                String tipo = (String)cmbTipo.getSelectedItem();
                objPedido.setTipoProducto(tipo);
            } catch (Exception ex) {
                Logger.getLogger(frmPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if( txtCantidad.getText().length() == 0  ) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese una cantidad.",
                    "Validación",
                    JOptionPane.ERROR_MESSAGE);
            txtCantidad.requestFocus();
            return;
        }else {
            try {
                int cantidad = Integer.parseInt(txtCantidad.getText());
                objPedido.setCantidad(cantidad); 
            }catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this,
                    "Ingrese una cantidad válida.",
                    "Validación",
                    JOptionPane.ERROR_MESSAGE);
                txtCantidad.requestFocus();
                return;
            }
                       
        }
        
        if(jrbProveedor1.isSelected()) {
            objPedido.setProveedor("Medley");
        }else if(jrbProveedor2.isSelected()) {
            objPedido.setProveedor("Biomep");            
        }else {
            JOptionPane.showMessageDialog(
                    this,
                    "Seleccione un proveedor.",
                    "Validación",
                    JOptionPane.ERROR_MESSAGE);   
            return;
        }
                
        if(cbxSucursal1.isSelected()) {
            objPedido.setSucursal("Las Palmas");
        }else if(cbxSucursal2.isSelected()) {
            objPedido.setSucursal("Puerto México");
        }else {
            JOptionPane.showMessageDialog(
                    this,
                    "Seleccione una sucursal.",
                    "Validación",
                    JOptionPane.ERROR_MESSAGE);    
            return;
        }                        
        
        //------------------------
        frmDatos dialog = new frmDatos(this, true, objPedido);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jrbProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbProveedor1ActionPerformed
        
    }//GEN-LAST:event_jrbProveedor1ActionPerformed

    private void jrbProveedor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbProveedor1MouseClicked
        
    }//GEN-LAST:event_jrbProveedor1MouseClicked

    private void jrbProveedor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbProveedor2MouseClicked
        
    }//GEN-LAST:event_jrbProveedor2MouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        borrarDatos();
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        frmTablaPedidos dialog = new frmTablaPedidos(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnVerPedidosActionPerformed
       
    public void borrarDatos() {
        txtProducto.setText("");
        cmbTipo.setSelectedIndex(0);
        txtCantidad.setText("");        
        proveedores.clearSelection();
        sucursales.clearSelection();  
    }
    
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
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                frmPedido frmpedido = new frmPedido();
                frmpedido.setLocationRelativeTo(null);
                frmpedido.setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.JCheckBox cbxSucursal1;
    private javax.swing.JCheckBox cbxSucursal2;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JRadioButton jrbProveedor1;
    private javax.swing.JRadioButton jrbProveedor2;
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
    private javax.swing.ButtonGroup proveedores;
    private javax.swing.ButtonGroup sucursales;
    public javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtId;
    public javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
