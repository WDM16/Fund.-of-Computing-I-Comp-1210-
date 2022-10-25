import java.text.DecimalFormat;

/**
*
* Program that uses Customer.
*
* Activity 08B
*
* @author Will May
* @3/23/20
*
*/
public class Customer implements Comparable<Customer> {
/**
   * Computes the ellipsoid to find the data.
   *
   * @param args Command line arguments - not used.
   */

   //instance variables
   private String name = "";
   private String location = "";
   private double balance;
   
   //constructor
   /**
   *Constructor for Customer. 
   *@param nameIn as a String.
   */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   //methods
   /**
   *Method to set the location.
   *@param locationIn of type String. 
   */
   public void setLocation(String locationIn) { //sets location variable
      location = locationIn;
   }
   
   /**
   *Overload Method to set the location.
   *@param city of type String. 
   *@param state of type String.
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
   *Method to change the balance.
   *@param amount of type double. 
   */
   public void changeBalance(double amount) { //add amount to balance
      balance += amount;
   }
   
   /**
   *Method to get the location.
   *@return result.
   */
   public String getLocation() { //returns variable for location
      String result = location;
      return result;
   }
   
   /**
   *Method to get the balance.
   *@return result.
   */
   public double getBalance() { //returns variable for balance
      double result = balance;
      return result;
   }
   
   /**
   *Method toString.
   *@return the name and location.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("0.0");
      return name + "\n" + location + "\n" + "$" + df.format(balance);
   }
   
   /**
   *Method toCompareTo objects.
   *@param obj of Customer object. 
   *@return value is true/false to make loan is valid.
   */
   public int compareTo(Customer obj) {
      
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; //consider them equal and return 0
      }
      else if (this.balance < obj.getBalance()) {
         return -1; //should return a negative number
      }
      else {
         return 1; //should return a positive number
      }
   }
   
}