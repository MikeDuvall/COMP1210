/**This class holds an array of numerical values and provides
methods that allow users to interact with the scores list.
Activity 07
@author Michael Duvall COMP 1210- 08
@version - 10/14/18
*/
public class Scores {
   private int[] numbers;
 /**This constructor adds numners to an array.
 @param numbersIn - numbers being put into array
 */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
 
 /**This method returns the even numbers in the array.
 @return evens - the even numbers
 */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
 
 /**This method returns the odd numbers in the array.
 @return odds - the odd numbers
 */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
 
 /**This method calculates the average of all the numbers
 in the array.
 @return  - the average
 */
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return (double) sum / numbers.length;
   }
 
 /**This method returns the array as a string in increasing order.
 @return result - the string object
 */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
 
 /**This method returns the array as a string in decreasing order.
 @return result - the object in decreading order
 */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}