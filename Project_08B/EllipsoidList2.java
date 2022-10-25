import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
*
* Ellipsoid program that stores the name of the list
* and an ArrayList of Ellipsoid objects.  
*
* Project 08A
*
* @author Will May
* @3/19/20
*
*/
public class EllipsoidList2 {
/**
   * Includes methods that return the name of the list,
   * number of Ellipsoid objects, total volume, total surface area,
   * average volume, and average surface for all Ellipsoid objects.
   *
   * @param args Command line arguments - not used.
   */
   
   // instance variables
   private String name = "";
   private Ellipsoid[] ellipsoidlist;
   private int numberOfEllipsoid;

      
   // constructor
   
   /**
   * Constructor EllipsoidList for the EllipsoidList class.
   *@param nameIn for EllipsoidList constructor.
   *@param ellipsoidlistIn for EllipsoidList constructor.
   *@param numberOfEllipsoidIn for EllipsoidList constructor.
   */
   public EllipsoidList2(String nameIn, Ellipsoid[] ellipsoidlistIn, 
         int numberOfEllipsoidIn) {
   /**
      * Imports all of the variables.
      */
      name = nameIn;
      ellipsoidlist = ellipsoidlistIn;
      numberOfEllipsoid = numberOfEllipsoidIn;
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
   
      return numberOfEllipsoid;
   }
   
