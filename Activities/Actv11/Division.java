/**This class holds methods to perform division tasks.
Activity 11
@author Michael Duvall
@version 11/26/18
*/
public class Division {
/**This method returns an int value for the division.
@param numerator - the numerator
@param denominator - the denominator
@return - the int result
*/
   public static int intDivide(int numerator, int denominator) {
      //Try-catch statement to catch ArithmeticException
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
/**This method returns a value including decimals for the division.
@param numerator - the numerator
@param denominator - the denominator
@return - the value with decimals
*/
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return (double) numerator / denominator;
   }
}