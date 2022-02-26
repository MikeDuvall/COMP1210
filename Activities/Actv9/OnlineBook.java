/**This class inherits from OnlineTextItem and stores info
about a book.
Activity 9
@author Michael Duvall
@version 11/5/18
*/
public class OnlineBook extends OnlineTextItem {
   protected String author;

/**This constructor calls on OnlineTextItem and sets author to
"Author Not Listed".
@param nameIn - name
@param priceIn - price
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
/**This method overrides toString to put author's name after book title.
@return - the new String representation
*/
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   
   /**This method sets author name.
   @param authorIn - author's name
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}