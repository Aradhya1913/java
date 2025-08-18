class Bank {
     double balance;
     static int count=0;

     // constructor 
    Bank(double initialBalance) {
        this.balance = initialBalance;
        count++;
    }
    
     // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        
        Bank account1 = new Bank(1000); 
        Bank account2 = new Bank(1000); 
        Bank account3 = new Bank(1000);

        
        account1.displayBalance();
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayBalance();

        
        System.out.println(count); 






    }
}