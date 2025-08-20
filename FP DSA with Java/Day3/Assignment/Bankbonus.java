package Assignment;

class Employee {

    public double Calculate_Bonus(int salary){
        return 0; 
    }
}

class Manager extends Employee {
    
    public double Calculate_Bonus(int salary){
        return (salary * 20) / 100.0;
    }
}

class Devoleper extends Employee {

    public double Calculate_Bonus(int salary){
        return (salary * 10) / 100.0;
    }
}

class Intern extends Employee {
    
    public double Calculate_Bonus(int salary){
        return (salary * 5) / 100.0;
    }
}

public class Bankbonus {
    public static void main(String[] args) {

        Employee emp = new Employee();
        System.out.println("Employee Bonus: "+emp.Calculate_Bonus(10));

        Devoleper dev = new Devoleper();
        System.out.println("Employee Bonus: "+dev.Calculate_Bonus(750000));

        Manager man = new Manager();
        System.out.println("Manager Bonus: "+man.Calculate_Bonus(150000));

        Intern in = new Intern();
        System.out.println("Manager Bonus: "+in.Calculate_Bonus(100000));
        
    }
}
