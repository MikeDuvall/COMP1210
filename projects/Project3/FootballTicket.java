import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

/**Program that accepts inputted coded football ticket information
that includes ticket price, category, time, date, seat, row,
section, and a description of the game, then prints information
accordingly.

Progect 3
@author Michael Duvall Comp 1210
@version 9/12/18
*/
public class FootballTicket {
   static final double STUDENT_DISCOUNT = 0.67;
   static final double FACULTY_STAFF_DISCOUNT = 0.20;

/**Program that takes in coded football ticket information
and prints out the respective information.

@param args - Standard command line
*/

   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      DecimalFormat fPrice = new DecimalFormat("$###.00");
      DecimalFormat fCost = new DecimalFormat("$##0.00");
      DecimalFormat fLottery = new DecimalFormat("0000000");
      Random lottery = new Random();
      String ticket, game, dateString, timeString, seat, 
         section, row, priceString, trimmedTicket, hours,
         minutes, month, date, year;
      char category;
      double cost = 0.0;
      double price = 0.0;
      int lotteryNum;
      
      //Get ticket info
      System.out.print("Enter your ticket code: ");
      ticket = input.nextLine();
      System.out.println();
      trimmedTicket = ticket.trim();
      int ticketChar = trimmedTicket.length();
      
      //Evalutate ticket info
      if (ticketChar >= 25) {
         category = trimmedTicket.charAt(0);
         priceString = trimmedTicket.substring(1, 6);
         
         hours = trimmedTicket.substring(6, 8);
         minutes = trimmedTicket.substring(8, 10);
         timeString = hours + ":" + minutes;
         
         month = trimmedTicket.substring(10, 12);
         date = trimmedTicket.substring(12, 14);
         year = trimmedTicket.substring(14, 18);
         dateString = month + "/" + date + "/" + year;
         
         seat = trimmedTicket.substring(18, 20);
         row = trimmedTicket.substring(20, 22);
         section = trimmedTicket.substring(22, 24);
         game = trimmedTicket.substring(24);
        
         price = Double.parseDouble(priceString) / 100;
      
         if (category == 's') {
            //cost = fCost.format(p - (STUDENT_DISCOUNT * p));
            cost = price - (STUDENT_DISCOUNT * price);
         }
         else if (category == 'f') {
            //cost = fCost.format(p - (FACULTY_STAFF_DISCOUNT * p));
            cost = price - (FACULTY_STAFF_DISCOUNT * price);
         }
         else {
            //cost = fCost.format(p);
            cost = price;
         }
         
         
         //Ticket Info Printed
         System.out.println("Game: " + game + "   Date: " + dateString
            + "   Time: " + timeString + "\nSection: "
            + Integer.parseInt(section) + "   Row: " + row
            + "   Seat: " + seat + "\nPrice: " + fPrice.format(price)
            + "   Category: " + category + "   Cost: " + fCost.format(cost));
         
         //Random Lottery Number
         lotteryNum = lottery.nextInt(100000) + 1;
         System.out.println("Prize Number: " + fLottery.format(lotteryNum));
      }
      else {
         System.out.println("Invalid Ticket Code." 
            + "\nTicket code must have at least 25 characters.");
      }
   }
}