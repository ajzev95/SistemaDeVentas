package vista;

import conexion.Conexion;
import controlador.Ctrl_RegistrarVenta;
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
import modelo.CabeceraVenta;


public class FrmGestionarVentas extends javax.swing.JFrame {

    int xx, xy;
    private int idCliente = 0;
    private int idVenta;

    public FrmGestionarVentas() {
        initComponents();
        CargarComboClientes();
        CargarTablaVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ventas = new javax.swing.JTable();
        jButton_actualizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_total_pagar = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        jComboBox_cliente = new javax.swing.JComboBox<>();
        jComboBox_estado = new javax.swing.JComboBox<>();

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
        jLabel1.setText("ADMINISTRAR VENTAS");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 30));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 40, 30));

        jTable_ventas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_ventas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 870, 160));

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
        jPanel1.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 110, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Total Pagar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fecha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 319, 50, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 269, 80, 30));

        txt_total_pagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_total_pagar.setEnabled(false);
        jPanel1.add(txt_total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 180, 30));

        txt_fecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_fecha.setEnabled(false);
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 180, 30));

        jComboBox_cliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente:", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 250, 30));

        jComboBox_estado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel1.add(jComboBox_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 370));

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
                Logger.getLogger(FrmGestionarVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_actualizarMouseClicked
       CabeceraVenta cabeceraVenta = new CabeceraVenta();
       Ctrl_RegistrarVenta controlRegistrarVenta = new Ctrl_RegistrarVenta();
       String cliente, estado;
       cliente = jComboBox_cliente.getSelectedItem().toString().trim();
       estado = jComboBox_estado.getSelectedItem().toString().trim();
       
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idCliente, concat(nombre, ' ', apellido) as cliente  from tb_cliente where concat(nombre, ' ', apellido) = '" + cliente + "'");
            ResultSet rs =  pst.executeQuery();
            if (rs.next()) {
                idCliente = rs.getInt("idCliente");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error en cargar el id cliente: " + e);
        }
        
        if (!cliente.equalsIgnoreCase("Seleccione cliente:")) {
            cabeceraVenta.setIdCliente(idCliente);
            if (estado.equalsIgnoreCase("Activo")) {
                cabeceraVenta.setEstado(1);
            } else {
                cabeceraVenta.setEstado(0);
            }
            
            if (controlRegistrarVenta.actualizar(cabeceraVenta, idVenta)) {
                JOptionPane.showMessageDialog(null, "¡Registro Actualizado!");
                CargarTablaVentas();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro para actualizar datos");
        }
        
    }//GEN-LAST:event_jButton_actualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton_actualizar;
    private javax.swing.JComboBox<String> jComboBox_cliente;
    private javax.swing.JComboBox<String> jComboBox_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_ventas;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txt_total_pagar.setText("");
        txt_fecha.setText("");
        jComboBox_cliente.setSelectedItem("Seleccione cliente:");
        jComboBox_estado.setSelectedItem("Activo");
        idCliente = 0;
    }

    private void CargarTablaVentas() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select cv.idCabeceraVenta as id, concat(c.nombre, ' ', c.apellido) as cliente, "
         + "cv.valorPagar as total, cv.fechaVenta as fecha, cv.estado from tb_cabecera_venta as cv, "
         + "tb_cliente as c where cv.idCliente = c.idCliente";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmGestionarVentas.jTable_ventas = new JTable(model);
            FrmGestionarVentas.jScrollPane1.setViewportView(FrmGestionarVentas.jTable_ventas);
            model.addColumn("N°");
            model.addColumn("cliente");
            model.addColumn("Total Pagar");
            model.addColumn("Fecha Venta");
            model.addColumn("estado");

            while (rs.next()) {

                Object fila[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    if (i == 4) {
                        String estado = String.valueOf(rs.getObject(i + 1));
                        if (estado.equalsIgnoreCase("1")) {
                            fila[i] = "Activo";
                        } else {
                            fila[i] = "Inactivo";
                        }
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla de ventas: " + e);
        }

        jTable_ventas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_ventas.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idVenta = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosVentaSelecionado(idVenta);
                } else {
                }
            }
        });
    }

    private void EnviarDatosVentaSelecionado(int idVenta) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("select cv.idCabeceraVenta, cv.idCliente, concat(c.nombre, ' ', c.apellido) as cliente, cv.valorPagar, cv.fechaVenta, cv.estado \n" +
            "from tb_cabecera_venta as cv, tb_cliente as c where cv.idCabeceraVenta = '" +idVenta+ "' and cv.idCliente = c.idCliente;");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                jComboBox_cliente.setSelectedItem(rs.getString("cliente"));
                txt_total_pagar.setText(rs.getString("valorPagar"));
                txt_fecha.setText(rs.getString("fechaVenta"));
                int estado = rs.getInt("estado");
                if (estado == 1) {
                    jComboBox_estado.setSelectedItem("Activo");
                } else {
                    jComboBox_estado.setSelectedItem("Inactivo");
                }
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar venta: " + e);
        }
    }

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
    
}
