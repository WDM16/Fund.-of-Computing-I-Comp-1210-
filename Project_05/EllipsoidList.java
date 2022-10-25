import java.util.ArrayList;
import java.text.DecimalFormat;

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
   private ArrayList<Ellipsoid> ellipsoidlist;

      
   // constructor
   
   /**
   * Constructor EllipsoidList for the EllipsoidList class.
   *@param nameIn for EllipsoidList constructor.
   *@param ellipsoidlistIn for EllipsoidList constructor.
   */
   public EllipsoidList(String nameIn, ArrayList<Ellipsoid> ellipsoidlistIn) {
   /**
      * Imports all of the variables.
      */
      name = nameIn;
      ellipsoidlist = ellipsoidlistIn;
   }
      
   // methods
   
   /**
   * Method getName for EllipsoidList class.
   * name of the list.
   *@return name.
   */
   public String getName() {
   
      return name;
   }
   
   /**
   * Method numberOfEllipsoids for EllipsoidList class.
   *@return ellipsoidlist.size
   */
   public int numberOfEllipsoids() {
   
      return ellipsoidlist.size();
   }
   
   /**
   * Method totalVolume for EllipsoidList class.
   *@return totalV.
   */
   public double totalVolume() {
      int i = 0;
      double totalV = 0;
      while (i < ellipsoidlist.size()) {
         totalV += ellipsoidlist.get(i).volume();
         i++;
      }
   
      return totalV;
   }
   
   /**
   * Method totalSurfaceArea for EllipsoidList class.
   *@return totalSA.
   */
   public double totalSurfaceArea() {
      int i = 0;
      double totalSA = 0;
      while (i < ellipsoidlist.size()) {
         totalSA += ellipsoidlist.get(i).surfaceArea();
         i++;
      }
   
      return totalSA;
   }
   
   /**
   * Method averageVolume for EllipsoidList class.
   * @return averageV.
   */
   public double averageVolume() {
      int i = 0;
      double averageV = 0;
      while (i < ellipsoidlist.size()) {
         averageV += ellipsoidlist.get(i).volume() / ellipsoidlist.size();
         i++;
        
      }
   
      return averageV;
   }
   
   /**
   * Method averageSurfaceArea for EllipsoidList class.
   * @return averageSA.
   */
   public double averageSurfaceArea() {
      int i = 0;
      double averageSA = 0;
      while (i < ellipsoidlist.size()) {
         averageSA += ellipsoidlist.get(i).surfaceArea() / ellipsoidlist.size();
         i++;
      
      }
   
      return averageSA;
   }
   
   /**
   * Method toString for EllipsoidList class.
   *@return result.
   */
   public String toString() {
      int i = 0;
      String result = name + "\n";
      
      
      while (i < ellipsoidlist.size()) {
         result += "\n" + ellipsoidlist.get(i).toString() + "\n";
         i++;
      }
   
      
      
   
      return result;
   }
   
   /**
   * Method summaryInfo for EllipsoidList class.
   *@return result.
   */
   public String summaryInfo() {
      DecimalFormat cf = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + name + " -----";
      result += "\nNumber of Ellipsoid Objects: " + ellipsoidlist.size();
      result += "\nTotal Volume: " 
         + (cf.format(totalVolume())) + " cubic units";
      result += "\nTotal Surface Area: " 
         + (cf.format(totalSurfaceArea())) + " square units";
      result += "\nAverage Volume: " 
         + (cf.format(averageVolume())) + " cubic units";
      result += "\nAverage Surface Area: " 
         + (cf.format(averageSurfaceArea())) + " square units";
   
      return result;
   }
   
   
   











}


