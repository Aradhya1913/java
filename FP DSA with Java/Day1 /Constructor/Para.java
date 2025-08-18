class Student {
    int id;
    String name;

    // Constructor with parameters
    Student(int i, String n) {
        id = i;
        name = n;
    }
}

public class Para {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}