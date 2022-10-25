/**
*
* Program that uses the User's Information.
*
* Activity 04
*
* @author Will May
* @2/3/20
*
*/
public class UserInfo {
/**
   * Uses the users information....
   *
   * @param args Command line arguments - not used.
   */


   // instance variables
   private String firstName;
      /**
      * String for the user's first name.
      */
   private String lastName;
    /**
      * String for the user's last name.
      */
   private String location;
    /**
      * String for the user's location.
      */
   private int age;
    /**
      * Int for the user's age.
      */
   private int status;
    /**
      * Indicates whether the user is online or offline.
      */
   private static final int OFFLINE = 0, ONLINE = 1;
    /**
      * Represents the two possible statuses of the user.
      */

   
   // constructor
   
 /**
 *@param firstNameIn for UserInfo
 *@param lastNameIn for UserInfo
 */         
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   //methods
   
   /**
   * String that prints out information.
   *@return String
   */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
       //@return output for String.
   }
   /**
   * Method that sets the location.
   *@param locationIn for setLocation.
   */
   public void setLocation(String locationIn) {
    /** 
    * Sets the location.
    */
      location = locationIn;
   }
   /**
   * Method that sets the age.
   *@return setAge.
   *@param ageIn for boolean.
   */
   public boolean setAge(int ageIn) {
   /**
   * Sets the age.
   */
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
      //@return isSet for setAge.
   }
   /**
   * Gets the age.
   *@return getAge.
   */
   public int getAge() {
   /**
   * Gets the age.
   */
      return age;
      //@return age for getAge.
   }
   /**
   * String that gets the location.
   *@return getLocation for String.
   */
   public String getLocation() {
   /**
   * Gets the location.
   */
      return location;
      //@return location for location.
   }
   
   /**
   * Method that logs the user off.
   */
   public void logOff() {
    /**
    * Allows user to logoff. 
    */
      status = OFFLINE;
   }
   /** 
   *Method that logs the user on.
   */
   public void logOn() {
    /** 
    * Allows user to logon.
    */
      status = ONLINE;
   }


}
