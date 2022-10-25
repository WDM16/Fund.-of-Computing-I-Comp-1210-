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
public class DedicatedCloud extends CloudStorage {
/**
* Child class that uses CloudStorage as a parent class.
*/

//field
   private double cost; 

//constructor
/**
* Constructor for DedicatedCloud.
* @param nameIn of type String.
* @param baseStorageCostIn of type double.
* @param costIn of type double.
*/
   public DedicatedCloud(String nameIn, double baseStorageCostIn,
      double costIn) {
      super(nameIn, baseStorageCostIn);
      cost = costIn;
   }

//methods 
/**
* Method getServerCost for DedicatedCloud.
* @return cost of type double.
*/
   public double getServerCost() {
      return cost;
   }
   
/**
* Method setServerCost for DedicatedCloud.
* @param costIn of type double.
*/
   public void setServerCost(double costIn) {
      cost = costIn;
   }
   
/**
* Method monthlyCost for DedicatedCloud.
* @return result of type double.
*/
   public double monthlyCost() {
      return baseStorageCost + cost;
   }
   
/**
* Method toString for DedicatedCloud.
* @return name of type String.
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat("###.00#");
      return super.toString() + " Monthly Cost: $" + df.format(monthlyCost()) 
         + "\nBase Storage Cost: $" + df.format(baseStorageCost)
         + "\nServer Cost: $" + df.format(cost) + "\n"; 
   }








}