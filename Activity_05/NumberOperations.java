/**
*
* Numbers Operations program that provides methods to perform
* various operations on that value.
*
* Activity 05
*
* @author Will May
* @2/10/20
*
*/
public class NumberOperations {
   private int number;
   
   
   //Constructor
   
     
   /**
   * Constructor NumberOperations for class.
   * @param numberIn for NumberOperations.
   */
   public NumberOperations(int numberIn) {
      number = numberIn;
   
   }
   
   
   //Instance variables
   
 /**
* method getValue for int in the NumberOperations class.
* @return number. 
*/  
   public int getValue() {
      
      return number; //placeholder return
   }
   
/**
* method oddsUnder for String in the NumberOperations class.
* @return output. 
*/   
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      
      }
      
      return output; //placeholder return
   }
   
/**
* method powersTwoUnder for String in the NumberOperations class.
* @return output. 
*/
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2
      
      }
   
      return output; //placeholder return
   }
  
/**
* method isGreater for int in the NumberOperations class.
* @return 0.
* @param compareNumber for isGreater. 
*/ 
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   
   
   }
       
   
/**
* method toString for String in the NumberOperations class.
* @return number + "". 
*/
   public String toString() {
   
      return number + ""; //placeholder return
   } 

}
