/**
*
* Program that involves the monthly cost
* and reporting for cloud storage.
*
* Project 11
*
* @author Will May
* @4/17/20
*
*/
public class InvalidCategoryException extends Exception {
   /**
    *@param categoryIn -
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }


}