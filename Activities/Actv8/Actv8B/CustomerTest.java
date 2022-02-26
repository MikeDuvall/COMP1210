import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**This test class tests the methods of Customer.
Actv 8B
@author Michael Duvall
@version 10/29/18
*/
public class CustomerTest {


   /** Fixture initialization (common initialization
      for all tests). **/
   @Before public void setUp() {
   }

    /** Test settters. **/
   @Test public void settersTest() {
      Customer c = new Customer("Jane, Lane");
      c.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", c.getLocation());
      
      c.setLocation("Auburn", "AL");
      Assert.assertEquals("Auburn, AL", c.getLocation());
   }
   
   /**Test changeBalance.*/
   @Test public void changeBalanceTest() {
      Customer c = new Customer("Lane, Jane");
      c.changeBalance(100);
      Assert.assertEquals(100, c.getBalance(), 0.000001);
   }
   
   /**Test toString.*/
   @Test public void toStringTest() {
      Customer c = new Customer("Jane, Lane");
      c.setLocation("Auburn, AL");
      c.changeBalance(999);
      Assert.assertEquals("Jane, Lane\nAuburn, AL\n$999.0",
         c.toString());
   }
   /**Test compareTo.*/
   @Test public void compareToTest() {
      Customer c1 = new Customer("Lane, Jane");
      c1.changeBalance(500);
      Customer c2 = new Customer("Lane, Lois");
      c2.changeBalance(500);
      Assert.assertTrue(c1.compareTo(c2) == 0);
   
      c1.changeBalance(-100);
      Assert.assertTrue(c1.compareTo(c2) < 0);
   
      c1.changeBalance(1000);
      Assert.assertTrue(c1.compareTo(c2) > 0);
   }
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
}
