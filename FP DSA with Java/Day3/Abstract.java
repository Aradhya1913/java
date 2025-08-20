// Abstract class
abstract class Animal {

    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass must implement abstract method
class Dog extends Animal {
    
    void sound() {
        System.out.println("Bark");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        a.sound();
        a.sleep();   
    }
}