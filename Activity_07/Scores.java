/**
*
* Class that holds an array of numerical values
* and provide methods that allow users 
* to interact with the Scores class.
*
* Activity 07
*
* @author Will May
* @3/2/20
*
*/
public class Scores {
  /**
   * Holds a set of numerical values.
   *
   */

   //Instance Variables
   
   private int[] numbers;
   
   //Constructor
   
/**
* The constructor takes an Scores of numeric values.
*@param numbersIn for constructor.
*/
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   
   }
   
   //Methods
   
/**
* Method findEvens for Scores.
*@return evens.
*/
   public int[] findEvens() {
   
      int numberEvens = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
/**
* Method findOdds for Score.
*@return odds.
*/
   public int[] findOdds() {
   
      int numberOdds = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
  
/**
* Method calculateAverage for Scores.
*@return sum / numLength.
*/ 
   public double calculateAverage() {
   
      int sum = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      double numLength = numbers.length;
   
      return sum / numLength;
   }
  
/**
* Method toString for Scores.
*@return result.
*/ 
   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
   
      return result;
   }
 
/**
* Method toStringInReverse for Scores.
*@return result.
*/  
   public String toStringInReverse() {
   
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      
      }
   
      return result;
   }
   
   

  
  
  
}

