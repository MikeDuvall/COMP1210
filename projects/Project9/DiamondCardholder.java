import java.text.DecimalFormat;
/**Class for a Diamond Cardholder.
Project 9
@author Michael Duvall
@version 11/7/18
*/
public class DiamondCardholder extends Cardholder {
   protected double discountRate = 0.05;
   protected DecimalFormat d = new DecimalFormat("0.0%");

/**This constructor creates a Diamond Cardholder object.
@param acctNumberIn - account number
@param nameIn - name
*/
   public DiamondCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Diamond Cardholder";
   }
   
   /**This method overrides the purchasePoints method.
   @return - the purchase points
   */
   public int purchasePoints() {
      return 3 * (int) this.totalPurchases();
   }
   
   /**This method gets the discount rate.
   @return discountRate - the discount rate
   */
   public double getDiscountRate() {
      return discountRate;
   }
   
   /**This method sets the discount rate.
   @param discountRateIn - the new discount rate
   */
   public void setDiscountRate(double discountRateIn) {
      discountRate = discountRateIn;
   }
   
   /**This method overrides totalPurchases to include discount rate.
   @return - the discounted total
   */
   public double totalPurchases() {
      double total = 0.0;
      for (int i = 0; i < purchases.length; i++) {
         total += purchases[i];
      }
      return total - (total * discountRate);
   }
   
   /**This method overrides the toString to include discount rate.
   @return - the string object of Diamond Cardholder
   */
   public String toString() {
      return super.toString() + "\n(includes "
         + d.format(discountRate)
         + " discount rate applied to New Purchases)";
   }
}