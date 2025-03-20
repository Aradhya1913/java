class Person{
    String name="Shyam";
    int age;
    public void displayInfoa(){
        System.out.println("I am a damn person");
        System.out.println(name);

    }
}

class Students extends Person
{
    int rollno=100;
    public void displayInfob(){
        System.out.println("I am a damn Student");
        System.out.println(age);
    }

}

class Highstudent extends Students
{
    char grade='A';
    public void displayInfoc(){
        System.out.println("I am a damn High school Student");
        System.out.println(rollno);
        System.out.println(grade);

    }

}

public class Inhale {
    public static void main(String[] args) {
        Highstudent p = new Highstudent();
        p.displayInfoa();
        p.displayInfob();
        p.displayInfoc();

    }
   
}