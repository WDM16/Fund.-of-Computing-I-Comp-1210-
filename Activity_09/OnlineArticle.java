/**
*
* Program that represents an OnlineArticle item in a store.
*
* Activity 09
*
* @author Will May
* @3/30/20
*
*/
public class OnlineArticle extends OnlineTextItem {
/**
*  Uses the OnlineTextItem as a parent class.
*/

//variables
   private int wordCount;

//constructor
/**
* Constructor for OnlineArticle.
* @param nameIn of type String.
* @param priceIn of type double.
*/
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
//methods
/**
* Method setWordCount of type void.
* @param wordCountIn of type int.
*/
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }




}