package Assignment;


class Bank {

    public double Calculate_intrest(int balance){
        return 0; 
    }
}

class SBI extends Bank {
    
    public double Calculate_intrest(int balance){
        return (balance * 6) / 100.0;
    }
    
}

class ICICI extends Bank {

    public double Calculate_intrest(int balance){
        return (balance * 7) / 100.0;
    }
}

class HDFC extends Bank {
    
    public double Calculate_intrest(int balance){
        return (balance * 7.5) / 100.0;
    }
}

public class BankIntrest {
    public static void main(String[] args) {

        Bank bam = new Bank();
        System.out.println("Bank Intrest: "+bam.Calculate_intrest(10));

        ICICI ic = new ICICI();
        System.out.println("Icici Intrest: "+ic.Calculate_intrest(750000));

        SBI man = new SBI();
        System.out.println("SBIIntrest: "+man.Calculate_intrest(150000));

        HDFC in = new HDFC();
        System.out.println("HDFCIntrest: "+in.Calculate_intrest(100000));
        
    }
}
