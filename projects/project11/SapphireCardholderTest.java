import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**Test Class for SapphireCardholder.*/
public class SapphireCardholderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**Test getters and setters.*/
   @Test public void gettersAndSettersTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      sc.setAcctNumber("10002");
      sc.setName("Smith, Dan");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      Assert.assertEquals("getAcctNumber test", "10002", sc.getAcctNumber());
      Assert.assertEquals("getName test", "Smith, Dan", sc.getName());
      Assert.assertEquals("getPrevBalance test",
         1200.0, sc.getPrevBalance(), .0001);
      Assert.assertEquals("getPayment test",
         200.0, sc.getPayment(), .0001);
      Assert.assertArrayEquals("getPurchases test",
         p1, sc.getPurchases(), .0001);
   }
   
   /**Test addDeletePurchases.*/
   @Test public void addDeletePurchasesTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.addPurchases(50.0, 20.0);
      double[] p2 = {34.5, 100.0, 63.50, 350.0, 50.0, 20.0};
      Assert.assertArrayEquals("addPurchases Test",
         p2, sc.getPurchases(), .0001);
      //delete test
      double[] pDelete = {100.0, 350.0, 50.0, 20.0};
      sc.deletePurchases(34.5, 63.50);
      Assert.assertArrayEquals("deletePurchases test",
         pDelete, sc.getPurchases(), .0001);
   }
   
   /**Test interest.*/
   @Test public void interestTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      Assert.assertEquals("interest test", 10.0, sc.interest(), .00001);
   }
   
   /**Test balance().*/
   @Test public void balanceTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      Assert.assertEquals("balance test", 558.0, sc.balance(), .00001);
   }
   
   /**Test currentBalance().*/
   @Test public void currentBalanceTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      Assert.assertEquals("currentBalance test",
         1558.0, sc.currentBalance(), .00001);
   }
   
   /**Test minPayment().*/
   @Test public void minPaymentTest() {
      SapphireCardholder sc = new SapphireCardholder("10001",
         "Smith, Sam");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      Assert.assertEquals("minPayment test",
         46.739999, sc.minPayment(), .00001);
   }
   
   /**Test toString().*/
   @Test public void toStringTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      Assert.assertTrue("toString test",
         sc.toString().contains("Sapphire Cardholder\n"
         + "AcctNo/Name: 10001 Smith, Sam\nPrevious Balance: $1,200.00\n"
         + "Payment: ($200.00)\nInterest: $10.00"
         + "\nNew Purchases: $548.00\nCurrent Balance: $1,558.00"
         + "\nMinimum Payment: $46.74\nPurchase Points: 548"));
   }
   
   /**Test compareTo.*/
   
   @Test public void compareToTest() {
      SapphireCardholder sc = new SapphireCardholder("10001", "Smith, Sam");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      SapphireCardholder sc2 = new SapphireCardholder("10002", "Smith, Dave");
      sc2.setPurchases(p1);
      sc2.setPrevBalance(1200.0);
      sc2.setPayment(200);
      Assert.assertEquals("compareTo test", 15, sc.compareTo(sc2));
   }
}