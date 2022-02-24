import java.text.DecimalFormat;
/**This class extends Diamond Cardholder to create a
Blue Diamond Cardholder.
Project 9
@author Michael Duvall
@version 11/7/18
*/
public class BlueDiamondCardholder extends DiamondCardholder {
   protected int bonusPurchasePoints = 2500;
   private DecimalFormat bp = new DecimalFormat("#,##0");
/**This constructor calls on Cardholder and sets category
to Blue Diamond Cardholder.
@param acctNumberIn - the account number
@param nameIn - name
*/
   public BlueDiamondCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Blue Diamond Cardholder";
      this.setDiscountRate(.10);
   }
   
   /**This method overrides the purchasePoints().
   @return points - the purchase points
   */
   public int purchasePoints() {
      int points = 5 * (int) this.totalPurchases();
      if (this.totalPurchases() > 2500) {
         points += bonusPurchasePoints;
      }
      return points;
   }
   
   /**This method sets the bonus purchase points.
   @param pointsIn - new bonus points
   */
   public void setBonusPurchasePoints(int pointsIn) {
      bonusPurchasePoints = pointsIn;
   }
   
   /**This method gets the bonus purchase points.
   @return bonusPurchasePoints
   */
   public int getBonusPurchasePoints() {
      return bonusPurchasePoints;
   }
   
   /**This method overrides the toString.
   @return output - the string obj
   */
   public String toString() {
      String output = super.toString();
      if (this.totalPurchases() > 2500) {
         output += "\n(includes " + bp.format(this.getBonusPurchasePoints())
            + " bonus points added to Purchase Points)";
      }
      return output;
   }
}