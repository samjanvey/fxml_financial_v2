package Model;

import java.util.ArrayList;

/**
 *
 * @author sam
 */
public class UserList {
    
    User user;
    ArrayList<User> userList;
    
    public UserList(User user) {
        
    }
    
    
    /* Empty constructor can be used for creating dummy account for testing */
    
    public UserList() {
        userList = new ArrayList<User>();
        createDefaultUser(); // Dummy method to create default creds
    }
    
    public User createDefaultUser(){
        user = new User("admin", "password"); // Needs to be deleted eventually
        userList.add(this.user);
        
        return this.user;
    }
    
    public Boolean compareCreds(String user, String pass) {
        // Check if User/pw exists
        for (int i = 0; i < userList.size(); i++) {
            for (int j = 0; j < userList.size(); j++) {
                if (userList.get(j).getEmail().equals(user)) {
                    break;
                } else {
                    return false;
                }
            }
            if (userList.get(i).getPassword().equals(pass)) {
                return true;
            }
        }
        return false; // Default to False - better safe than sorry
    }
    
    public String getUserEmail() {
        return this.user.email.toString();
    }
    
    public String getUserPassword() {
        return this.user.password.toString();
    }
}