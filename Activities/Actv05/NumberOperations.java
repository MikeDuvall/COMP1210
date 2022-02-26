/**This class defines an objest to hold an integer value
and provides methods to perform various operations on that value.

Activty 05
@author Michael Duvall Comp-1210-08
@version 10/1/18
*/
public class NumberOperations {
   private int number;
/**this constructor takes in an integer as a parameter.
@param numberIn - the inputted value
*/
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
 /**this method returns the value of the value.
 @return numberIn - returns the value of number 
 */
   public int getValue() {
      return number;
   }
 /**this method evalutates the odd numbers less than the
 value of the inputted number.
 @return output - the odd numbers
 */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
 /**this method gets the values of positive powers of two less
 than the value of the number.
 @return output - the powers of 2
 */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; //concatenate to output
         powers = powers * 2; // get next power of 2
      }
      return output;
   }
 /**this method compares number to an inputted number
 and determines if the input is greater than than number.
 @return 1 - number is greater, -1 if number is less than,
 0 if number is equal to
 @param compareNumber - the number being compared to number
 */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
 /**This method creates a string representation of the obj.
 @return number + "" - returns the value of number
 */
   public String toString() {
      return number + "";
   }
}