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
public class CardholdersPart2AppTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test main.
   @throws FileNotFoundException - standard
   **/
   @Test public void mainTest() throws FileNotFoundException {
      CardholdersPart2App app = new CardholdersPart2App();
      //test file without file name
      String[] args1 = {};
      CardholdersPart2App.main(args1);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
      
      //test file with file name
      String[] args2 = {"cardholder_data_1.txt"};
      CardholdersPart2App.main(args2);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
      
      String[] args3 = {"cardholder_data_2.txt"};
      CardholdersPart2App.main(args3);
      Assert.assertEquals(0.01, Cardholder.INTEREST_RATE, .0001);
   }
}
