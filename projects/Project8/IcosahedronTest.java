import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**Class to test methods inside of Icosahedron Class.
Project 8
@author Michael Duvall Comp 1210-08
@version 10/25/18
*/
public class IcosahedronTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


//    /** A test that always fails. **/
   // @Test public void defaultTest() {
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
   /**Test getters. */
   @Test public void gettersTest() {
      Icosahedron i = new Icosahedron("Mike", "Blue", 4.5);
      Assert.assertEquals("getLabel test", "Mike", i.getLabel());
      Assert.assertEquals("getColor test", "Blue", i.getColor());
      Assert.assertEquals("getEdge test", 4.5, i.getEdge(), .0001);
   }
   /**Test setters.*/
   @Test public void settersTest() {
      Icosahedron i = new Icosahedron("Mike", "Blue", 4.5);
      i.setLabel("Ike");
      i.setColor("Green");
      i.setEdge(9.0);
      Assert.assertEquals("setLabel test", "Ike", i.getLabel());
      Assert.assertEquals("setColor test", "Green", i.getColor());
      Assert.assertEquals("setEdge test", 9.0, i.getEdge(), .0001);
      //null color, label, and edge < 0
      Assert.assertEquals("setColor false test", false, i.setColor(null));
      Assert.assertEquals("setLabel false test", false, i.setLabel(null));
      i.setEdge(0);
      Assert.assertEquals("setEdge false test", 9.0, i.getEdge(), .0001);
   }
   /**Test surfaceArea.*/
   @Test public void surfaceAreaTest() {
      Icosahedron i = new Icosahedron("Mike", "Blue", 2.0);
      Assert.assertEquals("surfaceArea test",
         34.64101615, i.surfaceArea(), .0001);
   }
   /**Test volume.*/
   @Test public void volumeTest() {
      Icosahedron i = new Icosahedron("Mike", "Blue", 2.0);
      Assert.assertEquals("volume test", 17.4535599, i.volume(), .0001);
   }
   /**Test surfaceToVolumeRatio.*/
   @Test public void surfaceToVolumeRatio() {
      Icosahedron i = new Icosahedron("Mike", "Blue", 2.0);
      Assert.assertEquals("surfaceToVolumeRatio test",
         1.984753614748822, i.surfaceToVolumeRatio(), .0001);
   }
   /**Test toString.*/
   @Test public void toStringTest() {
      Icosahedron i = new Icosahedron("Mike", "Blue", 2.0);
      Assert.assertEquals("toString test", true,
         i.toString().contains("Icosahedron \"Mike\" is \"Blue\" with 30"
         + " edges of length 2.0 units."
         + "\n\tsurface area = 34.641016 square units"
         + "\n\tvolume = 17.45356 cubic units"
         + "\n\tsurface/volume ratio = 1.984754"));
   
   }
   /**Test getCount and resetCount.*/
   @Test public void countResetCountTest() {
      Icosahedron i = new Icosahedron("Mike", "Blue", 2);
      i.resetCount();
      Assert.assertEquals("resetCount test", 0, i.getCount());
      Icosahedron i2 = new Icosahedron("Ike", "Green", 2);
      Assert.assertEquals("getCount test", 1, i.getCount());
   }
   
   /**Test equals.*/
   @Test public void equalsTest() {
      Icosahedron i1 = new Icosahedron("Mike", "Blue", 2);
      Icosahedron i2 = new Icosahedron("Mike", "Blue", 2);
      Assert.assertEquals("equals test", true, i1.equals(i2));
   
      i2 = new Icosahedron("Ike", "Blue", 2);
      Assert.assertEquals("equals false test", false, i1.equals(i2));
   
      i2 = new Icosahedron("Mike", "Green", 2);
      Assert.assertEquals("equals false test", false, i1.equals(i2));
   
      i2 = new Icosahedron("Mike", "Blue", 3);
      Assert.assertEquals("equals false test", false, i1.equals(i2));
   
      String i3 = "Oops";
      Assert.assertEquals("equals false test", false, i1.equals(i3));
   //hashCode()
      Assert.assertEquals("equals false test", 0, i1.hashCode());
   }
}
