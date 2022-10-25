import java.util.ArrayList;

/**
*
* Program that holds a set of integer values representing
* daily temperatures.
*
* Activity 06
*
* @author Will May
* @2/16/20
*
*/
public class Temperatures {
/**
* Holds a set of integer values representing daily temperatures.
*
*/

//Instance Variables

   private ArrayList<Integer> temperatures;
   
   
//Constructor
/**
* The constructor takes an ArrayList of integer values.
*@param temperaturesIn for constructor.
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }


//Methods 
/**
* Method getLowTemp for Temperature.
*@return low.
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
         
      }
      return low;
   }
   
   
   
/**
* Method getHighTemp for Temperature.
*@return high.
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
   
      return high;
   }
   
/**
* Method lowerMinimum for Temperature.
*@param int.
*@param lowIn for lowerMinimum.
*@return lowIn.
*/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

/**
* Method higherMinimum for Temperature.
*@param int.
*@param highIn for higherMaximum.
*@return int.
*/
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   
   }
   
/**
* Method toString for Temperature.
*@return String.
*/
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   
   }

   





}
