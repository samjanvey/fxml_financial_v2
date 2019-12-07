package Model;

public class SerializedDataCollection {

    private UserList userList;
    private TransactionData transactionData;
    /**
     * @return the userList
     */
    public UserList getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(UserList userList) {
        this.userList = userList;
    }

    /**
     * @return the transactionData
     */
    public TransactionData getTransactionData() {
        return transactionData;
    }

    /**
     * @param transactionData the transactionData to set
     */
    public void setTransactionData(TransactionData transactionData) {
        this.transactionData = transactionData;
    }

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
