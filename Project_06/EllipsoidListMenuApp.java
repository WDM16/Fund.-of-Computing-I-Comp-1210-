import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
*
* Ellipsoid program that stores the name of the list
* and an ArrayList of Ellipsoid objects.  
*
* Project 06
*
* @author Will May
* @2/17/20
*
*/
public class EllipsoidListMenuApp {
/**
  *@param args not used.
  *@throws FileNotFoundException for EllipsoidListApp
  */
   public static void main(String[] args)  throws FileNotFoundException {
      String eListName = "*** no list name assigned ***";
      ArrayList<Ellipsoid> eListArray = new ArrayList<Ellipsoid>();
      EllipsoidList eList = new EllipsoidList(eListName, eListArray);
      String fileName = "no file name";
      
      double a = 0;
      double b = 0;
      double c = 0;
      String label = "";
   
      
      String code = "";
   
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Ellipsoid List System Menu\n"
                       + "R - Read File and Create Ellipsoid List\n"
                       + "P - Print Ellipsoid List\n" 
                       + "S - Print Summary\n"
                       + "A - Add Ellipsoid\n"   
                       + "D - Delete Ellipsoid\n"   
                       + "F - Find Ellipsoid\n"
                       + "E - Edit Ellipsoid\n"
                       + "Q - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': // Read in File and Create EllipsoidList
               System.out.print("\tFile Name: ");
               fileName = scan.nextLine();
            
               eList = eList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "Ellipsoid List created");
               System.out.println();
            
               break; 
                    
            case 'P': // Print EllipsoidList
               System.out.println(eList);
            
               break;
               
            case 'S': // Print Summary
               System.out.println();
               System.out.println(eList.summaryInfo());
               System.out.println();
            
               break;
               
               
            case 'A': // Add an Ellipsoid
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               
               System.out.print("\ta: ");
               a = Double.parseDouble(scan.nextLine());
               
               System.out.print("\tb: ");
               b = Double.parseDouble(scan.nextLine());
               
               System.out.print("\tc: ");
               c = Double.parseDouble(scan.nextLine());
            
               eList.addEllipsoid(label, a, b, c);
               System.out.println("\t*** Ellipsoid added ***");
               
               System.out.println();
               break;
         
            case 'D': // Delete Ellipsoid Object
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               Ellipsoid d = eList.deleteEllipsoid(label);
            
               if (d != null) {
                  System.out.println("\t\"" + d.getLabel() + "\" deleted");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found");
               }
               System.out.println();
            
               break; 
               
            case 'F': // Find Ellipsoid Object
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               Ellipsoid e = eList.findEllipsoid(label);
               
               if (e != null) {
                  System.out.println(e);
               }
               else {
                  System.out.println("\t\"" + label + "\" not found");
               }
               System.out.println();
            
               break;
               
            case 'E': // Edit Ellipsoid Object
               System.out.print("\tlabel: ");
               label = scan.nextLine();
              
               System.out.print("\ta: ");
               a = Double.parseDouble(scan.nextLine());
               
               System.out.print("\tb: ");
               b = Double.parseDouble(scan.nextLine());
               
               System.out.print("\tc: ");
               c = Double.parseDouble(scan.nextLine());
               
               Ellipsoid g = eList.findEllipsoid(label);
               
               if (g != null) {
                  eList.editEllipsoid(label, a, b, c);
                  System.out.println("\t\"" + g.getLabel() 
                     + "\" successfully edited");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found");
               }
            
               System.out.println();
               break;
         
               
               
                  
            case 'Q': // Quit
               break;
               
            default:  // no match, loop again
               System.out.println("\t*** invalid code ***");
               System.out.println();
            
               break; 
         }
      
      } while (!code.equalsIgnoreCase("Q"));
   
   }

}