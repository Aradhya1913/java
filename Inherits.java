class Vehicle {
    String brand;
    int speed;

    public void displayInfo() {
        System.out.println("This is a Parent class");
        System.out.println(brand);
        System.out.println(speed);
    }
}

class Car extends Vehicle {
    int numdoors;

    public void displayDetails() {
        System.out.println("This is a Child class");
        System.out.println(numdoors);
    }
}

public class Inherits {
    public static void main(String[] args) {
      
        Car c = new Car();
        c.brand = "Ferrari";
        c.speed = 250;
        c.numdoors = 4;

        c.displayInfo();
        c.displayDetails();
    }
}
