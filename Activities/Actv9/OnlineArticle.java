/**This class inherits OnlineTextItem and keeps
track of word count.
Activity 9
@author Michael Duvall
@version 11/5/18
*/
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;

/**This constructor calls on OnlineTextItem and sets wordCount.
@param nameIn - name
@param priceIn - price
*/
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**This method sets wordCount.
   @param wordCountIn - wordCount
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}