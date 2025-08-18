class Bank {
     private double balance;
     static int count=0;
     String name;
     int id=1999001000;

    // constructor 
    Bank(double initialBalance, String name) {
        this.balance = initialBalance;
        this.name = name;
        id=id+count;
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

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
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
        System.out.println("Account holder Name:"+name+" Account id:" +id+ " Current Balance: "+ balance);
    }
    public static void main(String[] args) {
        
        Gap.bar();
        Gap.bar();

        Bank account1 = new Bank(1000,"Nandeesh"); 
        Bank account2 = new Bank(1000,"Neha"); 
        Bank account3 = new Bank(1000,"Prajwal");

        account1.displayBalance();
        account1.deposit(500);
        account1.withdraw(200);
       
        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();
        account3.setBalance(10);

        System.out.println("Number of Account Holders :=  "+count); 

        Gap.bar();
        Gap.bar();

    }
}
