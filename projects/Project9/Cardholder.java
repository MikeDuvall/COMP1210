import java.util.Arrays;
import java.text.DecimalFormat;
/**This abstract class is the parent class for other cardholders.
Project 9
@author Michael Duvall
@version 11/6/18
*/

public abstract class Cardholder {
   protected String category, acctNumber, name;
   protected double prevBalance, payment;
   protected double[] purchases;
   /**Constant interest rate.*/ 
   public static final double INTEREST_RATE = 0.01;
   private DecimalFormat df = new DecimalFormat("$#,##0.00");
   private DecimalFormat pp = new DecimalFormat("#,##0");
   
   /**This constructor assigns the account number and name of cardholder.
   @param acctNumberIn - the account number
   @param nameIn - name of account holder
   */
   public Cardholder(String acctNumberIn, String nameIn) {
      acctNumber = acctNumberIn;
      name = nameIn;
      purchases = new double[0];
   }
   
   /**This method gets the account number.
   @return acctNumber - the account number
   */
   public String getAcctNumber() {
      return acctNumber;
   }
   
   /**This method sets the account number.
   @param acctNumberIn - the new account number
   */
   public void setAcctNumber(String acctNumberIn) {
      acctNumber = acctNumberIn;
   }
   
   /**This method gets the name.
   @return name - the name
   */
   public String getName() {
      return name;
   }
   
   /**This method sets the name.
   @param nameIn - the new name
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**This method gets the previous balance of the account.
   @return prevBalance - the previous balance
   */
   public double getPrevBalance() {
      return prevBalance;
   }
   
   /**This method sets the previous balance of the account.
   @param prevBalanceIn - the new balance
   */
   public void setPrevBalance(double prevBalanceIn) {
      prevBalance = prevBalanceIn;
   }
   
   /**This method gets the payment for the account.
   @return payment - the payment
   */
   public double getPayment() {
      return payment;
   }
   
   /**This method sets the payment for the account.
   @param paymentIn - the new payment
   */
   public void setPayment(double paymentIn) {
      payment = paymentIn;
   }
   
   /**This method gets the purchases.
   @return newPurchases - the purchases
   */
   public double[] getPurchases() {
      return purchases;
   }
   
   /**This method sets the purchases.
   @param purchasesIn - new purchases
   */
   public void setPurchases(double[] purchasesIn) { 
      purchases = purchasesIn;
   }
   
   /**This method adds puchases to the array.
   @param newPurchases - the purchases being added
   */
   public void addPurchases(double... newPurchases) {
      int indexP = purchases.length;
      int i = 0;
      purchases = Arrays.copyOf(purchases,
         purchases.length + newPurchases.length);
      while (i < newPurchases.length) {
         purchases[indexP] = newPurchases[i];
         indexP++;
         i++;
      }
   }
   
   /**This method deletes values from the purchases array.
   @param deletePurchases - the values being deleted
   */
   public void deletePurchases(double... deletePurchases) {
      for (int j = 0; j < deletePurchases.length; j++) {
         for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == deletePurchases[j]) {
               for (int l = i; l < purchases.length - 1; l++) {
                  purchases[l] = purchases[l + 1];
               }
               purchases = Arrays.copyOf(purchases, purchases.length - 1);
            }
         }
      }
   }
   
   /**This method returns the interest.
   @return - the interest
   */
   public double interest() {
      return (prevBalance - payment) * INTEREST_RATE;
   }
   
   /**This method adds the purchases together.
   @return total - the sum of purchases.
   */
   public double totalPurchases() {
      double total = 0.0;
      for (int i = 0; i < purchases.length; i++) {
         total += purchases[i];
      }
      return total;
   }
   
   /**This method returns the balance.
   @return balance - interest() + totatPurchases()
   */
   public double balance() {
      double balance = this.interest() + this.totalPurchases();
      return balance;
   }
   
   /**This method returns the current balance.
   @return - the current balance
   */
   public double currentBalance() {
      return prevBalance - payment + this.interest() + this.totalPurchases();
   }
   
   /**This method returns the minimum payment.
   @return - the minimum payment
   */
   public double minPayment() {
      return 0.03 * this.currentBalance();
   }
   
   /**This method returns a string object of Cardholder.
   @return - the string object
   */
   public String toString() {
      return category + "\n"
         + "AcctNo/Name: " + acctNumber + " " + name
         + "\nPrevious Balance: " + df.format(prevBalance)
         + "\nPayment: (" + df.format(payment) + ")"
         + "\nInterest: " + df.format(this.interest())
         + "\nNew Purchases: " + df.format(this.totalPurchases())
         + "\nCurrent Balance: " + df.format(this.currentBalance())
         + "\nMinimum Payment: " + df.format(this.minPayment())
         + "\nPurchase Points: " + pp.format(this.purchasePoints());
   }
   
   /**This method returns the purchase points.
   @return - the purchase points
   */
   public abstract int purchasePoints();
}