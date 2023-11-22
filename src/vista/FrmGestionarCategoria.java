package vista;

import conexion.Conexion;
import controlador.Ctrl_Categoria;
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
import modelo.Categoria;

public class FrmGestionarCategoria extends javax.swing.JFrame {

    int xx, xy;
    private int idCategoria;

    public FrmGestionarCategoria() {
        initComponents();
        CargarTablaCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_categorias = new javax.swing.JTable();
        jButton_actualizar = new javax.swing.JLabel();
        jButton_eliminar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();

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
        jLabel1.setText("ADMINISTRAR CATEGORIAS");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 30));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 40, 30));

        jTable_categorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_categorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 60, 350, 310));

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
        jPanel1.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 170, 30));

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
        jPanel1.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 170, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 170, -1));

        txt_descripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 390));

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
                Logger.getLogger(FrmGestionarCategoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_actualizarMouseClicked
        if (!txt_descripcion.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            Ctrl_Categoria controlCategoria = new Ctrl_Categoria();
            
            categoria .setDescripcion(txt_descripcion.getText().trim());
            if (controlCategoria.actualizar(categoria, idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria Actualizada");
                txt_descripcion.setText("");
                CargarTablaCategorias();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Actualizar la categoria");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria");
        }
    }//GEN-LAST:event_jButton_actualizarMouseClicked

    private void jButton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_eliminarMouseClicked
        if (!txt_descripcion.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            Ctrl_Categoria controlCategoria = new Ctrl_Categoria();
            
            categoria .setDescripcion(txt_descripcion.getText().trim());
            if (!controlCategoria.eliminar(idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria Eliminada");
                txt_descripcion.setText("");
                CargarTablaCategorias();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar la categoria");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una categoria");
        } 
    }//GEN-LAST:event_jButton_eliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton_actualizar;
    private javax.swing.JLabel jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_categorias;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables

    private void CargarTablaCategorias() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select idCategoria, descripcion, estado from tb_categoria";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmGestionarCategoria.jTable_categorias = new JTable(model);
            FrmGestionarCategoria.jScrollPane1.setViewportView(FrmGestionarCategoria.jTable_categorias);
            model.addColumn("IdCategoria");
            model.addColumn("descripcion");
            model.addColumn("estado");

            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla categorias: " + e);
        }

        jTable_categorias.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_categorias.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCategoria = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosCategoriaSelecionada(idCategoria);
                } else {
                }
            }
        });
    }

    private void EnviarDatosCategoriaSelecionada(int idCategoria) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst  = con.prepareStatement("select * from tb_categoria where idCategoria = '"+idCategoria+"'");
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                txt_descripcion.setText(rs.getString("descripcion"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar categoria: " + e);
        }
    }

}
