import java.util.ArrayList;
import java.util.ArrayList;
/**
*
* Ellipsoid program that stores the name of the list
* and an ArrayList of Ellipsoid objects.  
*
* Activity 05
*
* @author Will May
* @2/10/20
*
*/
public class EllipsoidList {
/**
   * Includes methods that return the name of the list,
   * number of Ellipsoid objects, total volume, total surface area,
   * average volume, and average surface for all Ellipsoid objects.
   *
   * @param args Command line arguments - not used.
   */
   
   // instance variables
   private String name = "";
   private ArrayList<Ellipsoid> ellipsoidlist = new ArrayList<Ellipsoid>();

      
   // constructor
   public EllipsoidList(String listIn, ArrayList<Ellipsoid>In) {
   /**
      * Imports all of the variables.
      */
      name = nameIn;
      ellipsoidList = ArrayList<Ellipsoid>In;
   }
      
   // methods
   public String getName() {
   
      return name;
   }
   
   public int numberOfEllipsoids() {
   
      return 0;
   }
   
   public double totalVolume() {
   
      return 0;
   }
   
   public double totalSurfaceArea() {
   
      return 0;
   }

   public double averageVolume() {
   
      return 0;
   }

   public double averageSurfaceArea() {
   
      return 0;
   }
   
   public String toString() {
   
      return "";
   }
   
   public String summaryInfo() {
   
      return "";
   }
   
   
   











}


