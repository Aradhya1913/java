// Normally u call a method by creating an obiject first --> objectname.method(); 
// But if Ststic method is used u can directly call by classname ---> Classname.method();


class MathUtil {
    static int square(int x) {
        return x * x;
    }
}
public class Test2 {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(5));  // No object needed
    }
}