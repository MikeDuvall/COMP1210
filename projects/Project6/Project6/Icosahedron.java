import java.text.DecimalFormat;
/**Program that defines Icosahedron object.
Project 4
@author Michael Duvall Comp 1210
@version 9/18/18
*/
public class Icosahedron {
//Variables
   private String label = "";
   private String color = "";
   private double edge = 0.0;
//Constructor
/**This constructor creates an instance of Icosahedron and
initializes the fields.
@param labelIn - description of size of the Icosahedron
@param colorIn - color of the Icosahedron
@param edgeIn - size of the edges of the Icosahedron
*/
   public Icosahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   
//Methods
/**This method returns the label.
@return label - returns the label
*/
   public String getLabel() {
      return label;
   }
   
/**This method determines if the label is set and trims
the set label.
@param labelIn - the label inputted
@return true - if the label is set
*/
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }
/**This method returns the color.
@return color - returns color
*/   
   public String getColor() {
      return color;
   }
/**This method sets the color.
@param colorIn - the color inputted
@return true - if the color is set.
*/
   public boolean setColor(String colorIn) {
      if (colorIn == null) {
         return false;
      }
      else {
         color = colorIn.trim();
         return true;
      }
   }
/**This method returns the edge.
@return edge - returns edge
*/
   public double getEdge() {
      return edge;
   }
/**This method sets the edge.
@param edgeIn - the edge inputted
@return true - if edge is greater than 0
*/
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
         edge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
/**This method calculates the surface area.
@return surfaceArea - the surface area
*/
   public double surfaceArea() {
      double surfaceArea = (5 * Math.sqrt(3) * Math.pow(edge, 2));
      return surfaceArea;
   }
   /**This method returns the volume.
   @return volume - the volume
   */
   public double volume() {
      double volume = (5 * (3 + Math.sqrt(5))) / 12 * Math.pow(edge, 3);
      return volume;
   }
   /**This method returns the surface area to volume ratio.
   @return surfaceToVolumeRatio - the surface area to volume ratio
   */
   public double surfaceToVolumeRatio() {
      double surfaceToVolumeRatio = surfaceArea() / volume();
      return surfaceToVolumeRatio;
   }
   /**This method returns string representation of the object.
   @return result - the string output
   */
   public String toString() {
   //Small, blue, length 0.01
      DecimalFormat df = new DecimalFormat("#,##0.0#####");
   
      String result = "Icosahedron \"" + label + "\" is \"" + color
         + "\" with 30 edges of length " + edge + " units.";
      result += "\n\tsurface area = " + df.format(surfaceArea())
         + " square units";
      result += "\n\tvolume = " + df.format(volume()) + " cubic units";
      result += "\n\tsurface/volume ratio = "
         + df.format(surfaceToVolumeRatio());
      return result;
   }
}
