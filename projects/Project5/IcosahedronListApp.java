import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**This class reads in the name of the data file entered by
the user and then reads list name and Icosahedron data from the
file, creates Icosahedron objects, stores them in a local ArrayList
of Icosahedron objects, creates a IcosahedronList object with the name
of the list and the ArrayList of Icosahedron objects, and prints the
IcosahedronList Object  followed summary information.
Project 5
@author Michael Duvall - COMP 1210- 08
@version 10/03/18
*/
public class IcosahedronListApp {
/**Takes in data file input and evaluates name and Icosahedron data accordingly,
creates icosahedron object and stores it into an arraylist,
creates an corresponding IcosahedronList, and prints out info of
IcosahedronList object.
@param args - stanndard command line
@throws FileNotFoundException - required by Scanner for File.
*/
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Icosahedron> myList = new ArrayList<Icosahedron>();
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.println();
      Scanner scanFile = new Scanner(new File(fileName));
      
      String icosahedronListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = Double.parseDouble(scanFile.nextLine());
      
         Icosahedron i = new Icosahedron(label, color, edge);
         myList.add(i);
      }
      scanFile.close();
      IcosahedronList icosahedronList
         = new IcosahedronList(icosahedronListName, myList);
      System.out.println(icosahedronList);
      System.out.println(icosahedronList.summaryInfo());
   }
}