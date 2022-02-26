/**Program that calls on the UserInfo class and creates
two instances of the class and invokes methods on the instances.
Activity 04
@author Michael Duvall - Comp 1210 - 08
@version 9/16/18
*/
public class UserInfoDriver {
/**Progam that creates two instances of UserInfo and invokes
methods of on the instances.
@param args - standard command line.
*/
   public static void main(String [] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}
