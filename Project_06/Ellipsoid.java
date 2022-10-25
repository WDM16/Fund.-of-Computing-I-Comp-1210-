import java.text.DecimalFormat;


/**
*
* Program that finds the surface area and volume of an Ellipsoid.
*
* Project 06
*
* @author Will May
* @2/10/20
*
*/
public class Ellipsoid {
/**
   * Computes the ellipsoid to find the data.
   *
   * @param args Command line arguments - not used.
   */

//instance variables
   private double a = 0;
   private double b = 0;
   private double c = 0;
   private String label = "";
   

    
   //constructors
   
   /**
   * Constructor Ellipsoid for the Ellipsoid class.
   * @param labelIn for String.
   * @param aIn for double.
   * @param bIn for double.
   * @param cIn for double.
   */
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) {
      /**
      * Imports all of the variables.
      */
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   
   }
   

//methods

/**
* method getLabel for String in the Ellipsoid class.
* @return label. 
*/
   public String getLabel() {
      return label;
   }

/**
* method setLabel for boolean in the Ellipsoid class.
* @param labelIn for setLabel.
* @return isSet.
*/
   public boolean setLabel(String labelIn) {
      /**
      * isSet is boolean for setLabel.
      */
      boolean isSet = true;
      if (labelIn != null) {
         label = labelIn.trim();
         return isSet;
      }
      else {
      
         return false; 
      }
   
   }
   
/**
* method getA for double in the Ellipsoid class.
* @return a for getA.
*/
   public double getA() {
   
      return a;
   //@return double representing field a.
   }
   
/**
* method setA for boolean in the Ellipsoid class.
* @param aIn for setA.
* @return isSet.
*/   
   public boolean setA(double aIn) {
      boolean isSet = true;
      if (aIn > 0) {
         a = aIn;
         return isSet;
      }
      else {
         return false;
      }
      
      
   }
   
/**
* method getB for double in the Ellipsoid class.
* @return b.
*/
   public double getB() {
   
      return b;
   }
   
/**
* method setB for boolean in the Ellipsoid class.
* @param bIn for setB.
* @return isSet.
*/
   public boolean setB(double bIn) {
      boolean isSet = true;
      if (bIn > 0) {
         b = bIn;
         return isSet;
      }
      else {
         return false;
      }
   }
   
/**
* method getC for double in the Ellipsoid class.
* @return c.
*/
   public double getC() {
   
      return c;
   }
   
/**
* method setC for boolean in the Ellipsoid class.
* @param cIn for setC.
* @return isSet.
*/   
   public boolean setC(double cIn) {
      boolean isSet = true;
      if (cIn > 0) {
         c = cIn;
         return isSet;
      }
      else {
         return false;
      }
   
   }

/**
* method volume for double in the Ellipsoid class.
* @return volume.
*/
   public double volume() {
      double volume = (4 * Math.PI * a * b * c) / 3;
      return volume;
   }

/**
* method surfaceArea for double in the Ellipsoid class.
* @return surfaceArea.
*/
   public double surfaceArea() {
      double surfaceArea = 4 * Math.PI * (Math.pow((Math.pow(a * b, 1.6) 
                + Math.pow(a * c, 1.6) + Math.pow(b * c, 1.6)) / 3, 1 / 1.6));
      return surfaceArea;
   }

/**
* method toString for String in the Ellipsoid class.
* @return output.
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      
   
      String myObj = "Ellipsoid \""  + label + "\" with axes a = " + a 
         + ", b = " + b + ", c = " + c + " units has: " 
         + "\n\tvolume = " + (df.format(volume())) + " cubic units"
         + "\n\tsurface area = " + (df.format(surfaceArea())) 
            + " square units";
         
     
      return myObj;
   }




}
