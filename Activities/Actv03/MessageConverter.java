import java.util.Scanner; 
/**
Program that reads in a message from a user then takes in
a number 1-5 from the user. Based on the number, the program will
print the users message trimmed, in lower case, in upper case, with
vowels replaced with underscores, or without the first and last character.

Comp 1210-08
@author Michael Duvall
@version 9/9/2018
*/
public class MessageConverter {
/**
Program takes in user message and number and according to number
prints out variations of the message.
@param args - standard command line
*/
   public static void main(String [] args) {
   
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType = 0;
      String result = "";
      
      //Promt user for a message
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      //Prompt user for their desired alteration to their message
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      outputType = Integer.parseInt(userInput.nextLine());
      
      //If statements to print out desired alterated message of user
      if (outputType == 0) { // as is
         result = message;
      }
      else if (outputType == 1) { // trimmed
         result = message.trim();
      }
      else if (outputType == 2) { // lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3) { // upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4) { // replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5) { // without first and last character
         result = message.substring(1, message.length() - 1);
      }
      
      else { // invalid input
         result = "Error: Invalid choice input.";
      }
      System.out.println("\n" + result);
   }
}