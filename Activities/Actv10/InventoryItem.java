/**This class represents an inventory item in a store.
Activity 9
@author Michael Duvall
@version 11/4/2018
*/
public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate = 0.0;
   
   /**Constructor to set name and price and create InventoryItem
   object.
   @param nameIn - the customer's name
   @param priceIn - the price
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**This method gets the name of the customer.
   @return name - the name
   */
   public String getName() {
      return name;
   }
   
   /**This method calcuates the cost.
   @return cost - the cost to the customer
   */
   public double calculateCost() {
      double cost = price * (1 + taxRate);
      return cost;
   }
   
   /**This method sets the tax rate.
   @param taxRateIn - the new tax rate
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**This method creates a string representation of InventoryItem.
   @return output - the string representation
   */
   public String toString() {
      String output = name + ": $" + this.calculateCost();
      return output;
   }
}