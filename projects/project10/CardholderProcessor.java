import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
/**This class provides methods for reading in a data file
and generating the monthly reports.
Poject 10
@author Michael Duvall
@version 11/13/18
*/
public class CardholderProcessor {
   private Cardholder[] chArray;
   private String[] invalidRecords;

/**This constructor initializes the Cardholder and invalid
records array.
*/
   public CardholderProcessor() {
      chArray = new Cardholder[0];
      invalidRecords = new String[0];
   }
/**This method gets the Cardholder array.
@return chArray - the Cardholder array
*/

   public Cardholder[] getCardholdersArray() {
      return chArray;
   }
   
   /**This method gets the invalid recors array.
   @return invalidRecords - the invalid records
   */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
   /**This method adds a cardholder to the cardholder array.
   @param cardIn - the card being added
   */
   public void addCardholder(Cardholder cardIn) {
      chArray = Arrays.copyOf(chArray, chArray.length + 1);
      chArray[chArray.length - 1] = cardIn;
   }
   
   /**This method adds a sting to the invalid records array.
   @param recordIn - the record being added
   */
   public void addInvalidRecord(String recordIn) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = recordIn;
   }
   
   /**This method reads in a cardholder file.
   @param fileIn - the file being read
   @throws FileNotFoundException - standard
   */
   public void readCardholderFile(String fileIn) 
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileIn));
      String line = "";
      char code;
      Cardholder card;
      String acctNumb, name;
      double prevBal, payment;
      int index = 0;
      
      while (scanFile.hasNext()) {
         double[] purch = new double[0];
         line = scanFile.nextLine();
         Scanner scanLine = new Scanner(line).useDelimiter(";");
         code = scanLine.next().charAt(0);
         acctNumb = scanLine.next();
         name = scanLine.next();
         prevBal = Double.parseDouble(scanLine.next());
         payment = Double.parseDouble(scanLine.next());
         int j = 0;
         while (scanLine.hasNext()) {
            purch = Arrays.copyOf(purch, purch.length + 1);
            purch[j] = Double.parseDouble(scanLine.next());
            j++;
         }
         //set cardholder type
         switch (code) {
            case '1' :
               card = new SapphireCardholder(acctNumb, name);
               card.setPrevBalance(prevBal);
               card.setPayment(payment);
               card.setPurchases(purch);
               chArray = Arrays.copyOf(chArray, chArray.length + 1);
               chArray[index] = card;
               index++;
               break;
            case '2' :
               card = new DiamondCardholder(acctNumb, name);
               card.setPrevBalance(prevBal);
               card.setPayment(payment);
               card.setPurchases(purch);
               chArray = Arrays.copyOf(chArray, chArray.length + 1);
               chArray[index] = card;
               index++;
               break;
            case '3':
               card = new BlueDiamondCardholder(acctNumb, name);
               card.setPrevBalance(prevBal);
               card.setPayment(payment);
               card.setPurchases(purch);
               chArray = Arrays.copyOf(chArray, chArray.length + 1);
               chArray[index] = card;
               index++;
               break;
            default:
               continue;
         }
         
      }
   }
   
   /**This method generates a report from the file read in.
   @return output - the report
   */
   public String generateReport() {
      String output = "----------------------------"
         + "\nMonthly Cardholder Report\n"
         + "----------------------------\n";
      for (Cardholder i: chArray) {
         output += i.toString() + "\n\n";
      }
      return output;
   }
   
   /**This method generates a report in alphabetical order.
   @return output - the report
   */
   public String generateReportByName() {
      String output = "--------------------------------------"
         + "\nMonthly Cardholder Report (by Name)\n"
         + "--------------------------------------\n";
      Arrays.sort(chArray);
      for (Cardholder c: chArray) {
         output += c.toString() + "\n\n";
      }
      return output;
   }
   
   /**This method generates a report by current balance.
   @return output - the report
   */
   public String generateReportByCurrentBalance() {
      String output = "---------------------------------------"
         + "\nMonthly Cardholder Report (by Current Balance)\n"
         + "---------------------------------------\n";
      
      Arrays.sort(chArray, new CurrentBalanceComparator());
      for (Cardholder c: chArray) {
         output += c.toString() + "\n\n";
      }
      return output;
   }
}