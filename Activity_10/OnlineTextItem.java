/**
*
* Program that represents an OnlineText item in a store.
*
* Activity 09
*
* @author Will May
* @3/30/20
*
*/
public abstract class OnlineTextItem extends InventoryItem {
/**
* Child Class that uses the parent class methods.
*/

//constructor
/**
* Constructor for OnlineTextItem.
* @param nameIn of type String.
* @param priceIn of type double.
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

//methods
/**
* Method calculateCost of type double.
* @return price.
*/
   public double calculateCost() {
      return price;
   }



}
