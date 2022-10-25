/**
*
* Program that represents an OnlineBook item in a store.
*
* Activity 09
*
* @author Will May
* @3/30/20
*
*/
public class OnlineBook extends OnlineTextItem {
/**
*  Uses the OnlineTextItem class as a parent class.
*/

//variables
   protected String author;
   
//constructor
/**
* Constructor for OnlineBook.
* @param nameIn of type String.
* @param priceIn of type double.
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }  

//methods
/**
* Method toString of type String.
* @return name in format.
*/
   public String toString() {
      return name + " - " + author 
         + ": $" + price;
   }
/**
* Method setAuthor of type void.
* @param authorIn of type String.
*/   
   public void setAuthor(String authorIn) {
      author = authorIn;
   }



}