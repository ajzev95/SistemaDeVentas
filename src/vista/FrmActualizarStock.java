package vista;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.Conexion;
import controlador.Ctrl_Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Producto;

public class FrmActualizarStock extends javax.swing.JFrame {

    
    int xx, xy;
    int idProducto = 0;
    int cantidad = 0;

    public FrmActualizarStock() {
        initComponents();
        CargarComboProductos();
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
        jButton_Guardar = new javax.swing.JLabel();
        txt_cantidad_actual = new javax.swing.JTextField();
        txt_cantidad_nueva = new javax.swing.JTextField();
        jComboBox_producto = new javax.swing.JComboBox<>();

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
        jLabel1.setText("ACTUALIZAR STOCK DE PRODUCTOS");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 53, 100, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Stock Actual");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Stock Nuevo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        jButton_Guardar.setBackground(new java.awt.Color(0, 153, 102));
        jButton_Guardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton_Guardar.setText("ACTUALIZAR");
        jButton_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Guardar.setOpaque(true);
        jButton_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_GuardarMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 250, 30));

        txt_cantidad_actual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_cantidad_actual.setEnabled(false);
        jPanel1.add(txt_cantidad_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 250, 28));

        txt_cantidad_nueva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_cantidad_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 250, 28));

        jComboBox_producto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto:" }));
        jComboBox_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_productoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 250, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 270));

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
                Logger.getLogger(FrmActualizarStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_productoActionPerformed
        MostrarStock();
    }//GEN-LAST:event_jComboBox_productoActionPerformed

    private void jButton_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GuardarMouseClicked
        if (!jComboBox_producto.getSelectedItem().equals("Seleccione producto:")) {
            if (!txt_cantidad_nueva.getText().isEmpty()) {
                boolean validacion = validar(txt_cantidad_nueva.getText().trim());
                if (validacion == true) {
                    if (Integer.parseInt(txt_cantidad_nueva.getText()) > 0) {
                        Producto producto = new Producto();
                        Ctrl_Producto controlProducto = new Ctrl_Producto();
                        int stockActual = Integer.parseInt(txt_cantidad_actual.getText().trim());
                        int stockNuevo = Integer.parseInt(txt_cantidad_nueva.getText().trim());

                        stockNuevo = stockActual + stockNuevo;
                        producto.setCantidad(stockNuevo);
                        if (controlProducto.actualizarStock(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, "Stock Actualizado");
                            jComboBox_producto.setSelectedItem("Seleccione producto:");
                            txt_cantidad_actual.setText("");
                            txt_cantidad_nueva.setText("");
                            CargarComboProductos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar Stock");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero ni negativo");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numerico");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una nueva cantidad para sumar el stock del producto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        }
    }//GEN-LAST:event_jButton_GuardarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton_Guardar;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cantidad_actual;
    private javax.swing.JTextField txt_cantidad_nueva;
    // End of variables declaration//GEN-END:variables

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
        } catch (SQLException e) {
            System.out.println("Error al cargar los productos en: " + e);
        }
    }

    private void MostrarStock() {
        try {
            Connection cn = Conexion.conectar();
            String sql = "select * from tb_producto where nombre = '" + jComboBox_producto.getSelectedItem() + "'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idProducto = rs.getInt("idProducto");
                cantidad = rs.getInt("cantidad");
                txt_cantidad_actual.setText(String.valueOf(cantidad));
            } else {
                txt_cantidad_actual.setText("");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener stock del producto en: " + e);
        }
    }

    private boolean validar(String valor) {
        int num;
        try {
            num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
