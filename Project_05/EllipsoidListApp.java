import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


/**
*
* Program that uses the Ellipsoid program. 
* 
*
* Project 05
*
* @author Will May
* @2/13/20
*
*/
public class EllipsoidListApp {
/**
  *@param args not used.
  *@throws FileNotFoundException for EllipsoidListApp
  */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<Ellipsoid> ellipsoidlist = new ArrayList<Ellipsoid>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      
      String fileName = scan.nextLine();
   
      Scanner scanFile = new Scanner(new File(fileName));
      
      String listname = scanFile.nextLine();
   
   
      while (scanFile.hasNext()) {
      
         String labelIn = scanFile.nextLine();
         double aIn = Double.parseDouble(scanFile.nextLine());
         double bIn = Double.parseDouble(scanFile.nextLine());
         double cIn = Double.parseDouble(scanFile.nextLine());
         
         Ellipsoid ex1 = new Ellipsoid(labelIn, aIn, bIn, cIn);
         ellipsoidlist.add(ex1); 
        
      
         
      }
      
      scanFile.close();
      
      EllipsoidList myEllipsoidList = 
         new EllipsoidList(listname, ellipsoidlist);
   
      System.out.println("\n" + myEllipsoidList + "\n");
   
      System.out.println(myEllipsoidList.summaryInfo()); 
   
   }

}