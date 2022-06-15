package sistemafarmaciaGUI;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemafarmacia.ComunicacionBD;
import sistemafarmacia.Conexion;
import sistemafarmacia.Pedidos;
import java.util.Objects;


public class frmPedido extends javax.swing.JFrame {

    String tabla = "usuarios";
    String user;
    Pedidos objPedido = new Pedidos();
    
    String listaPruebas[][] = new String[100][5];
    
    int aux = 0;
    int aux2 = 0;
    boolean primeraVez = false;
    boolean agregarOtroTrue = false;
    
    
    public frmPedido(String user) {
        initComponents();        
        
        
        this.user = user;
        if(!esAdmin(user)){
            
            lblEmpleados.setVisible(false);
            panEmpleados.setVisible(false);
            
        }
       
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icon.png")));
    }

    private frmPedido() {
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proveedores = new javax.swing.ButtonGroup();
        sucursales = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panFondo = new javax.swing.JPanel();
        panFondo2 = new javax.swing.JPanel();
        lblIconFarmacia = new javax.swing.JLabel();
        btnVerPedidos = new javax.swing.JButton();
        panEmpleados = new javax.swing.JPanel();
        lblEmpleados = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        panSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panUno = new javax.swing.JPanel();
        lblUno = new javax.swing.JLabel();
        panDos = new javax.swing.JPanel();
        lblDos = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnBorrar1 = new javax.swing.JButton();
        lblProveedor = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        jrbProveedor1 = new javax.swing.JRadioButton();
        jrbProveedor2 = new javax.swing.JRadioButton();
        cbxSucursal1 = new javax.swing.JCheckBox();
        cbxSucursal2 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarOtro = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnBorrar2 = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

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

        btnVerPedidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });

        panEmpleados.setBackground(new java.awt.Color(105, 214, 244));

        lblEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        lblEmpleados.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N
        lblEmpleados.setText("Empleados");
        lblEmpleados.setPreferredSize(new java.awt.Dimension(24, 35));
        lblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panEmpleadosLayout = new javax.swing.GroupLayout(panEmpleados);
        panEmpleados.setLayout(panEmpleadosLayout);
        panEmpleadosLayout.setHorizontalGroup(
            panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        panEmpleadosLayout.setVerticalGroup(
            panEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        lblCerrarSesion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesion.png"))); // NOI18N
        lblCerrarSesion.setText("Cerrar Sesión");
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panFondo2Layout = new javax.swing.GroupLayout(panFondo2);
        panFondo2.setLayout(panFondo2Layout);
        panFondo2Layout.setHorizontalGroup(
            panFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondo2Layout.createSequentialGroup()
                .addGroup(panFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondo2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnVerPedidos))
                    .addGroup(panFondo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIconFarmacia))
                    .addGroup(panFondo2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(panEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFondo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCerrarSesion)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panFondo2Layout.setVerticalGroup(
            panFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(panEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblIconFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnVerPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        panFondo.add(panFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 500));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lblTitulo.setText("Nuevo Pedido");
        panFondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        panUno.setBackground(new java.awt.Color(153, 255, 153));

        lblUno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUno.setText("1");

        javax.swing.GroupLayout panUnoLayout = new javax.swing.GroupLayout(panUno);
        panUno.setLayout(panUnoLayout);
        panUnoLayout.setHorizontalGroup(
            panUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUno, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );
        panUnoLayout.setVerticalGroup(
            panUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUno, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        panDos.setBackground(new java.awt.Color(204, 204, 204));

        lblDos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDos.setText("2");

        javax.swing.GroupLayout panDosLayout = new javax.swing.GroupLayout(panDos);
        panDos.setLayout(panDosLayout);
        panDosLayout.setHorizontalGroup(
            panDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDos, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );
        panDosLayout.setVerticalGroup(
            panDosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDos, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 255, Short.MAX_VALUE)
                .addComponent(panUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panFondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 96, 403, 48));

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        btnSiguiente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnBorrar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBorrar1.setText("Borrar");
        btnBorrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrar1MouseClicked(evt);
            }
        });

        lblProveedor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProveedor.setText("Proveedor:");

        lblSucursal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblSucursal.setText("Sucursal:");

        proveedores.add(jrbProveedor1);
        jrbProveedor1.setText("Medley");

        proveedores.add(jrbProveedor2);
        jrbProveedor2.setText("Biomep");

        sucursales.add(cbxSucursal1);
        cbxSucursal1.setText("Las Palmas");

        sucursales.add(cbxSucursal2);
        cbxSucursal2.setText("Puerto México");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblProveedor)
                        .addComponent(lblSucursal))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jrbProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbProveedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxSucursal2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(98, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProveedor))
                    .addGap(10, 10, 10)
                    .addComponent(jrbProveedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSucursal))
                    .addGap(10, 10, 10)
                    .addComponent(cbxSucursal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        btnAgregarOtro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarOtro.setText("Agregar otro");
        btnAgregarOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOtroActionPerformed(evt);
            }
        });

        lblProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProducto.setText("Producto:");

        cmbTipo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona uno", "Tabletas", "Capsulas", "Solución", "Inyectable" }));

        lblTipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        lblCantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCantidad.setText("Cantidad:");

        txtCantidad.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        btnBorrar2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBorrar2.setText("Borrar");
        btnBorrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrar2MouseClicked(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(252, 215, 112));
        btnConfirmar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addGap(49, 49, 49)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblProducto)
                                .addGap(18, 18, 18)
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCantidad)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBorrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarOtro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarOtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        panFondo.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 105, 400, 360));

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

    public boolean esAdmin(String user) {
        
        try {
            String[][] datoAdmin =  ComunicacionBD.datosBD(tabla, "tipo_usuario", "administrador");
                        
            for(int i = 0; i<datoAdmin.length;i++){
                
                if(user.equals(datoAdmin[i][2]))
                    return true;
            } 
                        
        } catch (SQLException ex) {
            Logger.getLogger(frmPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
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

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        
        if(esAdmin(user)){
            frmTablaPedidos dialog = new frmTablaPedidos(this, true, true);
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
            
        }else{
            frmTablaPedidos dialog = new frmTablaPedidos(this, true,false);
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        }
        
    }//GEN-LAST:event_btnVerPedidosActionPerformed

    private void lblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseClicked
        frmTablaUsuarios dialogo = new frmTablaUsuarios(this, true);
        dialogo.setLocationRelativeTo(this);
        dialogo.setVisible(true);
        
    }//GEN-LAST:event_lblEmpleadosMouseClicked

    private void lblEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseEntered
        panEmpleados.setBackground(new Color(17,179,225));
        lblEmpleados.setForeground(Color.white);
    }//GEN-LAST:event_lblEmpleadosMouseEntered

    private void lblEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseExited
        panEmpleados.setBackground(new Color(105,214,244));
        lblEmpleados.setForeground(Color.black);
    }//GEN-LAST:event_lblEmpleadosMouseExited

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
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

        jTabbedPane1.setSelectedIndex(1);
        panUno.setBackground(new Color(204,204,204));
        panDos.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnBorrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrar1MouseClicked
        proveedores.clearSelection();
        sucursales.clearSelection();
    }//GEN-LAST:event_btnBorrar1MouseClicked

    private void btnBorrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrar2MouseClicked
        txtProducto.setText("");
        cmbTipo.setSelectedIndex(0);
        txtCantidad.setText("");
    }//GEN-LAST:event_btnBorrar2MouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
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
        
        listaPruebas[aux][0] = objPedido.getNombreProducto();
        listaPruebas[aux][1] = objPedido.getTipoProducto();
        listaPruebas[aux][2] = String.valueOf(objPedido.getCantidad());
        listaPruebas[aux][3] = objPedido.getProveedor();
        listaPruebas[aux][4] = objPedido.getSucursal();
        
         try {
                for(int i = 0; i<=aux ;i++){
                    
                        String[] temp = {listaPruebas[i][0],listaPruebas[i][1],listaPruebas[i][2],listaPruebas[i][3],listaPruebas[i][4] };
                        ComunicacionBD.subirBD("pedidostemporal", temp);
                    
                }
                                
                } catch (SQLException ex) {
                    Logger.getLogger(frmPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        aux2 = aux;
        aux = 0;
        
        //------------------------
        
        if(agregarOtroTrue){
            frmPedido frame = new frmPedido();
            frmDatosDos dialog = new frmDatosDos(frame, true, objPedido, listaPruebas, aux2);
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
            agregarOtroTrue = false;
        }else{
            frmPedido frame = new frmPedido();
            frmDatos dialog = new frmDatos(frame, true, objPedido);
            dialog.setLocationRelativeTo(this);
            dialog.setVisible(true);
        }
        
        
        borrarDatos();
        
        
        jTabbedPane1.setSelectedIndex(0);           
        panDos.setBackground(new Color(204,204,204));
        panUno.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAgregarOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOtroActionPerformed
        
        agregarOtroTrue = true; 
        Pedidos objPedidoAux = new Pedidos();

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
            objPedidoAux.setNombreProducto(producto);
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
                objPedidoAux.setTipoProducto(tipo);
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
                objPedidoAux.setCantidad(cantidad);
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
                

        objPedidoAux.setProveedor(objPedido.getProveedor());
        objPedidoAux.setSucursal(objPedido.getSucursal());
        
        
        listaPruebas[aux][0] = objPedidoAux.getNombreProducto();
        listaPruebas[aux][1] = objPedidoAux.getTipoProducto();
        listaPruebas[aux][2] = String.valueOf(objPedidoAux.getCantidad());
        listaPruebas[aux][3] = objPedidoAux.getProveedor();
        listaPruebas[aux][4] = objPedidoAux.getSucursal();
        
        aux +=1;
        
        borrarDatos();
    }//GEN-LAST:event_btnAgregarOtroActionPerformed

    
    
    
    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
                
        frmInicioSesion dialogo = new frmInicioSesion();
        dialogo.setVisible(true);
        dialogo.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked
       
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
    private javax.swing.JButton btnAgregarOtro;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBorrar2;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.JCheckBox cbxSucursal1;
    private javax.swing.JCheckBox cbxSucursal2;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton jrbProveedor1;
    private javax.swing.JRadioButton jrbProveedor2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDos;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblIconFarmacia;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUno;
    public javax.swing.JPanel panDos;
    private javax.swing.JPanel panEmpleados;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panFondo2;
    private javax.swing.JPanel panSalir;
    public javax.swing.JPanel panUno;
    private javax.swing.ButtonGroup proveedores;
    private javax.swing.ButtonGroup sucursales;
    public javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtId;
    public javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
