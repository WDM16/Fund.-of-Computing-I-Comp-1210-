import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**Class for testing the BankLoan class. 
*/
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A test that always fails.
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */


   /** A test that always fails. **/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", 0.10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
   
    /**Tests the borrowFromBank Method. */
   @Test public void borrowFromBankTest() {
      BankLoan loan1 = new BankLoan("Jane", 0.09);
      loan1.borrowFromBank(1000.00);
      Assert.assertEquals(" ", 1000, loan1.getBalance(), .00001);
   }
   
   /**Tests literally every other method in class. */
   @Test public void payBankTest() { 
      BankLoan loan1 = new BankLoan("Jane", 0.10);
      loan1.borrowFromBank(100);
      loan1.payBank(50);
      loan1.getBalance();
      loan1.setInterestRate(0.08);
      loan1.getInterestRate();
      loan1.isAmountValid(50);
      loan1.isInDebt(loan1);
      BankLoan.resetLoansCreated();
      BankLoan.getLoansCreated();
      Assert.assertEquals(" ", 50, loan1.getBalance(), 0.0001);
      
   }
}
