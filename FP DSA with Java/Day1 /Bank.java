class Intrest  {
    public double Calculate_intrest(int loan){
        return 0; 
    }
}

class SBI extends Intrest {
    public double Calculate_intrest(int loan){
        return (loan * 6) / 100.0;
    }
}

class ICICI extends Intrest {
    public double Calculate_intrest(int loan){
        return (loan * 7) / 100.0;
    }
}

class HDFC extends Intrest {
    public double Calculate_intrest(int loan){
        return (loan * 7.5) / 100.0;
    }
}


class Bank {
    private double balance;
    private double loanAmount = 0;
    private Intrest loanProvider;   // SBI / ICICI / HDFC
    String name;
    static int count = 0;
    int id = 1999001000;

    // constructor 
    Bank(double initialBalance, String name) {
        this.balance = initialBalance;
        this.name = name;
        id = id + count;
        count++;
    }
    
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(name + " Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(name + " Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Apply for a loan
    public void applyLoan(double amount, Intrest provider) {
        this.loanAmount = amount;
        this.loanProvider = provider;
        System.out.println(name + " has taken a loan of " + amount);
    }

    // Calculate Loan Interest
    public void calculateLoanInterest() {
        if (loanProvider != null && loanAmount > 0) {
            double interest = loanProvider.Calculate_intrest((int)loanAmount);
            System.out.println(name + "'s Loan Interest: " + interest);
        } else {
            System.out.println(name + " has no loan.");
        }
    }

    // Repay Loan
    public void repayLoan(double amount) {
        if (loanAmount <= 0) {
            System.out.println(name + " has no loan to repay.");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            loanAmount -= amount;
            if (loanAmount < 0) loanAmount = 0;
            System.out.println(name + " repaid " + amount + 
                               ", Remaining Loan: " + loanAmount);
        } else {
            System.out.println("Not enough balance to repay loan!");
        }
    }

    // Display Balance
    public void displayBalance() {
        System.out.println("Account holder: " + name + 
                           " || Account id: " + id + 
                           " || Balance: " + balance + 
                           " || Loan: " + loanAmount);
    }

    // MAIN
    public static void main(String[] args) {
        Bank account1 = new Bank(5000,"Nandeesh"); 
        Bank account2 = new Bank(3000,"Neha"); 
        Bank account3 = new Bank(7000,"Prajwal");

        account1.displayBalance();
        account1.deposit(2000);
        account1.withdraw(1500);

        // Apply loans
        account1.applyLoan(100000, new SBI());
        account2.applyLoan(50000, new ICICI());
        account3.applyLoan(200000, new HDFC());

        // Show loan interest
        account1.calculateLoanInterest();
        account2.calculateLoanInterest();
        account3.calculateLoanInterest();

        // Repay some loan
        account1.repayLoan(20000);
        account2.repayLoan(10000);

        // Final balances
        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();

        System.out.println("Number of Account Holders: " + count); 
    }
}