package Model;

public class SerializedDataCollection {

    UserList userList;
    TransactionData transactionData;

    public SerializedDataCollection() {
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
