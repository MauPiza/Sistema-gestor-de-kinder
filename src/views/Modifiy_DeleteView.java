package views;

import common.Common;
import dao.UserManagerService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.User;

public final class Modifiy_DeleteView extends javax.swing.JFrame {

    UserManagerService userService = new UserManagerService();
    User currentUser = userService.getUser(Common.USER_SESSION_ID);
    User newUser = new User();
    List<User> users = new ArrayList();

    public Modifiy_DeleteView() {
        initComponents();
        setLocationRelativeTo(null);
        refreshComboBox();
        if (verifyPermissions()) {
            agregarUsuarioLabel.setText("Mi cuenta");
            selectUser_label1.setVisible(false);
            selectUser_comboBox.setVisible(false);
            buttonDelete.setVisible(false);
            buttonUpdate.setVisible(false);
            nameField.setEnabled(false);
            ape_patField.setEnabled(false);
            ape_matField.setEnabled(false);
            usernameField.setEnabled(false);
            passwordField.setEnabled(false);
        }
    }
    
    public Modifiy_DeleteView(boolean isSecretary) {
        initComponents();
        setLocationRelativeTo(null);
        refreshComboBox();
        if (verifyPermissions()) {
            agregarUsuarioLabel.setText("Mi cuenta");
            selectUser_label1.setVisible(false);
            selectUser_comboBox.setVisible(false);
            buttonDelete.setVisible(false);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        agregarUsuarioLabel = new javax.swing.JLabel();
        selectUser_comboBox = new javax.swing.JComboBox<>();
        back_label = new javax.swing.JLabel();
        selectUser_label1 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        ape_matField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        buttonDelete = new javax.swing.JPanel();
        deleteAccountLabel = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        ape_patField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        leftPanel.setBackground(Common.ORANGED_COLOR);
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarUsuarioLabel.setFont(new java.awt.Font("Roboto Slab", 0, 36)); // NOI18N
        agregarUsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        agregarUsuarioLabel.setText("Modificar / eliminar");
        leftPanel.add(agregarUsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 70));

        selectUser_comboBox.setBackground(new java.awt.Color(248, 255, 215));
        selectUser_comboBox.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        selectUser_comboBox.setForeground(new java.awt.Color(51, 51, 51));
        selectUser_comboBox.setBorder(null);
        selectUser_comboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectUser_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUser_comboBoxActionPerformed(evt);
            }
        });
        leftPanel.add(selectUser_comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 350, 40));

        back_label.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        back_label.setForeground(new java.awt.Color(255, 255, 255));
        back_label.setText("Volver");
        back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_labelMouseClicked(evt);
            }
        });
        leftPanel.add(back_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        selectUser_label1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        selectUser_label1.setForeground(new java.awt.Color(255, 255, 255));
        selectUser_label1.setText("Selecciona un usuario");
        leftPanel.add(selectUser_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");
        rightPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setText("Escribe tu nombre");
        nameField.setBorder(null);
        rightPanel.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 370, 40));

        jSeparator3.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator3.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellidos");
        rightPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        ape_matField.setBackground(new java.awt.Color(255, 255, 255));
        ape_matField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        ape_matField.setForeground(new java.awt.Color(102, 102, 102));
        ape_matField.setText("Apellido materno");
        ape_matField.setBorder(null);
        ape_matField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ape_matFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ape_matFieldFocusLost(evt);
            }
        });
        rightPanel.add(ape_matField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 180, 38));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre de usuario");
        rightPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(102, 102, 102));
        usernameField.setBorder(null);
        rightPanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 370, 38));

        jSeparator5.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator5.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, -1));

        buttonDelete.setBackground(new java.awt.Color(255, 51, 51));
        buttonDelete.setForeground(new java.awt.Color(51, 51, 51));
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        deleteAccountLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        deleteAccountLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteAccountLabel.setText("ELIMINAR CUENTA");
        deleteAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonDeleteLayout = new javax.swing.GroupLayout(buttonDelete);
        buttonDelete.setLayout(buttonDeleteLayout);
        buttonDeleteLayout.setHorizontalGroup(
            buttonDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonDeleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonDeleteLayout.setVerticalGroup(
            buttonDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonDeleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightPanel.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        buttonUpdate.setBackground(new java.awt.Color(0, 96, 100));
        buttonUpdate.setForeground(new java.awt.Color(51, 51, 51));
        buttonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        updateLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        updateLabel.setForeground(new java.awt.Color(255, 255, 255));
        updateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateLabel.setText("ACTUALIZAR");
        updateLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout buttonUpdateLayout = new javax.swing.GroupLayout(buttonUpdate);
        buttonUpdate.setLayout(buttonUpdateLayout);
        buttonUpdateLayout.setHorizontalGroup(
            buttonUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonUpdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buttonUpdateLayout.setVerticalGroup(
            buttonUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonUpdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightPanel.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator8.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 370, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Contraseña");
        rightPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setBorder(null);
        rightPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 370, 38));

        ape_patField.setBackground(new java.awt.Color(255, 255, 255));
        ape_patField.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        ape_patField.setForeground(new java.awt.Color(102, 102, 102));
        ape_patField.setText("Apellido paterno");
        ape_patField.setBorder(null);
        ape_patField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ape_patFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ape_patFieldFocusLost(evt);
            }
        });
        rightPanel.add(ape_patField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, 38));

        jSeparator6.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator6.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 180, 10));

        jSeparator10.setBackground(new java.awt.Color(215, 255, 217));
        jSeparator10.setForeground(new java.awt.Color(215, 255, 217));
        rightPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 370, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 380, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 420, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteAccountLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountLabelMouseClicked
        if (selectUser_comboBox.getSelectedIndex() != 0) {
            deleteAccount();
            refreshComboBox();
        }
    }//GEN-LAST:event_deleteAccountLabelMouseClicked

    private void updateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseClicked
        updateUser();
    }//GEN-LAST:event_updateLabelMouseClicked

    private void ape_patFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ape_patFieldFocusGained
        if (ape_patField.getText().equalsIgnoreCase("Apellido paterno")) {
            ape_patField.setText("");
        }
    }//GEN-LAST:event_ape_patFieldFocusGained

    private void ape_patFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ape_patFieldFocusLost
        if (ape_patField.getText().isBlank()) {
            ape_patField.setText("Apellido paterno");
        }
    }//GEN-LAST:event_ape_patFieldFocusLost

    private void ape_matFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ape_matFieldFocusGained
        if (ape_matField.getText().equalsIgnoreCase("Apellido materno")) {
            ape_matField.setText("");
        }
    }//GEN-LAST:event_ape_matFieldFocusGained

    private void ape_matFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ape_matFieldFocusLost
        if (ape_matField.getText().isBlank()) {
            ape_matField.setText("Apellido materno");
        }
    }//GEN-LAST:event_ape_matFieldFocusLost

    private void back_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_labelMouseClicked
        this.dispose();
    }//GEN-LAST:event_back_labelMouseClicked

    private void selectUser_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectUser_comboBoxActionPerformed
        getUserData(selectUser_comboBox.getSelectedItem().toString());
    }//GEN-LAST:event_selectUser_comboBoxActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Modifiy_DeleteView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregarUsuarioLabel;
    private javax.swing.JTextField ape_matField;
    private javax.swing.JTextField ape_patField;
    private javax.swing.JLabel back_label;
    private javax.swing.JPanel buttonDelete;
    private javax.swing.JPanel buttonUpdate;
    private javax.swing.JLabel deleteAccountLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JComboBox<String> selectUser_comboBox;
    private javax.swing.JLabel selectUser_label1;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void deleteAccount() {
        if (selectUser_comboBox.getSelectedIndex() != 0) {
            if (deleteSecretaryAccount()) {
                //Eliminar el registro de la secretaria en base al ID obtenido del combobox
                userService.deleteUser(Integer.valueOf(selectUser_comboBox.getSelectedItem().toString()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar el perfil de Administrador");
        }
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void updateUser() {
        if (setUserData() != null) {
            //Se actualiza el registro con el ID obtenido del comboBox
            userService.updateUser(userService.getUser(selectUser_comboBox.getSelectedItem().toString()).getUserId(), setUserData());
        }
    }

    private boolean deleteSecretaryAccount() {
        boolean deleteSecretary = false;
        if (currentUser.getUserProfile() == Common.SECRETARY_USER_TYPE) {
            deleteSecretary = true;
        }
        return deleteSecretary;
    }

    //Seteamos los nuevos datos del usuario
    private User setUserData() {
        newUser.setName(nameField.getText());
        newUser.setFirstLastname(ape_patField.getText());
        newUser.setSecondLastName(ape_matField.getText());
        newUser.setUsername(usernameField.getText());
        newUser.setPassword(passwordField.getText());
        return newUser;
    }

    //Autollenamos los campos de la UI con los datos del usuario actual (fuente: BD)
    private void getUserData(String userId) {
        newUser = userService.getUser(userId);
        nameField.setText(newUser.getName());
        ape_patField.setText(newUser.getFirstLastname());
        ape_matField.setText(newUser.getSecondLastName());
        usernameField.setText(newUser.getUsername());
        passwordField.setText(newUser.getPassword());
    }

    private void refreshComboBox() {
        users = userService.getUsers();
        users.forEach(user -> {
            selectUser_comboBox.addItem(user.getUsername());
        });
    }

    public boolean verifyPermissions() {
        boolean hasPermission = false;
        /*
        * Valida los permisos del usuario actual
        * El permiso se concederá si el usuaio NO ES de tipo secretaria
         */
        if (Common.USER_SESSION_ID == currentUser.getUserId()
                && currentUser.getUserProfile() == Common.SECRETARY_USER_TYPE) {
            hasPermission = true;
        }
        return hasPermission;
    }
}
