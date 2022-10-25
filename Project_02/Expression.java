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
public class Expression {

/**
*
* User is given equation, then inputs values to determine  
* the solution of the equation.
*
* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String equation = " ";
      double xVariable = 0;
      double yVariable = 0;
      
      
      //Display the given equation:
      System.out.print("result = (10x + 32.6) (5y - 1.567) / xy");
      
      //Prompt the user with a x variable:
      System.out.print("\n\tx = ");
      xVariable = userInput.nextDouble();
      
      //Prompt the user with a y variable:
      System.out.print("\ty = ");
      yVariable = userInput.nextDouble();
      
      
      double xyVariable = xVariable * yVariable;
      
      //Print the solution to the equation:
      if (xyVariable == 0)
      {
      //print undefined:
         System.out.print("result is \"undefined\"");
      
      }
      else
      {
      //Solve the equation and print the result:
         System.out.print("result = "
            + (10 * xVariable + 32.6) * (5 * yVariable - 1.567) 
            / (xVariable * yVariable));
      }
     
    
   }

}