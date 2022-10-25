import java.util.Scanner;
import java.text.DecimalFormat;
/**
*
* Program which solves an equation and then 
* formats the answer. 
*
* Project 3
*
* @author Will May
* @1/27/20
*/
public class Solver
{
 /**
 * Method solves the equation.
 *
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double x; 
      double result;
      
      //Request input from the user.
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      
      //Store the equation.
      result = ((Math.sqrt(Math.abs(11 * Math.pow(x, 4)
         + 9 * Math.pow(x, 3)
         + 7 * Math.pow(x, 2)
         + 5 * x
         + 4)))
         / (2 * x + 4));
         
      //Print the result.
      System.out.println("Result: " 
         + result);
         
      //Determine number of characters to the left and right.
      String resultx = Double.toString(result);
      int left = resultx.indexOf(".");
      int right = resultx.length() - left - 1;
     
      
      //Print number of characters to the left.
      System.out.println("# of characters to left "
         + "of decimal point: " 
         + left);
         
      //Print number of characters to the right.
      System.out.println("# of characters to right "
         + "of decimal point: " 
         + right);
   
      //Prints the formatted version.
      DecimalFormat df = new DecimalFormat("#,##0.0####"); 
      double resulty = result;         
      System.out.println("Formatted Result: "
         + (df.format(resulty)));
   }
   
   
   
}


