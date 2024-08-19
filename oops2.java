// 2. Encapsulation
// - Encapsulation is the process of bundling data (variables) and methods 
// that operate on the data into a single unit (class) and restricting 
// access to some of the object's components.

// Example:

class Account {
    // Private variables: cannot be accessed directly from outside the class
    private String accountNumber;
    private double balance;

    // Public methods to provide access to the private data
    public void setAccountNumber(String accNumber) {
        this.accountNumber = accNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class oops2 {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setAccountNumber("12345");
        myAccount.deposit(1000.50);
        System.out.println("Account Number: " + myAccount.getAccountNumber()); // Output: Account Number: 12345
        System.out.println("Balance: " + myAccount.getBalance()); // Output: Balance: 1000.5
    }
}
