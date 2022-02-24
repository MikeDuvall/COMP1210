import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**Test for CardholderPart2App.
Project 10
@author Michael Duvall
@version 11/14/18
*/
public class CardholdersPart3AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test main.
   @throws FileNotFoundException - standard
   **/
   @Test public void mainTest() throws FileNotFoundException {
      CardholdersPart3App app = new CardholdersPart3App();
      
      //test with file not found
      String[] args0 = {"nofile.txt"};
      CardholdersPart3App.main(args0);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
      //test file without file name
      String[] args1 = {};
      CardholdersPart3App.main(args1);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
      
      //test file with file name
      String[] args2 = {"cardholder_data_3_exceptions.txt"};
      CardholdersPart3App.main(args2);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
   }
}
