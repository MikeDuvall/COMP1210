import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**This class presents the user with a menu with eight options that
allows the user to make the program perform eight different tasks.
Project 6
@author Michael Duvall
@version 10/10/18
*/
public class IcosahedronListMenuApp {
/**This main method presents a menu to the user with eight options
to perform different actions regarding the icosahedron list.
@param args - standard command line
@throws FileNotFoundException - if the file cannot be opened
*/
   public static void main(String[] args) throws FileNotFoundException
   {
      String iListName = "no list name";
      ArrayList<Icosahedron> myList = new ArrayList<Icosahedron>();
      IcosahedronList myIList = new IcosahedronList(iListName, myList);
      String fileName = "no file name";
   
      String label, color;
      double edge;
   
      String code = "";
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Icosahedron List System Menu"
         + "\nR - Read File and Create Icosahedron List"
         + "\nP - Print Icosahedron List"
         + "\nS - Print Summary"
         + "\nA - Add Icosahedron"
         + "\nD - Delete Icosahedron"
         + "\nF - Find Icosahedron"
         + "\nE - Edit Icosahedron"
         + "\nQ - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch (codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               myIList = myIList.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "Icosahedron List created\n");
               break;
               
            case 'P':
               System.out.print(myIList);
               break;
         
            case 'S':
               System.out.println("\n" + myIList.summaryInfo() + "\n");
               break;
         
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
            
               myIList.addIcosahedron(label, color, edge);
               System.out.println("\t*** Icosahedron added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               Icosahedron iDelete = myIList.findIcosahedron(label);
               if (myIList.findIcosahedron(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else if (iDelete.getLabel().equalsIgnoreCase(label))
               {
                  System.out.println("\t\""
                     + myIList.findIcosahedron(label).getLabel()
                     + "\" deleted\n");
                  myIList.deleteIcosahedron(label);
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               Icosahedron iFind = myIList.findIcosahedron(label);
               if (myIList.findIcosahedron(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else if (iFind.getLabel().equalsIgnoreCase(label))
               {
                  System.out.println(myIList.findIcosahedron(label) + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               if (myIList.editIcosahedron(label, color, edge)) {
                  myIList.editIcosahedron(label, color, edge);
                  System.out.println("\t\"" + label
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      
      } while (!code.equalsIgnoreCase("Q"));
   
   }
   
}