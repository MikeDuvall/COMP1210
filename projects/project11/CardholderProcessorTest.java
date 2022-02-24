import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
   
/**Test for CardholderProcessor.
Project 10
@author Michael Duvall
@version 11/14/18
*/
public class CardholderProcessorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**Test getters and adders.
@throws FileNotFoundException - standard
*/
   @Test public void gettersAndAddersTest() throws FileNotFoundException {
      CardholderProcessor cp = new CardholderProcessor();
      SapphireCardholder sc = new SapphireCardholder("10001", "John");
      cp.addCardholder(sc);
      Cardholder[] chA2 = {sc};
      Assert.assertArrayEquals(chA2, cp.getCardholdersArray());
      String[] test = {"Invalid records"};
      cp.addInvalidRecord("Invalid records");
      Assert.assertArrayEquals(test, cp.getInvalidRecordsArray());
      
   }

/**Test generateReports.
@throws FileNotFoundException - standard
*/
   @Test public void generateReportsTest() 
      throws FileNotFoundException {
      CardholderProcessor cp = new CardholderProcessor();
      cp.readCardholderFile("cardholder_data_3_exceptions.txt");
      Assert.assertTrue(cp.generateReport().contains("Smith, Sam"));
      Assert.assertTrue(cp.generateReportByName().contains("Jenkins, Jordan"));
      Assert.assertTrue(cp.generateReportByCurrentBalance().contains(
         "Jenkins, Jordan"));
      Assert.assertTrue(cp.generateInvalidRecordsReport().contains(
         "110p.0"));
   }
/**Test comparator.*/
   @Test public void comparatorTest() {
      CurrentBalanceComparator cbc = new CurrentBalanceComparator();
      SapphireCardholder sc = new SapphireCardholder("10001", "c1");
      double[] p1 = {34.5, 100.0, 63.50, 350.0};
      sc.setPurchases(p1);
      sc.setPrevBalance(1200.0);
      sc.setPayment(200);
      BlueDiamondCardholder bdc2 = new BlueDiamondCardholder("10004",
         "Jenkins, Jordan");
      bdc2.addPurchases(5000.0, 1000.0, 4000.0);
      bdc2.setPrevBalance(1200.0);
      Assert.assertEquals(1, cbc.compare(sc, bdc2));
      
      SapphireCardholder sc2 = new SapphireCardholder("10001", "c1");
      sc2.setPurchases(p1);
      sc2.setPrevBalance(1200.0);
      sc2.setPayment(200);
      Assert.assertEquals(0, cbc.compare(sc, sc2));
   }
  
  // /**readFile Test*/
//   @Test public void readFileTest() {
//   CardholderProcessor cp = new CardholderProcessor();
      // cp.readCardholderFile("cardholder_data_3_exceptions.txt");
   //    Assert.assertTrue(
//   }
}
