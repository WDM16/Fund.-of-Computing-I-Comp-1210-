import java.util.Scanner;

/**
*
* Program that uses the Ellipsoid program. 
* 
*
* Project 05
*
* @author Will May
* @2/10/20
*
*/
public class EllipsoidApp {
/**
  *@param args not used.
  */
   public static void main(String[] args)
   {
      String label = "";
      double a = 0;
      double b = 0;
      double c = 0;
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      
      //Request input from the user.
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      
      //Request input from the user.
      System.out.print("\ta: ");
      a = Double.parseDouble(userInput.nextLine());
      
      
      if (a <= 0) {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      System.out.print("\tb: ");
      b = Double.parseDouble(userInput.nextLine());
      if (b <= 0) {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      System.out.print("\tc: ");
      c = Double.parseDouble(userInput.nextLine()); 
      if (c <= 0) {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      
         
      
         
      Ellipsoid ex1 = new Ellipsoid(label, a, b, c);
      System.out.println("\n" + ex1);
      
   
       
     
   
    
    
   }
}