/**
*
* Program that represents an inventory item in a store.
*
* Activity 09
*
* @author Will May
* @3/30/20
*
*/
public class InventoryItem {
/**
* Parent Class that has all of the super methods.
*/

//variables
   protected String name;
   protected double price;
   private static double taxRate = 0;

//constructor
/**
* Constructor for InventoryItem.
* @param nameIn for String.
* @param priceIn for double.
*/
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
//methods
/**
* Method getName of type String.
* @return name.
*/
   public String getName() {
      return name;
   }

/**
* Method calculateCost of type double.
* @return price and taxrate.
*/   
   public double calculateCost() {
      return price * (1 + taxRate); 
   }

/**
* Method setTaxRate of type void.
* @param taxRateIn for double.
*/   
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
 
/**
* Method toString of type String.
* @return name and cost.
*/   
   public String toString() {
      return name + ": $" + calculateCost();
   }





}