   /**
   * Method totalVolume for EllipsoidList class.
   *@return totalV.
   */
   public double totalVolume() {
      int i = 0;
      double totalV = 0;
      while (i < numberOfEllipsoid) {
         totalV += ellipsoidlist[i].volume();
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
      while (i < numberOfEllipsoid) {
         totalSA += ellipsoidlist[i].surfaceArea();
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
      while (i < numberOfEllipsoid) {
         averageV += ellipsoidlist[i].volume() / numberOfEllipsoid;
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
      while (i < numberOfEllipsoid) {
         averageSA += ellipsoidlist[i].surfaceArea() / numberOfEllipsoid;
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
      
      
      while (i < numberOfEllipsoid) {
         result += "\n" + ellipsoidlist[i].toString() + "\n";
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
      result += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
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
   
   
// ******NEW METHODS FOR PROJECT 6******



   /**
   * Method getList for EllispoidList class.
   *@return ellipsoidlist.
   */
   public Ellipsoid[] getList() {
   
      return ellipsoidlist;
   }
   
   /**
   * Method readFile for EllispoidList class.
   *@throws FileNotFoundException if the file cannot be opened.
   *@return eL.
   *@param fileName for readFile.
   */
   public EllipsoidList2 readFile(String fileName) throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileName));
      Ellipsoid[] eList = new Ellipsoid[100];
      String eListName = "";
      double aIn = 0, bIn = 0, cIn = 0;
      String labelIn = "";
      
      eListName = scanFile.nextLine(); 
           
      while (scanFile.hasNext()) {
         labelIn = scanFile.nextLine();
         aIn = Double.parseDouble(scanFile.nextLine());
         bIn = Double.parseDouble(scanFile.nextLine());
         cIn = Double.parseDouble(scanFile.nextLine());
         Ellipsoid ex1 = new Ellipsoid(labelIn, aIn, bIn, cIn);
         eList[numberOfEllipsoid] = ex1;
         numberOfEllipsoid++;
      
      }
      
      EllipsoidList2 eL = new EllipsoidList2(eListName, eList, 
           numberOfEllipsoid);
      
      return eL;
   
   }
   
   /**
   * Method addEllipsoid for EllispoidList class.
   *@param labelIn for addEllipsoid.
   *@param aIn for addEllipsoid.
   *@param bIn for addEllipsoid.
   *@param cIn for addEllipsoid.
   */
   public void addEllipsoid(String labelIn, 
      double aIn, double bIn, double cIn) {
   
      Ellipsoid e = new Ellipsoid(labelIn, aIn, bIn, cIn);
      ellipsoidlist[numberOfEllipsoid] = e;
      numberOfEllipsoid++;      
   }
   
   /**
   * Method findEllipsoid for EllispoidList class.
   *@return result.
   *@param labelIn for findEllipsoid.
   */
   public Ellipsoid findEllipsoid(String labelIn) {
      Ellipsoid result = null;
      int index = -1;
      for (int i = 0; i < numberOfEllipsoid; i++) {
         if (ellipsoidlist[i].getLabel().equalsIgnoreCase(labelIn)) {
            index = i;
            break;
         }
      }
      if (index >= 0) {
         result = ellipsoidlist[index];
      }
     
      return result;
   }
   
   /**
   * Method deleteEllipsoid for EllispoidList class.
   *@return result.
   *@param labelIn for deleteEllipsoid.
   */
   public Ellipsoid deleteEllipsoid(String labelIn) {
      Ellipsoid[] ellipCopy = new Ellipsoid[1];
      for (int i = 0; i < numberOfEllipsoid; i++) {
         if (ellipsoidlist[i].getLabel().equalsIgnoreCase(labelIn))
         {
            ellipCopy[0] = findEllipsoid(labelIn);
            for (int j = i; j < numberOfEllipsoid - 1; j++) {
               ellipsoidlist[j] = ellipsoidlist[j + 1];
            }
            ellipsoidlist[numberOfEllipsoid - 1] = null; 
            numberOfEllipsoid--;
         
         }
      }
      return ellipCopy[0];
   
   }
   
   
   
   /**
   * Method editEllipsoid for EllispoidList class.
   *@return edit.
   *@param labelIn for editEllipsoid.
   *@param aIn for editEllipsoid.
   *@param bIn for editEllipsoid.
   *@param cIn for editEllipsoid.

   */
   public Ellipsoid editEllipsoid(String labelIn, 
      double aIn, double bIn, double cIn) {
      Ellipsoid edit = null;
      for (int i = 0; i < numberOfEllipsoid; i++) {
      
         if (ellipsoidlist[i].getLabel().equalsIgnoreCase(labelIn)) {
            ellipsoidlist[i].setA(aIn);
            ellipsoidlist[i].setB(bIn);
            ellipsoidlist[i].setC(cIn);
            edit = ellipsoidlist[i];
         }
      
      
      }
      return edit;
   
   }
   
   
   //****** NEW METHODS FOR PROJECT 08B ******
   
   /**
   * Method for Ellipsoid that finds the 
   * Ellipsoid with the Smallest Volume.
   * @return elTest. 
   */
   public Ellipsoid findEllipsoidWithSmallestVolume() {
      if (numberOfEllipsoid > 0) {
         Ellipsoid smallVol = ellipsoidlist[1];
         for (int i = 0; i < numberOfEllipsoid; i++) {
            if (ellipsoidlist[i].volume() < smallVol.volume()) {
               smallVol = ellipsoidlist[i];
            }
         }
         return smallVol;
      } else {
         return null;
      }
   } 
  
  /**
   * Method for Ellipsoid that finds the 
   * Ellipsoid with the Largest Volume.
   * @return elTest. 
   */
   public Ellipsoid findEllipsoidWithLargestVolume() {
      if (numberOfEllipsoid > 0) { 
         Ellipsoid largeVol = ellipsoidlist[1];
         for (int i = 0; i < numberOfEllipsoid; i++) {
            if (ellipsoidlist[i].volume() > largeVol.volume()) {
               largeVol = ellipsoidlist[i];
            }
         }
         return largeVol;
      }  else {
         return null;
      }
   }
   
   
  
  /**
   * Method for Ellipsoid that finds the 
   * Ellipsoid with the Smallest Surface Area.
   * @return elTest. 
   */ 
   public Ellipsoid findEllipsoidWithSmallestSurfaceArea() {
      if (numberOfEllipsoid > 0) {
         Ellipsoid smallSA = ellipsoidlist[1];
         for (int i = 0; i < numberOfEllipsoid; i++) {
            if (ellipsoidlist[i].surfaceArea() < smallSA.surfaceArea()) {
               smallSA = ellipsoidlist[i];
            }
         }
         return smallSA;
      } else {
         return null;
      }
   } 
   
   /**
   * Method for Ellipsoid that finds the 
   * Ellipsoid with the Largest Surface Area.
   * @return elTest. 
   */
   public Ellipsoid findEllipsoidWithLargestSurfaceArea() {
      if (numberOfEllipsoid > 0) { 
         Ellipsoid largeSA = ellipsoidlist[1];
         for (int i = 0; i < numberOfEllipsoid; i++) {
            if (ellipsoidlist[i].surfaceArea() > largeSA.surfaceArea()) {
               largeSA = ellipsoidlist[i];
            }
         }
         return largeSA;
      }  else {
         return null;
      }
   } 
   
  
   
   
   











}


