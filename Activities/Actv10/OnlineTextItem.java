/**Class to represent online text item to be bought, doesnt have
to be instantiated because it just represents a number of items.
Activity 9
@author Michael Duvall
@version 11/5/18
*/
public abstract class OnlineTextItem extends InventoryItem {
/**This constructor calls on InventoryItem.
@param nameIn - name
@param priceIn - price
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**This method overrides calculateCost for items not taxed.
   @return - the cost
   */
   public double calculateCost() {
      return price;
   }
}