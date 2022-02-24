import java.util.Scanner;
/**
Program that determines the midpoint of a line segment
given the x and y coordinates for the two end components for
the line segment.
Project 2
@author Michael Duvall Comp 1210-08
@version 9/5/2018
*/
public class MidpointOfLineSegment {
/**
Program that takes in two coordinates and determines the
midpoint of the created line segment.

@param args - Standard command line
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x1, y1, x2, y2;
               
      //Prompt user for coordinates of endpoint 1:
      System.out.println("Enter the coordinates for endpoint 1:");
      System.out.print("\tx1 = ");
      x1 = userInput.nextDouble();
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();
      
      //Prompt user for coordinates of endpoint 2:
      System.out.println("Enter the coordinates for endpoint 2:");
      System.out.print("\tx2 = ");
      x2 = userInput.nextDouble();
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
      System.out.println();
      
      //Calculate midpoints:
      double midPointX = (x1 + x2) / 2;
      double midPointY = (y1 + y2) / 2;
      System.out.println("For endpoints (" + x1 + ", " + y1 + ") "
         + "and (" + x2 + ", " + y2 + "), the midpoint is (" + midPointX
         + ", " + midPointY + ").");
   }
}