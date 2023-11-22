package vista;

import conexion.Conexion;
import controlador.Ctrl_Cliente;
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
import modelo.Cliente;


public class FrmGestionarCliente extends javax.swing.JFrame {

    int xx, xy;
    private int idCliente;

    public FrmGestionarCliente() {
        initComponents();
        CargarTablaClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jButton_actualizar = new javax.swing.JLabel();
        jButton_eliminar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();

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
        jLabel1.setText("ADMINISTRAR CLIENTES");
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

        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_clientes);

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
        jLabel3.setText("Direccion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 90, 30));

        txt_dni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 170, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 319, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Apellido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 269, 80, 30));

        txt_apellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 170, 30));

        txt_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 170, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("DNI");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        txt_direccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 170, 30));

        txt_telefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 170, 30));

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
                Logger.getLogger(FrmGestionarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_actualizarMouseClicked
        if (txt_nombre.getText().isEmpty() && txt_apellido.getText().isEmpty() && txt_dni.getText().isEmpty() && txt_telefono.getText().isEmpty() && txt_direccion.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null, "!Complete todos los campos¡");
        } else {
            Cliente cliente = new Cliente();
            Ctrl_Cliente controlCliente = new Ctrl_Cliente();
            
            cliente.setNombre(txt_nombre.getText().trim());
            cliente.setApellido(txt_apellido.getText().trim());
            cliente.setDni(txt_dni.getText().trim());
            cliente.setTelefono(txt_telefono.getText().trim());
            cliente.setDireccion(txt_direccion.getText().trim());
            
            if (controlCliente.actualizar(cliente, idCliente)) {
                JOptionPane.showMessageDialog(null, "!Datos del cliente actualizados¡");
                CargarTablaClientes();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "!Error al actualizar¡");
            }
        }
    }//GEN-LAST:event_jButton_actualizarMouseClicked

    private void jButton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_eliminarMouseClicked
        Ctrl_Cliente controlCliente = new Ctrl_Cliente();
        if (idCliente == 0) {
            JOptionPane.showMessageDialog(null, "!Seleccione un Cliente¡");  
        } else {
            if (!controlCliente.eliminar(idCliente)) {
                JOptionPane.showMessageDialog(null, "!Cliente Eliminado¡");
                CargarTablaClientes();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "!Error al eliminar cliente¡");
                Limpiar();
            }
        }
    }//GEN-LAST:event_jButton_eliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton_actualizar;
    private javax.swing.JLabel jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_clientes;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txt_nombre.setText("");
        txt_telefono.setText("");
        txt_dni.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
    }

    private void CargarTablaClientes() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from tb_cliente";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmGestionarCliente.jTable_clientes = new JTable(model);
            FrmGestionarCliente.jScrollPane1.setViewportView(FrmGestionarCliente.jTable_clientes);
            model.addColumn("N°");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("dni");
            model.addColumn("telefono");
            model.addColumn("direccion");
            model.addColumn("estado");

            while (rs.next()) {

                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla clientes: " + e);
        }

        jTable_clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_clientes.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCliente = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClienteSelecionado(idCliente);
                } else {
                }
            }
        });
    }

    private void EnviarDatosClienteSelecionado(int idCliente) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("select * from tb_cliente where idCliente = '" + idCliente + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellido.setText(rs.getString("apellido"));
                txt_dni.setText(rs.getString("dni"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_direccion.setText(rs.getString("direccion"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar cliente: " + e);
        }
    }

}
