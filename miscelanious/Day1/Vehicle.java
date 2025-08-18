import java.util.Scanner;

class Car {
    
    int wheels=4;
    int doors=4;
    String color="White";
    String brand="suzuki";
    float speed = 145.6f;

    
    
    private int current_gear = 0; // remember last gear



    public String PlayMusic() {
        return "Playing La La Land Music";
    }

    public void Gearshift(int g) {
        // Invalid gear check
        if (g > 6 || g < -1) {
            System.out.println("Enter a valid gear from -1 to 6");
            return;
        }

        // Gear shifting logic
        if (g > current_gear) {
            System.out.print("Upshifting");
        } else if (g < current_gear) {
            if (g == -1) {
                System.out.print("Shifting to reverse");
            } else {
                System.out.print("Downshifting");
            }
        } else {
            System.out.print("Already in the same gear");
        }

        current_gear = g; // update gear

        // Gear label output
        switch (g) {
            case -1:
                System.out.println(" (Reverse Gear)");
                break;
            case 0:
                System.out.println(" (Neutral)");
                break;
            case 1:
                System.out.println(" to gear one");
                break;
            case 2:
                System.out.println(" to gear two");
                break;
            case 3:
                System.out.println(" to gear three");
                break;
            case 4:
                System.out.println(" to gear four");
                break;
            case 5:
                System.out.println(" to gear five");
                break;
            case 6:
                System.out.println(" to gear six");
                break;
        }
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();

        while (true) {
            System.out.print("Enter gear (-1 to 6) or type 999 to stop: ");
            int gear = sc.nextInt();

            if (gear == 999) { // exit condition
                break;
            }

            c.Gearshift(gear);
        }

        System.out.println(c.PlayMusic());
        System.out.println(c.brand);
        System.out.println(c.color);
        System.out.println("No of wheels="+c.wheels);
        System.out.println("Top Speed="+c.speed);

        

        sc.close();
    }
}
