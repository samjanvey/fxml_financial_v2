package Model;

/**
 *
 * @author Brad, Sam
 */
public class User extends Person {
    protected String email; // could also be a username
    protected String password;
    private int accountID = 000001; // First account ID number. Each instantiation will increase by 1
    UserList userList;
    
    public User(String fName, String lName, String email) {
        super(fName, lName);
        this.email = email;
        this.accountID += 1; // Ensures each new User receives a unique AccountID
        addUserToList(this);
    }
    
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.accountID += 1;
    }
    
    public User() {
        
    }
    
    public void addUserToList(User user) {
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}