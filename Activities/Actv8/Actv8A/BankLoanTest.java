import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**This class tests the Bank Loan Class.
*/

public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void changeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals("Testing chargeInterest(): ",
         1100, loan1.getBalance(), .000001);
   }
    /** A test that always fails. **/
   @Test public void isInDebtTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.isInDebt(loan1);
      Assert.assertEquals("Testing isInDebt(): ",
         1000, loan1.getBalance(), .000001);
   }
    /** A test that always fails. **/
   @Test public void isAmountValidTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.isAmountValid(1000.00);
      loan1.borrowFromBank(1000.00);
      Assert.assertEquals("Testing isAmountValid(): ",
         1000, loan1.getBalance(), .000001);
   }
    /** A test that always fails. **/
   @Test public void getLoansCreatedTest() {
      BankLoan.resetLoansCreated();
      BankLoan loan1 = new BankLoan("Jane", .10);
      BankLoan loan2 = new BankLoan("Bob", .10);
      BankLoan loan3 = new BankLoan("jack", .10);
      Assert.assertEquals(3, BankLoan.getLoansCreated());
   }
    /** A test that always fails. **/
   @Test public void resetLoansCreatedTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      BankLoan loan2 = new BankLoan("Bob", .10);
      loan2.borrowFromBank(1000.00);
      BankLoan.getLoansCreated();
      loan1.payBank(loan1.getBalance());
      loan2.payBank(loan2.getBalance());
      BankLoan.resetLoansCreated();
      Assert.assertEquals("Testing resetLoansCreated(): ",
         0, BankLoan.getLoansCreated(), .000001);
   }
}
