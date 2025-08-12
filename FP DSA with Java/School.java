import java.util.Scanner;

class Grade {
    String name;
    String stream; 
    boolean passed;

    public void setDetails(String name, String stream, boolean passed) {
        this.name = name;
        this.stream = stream;
        this.passed = passed;
    }

    public String GradeDetail() {
        return name + "|" + stream + "|" + passed;
    }
}

public class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Grade grade1 = new Grade();

        System.out.print("Enter name , Enter Stream , passsed ? (true/false): ");
        
        String name = sc.nextLine();
        String stream = sc.nextLine();
        boolean passed = sc.nextBoolean();

        grade1.setDetails(name, stream, passed);

        System.out.println("\n --- Grade Details ---");
        System.out.println(grade1.GradeDetail());

        sc.close();
    }
}
