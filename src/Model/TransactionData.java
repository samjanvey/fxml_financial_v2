package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class TransactionData {

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public TransactionData() {

        this.readTransactionsFile();
        if(transactions.isEmpty() || transactions == null) {
            this.createTestTransactionsFile();
            this.writeTransactionsFile();
            this.readTransactionsFile();
        }
        this.printTransactions();


    }

    private void readTransactionsFile() {

    }

    private void createTestTransactionsFile() {

    }

    private void writeTransactionsFile() {
        LocalDate tempDate;
        String tempTransactionName = "default";
        Double tempAmount = 0.0;
        Integer tempType = 0;
        Transaction defaultTransaction = new Transaction(tempDate, tempTransactionName, tempAmount, tempType);

        for(int i = 0; i < 100; i++) {
            //Randomize transaction date
            Random random = new Random();
            int minDay = (int) LocalDate.of(2018, 1, 1).toEpochDay();
            int maxDay = (int) LocalDate.of(2019, 12, 31).toEpochDay();
            long randomDay = minDay + random.nextInt(maxDay - minDay);

            LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

            tempDate = randomDate;

            //Generate transaction name
            tempTransactionName = "placeholder" + i;

            //Randomize transaction amount
            
        }
    }

    private void printTransactions() {

    }

//    private static int getRandomNumberInRange(int min, int max) {
//
//        if (min >= max) {
//            throw new IllegalArgumentException("max must be greater than min");
//        }
//
//        Random r = new Random();
//        return r.nextInt((max - min) + 1) + min;
//    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
