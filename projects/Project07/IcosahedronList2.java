import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**This class stores the name of the list and an array of Icosahedron
objects, and the numnber of Icosahedrons in the array, and includes methods
to interact with the Icosahedrons in the array.
project7
@author Michael Duvall - COMP 1210
@version 10/17/18
*/
public class IcosahedronList2 {

   private String listName = "";
   private Icosahedron[] icosahedronList;
   private int numberOfIcos = 0;
/**This constructor takes in the list name and the Icosahedron array.
@param listNameIn - the list name
@param icosListIn - the icosahedron array
@param numberOfIcosIn - the number of icosedrons in the array
*/
   public IcosahedronList2(String listNameIn,
            Icosahedron[] icosListIn, int numberOfIcosIn) {
      icosahedronList = icosListIn;
      listName = listNameIn;
      numberOfIcos = numberOfIcosIn;
   }
/**This method returns the name of the list.
@return listName - the name of the list
*/
   public String getName() {
      return listName;
   }
/**This method returns the number of Icosahedrons in the list.
@return numOfIcos - the number of Icosahedrons
*/
   public int numberOfIcosahedrons() {
      if (numberOfIcos == 0) {
         return 0;
      }
      else {
         return numberOfIcos;
      }
   }
   /**This method calculates the total surface area of all the
   Icosahedrons in the list.
   @return totalSurfaceArea - the total surface area
   */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0.0;
      int numOfIcos = numberOfIcos;
      int index = numOfIcos - 1;
      if (numOfIcos == 0) {
         totalSurfaceArea = 0.0;
      }
      else {
         while (numOfIcos > 0) {
            totalSurfaceArea += icosahedronList[index].surfaceArea();
            index--;
            numOfIcos--;
         }
      }
      return totalSurfaceArea;
   }
   /**This methos calculates the total volume of all the 
   Icosahedrons in the list.
   @return totalVolume - the total volume
   */
   public double totalVolume() {
      double totalVolume = 0.0;
      int numOfIcos = numberOfIcos;
      if (numOfIcos == 0) {
         return 0.0;
      }
      else {
         while (numOfIcos > 0) {
            totalVolume += icosahedronList[numOfIcos - 1].volume();
            numOfIcos--;
         }
      }
      return totalVolume;
   }
   /**This method calculates the average surface area of all
   the Icosahedrons in the list.
   @return averageSurfaceArea - the average surface area
   */
   public double averageSurfaceArea() {
      double averageSurfaceArea = 0.0;
      if (numberOfIcos > 0) {
         averageSurfaceArea = totalSurfaceArea() / numberOfIcos;
         return averageSurfaceArea;
      }
      else {
         return averageSurfaceArea;
      }
   }
   /**This method calculates the average volume of all the 
   Icosahedrons in the list.
   @return averageVolume - the average volume
   */
   public double averageVolume() {
      double averageVolume = 0.0;
      if (numberOfIcos > 0) {
         averageVolume = totalVolume() / numberOfIcos;
         return averageVolume;
      }
      else {
         return averageVolume;
      }
   }
   /**This method calculates the average surface area to volume ratio
   of all the icosahedrons in the list.
   @return averageSurfaceToVolumeRatio - the average
   surface area to volume ratio
   */
   public double averageSurfaceToVolumeRatio() {
      double averageSurfaceToVolumeRatio = 0.0;
      int numOfIcos = numberOfIcos;
      if (numOfIcos == 0) {
         return averageSurfaceToVolumeRatio;
      }
      else {
         double totalSurfaceToVolumeRatio = 0.0;
         while (numOfIcos > 0) {
            totalSurfaceToVolumeRatio 
               += icosahedronList[numOfIcos - 1].surfaceToVolumeRatio();
            numOfIcos--;
         }
         averageSurfaceToVolumeRatio = totalSurfaceToVolumeRatio
            / numberOfIcos;
         return averageSurfaceToVolumeRatio;
      }
   }
   /**This method creates a string representation of all the Icosahedrons
   in the list.
   @return - the string representation
   */
   public String toString() {
      String output = getName() + "\n";
      int numOfIcos = numberOfIcos;
      int index = 0;
      if (numOfIcos == 0) {
         output = getName() + "\n";
      }
      while (index < numberOfIcos) {
         output += "\n" + icosahedronList[index] + "\n";
         index++;
      }
      return output + "\n";
   }
   /**This methos creates a string representation of the summary of the
   information of the icosahedron array.
   @return - the summary
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----"
         + "\nNumber of Icosahedrons: " + numberOfIcosahedrons()
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + "\nTotal Volume: " + df.format(totalVolume())
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + "\nAverage Volume: " + df.format(averageVolume())
         + "\nAverage Surface/Volume Ratio: "
         + df.format(averageSurfaceToVolumeRatio());
      return output;
   }
   /**This method returns the Icosahedron list.
   @return icosahedronList - the icos list
   */
   public Icosahedron[] getList() {
      return icosahedronList;
   }
   /**This method reads an icos from a file and adds it to the list.
   @param fileNameIn - the file being read
   @return iL - the new list
   @throws FileNotFoundException if file cannot be found
   */
   public IcosahedronList2 readFile(String fileNameIn) 
      throws FileNotFoundException {
      String listNameNew = "*** no list name assigned **";
      Icosahedron[] myList = new Icosahedron[100];
      Scanner scanFile = new Scanner(new File(fileNameIn));
      int numIcosahedrons = 0;
      String label = "", color = "";
      double edge = 0.0;
      
      listNameNew = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.next();
         color = scanFile.next();
         edge = Double.parseDouble(scanFile.next());
         Icosahedron i = new Icosahedron(label, color, edge);
         myList[numIcosahedrons] = i;
         numIcosahedrons++;
      }
      
      IcosahedronList2 iL = new IcosahedronList2(listNameNew,
         myList, numIcosahedrons);
   
      return iL;
   }
   /**This method adds an Icosahedron to the list.
   @param label - the label of icos being added
   @param color -  color of icos being added
   @param edge - edge of icos being added
   */
   
   public void addIcosahedron(String label, String color, double edge) {
      Icosahedron i = new Icosahedron(label, color, edge);
      icosahedronList[numberOfIcos] = i;
      numberOfIcos++;
   }
   /**This method returns a icosahedron from the list. 
   @param label - label of icos wanting to be found
   @return foundI - the Icos found
   */
   public Icosahedron findIcosahedron(String label) {
      int index = -1;
      String labelF = "", colorF = "";
      double edgeF = 0.0;
      Icosahedron foundI = new Icosahedron(labelF, colorF, edgeF);
      // find icos
      for (int i = 0; i < numberOfIcos; i++) {
         if (icosahedronList[i].getLabel().equalsIgnoreCase(label)) {
            foundI = icosahedronList[i];
            return foundI;
         }
      }
   
      return null;
   }
   /**This method deletes the desired Icos.
   @param label - label of desired icos
   @return result - true if the icos was deleted
   */
   public Icosahedron deleteIcosahedron(String label) {
      String labelD = "", colorD = "";
      double edgeD = 0.0;
      Icosahedron deleteI = new Icosahedron(labelD, colorD, edgeD);
      
      if (findIcosahedron(label) == null) {
         deleteI = null;
      }
      else {
      // find icos and delete it
         for (int i = 0; i < numberOfIcos; i++) { 
            if (icosahedronList[i].getLabel().equalsIgnoreCase(label)) {
               deleteI = icosahedronList[i];
               for (int j = i; j < numberOfIcos - 1; j++) {
                  icosahedronList[j] = icosahedronList[j + 1];
               }
               icosahedronList[numberOfIcos - 1] = null;
               numberOfIcos--;
            }
         }
      }
      return deleteI;
   }
   /**This method edits the desired Icos.
   @param label - that of the desired icos
   @param color - that of the desired icos
   @param edge - that of the desired icos
   @return result - true if the icos was edited
   */
   public boolean editIcosahedron(String label, String color, double edge) {
      boolean result = false;
      int index = -1;
       // find icosahedron and edit
      for (int i = 0; i < numberOfIcos; i++) {
         if (icosahedronList[i].getLabel().equalsIgnoreCase(label)) {
            icosahedronList[i].setColor(color);
            icosahedronList[i].setEdge(edge);
            result = true;
         
         }
      }
      return result;
   }
}