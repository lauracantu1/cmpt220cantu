public class AccountExercise {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000); //Account Id of 1122 and a balance of $20,000
        
        
        account.setAnnualInterestRate(4.5); //Annual interest rate of 4.5%
        account.withdraw(2500.0); //Withdraw method to withdraw $2,500
        account.deposit(3000.0); //Deposit method to deposit $3,000
        
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date created: " + account.getDateCreated());

    }
}
