class Student{

        int rollno;
        String name;
        int marks;
        
}


public class ArrofObj {
    public static void main(String[] args) {
        
        //Creating 3 Objects for student
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

      
        s1.rollno=1;
        s1.name="Nandeesh";
        s1.marks=98;

        s2.rollno=1;
        s2.name="Neha";
        s2.marks=98;
     
        s3.rollno=1;
        s3.name="Prajwal";
        s3.marks=98;

        Student students[] =new Student[3]; // Creating arroy of objects    // Refer arrayofobject.pdf
        

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
      
      //  students → [ (1, "Nandeesh", 98), (2, "Neha", 95), (3, "Prajwal", 90) ]
      //                     students[0]        students[1]        students[0]
       
        for(int i=0;i<students.length;i++)
       {
            System.out.println(students[i].name+" "+students[i].rollno+" "+students[i].marks);
       }

       Gap.bar();

       for(Student n: students)
       {
        System.out.println(n.name+" "+n.rollno+" "+n.marks);

       }

    }
}
