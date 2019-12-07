package Model;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public class SerializedDataCollection {

    private UserList userList;
    private TransactionData transactionData;

    public SerializedDataCollection() throws JAXBException, FileNotFoundException {
        userList = new UserList();
        transactionData = new TransactionData();
    }

    public UserList getUserList() {
        return userList;
    }

    public void setUserList(UserList userList) {
        this.userList = userList;
    }

    public TransactionData getTransactionData() {
        return transactionData;
    }

    public void setTransactionData(TransactionData transactionData) {
        this.transactionData = transactionData;
    }
}
