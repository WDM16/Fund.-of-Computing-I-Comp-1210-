import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
*
* Ellipsoid program that stores the name of the list
* and an ArrayList of Ellipsoid objects.  
*
* Project 06
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
   
   
// ******NEW METHODS FOR PROJECT 6******



   /**
   * Method getList for EllispoidList class.
   *@return ellipsoidlist.
   */
   public ArrayList<Ellipsoid> getList() {
   
      return ellipsoidlist;
   }
   
   /**
   * Method readFile for EllispoidList class.
   *@throws FileNotFoundException if the file cannot be opened.
   *@return eL.
   *@param fileName for readFile.
   */
   public EllipsoidList readFile(String fileName) throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileName));
      ArrayList<Ellipsoid> eList = new ArrayList<Ellipsoid>();
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
         eList.add(ex1);           
      }
      
      EllipsoidList eL = new EllipsoidList(eListName, eList);
      
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
      ellipsoidlist.add(e);
   }
   
   /**
   * Method findEllipsoid for EllispoidList class.
   *@return result.
   *@param labelIn for findEllipsoid.
   */
   public Ellipsoid findEllipsoid(String labelIn) {
      Ellipsoid result = null;
      int index = -1;
      for (Ellipsoid elli : ellipsoidlist) {
         if (elli.getLabel().equalsIgnoreCase(labelIn)) {
            index = ellipsoidlist.indexOf(elli);
            break;
         }
      }
      if (index >= 0) {
         result = ellipsoidlist.get(index);
      }
     
      return result;
   }
   
   /**
   * Method deleteEllipsoid for EllispoidList class.
   *@return result.
   *@param labelIn for deleteEllipsoid.
   */
   public Ellipsoid deleteEllipsoid(String labelIn) {
      Ellipsoid result = null;
      int index = -1;
      for (Ellipsoid e : ellipsoidlist) {
         if (e.getLabel().equalsIgnoreCase(labelIn))
         {
            index = ellipsoidlist.indexOf(e);
            break;
         }
      }
      
      if (index >= 0) {
         result = ellipsoidlist.get(index);
         ellipsoidlist.remove(index);
         
      }
      return result;
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
      for (Ellipsoid obj : ellipsoidlist) {
      
         if (obj.getLabel().equalsIgnoreCase(labelIn)) {
            obj.setA(aIn);
            obj.setB(bIn);
            obj.setC(cIn);
            edit = obj;
         }
      
      
      }
      return edit;
   
   }
   
   
   











}


