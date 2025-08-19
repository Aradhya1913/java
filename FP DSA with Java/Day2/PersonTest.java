package Day2;

class Person {
    String namess;
    int ages;

    void display() {
        System.out.println("Name: " + namess);
        System.out.println("Age: " + ages);
    }
}

public class PersonTest {
    public static void main(String[] args) {
       
        Person p1 = new Person();
        p1.namess="Revanna";
        p1.ages = 32;
        
        p1.display();


    }
}
