package vista;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.Conexion;
import controlador.Ctrl_RegistrarVenta;
import controlador.VentaPDF;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CabeceraVenta;
import modelo.DetalleVenta;

public class FrmFacturacion extends javax.swing.JFrame {

    int xx, xy;
    private DefaultTableModel modeloDatosProductos;
    ArrayList<DetalleVenta> listaProductos = new ArrayList<>();
    private DetalleVenta producto;
    
    private int idCliente = 0;

    private int idProducto = 0;
    private String nombre = "";
    private int cantidadProductoBBDD = 0;
    private double precioUnitario = 0.0;
    private int porcentajeIgv = 0;

    private int cantidad = 0;
    private double subtotal = 0.0;
    private double descuento = 0.0;
    private double igv = 0.0;
    private double totalPagar = 0.0;
    
    private double subtotalGeneral = 0.0;
    private double descuentoGeneral = 0.0;
    private double igvGeneral = 0.0;
    private double totalPagarGeneral = 0.0;

    private int auxIdDetalle = 1;

    public FrmFacturacion() {
        initComponents();
        CargarComboClientes();
        CargarComboProductos();
        inicializarTablaProducto();
        
        txt_efectivo.setEnabled(false);
        jButton_calcular_cambio.setEnabled(false);
        
        txt_subtotal.setText("0.0");
        txt_igv.setText("0.0");
        txt_descuento.setText("0.0");
        txt_total_pagar.setText("0.0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_cliente = new javax.swing.JComboBox<>();
        jComboBox_producto = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        txt_cliente_buscar = new javax.swing.JTextField();
        jButton_buscar_cliente = new javax.swing.JLabel();
        jButton_añadir_producto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_descuento = new javax.swing.JTextField();
        txt_igv = new javax.swing.JTextField();
        txt_total_pagar = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        txt_cambio = new javax.swing.JTextField();
        jButton_calcular_cambio = new javax.swing.JLabel();
        jButton_registrarVenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACTURACION");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 30));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 30));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 80, 20));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 89, 80, 30));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 70, 30));

        jComboBox_cliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente:", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 250, 30));

        jComboBox_producto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto:", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 250, 30));

        txt_cantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 100, 30));

