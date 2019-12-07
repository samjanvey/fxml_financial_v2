package Model;

import java.util.ArrayList;

public class Model
{    
    UserList userList;
    
    public Model()
    {
        userList = new UserList();
    }
    
    public UserList getUserList() {
        return this.userList;
    }
}