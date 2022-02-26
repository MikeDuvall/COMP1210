/**Program that creates an object to be called on in
another class.
Activity 04
@author Michael Duvall Comp 1210 - 08
@version 9/16/18
*/
public class UserInfo {
// instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

// constructor
/**This constructor creates an instance of UserInfo and
initializes the fields. 
@param firstNameIn - represents the user's first name.
@param lastNameIn - represents the user's last name.
*/
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }

// methods
/**This method returns a String representation of the object.
@return output - returns String set to output.
*/
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      
      return output;
   }
   /**This method describes the location initialized in the object.
   @param locationIn - sets location. 
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**This method sets the value of age.
   @return isSet - returs boolean value indicating if age was set.
   @param ageIn - sets age.
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**This method returns the age.
   @return age - returns age int value.
  */
   public int getAge() {
      return age;
   }
   /**This method returns the location.
   @return location - returns location String.
   */
   public String getLocation() {
      return location;
   }
   /**This method allows the user to log off.
   */
   public void logOff() {
      status = OFFLINE;
   }
  /**This method allows user to log off.
  */
   public void logOn() {
      status = ONLINE;
   }
}