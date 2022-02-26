/**This class contains methods to be used regarding
bank loans.
Activity 8
@author Michael Duvall
@version 10/22/2018
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   //Added static variables
   private static int loansCreated = 0;
   
/**This constructor takes in the customer name and the
interest rate to create a customer profile.
@param customerNameIn - the Customers name
@param interestRateIn - the customer's interest rate
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
/**This method allows the customer to borrow money if their 
balance is less than their maximum loan value amount.
@param amount - the amount being borrowed
@return wasLoanMade - true if loan was made, false otherwise
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
/**This method allows the customer to pay the bank back
for their loan.
@param amountPaid - the amount being paid
@return balance - the new balance of the customer
*/
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**This method returns the customers balance.
   @return balance - the customers balance.
   */
   public double getBalance() {
      return balance;
   }
   /**This method allows the user to set a new interest rate.
   @param interestRateIn - the new interest rate
   @return - if the interest rate was set
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**This method returns the interest Rate.
   @return interestRate - the interest rate
   */
   public double getInterestRate() {
      return interestRate;
   }
   /**This method charges the customer their interest rate.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**This method puts the BankLoan information into a String obj.
   @return output - the string obj of BankLoan
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
// Added methods.
/**This method evaluates if the requested loan amount is
able to be loaned to the customer.
@param amount - the requested amount to be loaned
@return - true if loan is valid
*/
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**This method determines if the customer is in debt
   to the bank.
   @param loan - their loan info
   @return - true if they still owe the bank
   */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   /**This method returns the number of loans created.
   @return loansCreated - the number of loans created
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**This method resests the number of loans created to 0.
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
}
