 public class Operators {
    
    public static void main(String[] args){

        int num1=7;
        int num2=10;
        
        num1 = num1+2; 
        System.out.println("num1="+num1);
        
        num2 -= 2; // works only when opertars is behind '=' symbols;
        System.out.println("num2="+num2);
       
        num2 =- 2; //  If operator is after '=' symbol, it will be considered as overwriting the num2 value as +2 or -2
        System.out.println("num2="+num2);

        // post increment {First Fetch the value & then Increment}
        num1++;
        num2--;
        System.out.println("THIS IS POST-INCREMENT VALUES: " + num1 +","+ num2);

        //Pre increment {First Increment & then fetch the value}
        ++num1;
        --num2;
        System.out.println("THIS IS PRE-INCREMENT VALUES: "+ num1 +","+ num2);



        



    }
 } 