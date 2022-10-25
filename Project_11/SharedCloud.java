import java.text.DecimalFormat;
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
public class SharedCloud extends CloudStorage {
/**
* Child class that uses CloudStorage as a parent class.
*/

//fields
   protected double stored;
   protected double limit;
/**
* Constant of Cost factor.
*/
   public static final double COST_FACTOR = 1.0;

//constructor
/**
* Constructor for SharedCloud.
* @param nameIn of type String.
* @param baseStorageCostIn of type double.
* @param limitIn of type double.
* @param storedIn of type double. 
*/
   public SharedCloud(String nameIn, double baseStorageCostIn, 
         double storedIn, double limitIn) {
      super(nameIn, baseStorageCostIn);
      limit = limitIn;
      stored = storedIn;   
   }

//methods
   /**
   * Method getDataStored for SharedCloud.
   * @return stored.
   */
   public double getDataStored() {
      return stored;
   }

   /**
   * Method setDataStore for SharedCloud.
   * @param storedIn of type double.
   */
   public void setDataStored(double storedIn) {
      stored = storedIn;
   }
   
   /**
   * Method getDataLimit for SharedCloud.
   * @return limit.
   */
   public double getDataLimit() {
      return limit;
   }
  
   /**
   * Method setDataLimit for SharedCloud.
   * @param limitIn of type double.
   */
   public void setDataLimit(double limitIn) {
      limit = limitIn;
   }

   /**
   * Method getCostFactor for SharedCloud.
   * @return costFactor of type constant.
   */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
   * Method dataOverage for SharedCloud.
   * @return result.
   */
   public double dataOverage() {
      double result = stored - limit;
      if (result < 0) {
         return 0;
      }
      else {
         return result;
      }   
   
   }
   
   /**
   * Method monthlyCost for SharedCloud.
   * @return mCost.
   */
   public double monthlyCost() {
      return ((baseStorageCost + dataOverage()) * SharedCloud.COST_FACTOR);
   }

   /**
   * Method toString for SharedCloud.
   * @return string.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("###.00#");
      DecimalFormat ef = new DecimalFormat("##0.000#");
      DecimalFormat ff = new DecimalFormat("##.0#");
      return super.toString() + " Monthly Cost: $" + df.format(monthlyCost()) 
         + "\nBase Storage Cost: $" + df.format(baseStorageCost)
         + "\nData Stored: " + ef.format(stored) + " GB"
         + "\nData Limit: " + ef.format(limit) + " GB"
         + "\nOverage: " + ef.format(dataOverage()) + " GB"
         + "\nCost Factor: " + ff.format(getCostFactor()) + "\n";
   }






}