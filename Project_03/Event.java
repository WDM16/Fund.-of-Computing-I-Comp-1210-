import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
*
* Program that gives the user information on the event
* based upon their input.
*
* Project 3
*
* @author Will May
* @1/28/20
*/
public class Event
{
   /**
   * Uses the users input to aid the user to 
   * read their ticket.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String code = "";
      String result = "";
      String event = "";
      String section = "";
      String row = "";
      String seat = "";
      String price = "";
      String discount = "";
      
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat pf = new DecimalFormat("0%");
      DecimalFormat prf = new DecimalFormat("0000");
      
    //Request input from the user.
      System.out.print("Enter your event code: ");
      code = userInput.nextLine();
      
    //Trim the length of the code. 
      result = code.trim();         
      int count = result.length();
      
    //Use the code to determine if it longer than 26 characters.
      if (count < 26) { 
         System.out.println();
         System.out.println("Invalid Event Code.");
         System.out.println("Event code must have "
            + "at least 26 characters.");
      }
      else {
         System.out.println();
      
      
      //Print event and its description.
         event = result.substring(25, result.length());
         System.out.print("Event: " 
            + event);
            
      //Print date and its decription.
         String month = result.substring(0, 2) + "/";
         String day = result.substring(2, 4) + "/";
         String year = result.substring(4, 8);
         System.out.print("   Date: "
            + month + day + year);
            
      //Print time and its description.
         String hr = result.substring(8, 10) +  ":";
         String min = result.substring(10, 12);
         System.out.println("   Time: "
            + hr + min);
            
      //Print section and its description.
         section = result.substring(19, 21);
         System.out.print("Section: "
            + section);
            
      //Print row and its description.
         row = result.substring(21, 23);
         System.out.print("   Row: "
            + row);
            
      //Print seat and its description.
         seat = result.substring(23, 25);
         System.out.println("   Seat: "
            + seat);
            
      //Print price and its description. 
         price = result.substring(12, 17);
         double pricex = Double.parseDouble(price);
         double pricey = pricex / 100;
         System.out.print("Price: "
            + (df.format(pricey)));
            
      //Print discount and its description.
         discount = result.substring(17, 19); 
         double discountx = Double.parseDouble(discount);
         double discounty = discountx / 100;
         System.out.print("   Discount: "
            + (pf.format(discounty)));
            
      //Print cost and its description.
         double cost = pricey * discounty;
         double costx = pricey - cost;
         
         System.out.println("   Cost: "
            + (df.format(costx)));
            
      //Print prize number and its description. 
         Random generator = new Random();
         double prizenum = generator.nextDouble() * 1000;
         
         System.out.print("Prize Number: "
            + (prf.format(prizenum)));
      
      
      }
      
      
       
       
       
   }
}
