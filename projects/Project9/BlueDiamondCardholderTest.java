import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**Test Class for BlueDiamondCardholer.*/
public class BlueDiamondCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**Test purchasePoints().*/
   @Test public void purchasePointsTest() {
      BlueDiamondCardholder bdc2 = new BlueDiamondCardholder("10004",
         "Jenkins, Jordan");
      bdc2.addPurchases(5000.0, 1000.0, 4000.0);
      bdc2.setPrevBalance(1200.0);
      Assert.assertEquals("purchasePoints test",
         47500, bdc2.purchasePoints());
      
      //no bonus points
      BlueDiamondCardholder bdc = new BlueDiamondCardholder("10003",
         "King, Kelly");
      bdc.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      bdc.setPrevBalance(1200.0);
      Assert.assertEquals(2690, bdc.purchasePoints());
   }
   
   /**Test setter and getter.*/
   @Test public void setterAndGetterTest() {
      BlueDiamondCardholder bdc2 = new BlueDiamondCardholder("10004",
         "Jenkins, Jordan");
      bdc2.addPurchases(5000.0, 1000.0, 4000.0);
      bdc2.setPrevBalance(1200.0);
      bdc2.setBonusPurchasePoints(3000);
      Assert.assertEquals("setter and getterTest",
         3000, bdc2.getBonusPurchasePoints());
   }
   
   /**Test toString().*/
   @Test public void toStringTest() {
      BlueDiamondCardholder bdc2 = new BlueDiamondCardholder("10004",
         "Jenkins, Jordan");
      bdc2.addPurchases(5000.0, 1000.0, 4000.0);
      bdc2.setPrevBalance(1200.0);
      Assert.assertTrue("toString Test",
         bdc2.toString().contains("Blue Diamond Cardholder"
         + "\nAcctNo/Name: 10004 Jenkins, Jordan"
         + "\nPrevious Balance: $1,200.00"
         + "\nPayment: ($0.00)"
         + "\nInterest: $12.00"
         + "\nNew Purchases: $9,000.00"
         + "\nCurrent Balance: $10,212.00"
         + "\nMinimum Payment: $306.36"
         + "\nPurchase Points: 47,500"
         + "\n(includes 10.0% discount rate applied to New Purchases)"
         + "\n(includes 2,500 bonus points added to Purchase Points)"));
         
      BlueDiamondCardholder bdc = new BlueDiamondCardholder("10003",
         "King, Kelly");
      bdc.addPurchases(34.5, 100.0, 63.50, 300.0, 100.0);
      bdc.setPrevBalance(1200.0);
      Assert.assertTrue("No bonus Points",
         bdc.toString().contains("Blue Diamond Cardholder"
         + "\nAcctNo/Name: 10003 King, Kelly"
         + "\nPrevious Balance: $1,200.00"
         + "\nPayment: ($0.00)"
         + "\nInterest: $12.00"
         + "\nNew Purchases: $538.20"
         + "\nCurrent Balance: $1,750.20"
         + "\nMinimum Payment: $52.51"
         + "\nPurchase Points: 2,690"
         + "\n(includes 10.0% discount rate applied to New Purchases)"));
   }
}
