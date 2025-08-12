import java.util.Scanner;

class Cars {
        private int current_gear = 0; 

    
    String brand;
    String color;
    boolean offroading ;


    public void setDetails(String brand, String color, boolean offroading) {
        this.brand = brand;
        this.color = color;
        this.offroading = offroading;
    }

    public String CarsDetail() {
        return "Brand: " + brand + ", Color: " + color + ", Offroading: " + (offroading ? "Yes" : "No");
    }

    public String PlayMusic() {
        return "Playing La La Land Music";
    }

    public void Gearshift(int g) {

        if (g > 6 || g < -1) {
            System.out.println("Enter a valid gear from -1 to 6");
            return;
        }

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

        current_gear = g; 
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

public class Vehicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cars c = new Cars();

        // Gear input loop
        while (true) {
            System.out.print("Enter gear (-1 to 6) or type 999 to stop: ");
            int gear = sc.nextInt();
            if (gear == 999) break;
            c.Gearshift(gear);
        }
        System.out.println(c.PlayMusic());

        // Create and set details for Carss
        Cars thar = new Cars();
        thar.setDetails("Mahindra", "Black", true);

        Cars creta = new Cars();
        creta.setDetails("Hyundai", "Red", false);

        Cars dzire = new Cars();
        dzire.setDetails("Maruthi", "Marun", false);

        // Print details
        System.out.println("\nCars Details:");
        System.out.println(c.CarsDetail());
        System.out.println(thar.CarsDetail());
        System.out.println(creta.CarsDetail());
        System.out.println(dzire.CarsDetail());

        sc.close();
    }
}
