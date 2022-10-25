/**
*
* Program that involves the monthly cost
* and reporting for cloud storage.
*
* Project 10
*
* @author Will May
* @4/8/20
*
*/
public abstract class CloudStorage implements Comparable<CloudStorage> {
/**
* Abstract parent class that describes cloud storage data
* and provides methods to access the data.
*/

//fields
   protected String name;
   protected double baseStorageCost;
   protected static int count = 0;
   
//constructor
/**
* Constructor for CloudStorage.
* @param nameIn of type String.
* @param baseStorageCostIn of type double.
*/
   public CloudStorage(String nameIn, double baseStorageCostIn) {
      name = nameIn;
      baseStorageCost = baseStorageCostIn;
      
      count++;
   }

//methods
/**
* Method getName for CloudStorage.
* @return name of type String.
*/
   public String getName() {
      return name;
   }
   
/**
* Method setName for CloudStorage.
* @param nameIn of type String.
*/
   public void setName(String nameIn) {
      name = nameIn;
   }
   
/**
* Method getBaseStorageCost for CloudStorage.
* @return baseStorageCost.
*/
   public double getBaseStorageCost() {
      return baseStorageCost;
   }
   
/**
* Method setBaseStorageCost for CloudStorage.
* @param baseStorageCostIn of type double.
*/
   public void setBaseStorageCost(double baseStorageCostIn) {
      baseStorageCost = baseStorageCostIn;
   }
   
/**
* Method getCount for CloudStorage.
* @return count.
*/
   public static int getCount() {
      return count;
   }
   
/**
* Method resetCount for CloudStorage.
*
*/
   public static void resetCount() {
      count = 0; 
   }

/**
* Method toString for CloudStorage.
* @return result;
*/
   public String toString() {
      return name + " (" + this.getClass() + ")";
   
   }
   
/**
* Method monthlyCost for CloudStorage.
* @return -
*/
   public abstract double monthlyCost(); 
     

/**
* Method compareTo for CloudStorage.
* @param obj of type CloudStorage
* @return result.
*/
   public int compareTo(CloudStorage obj) {
      return name.toLowerCase() 
               .compareTo(obj.getName().toLowerCase());
   
   }






   
}