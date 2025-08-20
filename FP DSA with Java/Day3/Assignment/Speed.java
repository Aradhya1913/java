package Assignment;

class Vehicle {
    public int Speed() {
        return 220;
    }
}
    class Car extends Vehicle {
        public int Speed() {
            return 100;
        }
    }

    class Bike extends Vehicle {
        
        public int Speed() {
            return 80;
        }
    }

    class Truck extends Vehicle {
        public int Speed() {
            return 90;
        }
    }


public class Speed {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        System.out.println(veh.Speed());

        Car car = new Car();
        System.out.println(car.Speed());

        Bike bike = new Bike();
        System.out.println(bike.Speed());

        Truck truck = new Truck();
        System.out.println(truck.Speed());
    }
}