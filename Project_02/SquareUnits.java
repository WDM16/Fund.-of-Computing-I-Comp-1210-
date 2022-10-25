import java.util.Scanner;
/**
*
* Program that finds the result of a specific expression 
* after reading input values for x and y.
*
* @author Will May
* @version 1/22/20
*
*/
public class SquareUnits {
/**
*
* User enters in a number and displays the combination of acres, 
* square yards, square feet, and square inches.
*
* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int area = 0;
      int acres = 0;
      int squareYards = 0;
      int squareFeet = 0;
      int squareInches = 0;
      
            
   
   
   //Prompt the user for area in square inches:
      System.out.print("Enter the area in square inches: ");
      area = userInput.nextInt();
      
      
      if (area > 1000000000)
      {
         System.out.print("Limit of 1,000,000,000 "
            + "square inches exceeded!");
      }
      else
      {
       
      
         System.out.println("Number of Units: ");
         
         //Calculate and print the calculations:
         System.out.println("\tAcres: " + (area / 6272640));
         System.out.println("\tSquare Yards: " + (((area % 6272640) / 1296))); 
         System.out.println("\tSquare Feet: " 
              + (((area % 6272640) % 1296) / 144));
         System.out.print("\tSquare Inches: " 
              + (((area % 6272640) % 1296) % 144) / 1); 
      }
      
    
      
     
   }






}
