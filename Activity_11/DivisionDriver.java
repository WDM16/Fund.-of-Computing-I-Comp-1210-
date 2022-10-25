import javax.swing.JOptionPane;
/**
 * @author WillMay
 * @04/13/2020
 */
public class DivisionDriver {
   /**
    * Main method.
    * @param args command line arguments
    */
   public static void main(String[] args) {
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "interger division: \n"
               + Division.intDivide(num, denom)
               + "\n\nFloating point division: \n"
               + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, "Result", 
            JOptionPane.PLAIN_MESSAGE);
      } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Invalid input: enter numerical "
            + "integer value only.", "Error", JOptionPane.PLAIN_MESSAGE);
      } catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, "Error", 
            JOptionPane.PLAIN_MESSAGE);
      }
   }
}