package Model;


import java.time.LocalDate;
import java.util.Date;

public class Transaction {

    LocalDate date;
    String transactionName;
    Double amount;
    Integer type;

    public Transaction(LocalDate date, String transactionName, Double amount, Integer type) {
        this.date = date;
        this.transactionName = transactionName;
        this.amount = amount;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
