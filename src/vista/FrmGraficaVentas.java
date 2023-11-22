package vista;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmGraficaVentas extends javax.swing.JFrame {

    ArrayList<Integer> listaCantidad = new ArrayList<>();
    ArrayList<String> listaFechas = new ArrayList<>();
    int cantidadResultados = 0;
    String[] vector_fechaVenta;
    int[] vector_estatus_cantidad;
    int xx, xy;
    
    public FrmGraficaVentas() {
        initComponents();
        MetodoContador();
        vector_fechaVenta = new String[cantidadResultados];
        vector_estatus_cantidad = new int[cantidadResultados];
        MetodoAlmacenaDatos();
    }

    private int MetodoContador() {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select fechaVenta, count(fechaVenta) as Ventas from tb_cabecera_venta "
                    + "where fechaVenta BETWEEN '" + FrmGraficas.fecha_inicio + "' and '" + FrmGraficas.fecha_fin + "' group by fechaVenta;");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cantidadResultados++;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error en: " + e);
        }
        return cantidadResultados;
    }

    private void MetodoAlmacenaDatos() {
        try {
            Connection cn = Conexion.conectar();

            PreparedStatement pst = cn.prepareStatement("select fechaVenta, count(fechaVenta) as Ventas from tb_cabecera_venta "
                    + "where fechaVenta BETWEEN '" + FrmGraficas.fecha_inicio + "' and '" + FrmGraficas.fecha_fin + "' group by fechaVenta;");
            ResultSet rs = pst.executeQuery();
            int contador = 0;
            while (rs.next()) {
                vector_fechaVenta[contador] = rs.getString("fechaVenta");
                listaFechas.add(vector_fechaVenta[contador]);
                vector_estatus_cantidad[contador] = rs.getInt("Ventas");
                listaCantidad.add(vector_estatus_cantidad[contador]);
                contador++;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error en: " + e);
        }
    }

    public int MetodoMayorVenta(ArrayList<Integer> listaCantidad) {
        int mayor = 0;
        for (int i = 0; i < listaCantidad.size(); i++) {
            if (listaCantidad.get(i) > mayor) {
                mayor = listaCantidad.get(i);
            }
        }
        return mayor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HISTORIAL DE VENTAS");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 30));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

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
                Logger.getLogger(FrmGraficaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int mayorVenta = MetodoMayorVenta(listaCantidad);
        int largo_NuevoIngreso = 0;
        int parametro1 = 133;
        int parametroFecha = 118;
        int parametro3 = 100;

        for (int i = 0; i < listaCantidad.size(); i++) {
            largo_NuevoIngreso = listaCantidad.get(i) * 400 / mayorVenta;
            if (i == 0) {
               g.setColor(new Color(140, 0, 75));
            } else if (i == 1) {
               g.setColor(new Color(255, 51, 51));
            } else if (i == 2) {
               g.setColor(new Color(0, 0, 0));
            } else if (i == 3) {
               g.setColor(new Color(0, 153, 153));
            } else if (i == 4) {
               g.setColor(new Color(0, 85, 0)); 
            } else if (i == 5) {
               g.setColor(new Color(51, 102, 255)); 
            } else if (i == 6) {
               g.setColor(new Color(255, 127, 0)); 
            } else {
              g.setColor(new Color(255, 204, 0));
            }
            
            g.fillRect(100, parametro3, largo_NuevoIngreso, 40);
            g.drawString(listaFechas.get(i), 10, parametroFecha);
            g.drawString("Cantidad: " + listaCantidad.get(i), 10, parametro1);
            parametro1 += 50;
            parametroFecha += 50;
            parametro3 += 50;
        }
    }

}
