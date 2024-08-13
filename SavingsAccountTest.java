//SavingsAccount.java
public class SavingsAccount {
    
    private static double annualInterestRate;
    private double savingsBalance;

    
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}

//SavingsAccountTest.java
public class SavingsAccountTest {
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate the monthly interest and print new balances for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("annual interest rate to 4%");
        System.out.printf("Saver 1 Balance: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 Balance: Rs %.2f%n%n", saver2.getSavingsBalance());

        // Set the annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate the monthly interest and print new balances for both savers
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("annual interest rate to 5%");
        System.out.printf("Saver 1 Balance: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 Balance: Rs %.2f%n", saver2.getSavingsBalance());
    }
}
