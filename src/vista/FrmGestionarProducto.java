package vista;

import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

public class FrmGestionarProducto extends javax.swing.JFrame {

    int xx, xy;
    private int idProducto;
    int obtenerIdCategoriaCombo = 0;

    public FrmGestionarProducto() {
        initComponents();
        CargarTablaProductos();
        CargarComboCategoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jButton_actualizar = new javax.swing.JLabel();
        jButton_eliminar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_igv = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox_categoria = new javax.swing.JComboBox<>();

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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRAR PRODUCTOS");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, 30));

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
        jScrollPane1.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 710, 200));

        jButton_actualizar.setBackground(new java.awt.Color(0, 102, 102));
        jButton_actualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_actualizar.setText("actualizar");
        jButton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_actualizar.setOpaque(true);
        jButton_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_actualizarMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 170, 30));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_eliminar.setText("eliminar");
        jButton_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_eliminar.setOpaque(true);
        jButton_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_eliminarMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 170, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 319, 120, 30));

        txt_descripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 170, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 319, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 269, -1, 30));

        txt_cantidad.setEditable(false);
        txt_cantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 170, 30));

        txt_precio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 170, 30));

        txt_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 170, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("IGV");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        jComboBox_igv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_igv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione igv:", "No grava igv", "12%", "14%" }));
        jPanel1.add(jComboBox_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 240, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Categoria");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria:", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.valueOf(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmGestionarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_actualizarMouseClicked
        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String igv = "";
        String categoria = "";
        igv = jComboBox_igv.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        if (txt_nombre.getText().isEmpty() || txt_cantidad.getText().isEmpty() || txt_precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            
            /*if (!controlProducto.existeProducto(txt_nombre.getText().trim())) {*/
                if (igv.equalsIgnoreCase("Seleccione igv:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione igv.");
                } else {
                    if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione categoria.");
                    } else {
                        try {
                            producto.setNombre(txt_nombre.getText().trim());
                            producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
                            String precioTXT = "";
                            double Precio = 0.0;
                            precioTXT = txt_precio.getText().trim();
                            boolean aux = false;
                            
                            for (int i = 0; i < precioTXT.length(); i++) {
                                if (precioTXT.charAt(i) == ',') {
                                    String precioNuevo = precioTXT.replace(",", ".");
                                    Precio = Double.parseDouble(precioNuevo);
                                    aux = true;
                                }
                            }

                            if (aux == true) {
                                producto.setPrecio(Precio);
                            } else {
                                Precio = Double.parseDouble(precioTXT);
                                producto.setPrecio(Precio);
                            }

                            producto.setDescripcion(txt_descripcion.getText().trim());
                            if (igv.equalsIgnoreCase("No grava iva")) {
                                producto.setPorcentajeIgv(0);
                            } else if (igv.equalsIgnoreCase("12%")) {
                                producto.setPorcentajeIgv(12);
                            } else if (igv.equalsIgnoreCase("14%")) {
                                producto.setPorcentajeIgv(14);
                            }

                            IdCategoria();
                            producto.setIdCategoria(obtenerIdCategoriaCombo);
                            producto.setEstado(1);

                            if (controlProducto.actualizar(producto, idProducto)) {
                                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                                CargarComboCategoria();
                                CargarTablaProductos();
                                jComboBox_igv.setSelectedItem("Seleccione igv:");
                                Limpiar();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al Actualizar");
                            }
                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: " + e);
                        }
                    }
                }
            /*} else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la base de datos");
            }*/
        }
    }//GEN-LAST:event_jButton_actualizarMouseClicked

    private void jButton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_eliminarMouseClicked
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        if (idProducto == 0) {
            JOptionPane.showMessageDialog(null, "¡Seleccione un Producto!");
        } else {
            if (!controlProducto.eliminar(idProducto)) {
                JOptionPane.showMessageDialog(null, "¡Producto Eliminado!");
                CargarTablaProductos();
                CargarComboCategoria();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar Producto!");
            }
        }
    }//GEN-LAST:event_jButton_eliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton_actualizar;
    private javax.swing.JLabel jButton_eliminar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_igv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_descripcion.setText("");
        txt_precio.setText("");
        jComboBox_igv.setSelectedItem("Seleccione igv:");
        jComboBox_categoria.setSelectedItem("Selecione categoria:");
    }

    private void CargarComboCategoria() {
        Connection cn = Conexion.conectar();
        String sql = "select  * from tb_categoria";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione categoria:");

            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("!Error al cargar categorias¡");
        }
    }

    String descripcionCategoria = "";
    double precio = 0.0;
    int porcentajeIgv = 0;
    double IGV = 0;

    private void CargarTablaProductos() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select p.idProducto, p.nombre, p.cantidad, p.precio, p.descripcion, p.igv, c.descripcion, p.estado from tb_producto as p, tb_categoria as c where p.idCategoria = c.idCategoria";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmGestionarProducto.jTable_productos = new JTable(model);
            FrmGestionarProducto.jScrollPane1.setViewportView(FrmGestionarProducto.jTable_productos);
            model.addColumn("N°");
            model.addColumn("nombre");
            model.addColumn("cantidad");
            model.addColumn("precio");
            model.addColumn("descripcion");
            model.addColumn("Igv");
            model.addColumn("categoria");
            model.addColumn("estado");

            while (rs.next()) {
                precio = rs.getDouble("precio");
                porcentajeIgv = rs.getInt("igv");

                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {

                    if (i == 5) {
                        calcularIgv(precio, porcentajeIgv);
                        fila[i] = IGV;
                        rs.getObject(i + 1);
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla productos: " + e);
        }

        jTable_productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_productos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idProducto = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosProductoSelecionado(idProducto);
                } else {
                }
            }
        });
    }

    private double calcularIgv(double precio, int igv) {
        int p_igv = igv;
        switch (p_igv) {
            case 0:
                IGV = 0.0;
                break;
            case 12:
                IGV = precio * 0.12;
                break;
            case 14:
                IGV = precio * 0.14;
                break;
            default:
                break;
        }
        IGV = (double) Math.round(IGV * 100) / 100;
        return IGV;
    }

    private void EnviarDatosProductoSelecionado(int idProducto) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("select * from tb_producto where idProducto = '" + idProducto + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_cantidad.setText(rs.getString("cantidad"));
                txt_precio.setText(rs.getString("precio"));
                txt_descripcion.setText(rs.getString("descripcion"));
                int igv = rs.getInt("igv");
                switch (igv) {
                    case 0:
                        jComboBox_igv.setSelectedItem("No grava igv");
                        break;
                    case 12:
                        jComboBox_igv.setSelectedItem("12%");
                        break;
                    case 14:
                        jComboBox_igv.setSelectedItem("14%");
                        break;
                    default:
                        jComboBox_igv.setSelectedItem("Seleccione igv:");
                        break;
                }
                int idCate = rs.getInt("idCategoria");
                jComboBox_categoria.setSelectedItem(relacionarCategoria(idCate));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar producto: " + e);
        }
    }

    private String relacionarCategoria(int idCategoria) {

        String sql = "select  descripcion from tb_categoria where idCategoria = '" + idCategoria + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                descripcionCategoria = rs.getString("descripcion");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("!Error al obtener el id de la categorias¡");
        }
        return descripcionCategoria;
    }
    
    private int IdCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }
}
