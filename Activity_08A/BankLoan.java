/** 
*Program that uses static and instance variables.
*Activity 08A
*@author Will May
*@10/22/18
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   
      
   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

/**
*Constructor to create a bank loan. 
   *@param customerNameIn reassigns to customer's name.
   *@param interestRateIn defines interest rate for customer.
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

/**
*Method to borrow from the bank.
*@param amount of type double. 
   *@return value is true/false to make loan is valid.
   */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
*Method to make payment towards declining loan balance.
   *@param amountPaid for double.
   *@return returns the new debt balance.
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
/**
*Method to get current balance of a loan.
   *@return balance for double.
   */
   public double getBalance() {
      return balance;
   }
/**
*Method to change the interest rate declared when
   *the loan was made. 
   *@param interestRateIn for double.
   *@return true/false.
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
/**
*Method to get the current interest rate.
   *@return interestRate.
   */
   public double getInterestRate() {
      return interestRate;
   }
/**
*Method to charge interest on the loan.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }

/**
*Method shows all of the loans information as string.
   *@return output.
   */ 
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

/**
*Method for finding if the amount in parameters is valid.
   *@param amount for double.
   *@return amount.
   */ 
   public static boolean isAmountValid(double amount) {
   
      return amount >= 0;
   }

/**
*Method for finding if the customer is in debt.
   *@param loan for BankLoan.
   *@return true/false.
   */ 
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }

/**
*Method for getting the amount of loans created.
   *@return returns this value as an integer.
   */
   public static int getLoansCreated() {
      return loansCreated;
   }

/**
*Method that sets the loans created to 0.
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
   


}
