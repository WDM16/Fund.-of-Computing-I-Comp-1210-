/**
*
* Program that represents an inventory item in a store.
*
* Activity 10
*
* @author Will May
* @4/6/20
*
*/
public class ItemsList {
   /**
   * Class that holds an array of InventoryItem objects.
   *
   */
   
   //instance variables
   private InventoryItem[] inventory;
   private int count;
   
   //constructor
   /**
   * Contructor for ItemsList.
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   //methods 
   /**
   * Method addItem for ItemsList.
   * @param itemIn of type InventoryItem array.
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
   * Method calculateTotal for ItemsList.
   * @param electronicsSurcharge of type double.
   * @return double.
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   
   }
   
   /**
   * Method toString for ItemsList.
   * @return String.
   */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}