class Calculation {
    int a = 20;
    int b = 10;

    public void add() {
        System.out.println("This is a method in the parent class");
    }

    public void sub() {
        System.out.println("This is another method in the parent class");
    }
}

class Mycalculation extends Calculation {
    String name;
    double d;

    public void div() {
        System.out.println("This is a child class");
        System.out.println("Value of a: " + a);
    }

    public void mul() {
        System.out.println("This is a child class");
        System.out.println("Value of b: " + b);
    }
}

public class Inherit {
    public static void main(String[] args) {
        Mycalculation myc = new Mycalculation();
        Calculation c = new Calculation();
        
        myc.div();
        myc.mul();
       
        myc.a = 10;
        System.out.println("Updated value of a: " + myc.a);
        myc.b = 20;
        System.out.println("Updated value of b: " + myc.b);

     
    }
}
