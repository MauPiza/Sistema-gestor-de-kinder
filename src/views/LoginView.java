package views;

import common.Common;
import dao.UserManagerService;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame {

    UserManagerService sessionManagment = new UserManagerService();
    String email = "", password = "";
    int userType = 0;

    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonEnter = new javax.swing.JPanel();
        labelEnter = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        checkBox = new javax.swing.JCheckBox();
        bottomPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Gestor de Calificaciones");
        setBackground(new java.awt.Color(255, 255, 255));

        contentPane.setBackground(new java.awt.Color(255, 255, 255));
        contentPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_kinder.png"))); // NOI18N
        contentPane.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 130, 110));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setText("Inicia sesión");
        contentPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 220, 50));

        jLabel2.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");
        contentPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 40));

        jLabel3.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        contentPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 40));

        buttonEnter.setBackground(new java.awt.Color(41, 35, 92));
        buttonEnter.setForeground(new java.awt.Color(255, 255, 255));
        buttonEnter.setLayout(new java.awt.CardLayout());

        labelEnter.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        labelEnter.setForeground(new java.awt.Color(255, 255, 255));
        labelEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnter.setText("ENTRAR");
        labelEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEnterMouseClicked(evt);
            }
        });
        buttonEnter.add(labelEnter, "card2");

        contentPane.add(buttonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 130, 60));

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText("Ingresa tu nombre de usuario");
        usernameField.setBorder(null);
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        contentPane.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 570, 40));
        contentPane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 570, 10));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("Contraseña");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        contentPane.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 570, 40));
        contentPane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 570, 10));

        checkBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        checkBox.setForeground(new java.awt.Color(102, 102, 102));
        checkBox.setText("Soy director");
        checkBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contentPane.add(checkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        bottomPane.setBackground(new java.awt.Color(30, 79, 145));
        bottomPane.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
            .addComponent(bottomPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottomPane, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEnterMouseClicked
        email = usernameField.getText();
        password = (passwordField.getText());

        if (!email.isBlank() && !password.isBlank()) {
            if (checkBox.isSelected()) {
                userType = Common.ADMIN_USER_TYPE;
            } else {
                userType = Common.SECRETARY_USER_TYPE;
            }
            if (sessionManagment.login(userType, email, password) >= 0) {
                HomeView homeView = new HomeView();
                this.setVisible(false);
                homeView.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puedes dejar campos vacios");
        }
    }//GEN-LAST:event_labelEnterMouseClicked

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        if (usernameField.getText().equalsIgnoreCase("Ingresa tu nombre de usuario")) {
            usernameField.setText("");
        }
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        if (usernameField.getText().isBlank()) {
            usernameField.setText("Ingresa tu nombre de usuario");
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        if (passwordField.getText().equalsIgnoreCase("Contraseña")) {
            passwordField.setText("");
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        if (passwordField.getText().isBlank()) {
            passwordField.setText("Contraseña");
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPane;
    private javax.swing.JPanel buttonEnter;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JPanel contentPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelEnter;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

}
