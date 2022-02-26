/**This class will hold an array of inventoryItem objects.
Activity 10
@author Michael Duvall
@version 11/11/18
*/

public class ItemsList {
   private InventoryItem[] inventory;
   private int count;

/**This constructor holds an array of InventoryItem objects.
*/
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**This method adds an item to the list.
   @param itemIn - the item being added
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**This method calculates the total based on a surcharge.
   @param electronicsSurcharge - the sucharge
   @return total - the total
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**This method creates a string object for ItemsList.
   @return output - the String obj
   */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}