package Model;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class TransactionData {

    private ArrayList<Transaction> transactions = new ArrayList<>();
    private final String pathname = "transactions.ser";
    private Transaction testTransaction;

    public TransactionData() {

        this.readTransactionsFile();
        if(transactions.isEmpty() || transactions == null) {
            this.createTestTransactionsData();
            this.writeTransactionsFile();
            this.readTransactionsFile();
        }
        this.printTransactions();

    }

    private void writeTransactionsFile() {
        try {
            FileOutputStream fos = new FileOutputStream(pathname);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(transactions);
            out.close();
            fos.close();
            System.out.println("Transactions have been serialized");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void readTransactionsFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(pathname);
            in = new ObjectInputStream(fis);
            transactions = (ArrayList<Transaction>) in.readObject();
            in.close();
            fis.close();
            if(!transactions.isEmpty()) {
                System.out.println("There are Transactions in the TransactionData");
            }
        }
        catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    private void createTestTransactionsData() {
        LocalDate tempDate = LocalDate.of(Integer.parseInt("2017"), Integer.parseInt("12"), Integer.parseInt("31"));
        String tempTransactionName = "default";
        Double tempAmount = 0.0;
        Integer tempType = 0;
        Transaction defaultTransaction = new Transaction(tempDate, tempTransactionName, tempAmount, tempType);
        Transaction tempTransaction = new Transaction(tempDate, tempTransactionName, tempAmount, tempType);

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
            Random doubleRandom = new Random();
            tempAmount = Double.parseDouble(getRandomDoubleValue(doubleRandom, 0, 1499, 2));

            //Randomize transaction type
            tempType = random.nextInt(3);
            tempTransaction = new Transaction(tempDate, tempTransactionName, tempAmount, tempType);
            transactions.add(tempTransaction);
        }
    }


    private void printTransactions() {
        System.out.println("TransactionData has the following transactions: ");
        for(int i = 0; i < transactions.size(); i++) {
            Transaction temp = (Transaction) transactions.get(i);
            System.out.println(temp.getAttributes());
        }
    }

    public static String getRandomDoubleValue(final Random random,
                                              final int lowerBound, final int upperBound, final int decimalPlaces){

        if(lowerBound < 0 || upperBound <= lowerBound || decimalPlaces < 0){
            throw new IllegalArgumentException("Put error message here");
        }

        final double dbl =
                ((random == null ? new Random() : random).nextDouble() //
                        * (upperBound - lowerBound))
                        + lowerBound;
        return String.format("%." + decimalPlaces + "f", dbl);

    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}

