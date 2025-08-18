class Student {
    int id;
    String name;
}

public class Default {
    public static void main(String[] args) {
        Student s = new Student();  // default constructor called
        System.out.println(s.id);
        System.out.println(s.name);
       
    }
}