package Model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class TransactionData {

    private ArrayList<Transaction> transactions = new ArrayList<>();
    private Integer transactionsSize;
    private String fileName;

    public TransactionData() throws JAXBException, FileNotFoundException {

        fileName = "transactionData.xml";

        this.jaxbXmlFileToObject(fileName);
        if(transactions.isEmpty() || transactions == null) {
            this.createTestTransactionsData();
            transactionsSize = transactions.size();
            this.writeTransactionsFile();
            this.jaxbXmlFileToObject(fileName);
        }
        this.printTransactions();


    }

    private void writeTransactionsFile() throws JAXBException, FileNotFoundException {
        for(int j = 0; j < transactions.size(); j++) {
            jaxbObjectToXML(transactions.get(j), transactions);
        }
    }

    private static void jaxbObjectToXML(Transaction transaction, ArrayList<Transaction> transactions) throws JAXBException, FileNotFoundException {
        JAXBContext contextObj = JAXBContext.newInstance(Transaction.class);

        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        FileOutputStream fos = new FileOutputStream("transactionData.xml");
        for(int i = 0; i < transactions.size(); i++) {
            marshallerObj.marshal(transactions.get(i), fos);
        }
//        try
//        {
//            //Create JAXB Context
//            JAXBContext jaxbContext = JAXBContext.newInstance(Transaction.class);
//
//            //Create Marshaller
//            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//            //Required formatting??
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//            //Store XML to File
//            File file = new File("transactionData.xml");
//
//            //Writes XML file to file-system
//            jaxbMarshaller.marshal(transaction, file);
//        }
//        catch (JAXBException e)
//        {
//            e.printStackTrace();
//        }
    }

    private static void jaxbXmlFileToObject(String fileName) {

        File xmlFile = new File(fileName);

        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Transaction.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Transaction transaction = (Transaction) jaxbUnmarshaller.unmarshal(xmlFile);

            System.out.println(transaction);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
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
