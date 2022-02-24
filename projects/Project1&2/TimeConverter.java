import java.util.Scanner;
/**Program that accepts a raw time measurement in seconds and 
then displays the time in a combination of days, hours, minutes, and seconds.

Project 2
@author Michael Duvall Comp 1210-08
@version 9/5/2018
*/
public class TimeConverter {
/**Program the takes in inputed time and gives an output of the time
in a combination of days, hours, minutes, and seconds.

@param args - Standard command line
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int timeMeasurement, days, hours, minutes, seconds;
      
      //Prompt user for time measurement in seconds:
      System.out.print("Enter the raw time measurement in seconds: ");
      timeMeasurement = userInput.nextInt();
      
      if (timeMeasurement < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      else {
         System.out.println("Measurement by combined days, hours, "
            + "minutes, seconds:");
         days = timeMeasurement / 86400;
         hours = timeMeasurement % 86400 / 3600;
         minutes = timeMeasurement % 86400 % 3600 / 60;
         seconds = timeMeasurement % 86400 % 3600 % 60;
         System.out.println("\tdays: " + days + "\n\thours: " + hours
            + "\n\tminutes: " + minutes + "\n\tseconds: " + seconds);
         System.out.println();
         System.out.println(timeMeasurement + " seconds = " 
            + days + " days, " + hours + " hours, " 
            + minutes + " minutes, " + seconds + " seconds");
      }
   }
}