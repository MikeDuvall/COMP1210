/**This class contains methods to store info about a customer.
Activity 8B
@author Michael Duvall
@version 10/29/18
*/

public class Customer implements Comparable<Customer> {
   private String name = "";
   private String location = "";
   private double balance = 0.0;

/**This constructor takes in the Customer's name and assigns
remaining variables.
@param nameIn - customer's name
*/
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0.0;
   }
   
   /**This method sets the location.
   @param locationIn - the location
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**This method changes the balance.
   @param amount - the amount being added to balance.
   */
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /**This method returns the location.
   @return location - the location
   */
   public String getLocation() {
      return location;
   }
   
   /**This method returns the balance.
   @return balance - the balance
   */
   public double getBalance() {
      return balance;
   }
   
   /**This method overloads setLocation so it can take in
   city and state as params.
   @param city - the city
   @param state - the State
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**This method creates a string obj of Customer.
   @return output - the string obj
   */
   public String toString() {
      String output = name + "\n" + location + "\n$" + balance;
      return output;
   }
   
   /**This method compares balance of two objs of compatable classes.
   @param obj - the obj being compared to.
   @return 0 if equal, -1 if this.balance < obj.balance, 1 if >
   */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}