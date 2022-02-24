import java.util.Comparator;
/**This class defines the ordering from highest to lowest.
*/
public class CurrentBalanceComparator implements Comparator<Cardholder> {
/**This method compares two objects based on current balance.
@param c1 - the first Cardholder
@param c2 - the second cardholder
@return -1 if first cardholder comes first, 1 if after, 0 if the same
*/
   public int compare(Cardholder c1, Cardholder c2) {
      if (c1.currentBalance() > c2.currentBalance()) {
         return -1;
      }
      else if (c1.currentBalance() < c2.currentBalance()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}