        txt_cliente_buscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_cliente_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 170, 30));

        jButton_buscar_cliente.setBackground(new java.awt.Color(0, 153, 102));
        jButton_buscar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jButton_buscar_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_buscar_cliente.setText("BUSCAR ");
        jButton_buscar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_buscar_cliente.setOpaque(true);
        jButton_buscar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_buscar_clienteMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_buscar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 140, 30));

        jButton_añadir_producto.setBackground(new java.awt.Color(0, 102, 204));
        jButton_añadir_producto.setForeground(new java.awt.Color(255, 255, 255));
        jButton_añadir_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_añadir_producto.setText("AGREGAR");
        jButton_añadir_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_añadir_producto.setOpaque(true);
        jButton_añadir_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_añadir_productoMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_añadir_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 140, 30));

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 840, 140));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Subtotal");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Descuento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("IGV");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Total a Pagar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Efectivo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Cambio");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 370, 60, -1));

        txt_subtotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_subtotal.setEnabled(false);
        jPanel1.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 250, 30));

        txt_descuento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_descuento.setEnabled(false);
        jPanel1.add(txt_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 290, 30));

        txt_igv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_igv.setEnabled(false);
        jPanel1.add(txt_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 250, 30));

        txt_total_pagar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_total_pagar.setEnabled(false);
        jPanel1.add(txt_total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 290, 30));

        txt_efectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 250, 30));

        txt_cambio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_cambio.setEnabled(false);
        jPanel1.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 290, 30));

        jButton_calcular_cambio.setBackground(new java.awt.Color(102, 102, 255));
        jButton_calcular_cambio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_calcular_cambio.setForeground(new java.awt.Color(255, 255, 255));
        jButton_calcular_cambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_calcular_cambio.setText("CALCULAR CAMBIO");
        jButton_calcular_cambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_calcular_cambio.setOpaque(true);
        jButton_calcular_cambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_calcular_cambioMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_calcular_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 150, 30));

        jButton_registrarVenta.setBackground(new java.awt.Color(255, 102, 51));
        jButton_registrarVenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton_registrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registrarVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_registrarVenta.setText("REGISTRAR");
        jButton_registrarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_registrarVenta.setOpaque(true);
        jButton_registrarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_registrarVentaMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_registrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.valueOf(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void inicializarTablaProducto() {
        modeloDatosProductos = new DefaultTableModel();
        modeloDatosProductos.addColumn("N°");
        modeloDatosProductos.addColumn("Nombre");
        modeloDatosProductos.addColumn("Cantidad");
        modeloDatosProductos.addColumn("P. Unitario");
        modeloDatosProductos.addColumn("Subtotal");
        modeloDatosProductos.addColumn("Descuento");
        modeloDatosProductos.addColumn("Igv");
        modeloDatosProductos.addColumn("Total Pagar");
        modeloDatosProductos.addColumn("Accion");
        jTable_productos.setModel(modeloDatosProductos);
    }

    private void listaTablaProductos(){
       modeloDatosProductos.setRowCount(listaProductos.size());
        for (int i = 0; i < listaProductos.size(); i++) {
            modeloDatosProductos.setValueAt(i + 1, i, 0);
            modeloDatosProductos.setValueAt(listaProductos.get(i).getNombre(), i, 1);
            modeloDatosProductos.setValueAt(listaProductos.get(i).getCantidad(), i, 2);
            modeloDatosProductos.setValueAt(listaProductos.get(i).getPrecioUnitario(), i, 3);
            modeloDatosProductos.setValueAt(listaProductos.get(i).getSubTotal(), i, 4);
            modeloDatosProductos.setValueAt(listaProductos.get(i).getDescuento(), i, 5);
            modeloDatosProductos.setValueAt(listaProductos.get(i).getIgv(), i, 6);
            modeloDatosProductos.setValueAt(listaProductos.get(i).getTotalPagar(), i, 7);
            modeloDatosProductos.setValueAt("Eliminar", i, 8);
        }
        jTable_productos.setModel(modeloDatosProductos);
    }
    
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton_buscar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_buscar_clienteMouseClicked
        String clienteBuscar = txt_cliente_buscar.getText().trim();
        Connection cn = Conexion.conectar();
        String sql = "select nombre, apellido from tb_cliente where dni = '" + clienteBuscar + "'";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                jComboBox_cliente.setSelectedItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            } else {
                jComboBox_cliente.setSelectedItem("Seleccione cliente:");
                JOptionPane.showMessageDialog(null, "¡DNI de cliente incorrecto o no encontrado!");
            }
            txt_cliente_buscar.setText("");
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al buscar cliente!, " + e);
        }
    }//GEN-LAST:event_jButton_buscar_clienteMouseClicked

    private void jButton_añadir_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_añadir_productoMouseClicked
        String combo = jComboBox_producto.getSelectedItem().toString();
        if (combo.equalsIgnoreCase("Seleccione producto:")) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            if (!txt_cantidad.getText().isEmpty()) {
                boolean validacion = validar(txt_cantidad.getText());
                if (validacion == true) {
                    if (Integer.parseInt(txt_cantidad.getText()) > 0) {
                        cantidad = Integer.parseInt(txt_cantidad.getText());
                        DatosDelProducto();
                        if (cantidad <= cantidadProductoBBDD) {
                            subtotal = precioUnitario * cantidad;
                            totalPagar = subtotal + igv + descuento;

                            subtotal = (double) Math.round(subtotal * 100) / 100;
                            igv = (double) Math.round(igv * 100) / 100;
                            descuento = (double) Math.round(descuento * 100) / 100;
                            totalPagar = (double) Math.round(totalPagar * 100) / 100;

                            producto = new DetalleVenta(auxIdDetalle, 1, idProducto, nombre,
                                    Integer.parseInt(txt_cantidad.getText()), precioUnitario, subtotal, descuento,
                                    igv, totalPagar, 1);

                            listaProductos.add(producto);

                            JOptionPane.showMessageDialog(null, "Producto agregado");
                            auxIdDetalle++;
                            txt_cantidad.setText("");
                            CargarComboProductos();
                            CalcularTotalPagar();
                            
                            txt_efectivo.setEnabled(true);
                            jButton_calcular_cambio.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cantidad supera al stock");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero(0), ni negativo");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad de productos");
            }
        }
        listaTablaProductos();
    }//GEN-LAST:event_jButton_añadir_productoMouseClicked

    private void jButton_calcular_cambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_calcular_cambioMouseClicked
        if (!txt_efectivo.getText().isEmpty()) {
            boolean validacion = validarDouble(txt_efectivo.getText());
            if (validacion == true) {
                double efc = Double.parseDouble(txt_efectivo.getText().trim());
                double top = Double.parseDouble(txt_total_pagar.getText().trim());
                
                if (efc < top) {
                    JOptionPane.showMessageDialog(null, "El dinero en efectivo no es suficiente");
                } else {
                    double canmbio = (efc - top);
                    double cambi = (double) Math.round(canmbio * 100d) / 100;
                    String camb = String.valueOf(cambi);
                    txt_cambio.setText(camb);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se admiten caracteres  no numericos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese dinero en efectivo para calcular cambio");
        }
    }//GEN-LAST:event_jButton_calcular_cambioMouseClicked

    int idArrayList = 0;
    
    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
       int fila_point = jTable_productos.rowAtPoint(evt.getPoint());
       int columna_point = 0;
           
        if (fila_point >- 1) {
            idArrayList = (int) modeloDatosProductos.getValueAt(fila_point, columna_point);
        }
        
        int opcion = JOptionPane.showConfirmDialog(null, "¿Eliminar Producto?");
        switch(opcion){
          case 0: listaProductos.remove(idArrayList - 1); CalcularTotalPagar(); listaTablaProductos(); break;
          case 1: break;
          default:break;
        }
    }//GEN-LAST:event_jTable_productosMouseClicked

    private void jButton_registrarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registrarVentaMouseClicked
        CabeceraVenta cabeceraVenta = new CabeceraVenta();
        DetalleVenta detalleVenta = new DetalleVenta();
        Ctrl_RegistrarVenta controlVenta = new Ctrl_RegistrarVenta();
        
        String fechaActula = "";
        Date date = new Date();
        fechaActula = new SimpleDateFormat("yyyy/MM/dd").format(date);
        
        if (!jComboBox_cliente.getSelectedItem().equals("Seleccione cliente:")) {
            if (listaProductos.size() > 0) {
                ObtenerIdCliente();
                cabeceraVenta.setIdCabeceraventa(0);
                cabeceraVenta.setIdCliente(idCliente);
                cabeceraVenta.setValorPagar(Double.parseDouble(txt_total_pagar.getText()));
                cabeceraVenta.setFechaVenta(fechaActula);
                cabeceraVenta.setEstado(1);
                
                if (controlVenta.guardar(cabeceraVenta)) {
                    JOptionPane.showMessageDialog(null, "¡Venta Registrada!");
                    
                    VentaPDF pdf = new VentaPDF();
                    pdf.DatosCliente(idCliente);
                    pdf.generaFacturaPDF();
                    
                    for (DetalleVenta elemento: listaProductos) {
                        detalleVenta.setIdDetalleVenta(0);
                        detalleVenta.setIdCabeceraVenta(0);
                        detalleVenta.setIdProducto(elemento.getIdProducto());
                        detalleVenta.setCantidad(elemento.getCantidad());
                        detalleVenta.setPrecioUnitario(elemento.getPrecioUnitario());
                        detalleVenta.setSubTotal(elemento.getSubTotal());
                        detalleVenta.setDescuento(elemento.getDescuento());
                        detalleVenta.setIgv(elemento.getIgv());
                        detalleVenta.setTotalPagar(elemento.getTotalPagar());
                        detalleVenta.setEstado(1);
                        
                        if (controlVenta.guardarDetalle(detalleVenta)) {
                            //System.out.println("Detalle de  Venta Registrado");
                            txt_subtotal.setText("0.0");
                            txt_igv.setText("0.0");
                            txt_descuento.setText("0.0");
                            txt_total_pagar.setText("0.0");
                            txt_efectivo.setText("0.0");
                            txt_cambio.setText("0.0");
                            auxIdDetalle = 1;
                            
                            CargarComboClientes();
                            RestarStockPorductos(elemento.getIdProducto(), elemento.getCantidad());
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "¡Error al guardar detalle de venta!");
                        }
                    }
                    listaProductos.clear();
                    listaTablaProductos();
                } else {
                   JOptionPane.showMessageDialog(null, "¡Error al guardar cabecera de venta!");    
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Seleccione un producto!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Seleccione un cliente!");
        }
        
    }//GEN-LAST:event_jButton_registrarVentaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton_añadir_producto;
    private javax.swing.JLabel jButton_buscar_cliente;
    private javax.swing.JLabel jButton_calcular_cambio;
    private javax.swing.JLabel jButton_registrarVenta;
    private javax.swing.JComboBox<String> jComboBox_cliente;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cliente_buscar;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_igv;
    private javax.swing.JTextField txt_subtotal;
    public static javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables

    private void CargarComboClientes() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_cliente";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_cliente.removeAllItems();
            jComboBox_cliente.addItem("Seleccione cliente:");

            while (rs.next()) {
                jComboBox_cliente.addItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar clientes, !" + e);
        }
    }

    private void CargarComboProductos() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_producto";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_producto.removeAllItems();
            jComboBox_producto.addItem("Seleccione producto:");

            while (rs.next()) {
                jComboBox_producto.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar producto, !" + e);
        }
    }

    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
      private boolean validarDouble(String valor) {
        try {
            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void DatosDelProducto() {
        try {
            String sql = "select * from tb_producto where  nombre = '" + jComboBox_producto.getSelectedItem() + "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idProducto = rs.getInt("idProducto");
                nombre = rs.getString("nombre");
                cantidadProductoBBDD = rs.getInt("cantidad");
                precioUnitario = rs.getDouble("precio");
                porcentajeIgv = rs.getInt("Igv");
                CalcularIgv(precioUnitario, porcentajeIgv);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del producto, " + e);
        }
    }

    private double CalcularIgv(double precio, int porcentajeIgv) {
        int p_igv = porcentajeIgv;

        switch (p_igv) {
            case 0:
                igv = 0.0;
                break;
            case 12:
                igv = (precio * cantidad) * 0.12;
                break;
            case 14:
                igv = (precio * cantidad) * 0.14;
                break;
            default:
                break;
        }
        return igv;
    }
    
    private void CalcularTotalPagar(){
       subtotalGeneral  = 0;
       descuentoGeneral = 0;
       igvGeneral = 0;
       totalPagarGeneral = 0;
       
       for(DetalleVenta elemento : listaProductos){
          subtotalGeneral += elemento.getSubTotal();
          descuentoGeneral += elemento.getDescuento();
          igvGeneral += elemento.getIgv();
          totalPagarGeneral += elemento.getTotalPagar();
       }
       subtotalGeneral = (double) Math.round(subtotalGeneral*100)/100;
       descuentoGeneral = (double) Math.round(descuentoGeneral*100)/100;
       igvGeneral = (double) Math.round(igvGeneral*100)/100;
       totalPagarGeneral = (double) Math.round(totalPagarGeneral*100)/100;
       
       txt_subtotal.setText(String.valueOf(subtotalGeneral));
       txt_igv.setText(String.valueOf(igvGeneral));
       txt_descuento.setText(String.valueOf(descuentoGeneral));
       txt_total_pagar.setText(String.valueOf(totalPagarGeneral));
    }
    
    private void ObtenerIdCliente(){
        try {
            String sql = "select * from tb_cliente where concat(nombre,' ',apellido) = '" +jComboBox_cliente.getSelectedItem()+ "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               idCliente = rs.getInt("idCLiente");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener id del cliente, " +e);
        }
    }
    
    private void RestarStockPorductos(int idProducto, int cantidad){
      int cantidadProductosBaseDeDatos = 0;
        try {
            Connection cn = Conexion.conectar();
            String sql = "select idProducto, cantidad from tb_producto where idProducto = '" + idProducto + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               cantidadProductosBaseDeDatos = rs.getInt("cantidad");
            }
            cn.close();
        } catch (SQLException e) {
          System.out.println("Error al restar cantidad 1, " +e);
        }
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement consulta = cn.prepareStatement("update tb_producto set cantidad=? where idProducto = '" + idProducto + "'");
            int cantidadNueva = cantidadProductosBaseDeDatos -cantidad;
            consulta.setInt(1, cantidadNueva);
            if (consulta.executeUpdate() > 0) {
                System.out.println("Todo bien");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al restar cantidad 2, " +e);
        }
    }
}
