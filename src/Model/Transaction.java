package Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;


public class Transaction implements Serializable {

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

    public ArrayList<String> getAttributes() {
        ArrayList<String> attributes = new ArrayList<String>();
        for(int i = 0; i < 4; i++){
            attributes.add(getAttribute(i));
        }

        return attributes;
    }

    public String getAttribute(int n) {

        switch (n) {
            case 0:
                return getDate().toString();
            case 1:
                return getTransactionName();
            case 2:
                return getAmount().toString();
            case 3:
                return getType().toString();
            default:
                return "getAttribute error";
        }
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

