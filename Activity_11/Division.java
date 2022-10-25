/**
 * @author WillMay
 * @04/20/2020
 */
public class Division {
   /**
    * Method intDivide for Division.
    * @param numerator of type int
    * @param denominator of type int
    * @return -
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      } catch (ArithmeticException e) {
         return 0;
      }
   }

   /**
    * Method decimalDivide for Division.
    * @param numerator of type int
    * @param denominator of type int
    * @return float value of division.
    */
   public static float decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The demoninator "
            + "cannot be zero");
      }
      return (float) numerator / denominator;
   }
}