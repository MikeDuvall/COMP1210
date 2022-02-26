/**This driver class prints the output of various InventoryItem objects.
Activity 10
@author Michael Duvall
@version 11/12/18
*/
public class InventoryListApp {
/**This driver prints out an ItemsList object that holds
various InventoryItems.
@param args - standard command line
*/
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      ItemsList myItems = new ItemsList();
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}