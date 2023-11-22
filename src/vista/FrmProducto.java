package vista;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

public class FrmProducto extends javax.swing.JFrame {

    int obtenerIdCategoriaCombo = 0;
    int xx, xy;

    public FrmProducto() {
        initComponents();
        CargarComboCategorias();
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
        jLabel6 = new javax.swing.JLabel();
        jButton_Guardar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jComboBox_igv = new javax.swing.JComboBox<>();
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

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO PRODUCTO");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Precio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Descripcion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, -1, -1));

        jButton_Guardar.setBackground(new java.awt.Color(0, 153, 102));
        jButton_Guardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_Guardar.setText("GUARDAR");
        jButton_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Guardar.setOpaque(true);
        jButton_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_GuardarMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 250, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("IGV");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Categoria");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 250, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 250, 28));

        txt_cantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, 28));

        txt_precio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 250, 28));

        txt_descripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 250, 28));

        jComboBox_igv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_igv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione igv:", "No grava igv", "12%", "14%" }));
        jPanel1.add(jComboBox_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 250, 28));

        jComboBox_categoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria:", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 250, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

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
                Logger.getLogger(FrmProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GuardarMouseClicked
        Producto producto = new Producto();
        Ctrl_Producto controlProducto = new Ctrl_Producto();
        String igv = "";
        String categoria = "";
        igv = jComboBox_igv.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        if (txt_nombre.getText().equals("") || txt_cantidad.getText().equals("") || txt_precio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            txt_nombre.setBackground(Color.red);
            txt_cantidad.setBackground(Color.red);
            txt_precio.setBackground(Color.red);
        } else {
            if (!controlProducto.existeProducto(txt_nombre.getText().trim())) {
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

                            if (controlProducto.guardar(producto)) {
                                JOptionPane.showMessageDialog(null, "Registro Guardado");
                                txt_nombre.setBackground(Color.green);
                                txt_cantidad.setBackground(Color.green);
                                txt_precio.setBackground(Color.green);
                                txt_descripcion.setBackground(Color.green);
                                
                                CargarComboCategorias();
                                jComboBox_igv.setSelectedItem("Seleccione igv:");
                                Limpiar();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al Guardar");
                            }

                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: " +e);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la base de datos");
            }
        }

    }//GEN-LAST:event_jButton_GuardarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton_Guardar;
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
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    private void Limpiar(){
       txt_nombre.setText("");
       txt_cantidad.setText("");
       txt_precio.setText("");
       txt_descripcion.setText("");
    }
    
    private void CargarComboCategorias() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_categoria";
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
            System.out.println("Error al cargar categorias");
        }

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
