/**This Class inherits InventoryItem and also takes into
account shipping costs.
Activity 9
@author Michael Duvall
@version 11/5/18
*/
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   /**Constant variable for shipping cost.*/
   public static final double SHIPPING_COST = 1.5;

/**This constructor invokes InventoryItem and sets weight.
@param nameIn - name 
@param priceIn - price
@param weightIn - weight
*/
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**This method overrides calculateCost of InventoryItem.
   @return - the overriden result with shipping cost
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}