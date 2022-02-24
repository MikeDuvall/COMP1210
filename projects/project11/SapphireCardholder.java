/**Class for a Sapphire cardholder.
Project 9
@author Michael Duvall
@version 11/7/18
*/

public class SapphireCardholder extends Cardholder {
/**This constructor calls on Cardholder and sets
Category to Sapphire Cardholder.
@param acctNumberIn - the account number
@param nameIn - name
*/
   public SapphireCardholder(String acctNumberIn, String nameIn) {
      super(acctNumberIn, nameIn);
      category = "Sapphire Cardholder";
   }
   
   /**This method overrides the abstract purchasePoints method.
   @return - the purchase points to the whole dollar of total purchase
   */
   public int purchasePoints() {
      return (int) this.totalPurchases();
   }
}