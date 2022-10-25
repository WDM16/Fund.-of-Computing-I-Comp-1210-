/**
*
* Program that involves the monthly cost
* and reporting for cloud storage.
*
* Project 09
*
* @author Will May
* @4/1/20
*
*/
public class PublicCloud extends SharedCloud {
   /**
   * Child class that uses SharedCloud as a parent class.
   */
   
   //field
   /**
   * Constant of Cost Factor.
   */
   public static final double COST_FACTOR = 2.0;
   
   //constructor
   /**
   * Constructor of PublicCloud.
   * @param nameIn of type String.
   * @param baseStorageCostIn of type double.
   * @param storedIn of type double.
   * @param limitIn of type double.
   */
   public PublicCloud(String nameIn, double baseStorageCostIn,
         double storedIn, double limitIn) {
      super(nameIn, baseStorageCostIn, storedIn, limitIn);     
   }
   
   //methods
   /**
   * Method getCostFactor for PublicCloud.
   * @return costfactor.
   */
   public double getCostFactor() {
      return COST_FACTOR;
   }

   /**
   * Method monthlyCost for PublicCloud.
   * @return mCost.
   */
   public double monthlyCost() {
      return (baseStorageCost + dataOverage() * PublicCloud.COST_FACTOR);
      
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}