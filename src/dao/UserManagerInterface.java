package dao;

import java.util.List;
import model.User;

public interface UserManagerInterface {
    
    public int login(int userType, String user, String password);
    public boolean logout();
    public boolean createNewUser(User user);
    public User getUser(int userId);
    public User getUser(String userId);
    public List<User> getUsers();
    public void updateUser(int userId, User newUserInfo);
    public void deleteUser(int userId);
    public boolean adminExists();
        
}
