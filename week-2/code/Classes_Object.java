
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){ // Method overloading -> same method-name with change in number of variables.
        return n1+n2+n3;
    }
    public double add(double n1,int n2){ // Method Overloading with just altering the variable type ;
        return n1+n2;
    }
    
    
}
public class Classes_Object {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;     
        int num3=1;
        double num4= 9.4;
        
        Calculator calc = new Calculator(); // Classname objectname =new Classname(); <= Creating new ojects
        
        int result1=calc.add(num1,num2);
        int result2=calc.add(num1,num2,num3);
        double result4 =calc.add(num4,num2);
        
        System.out.println("Adding Two num ="+result1);
        System.out.println("Adding Three num ="+result2);
        System.out.println("Adding two decimal num ="+result4);


        


    }
}
