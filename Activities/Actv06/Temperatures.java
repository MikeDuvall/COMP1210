import java.util.ArrayList;
/**This class holds a set of integer values representing daily temps
and evaluates the highest and lowest temps.
Activity 06
@author Michael Duvall
@version 10/8/18
*/
public class Temperatures {
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

/**This constructor takes in an ArrayList of integer values.
@param temperaturesIn -- the temps
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   /**This method finds the lowest temp in the list.
   @return low - the lowest temp
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   /**This method finds the highest temp in the list.
   @return high - the highest temp
   */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      int i = 1;
      for (Integer temp : temperatures) {
         if (temp >  high) { //?
            high = temp;
         }
      }
      return high;
   }
   /**This method compares the lowest temp in the list
   and an inputted temp and gives the lower temp.
   @param lowIn - the inputted temp
   @return the lower temp
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**This method compares the highest temp in the list
   and an inputted temp and gives the higher temp.
   @param highIn - the inputted temp
   @return the higher temp
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**This method returns a string containing the low and high
   temps.
   @return - the string object
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}