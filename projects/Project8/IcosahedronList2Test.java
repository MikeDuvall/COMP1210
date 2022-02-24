import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**Tect Class for methods inside of IcosahedtonList2 class.
Project 8
@author Michael Duvall
@version 10/25/18
*/
public class IcosahedronList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**Test getName and numberOfIcosahedrons.*/
   @Test public void getNameAndNumberOfIcosTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      iArray[2] = new Icosahedron("Test3", "Blue", 2);
   
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
   
      Assert.assertEquals("getName test", "Test List", iList.getName());
      Assert.assertEquals("numberOfIcosahedrons test",
         3, iList.numberOfIcosahedrons());
      IcosahedronList2 list2 = new IcosahedronList2("null", null, 0);
      Assert.assertEquals(0, list2.numberOfIcosahedrons());
   }
   
   /**Test totalSurfaceArea and totalVolume.*/
   @Test public void totalSurfaveAreaAndVolumeTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      iArray[2] = new Icosahedron("Test3", "Blue", 2);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      
      Assert.assertEquals("totalSurfaceArea test",
         103.92304845413263, iList.totalSurfaceArea(), .0001);
      Assert.assertEquals("totalVolume test",
         52.360679774997905, iList.totalVolume(), 0.0001);
     
      //List with no Icos
      Icosahedron[] iArray2 = new Icosahedron[100];
      IcosahedronList2 iList2 = new IcosahedronList2("No Icos", iArray2, 0);
      Assert.assertEquals("totalSurfaceArea test",
         0.0, iList2.totalSurfaceArea(), .0001);
      Assert.assertEquals("totalVolume test",
         0.0, iList2.totalVolume(), 0.0001);
   }
   
   /**Test average Methods.*/
   @Test public void averageMethods() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      iArray[2] = new Icosahedron("Test3", "Blue", 2);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      
      Assert.assertEquals("averageSurface Test",
         34.64101615137754, iList.averageSurfaceArea(), .0001);
      Assert.assertEquals("averageVolume Test",
         17.4535599249993, iList.averageVolume(), .0001);
      Assert.assertEquals("averageSurfaceToVolumeRatio Test",
         1.984753614748822, iList.averageSurfaceToVolumeRatio(), .0001);
         
      //list with no icos
      Icosahedron[] iArray2 = new Icosahedron[100];
      IcosahedronList2 iList2 = new IcosahedronList2("No Icos", iArray2, 0);
      Assert.assertEquals("averageSurface Test",
         0.0, iList2.averageSurfaceArea(), .0001);
      Assert.assertEquals("averageVolume Test",
         0.0, iList2.averageVolume(), .0001);
      Assert.assertEquals("averageSurfaceToVolumeRatio Test",
         0.0, iList2.averageSurfaceToVolumeRatio(), .0001);
   }
   
   /**Test toString and summaryInfo.*/
   @Test public void toStringAndSummaryInfoTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      
      Assert.assertEquals("toString test", true,
         iList.toString().contains("Test List\n\n"
         + "Icosahedron \"Test1\" is \"Blue\" with 30 edges "
         + "of length 2.0 units."
         +	"\n\tsurface area = 34.641016 square units"
         +	"\n\tvolume = 17.45356 cubic units"
         +	"\n\tsurface/volume ratio = 1.984754\n\n"
         + "Icosahedron \"Test2\" is \"Blue\""
         + " with 30 edges of length 2.0 units."
         +	"\n\tsurface area = 34.641016 square units"
         +	"\n\tvolume = 17.45356 cubic units"
         +	"\n\tsurface/volume ratio = 1.984754"));
      Assert.assertEquals("summaryInfo Test", true,
         iList.summaryInfo().contains("----- Summary for Test List -----\n"
         + "Number of Icosahedrons: 2"
         + "\nTotal Surface Area: 69.282"
         + "\nTotal Volume: 34.907"
         + "\nAverage Surface Area: 34.641"
         + "\nAverage Volume: 17.454"
         + "\nAverage Surface/Volume Ratio: 1.985"));
         
      IcosahedronList2 list2 = new IcosahedronList2("null", null, 0);
      Assert.assertTrue(list2.toString().contains("null\n"));
   }
   
   /**Test getList.*/
   
   // @Test public void getListTest() {
      // Icosahedron[] iArray = new Icosahedron[100];
      // iArray[0] = new Icosahedron("Test1", "Blue", 2);
      // iArray[1] = new Icosahedron("Test2", "Blue", 2);
      // IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
   //    
   //    Assert.assertEquals("getList test", true,
   //       iList.getList());
