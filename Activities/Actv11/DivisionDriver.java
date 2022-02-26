import javax.swing.JOptionPane;
/**This class contains a main method that gets the numerator and
denominator and returns the both integer and decimal division.
Activity11
@author Michael Duvall 
@version 11/26/18
*/
public class DivisionDriver {
/**This main method prompts the user for two numbers and returns the result.
@param args - standard command line
*/
   public static void main(String[] args) {
   //create dialog box for num and denom
      String numInput = 
         JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = 
         JOptionPane.showInputDialog("Enter the denominator:");
      //try-catch statement to catch execptions
      try {
      //parse num and denom
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
      //string to hold result
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
      //print the result in a dialog box
         JOptionPane.showMessageDialog(null, result, 
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, 
            "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}