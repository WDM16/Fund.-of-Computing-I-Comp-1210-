/**
*
* Program that represents an electronics item in a store.
*
* Activity 09
*
* @author Will May
* @3/30/20
*
*/
public class ElectronicsItem extends InventoryItem {
/**
* Child Class that uses the parent class methods.
*/
   
//variable
   protected double weight;
/**
* Constant of Shipping cost.
*/
   public static final double SHIPPING_COST = 1.5;    

//constructor
/**
* Constructor for ElectronicsItem.
* @param nameIn for String.
* @param priceIn for double.
* @param weightIn for double.
*/
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
//methods
/**
* Method calculateCost of type double.
* @return cost and shipping cost/weight.
*/
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }   




}