package views;

import common.Common;
import dao.UserManagerService;
import model.User;
import utils.Utils;

public class HomeView extends javax.swing.JFrame {

    UserManagerService userService = new UserManagerService();
    User currentUser = userService.getUser(Common.USER_SESSION_ID);
    Modifiy_DeleteView mdView;

    public HomeView() {
        initComponents();
        dateLabel.setText(Utils.setActualDate());
        welcomeLabel.setText("Bienvenido, " + currentUser.getName() + " " + currentUser.getFirstLastname());
        if (verifyPermissions()) {
            user_managment_menu.setVisible(false);
            modificarCuenta_item.setText("Mi cuenta");
        }
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_inscripcion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_generacion_boletas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_listar_alumno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_calificaciones = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        accountMenu = new javax.swing.JMenu();
        modificarCuenta_item = new javax.swing.JMenuItem();
        logoutItem = new javax.swing.JMenuItem();
        user_managment_menu = new javax.swing.JMenu();
        altas_item = new javax.swing.JMenuItem();
        modif_bajas_item = new javax.swing.JMenuItem();
        list_item = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        bitacora_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        panel_inscripcion.setBackground(new java.awt.Color(255, 204, 153));
        panel_inscripcion.setForeground(new java.awt.Color(51, 51, 51));
        panel_inscripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_inscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_inscripcionMouseClicked(evt);
            }
        });
        panel_inscripcion.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/students/birret_24dp.png"))); // NOI18N
        jLabel2.setText("Inscripción de alumnos");
        panel_inscripcion.add(jLabel2, new java.awt.GridBagConstraints());

        panel_generacion_boletas.setBackground(new java.awt.Color(19, 19, 19));
        panel_generacion_boletas.setForeground(new java.awt.Color(204, 204, 204));
        panel_generacion_boletas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_generacion_boletas.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/students/document_24dp.png"))); // NOI18N
        jLabel3.setText("Generación de boletas");
        panel_generacion_boletas.add(jLabel3, new java.awt.GridBagConstraints());

        panel_listar_alumno.setBackground(new java.awt.Color(204, 204, 255));
        panel_listar_alumno.setForeground(new java.awt.Color(51, 51, 51));
        panel_listar_alumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_listar_alumno.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/students/students_list_24dp.png"))); // NOI18N
        jLabel4.setText("Lista de alumnos");
        panel_listar_alumno.add(jLabel4, new java.awt.GridBagConstraints());

        panel_calificaciones.setBackground(new java.awt.Color(204, 255, 153));
        panel_calificaciones.setForeground(new java.awt.Color(51, 51, 51));
        panel_calificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_calificaciones.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/students/star_grade_24dp.png"))); // NOI18N
        jLabel5.setText("Captura de calificaciones");
        panel_calificaciones.add(jLabel5, new java.awt.GridBagConstraints());

        dateLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dateLabel.setForeground(Common.SECOND_GRAY        );
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Fecha actual");

        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        welcomeLabel.setText("Bienvenido, {nombre - apellido p}");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_inscripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(panel_generacion_boletas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_listar_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_calificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_inscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(panel_calificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_listar_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(panel_generacion_boletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        accountMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users_managment/account_24dp.png"))); // NOI18N
        accountMenu.setText("Cuenta");
        accountMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        modificarCuenta_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users_managment/edit_18dp.png"))); // NOI18N
        modificarCuenta_item.setText("Modificar mi cuenta");
        modificarCuenta_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCuenta_itemActionPerformed(evt);
            }
        });
        accountMenu.add(modificarCuenta_item);

        logoutItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users_managment/logout_18dp.png"))); // NOI18N
        logoutItem.setText("Cerrar sesión");
        logoutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutItemActionPerformed(evt);
            }
        });
        accountMenu.add(logoutItem);

        jMenuBar1.add(accountMenu);

        user_managment_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users_managment/manage_accounts_18dp.png"))); // NOI18N
        user_managment_menu.setText("Gestión de usuarios");
        user_managment_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        altas_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        altas_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users_managment/add_user_18dp.png"))); // NOI18N
        altas_item.setText("Altas");
        altas_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altas_itemActionPerformed(evt);
            }
        });
        user_managment_menu.add(altas_item);

        modif_bajas_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        modif_bajas_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users_managment/edit_18dp.png"))); // NOI18N
        modif_bajas_item.setText("Modificaciones y bajas");
        modif_bajas_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modif_bajas_itemActionPerformed(evt);
            }
        });
        user_managment_menu.add(modif_bajas_item);

        list_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        list_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users_managment/list_18dp.png"))); // NOI18N
        list_item.setText("Listar usuarios");
        list_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_itemActionPerformed(evt);
            }
        });
        user_managment_menu.add(list_item);
        user_managment_menu.add(jSeparator1);

        bitacora_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        bitacora_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users_managment/log_18_px.png"))); // NOI18N
        bitacora_item.setText("Bitácora de acciones");
        user_managment_menu.add(bitacora_item);

        jMenuBar1.add(user_managment_menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altas_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altas_itemActionPerformed
        CreateNewProfileView createView = new CreateNewProfileView();
        createView.setVisible(true);
    }//GEN-LAST:event_altas_itemActionPerformed

    private void logoutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutItemActionPerformed
        if (userService.logout()) {
            LoginView loginView = new LoginView();
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.setVisible(false);
            loginView.setVisible(true);
        }
    }//GEN-LAST:event_logoutItemActionPerformed

    private void modificarCuenta_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCuenta_itemActionPerformed
        mdView = new Modifiy_DeleteView();
        this.setVisible(false);
        mdView.setVisible(true);
    }//GEN-LAST:event_modificarCuenta_itemActionPerformed

    private void modif_bajas_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modif_bajas_itemActionPerformed
        mdView = new Modifiy_DeleteView();
        mdView.setVisible(true);
    }//GEN-LAST:event_modif_bajas_itemActionPerformed

    private void panel_inscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_inscripcionMouseClicked
        InscripcionAlumnosView inscripcionView = new InscripcionAlumnosView();
        this.dispose();
        inscripcionView.setVisible(true);
    }//GEN-LAST:event_panel_inscripcionMouseClicked

    private void list_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_itemActionPerformed
        ListUsersView usersView = new ListUsersView();
        usersView.setVisible(true);
    }//GEN-LAST:event_list_itemActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu accountMenu;
    private javax.swing.JMenuItem altas_item;
    private javax.swing.JMenuItem bitacora_item;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem list_item;
    private javax.swing.JMenuItem logoutItem;
    private javax.swing.JMenuItem modif_bajas_item;
    private javax.swing.JMenuItem modificarCuenta_item;
    private javax.swing.JPanel panel_calificaciones;
    private javax.swing.JPanel panel_generacion_boletas;
    private javax.swing.JPanel panel_inscripcion;
    private javax.swing.JPanel panel_listar_alumno;
    private javax.swing.JMenu user_managment_menu;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
