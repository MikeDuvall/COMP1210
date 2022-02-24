import java.util.Scanner;
/**This program reads in the values for the label, color,
and edge for the Icosahedron and creates an Icosahedron object
and prints out a new line and the object.
Project 4
@author Michael Duvall COMP 1210
@version 9/19/18
*/
public class IcosahedronApp {
/**Program that takes input in for an Icosahedron object
and prints it out accordingly.
@param args - standard comand line
*/
   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter label, color, "
         + "and edge length for an icosahedron.");
      System.out.print("\tlabel: ");
      String label = input.nextLine();
      System.out.print("\tcolor: ");
      String color = input.nextLine();
      System.out.print("\tedge: ");
      double edge = input.nextDouble();
      
      if (edge <= 0) {
         System.out.println("Error: edge must be greater than 0.");
      }
      else {
         System.out.println();
         Icosahedron icosahedron = new Icosahedron(label, color, edge);
         System.out.println(icosahedron);
      }
   }
}