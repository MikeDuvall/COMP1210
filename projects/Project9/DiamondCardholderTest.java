import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Test Class for DiamondCardholder.*/
public class DiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


  /**Test setters and getters.*/
   @Test public void settersAndGettersTest() {
      DiamondCardholder dc = new DiamondCardholder("10002", "Jones, Pat");
      dc.addPurchases(34.5, 100.0, 63.50, 300.0);
      dc.setPrevBalance(1200.0);
      dc.setDiscountRate(.06);
      Assert.assertEquals(0.06, dc.getDiscountRate(), .0001);
   }
   
   /**Test totalPurchases.*/
   @Test public void totalPurchasesTest() {
      DiamondCardholder dc = new DiamondCardholder("10002", "Jones, Pat");
      dc.addPurchases(34.5, 100.0, 63.50, 300.0);
      dc.setPrevBalance(1200.0);
      Assert.assertEquals("totalPurchase test",
         473.10, dc.totalPurchases(), .0001);
   }
   
   /**Test toString.*/
   @Test public void toStringTest() {
      DiamondCardholder dc = new DiamondCardholder("10002", "Jones, Pat");
      dc.addPurchases(34.5, 100.0, 63.50, 300.0);
      dc.setPrevBalance(1200.0);
      Assert.assertTrue("toString Test",
         dc.toString().contains("Diamond Cardholder" 
         + "\nAcctNo/Name: 10002 Jones, Pat"
         + "\nPrevious Balance: $1,200.00"
         + "\nPayment: ($0.00)"
         + "\nInterest: $12.00"
         + "\nNew Purchases: $473.10"
         + "\nCurrent Balance: $1,685.10"
         + "\nMinimum Payment: $50.55"
         + "\nPurchase Points: 1,419"
         + "\n(includes 5.0% discount rate applied to New Purchases)"));
   }
}
