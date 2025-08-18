class Student {
    int id;
    String name;

    // Constructor
    Student() {
        id = 1;
        name = "Alice";
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();  // calls constructor
        System.out.println(s.id);   // 1
        System.out.println(s.name); // Alice
    }
}