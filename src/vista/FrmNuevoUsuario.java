package vista;

import controlador.Ctrl_Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class FrmNuevoUsuario extends javax.swing.JFrame {

    int obtenerIdCategoriaCombo = 0;
    int xx, xy;

    public FrmNuevoUsuario() {
        initComponents();
        txt_password.setVisible(true);
        txt_password_visible.setVisible(false);
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
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jCheckBox_ver_clave = new javax.swing.JCheckBox();
        txt_password_visible = new javax.swing.JTextField();

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
        jLabel1.setText("NUEVO USUARIO");
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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 53, 100, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 94, 100, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, 100, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 174, 100, -1));

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
        jPanel1.add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 250, 250, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 214, 100, -1));

        txt_nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 50, 250, 28));

        txt_apellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 90, 250, 28));

        txt_usuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 130, 250, 28));

        txt_telefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 210, 250, 28));

        txt_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 170, 250, 28));

        jCheckBox_ver_clave.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox_ver_clave.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox_ver_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_ver_claveMouseClicked(evt);
            }
        });
        jPanel1.add(jCheckBox_ver_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, 28));

        txt_password_visible.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txt_password_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 170, 245, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

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
                Logger.getLogger(FrmNuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GuardarMouseClicked
        if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_usuario.getText().isEmpty() || txt_password.getText().isEmpty() || txt_telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            Usuario usuario = new Usuario();
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            if (!controlUsuario.existeUsuario(txt_usuario.getText().trim())) {
                usuario.setNombre(txt_nombre.getText().trim());
                usuario.setApellido(txt_apellido.getText().trim());
                usuario.setUsuario(txt_usuario.getText().trim());
                usuario.setPassword(txt_password.getText().trim());
                usuario.setTelefono(txt_telefono.getText().trim());
                usuario.setEstado(1);
                
                if (controlUsuario.guardar(usuario)) {
                    JOptionPane.showMessageDialog(null, "!Usuario Registrado¡");   
                } else {
                    JOptionPane.showMessageDialog(null, "!Error al Registrar Usuario¡");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya esta registrado, ingrese otro");
            }
        }
        Limpiar(); 
    }//GEN-LAST:event_jButton_GuardarMouseClicked

    private void jCheckBox_ver_claveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_ver_claveMouseClicked
        if (jCheckBox_ver_clave.isSelected() == true) {
            String pass = "";
            char[] passIngresado = txt_password.getPassword();
            for (int i = 0; i < passIngresado.length; i++) {
                pass +=passIngresado[i];
            }
            txt_password_visible.setText(pass);
            txt_password.setVisible(false);
            txt_password_visible.setVisible(true);
        } else {
            String passwordIngresado = txt_password_visible.getText().trim();
            txt_password.setText(passwordIngresado);
            txt_password.setVisible(true);
            txt_password_visible.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox_ver_claveMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton_Guardar;
    private javax.swing.JCheckBox jCheckBox_ver_clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_password_visible;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

   private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_password.setText("");
        txt_usuario.setText("");
        txt_telefono.setText("");
    }
}
