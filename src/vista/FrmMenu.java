package vista;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import controlador.Reportes;
import java.awt.Image;
import java.awt.Toolkit;

public class FrmMenu extends javax.swing.JFrame {

   
    public FrmMenu() {
        initComponents();
    }
    
    @Override
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ventas.png"));
       return retValue;
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_producto = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_gestionar_categorias = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nueva_venta = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_gestionar_ventas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_reportes_categorias = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_reportes_producto = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_reportes_ventas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_ver_historiar = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("BIENVENIDOS AL SISTEMA DE VENTAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabajo-en-equipo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 600));

        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_40px.png"))); // NOI18N
        jMenu1.setText("USUARIO");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_user_male_40px.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);
        jMenu1.add(jSeparator1);

        jMenuItem_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings_40px.png"))); // NOI18N
        jMenuItem_gestionar_usuario.setText("Gestionar Usuarios");
        jMenuItem_gestionar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/product_40px.png"))); // NOI18N
        jMenu2.setText("PRODUCTO");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 40));

        jMenuItem_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delivered_40px.png"))); // NOI18N
        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_nuevo_producto);
        jMenu2.add(jSeparator2);

        jMenuItem_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/supplier_40px.png"))); // NOI18N
        jMenuItem_gestionar_producto.setText("Gestionar Productos");
        jMenuItem_gestionar_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_producto);
        jMenu2.add(jSeparator3);

        jMenuItem_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/general_ledger_40px.png"))); // NOI18N
        jMenuItem_actualizar_stock.setText("Actualizar Stock");
        jMenuItem_actualizar_stock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizar_stockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(null);
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/team_40px.png"))); // NOI18N
        jMenu3.setText("CLIENTE");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 40));

        jMenuItem_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_user_male_40px.png"))); // NOI18N
        jMenuItem_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem_nuevo_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nuevo_cliente);
        jMenu3.add(jSeparator4);

        jMenuItem_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/worker_40px.png"))); // NOI18N
        jMenuItem_gestionar_cliente.setText("Gestionar Clientes");
        jMenuItem_gestionar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestionar_cliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(null);
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorize_40px.png"))); // NOI18N
        jMenu4.setText("CATEGORIA");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 40));

        jMenuItem_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_list_40px.png"))); // NOI18N
        jMenuItem_nueva_categoria.setText("Nueva Categoria");
        jMenuItem_nueva_categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_nueva_categoria);
        jMenu4.add(jSeparator5);

        jMenuItem_gestionar_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings_40px.png"))); // NOI18N
        jMenuItem_gestionar_categorias.setText("Gestionar Categorias");
        jMenuItem_gestionar_categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_gestionar_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_categorias);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(null);
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purchase_order_40px.png"))); // NOI18N
        jMenu5.setText("FACTURAR");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 40));

        jMenuItem_nueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell_40px.png"))); // NOI18N
        jMenuItem_nueva_venta.setText("Nueva Venta");
        jMenuItem_nueva_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nueva_venta);
        jMenu5.add(jSeparator6);

        jMenuItem_gestionar_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/job_40px.png"))); // NOI18N
        jMenuItem_gestionar_ventas.setText("Gestionar Ventas");
        jMenuItem_gestionar_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_gestionar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_ventasActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_gestionar_ventas);

        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(null);
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_graph_report_40px.png"))); // NOI18N
        jMenu6.setText("REPORTES");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 40));

        jMenuItem_reportes_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/investment_portfolio_40px.png"))); // NOI18N
        jMenuItem_reportes_clientes.setText("Reportes Clientes");
        jMenuItem_reportes_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem_reportes_clientes);
        jMenu6.add(jSeparator7);

        jMenuItem_reportes_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/investment_portfolio_40px.png"))); // NOI18N
        jMenuItem_reportes_categorias.setText("Reportes Categorias");
        jMenuItem_reportes_categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem_reportes_categorias);
        jMenu6.add(jSeparator8);

        jMenuItem_reportes_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/investment_portfolio_40px.png"))); // NOI18N
        jMenuItem_reportes_producto.setText("Reportes Productos");
        jMenuItem_reportes_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem_reportes_producto);
        jMenu6.add(jSeparator9);

        jMenuItem_reportes_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/investment_portfolio_40px.png"))); // NOI18N
        jMenuItem_reportes_ventas.setText("Reportes Ventas");
        jMenuItem_reportes_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.add(jMenuItem_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(null);
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/order_history_40px.png"))); // NOI18N
        jMenu7.setText("HISTORIAL");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 40));

        jMenuItem_ver_historiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view_schedule_40px.png"))); // NOI18N
        jMenuItem_ver_historiar.setText("Ver Historial");
        jMenuItem_ver_historiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem_ver_historiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ver_historiarActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ver_historiar);

        jMenuBar1.add(jMenu7);

        jMenu8.setBorder(null);
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shutdown_40px.png"))); // NOI18N
        jMenu8.setText("CERRAR SESION");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(165, 40));
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed

    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
        FrmCategoria intcategiria = new FrmCategoria();
        intcategiria.setVisible(true);
        intcategiria.pack();
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriasActionPerformed
        FrmGestionarCategoria intGestionCategoria = new FrmGestionarCategoria();
        intGestionCategoria.setVisible(true);
        intGestionCategoria.pack();
    }//GEN-LAST:event_jMenuItem_gestionar_categoriasActionPerformed

    private void jMenuItem_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_productoActionPerformed
        FrmProducto intProducto = new FrmProducto();
        intProducto.setVisible(true);
        intProducto.pack();
    }//GEN-LAST:event_jMenuItem_nuevo_productoActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        FrmGestionarProducto intGestionProducto = new FrmGestionarProducto();
        intGestionProducto.setVisible(true);
        intGestionProducto.pack();
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizar_stockActionPerformed
        FrmActualizarStock intactualizar = new FrmActualizarStock();
        intactualizar.setVisible(true);
        intactualizar.pack();
    }//GEN-LAST:event_jMenuItem_actualizar_stockActionPerformed

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed
        FrmCliente intCliente = new FrmCliente();
        intCliente.setVisible(true);
        intCliente.pack();
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_clienteActionPerformed
        FrmGestionarCliente intGestionCliente = new FrmGestionarCliente();
        intGestionCliente.setVisible(true);
        intGestionCliente.pack();
    }//GEN-LAST:event_jMenuItem_gestionar_clienteActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        FrmNuevoUsuario intNuevoUsuario = new FrmNuevoUsuario();
        intNuevoUsuario.setVisible(true);
        intNuevoUsuario.pack();
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
        FrmGestionarUsuario intGestionUsuario = new FrmGestionarUsuario();
        intGestionUsuario.setVisible(true);
        intGestionUsuario.pack();
    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_ventaActionPerformed
        FrmFacturacion intFacturacion = new FrmFacturacion();
        intFacturacion.setVisible(true);
        intFacturacion.pack();
    }//GEN-LAST:event_jMenuItem_nueva_ventaActionPerformed

    private void jMenuItem_gestionar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_ventasActionPerformed
        FrmGestionarVentas intGestionVentas = new FrmGestionarVentas();
        intGestionVentas.setVisible(true);
        intGestionVentas.pack();
    }//GEN-LAST:event_jMenuItem_gestionar_ventasActionPerformed

    private void jMenuItem_ver_historiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ver_historiarActionPerformed
        FrmGraficas fgraficas = new FrmGraficas();
        fgraficas.setVisible(true);
        fgraficas.pack();
    }//GEN-LAST:event_jMenuItem_ver_historiarActionPerformed

    public static void main(String args[]) {
        try {
            FlatArcDarkOrangeIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem_gestionar_categorias;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_gestionar_ventas;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_venta;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_producto;
    private javax.swing.JMenuItem jMenuItem_reportes_ventas;
    private javax.swing.JMenuItem jMenuItem_ver_historiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
