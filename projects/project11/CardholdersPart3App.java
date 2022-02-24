import java.io.FileNotFoundException;
/**This class allows the user to input a file as a command line argument and
prints out the respected information from the file regarding Cardholder.
Project 10
@author Michael Duvall
@version 11/14/18
*/
public class CardholdersPart3App {
/**This main method takes in a file as a command line arg and prints out the
corresponding information.
@param args - standard command line
@throws FileNotFoundException - standard
*/
   public static void main(String[] args)
      throws FileNotFoundException {
      try {
         CardholderProcessor cp = new CardholderProcessor();
         if (args.length == 0) {
            System.out.println("File name expected as command line argument.\n"
               + "Program ending.");
         }
         else {
            cp.readCardholderFile(args[0]);
            System.out.print(cp.generateReport());
            System.out.print(cp.generateReportByName());
            System.out.print(cp.generateReportByCurrentBalance());
            System.out.print(cp.generateInvalidRecordsReport());
         }
      }
      catch (FileNotFoundException e) {
         System.out.println(" *** Attempted to read file: "
            + args[0] + " (No such file or directory)");
      } 
   }
}