// 
   // }
   
   /**Test readFile.
   @throws IOException for reading a file
   */
   @Test public void readFileTest() throws IOException {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      IcosahedronList2 iList = new IcosahedronList2("Test List", null, 0);
      iList = iList.readFile("icosahedron_data_1.txt");
      Assert.assertEquals("readFile test", 
         "Icosahedron Test List", iList.getName());
   }
   
   /**Test addIcosahedron.*/
   @Test public void addIcosahedronTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      
      Icosahedron i = new Icosahedron("Added", "Orange", 2);
      iList.addIcosahedron("Added", "Orange", 2);
      Icosahedron[] iA = iList.getList();
      Assert.assertEquals(i, iA[2]);
   }
   
   /**Test findIcosahedron.*/
   @Test public void findIcosahedron() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 2);
      Icosahedron found = iList.findIcosahedron("Test1");
      Assert.assertEquals(iArray[0], found);
   }
   
   /**Test deleteIcosahedron.*/
   @Test public void deleteIcosahedronTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      iArray[2] = new Icosahedron("Test3", "Blue", 2);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      
      iList.deleteIcosahedron("Test2");
      Icosahedron i = new Icosahedron("Test3", "Blue", 2);
      Assert.assertEquals(i, iArray[1]);
      
      Icosahedron delete = iList.deleteIcosahedron("Hello");
      Assert.assertEquals(null, delete);
   }
   
   /**Test editIcosahedron.*/
   @Test public void editIcosahedronTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Test1", "Blue", 2);
      iArray[1] = new Icosahedron("Test2", "Blue", 2);
      iArray[2] = new Icosahedron("Test3", "Blue", 2);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      
      Assert.assertTrue(iList.editIcosahedron("Test1", "Orange", 3));
      Assert.assertFalse(iList.editIcosahedron("Hello", "Blue", 2));
   }
   
   /**Test findIcosahedronWith methods.*/
   @Test public void findIcosahedronWithTest() {
      Icosahedron[] iArray = new Icosahedron[100];
      iArray[0] = new Icosahedron("Shortest", "Blue", 2);
      iArray[1] = new Icosahedron("Medium", "Blue", 3);
      iArray[2] = new Icosahedron("Longest", "Blue", 4);
      IcosahedronList2 iList = new IcosahedronList2("Test List", iArray, 3);
      
      Assert.assertEquals(iArray[0], iList.findIcosahedronWithShortestEdge());
      Assert.assertEquals(iArray[2], iList.findIcosahedronWithLongestEdge());
      Assert.assertEquals(iArray[0], iList.findIcosahedronWithSmallestVolume());
      Assert.assertEquals(iArray[2], iList.findIcosahedronWithLargestVolume());
      
      //List with no Icos
      
      IcosahedronList2 iList2 = new IcosahedronList2("Null List", null, 0);
      Assert.assertEquals(null, iList2.findIcosahedronWithShortestEdge());
      Assert.assertEquals(null, iList2.findIcosahedronWithLongestEdge());
      Assert.assertEquals(null, iList2.findIcosahedronWithSmallestVolume());
      Assert.assertEquals(null, iList2.findIcosahedronWithLargestVolume());
   }
}
