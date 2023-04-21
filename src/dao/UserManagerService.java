package dao;

import common.Common;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.User;
import utils.DbConnection_MySQL;

public class UserManagerService implements UserManagerInterface {

    private final DbConnection_MySQL db = new DbConnection_MySQL();
    private final User user = new User();
    private final List<User> users = new ArrayList();

    @Override
    public boolean createNewUser(User user) {
        boolean created = false;
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            if (countSecretaryProfiles() < 3) {
                query.append("INSERT INTO usuarios VALUES (")
                        .append(0)
                        .append(",")
                        .append(user.getUserProfile())
                        .append(",'")
                        .append(user.getName())
                        .append("','")
                        .append(user.getFirstLastname())
                        .append("','")
                        .append(user.getSecondLastName())
                        .append("','")
                        .append(user.getUsername()).append("','")
                        .append(user.getPassword()).append("');");
                if ((boolean) db.execute(query.toString(), true)) {
                    JOptionPane.showMessageDialog(null, "Usuario creado");
                    created = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error. Usuario no creado");
                    System.out.println("Error: " + db.getError());
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Límite de usuarios excedidos"
                        + "\nConsejo: elimine un perfil para que esté disponible esta función.");
            }
        } catch (HeadlessException e) {
            System.out.println(db.getError());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            db.disconnect();
        }
        return created;
    }

    @Override
    public User getUser(int userId) {
        try {
            if (db.connect()) {
                String query = "SELECT * FROM usuarios WHERE id_usuario = " + userId + ";";
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    user.setUserId(rs.getInt("id_usuario"));
                    user.setUserProfile(rs.getInt("perfil"));
                    user.setName(rs.getString("nombre"));
                    user.setFirstLastname(rs.getString("apellido_paterno"));
                    user.setSecondLastName(rs.getString("apellido_materno"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                }
            }
        } catch (SQLException e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
        return user;
    }
    
        @Override
    public User getUser(String username) {
        try {
            if (db.connect()) {
                String query = "SELECT * FROM usuarios WHERE username = '" + username + "';";
                ResultSet rs = (ResultSet) db.execute(query, false);
                if (rs.next()) {
                    user.setUserId(rs.getInt("id_usuario"));
                    user.setUserProfile(rs.getInt("perfil"));
                    user.setName(rs.getString("nombre"));
                    user.setFirstLastname(rs.getString("apellido_paterno"));
                    user.setSecondLastName(rs.getString("apellido_materno"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                }
            }
        } catch (SQLException e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
        return user;
    }

    @Override
    public List<User> getUsers() {
        try {
            db.connect();
            String query = "SELECT * FROM usuarios";
            ResultSet rs = (ResultSet) db.execute(query, false);
            while (rs.next()) {
                User myUser = new User();
                myUser.setUserId(rs.getInt("id_usuario"));
                myUser.setUserProfile(rs.getInt("perfil"));
                myUser.setName(rs.getString("nombre"));
                myUser.setFirstLastname(rs.getString("apellido_paterno"));
                myUser.setSecondLastName(rs.getString("apellido_materno"));
                myUser.setUsername(rs.getString("username"));
                myUser.setPassword(rs.getString("password"));
                users.add(myUser);
            }
        } catch (SQLException e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
        return users;
    }

    @Override
    public void updateUser(int userId, User newUserInfo) {
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("UPDATE usuarios SET ")
                    .append("nombre = '").append(newUserInfo.getName()).append("',")
                    .append("apellido_paterno = '").append(newUserInfo.getFirstLastname()).append("',")
                    .append("apellido_materno = '").append(newUserInfo.getSecondLastName()).append("',")
                    .append("username = '").append(newUserInfo.getUsername()).append("',")
                    .append("password = '").append(newUserInfo.getPassword()).append("'")
                    .append(" WHERE id_usuario = ").append(userId).append(";");
            if ((boolean) db.execute(query.toString(), true)) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se hizo ningún cambio");
            }
        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
    }

    @Override
    public void deleteUser(int userId) {
        try {
            db.connect();
            String query = "DELETE FROM usuarios WHERE id_usuario = " + userId;

            int confirmarEliminar = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar la cuenta?");
            if (confirmarEliminar == JOptionPane.YES_OPTION) {
                if ((boolean) db.execute(query, true)) {
                    // Se asigna -1 para indicar que la sesión se ha cerrado y el ID (-1) no existe
                    Common.USER_SESSION_ID = -1;
                    JOptionPane.showMessageDialog(null, "Usuario eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
                }
            }
        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
    }

    @Override
    public int login(int userType, String user, String password) {
        // -1 para evaluar si el id en la base de datos no existe
        Common.USER_SESSION_ID = -1;
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("SELECT * FROM usuarios WHERE perfil = ")
                    .append(userType)
                    .append(" AND username = '")
                    .append(user)
                    .append("'")
                    .append(" AND password = '")
                    .append(password)
                    .append("';");
            ResultSet rs = (ResultSet) db.execute(query.toString(), false);
            if (rs.next()) {
                Common.USER_SESSION_ID = rs.getInt("id_usuario");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
        return Common.USER_SESSION_ID;
    }

    public boolean logout() {
        boolean isLoggedOut = false;
        int logout = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?");
        if (logout == JOptionPane.YES_OPTION) {
            Common.USER_SESSION_ID = -1;
            isLoggedOut = true;
        }
        return isLoggedOut;
    }

    private int countSecretaryProfiles() throws SQLException {
        int count = 0;
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM usuarios WHERE perfil = ")
                .append(Common.SECRETARY_USER_TYPE);
        ResultSet rs = (ResultSet) db.execute(query.toString(), false);
        while (rs.next()) {
            count++;
        }
        return count;
    }

    @Override
    public boolean adminExists() {
        StringBuilder query = new StringBuilder();
        boolean exist = false;
        try {
            db.connect();
            query.append("SELECT * FROM usuarios WHERE perfil = ")
                    .append(Common.ADMIN_USER_TYPE);
            ResultSet rs = (ResultSet) db.execute(query.toString(), false);
            if (rs.next()) {
                exist = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            db.disconnect();
        }
        return exist;
    }
}
