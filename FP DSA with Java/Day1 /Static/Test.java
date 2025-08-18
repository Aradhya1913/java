// Normally u call a Variable declared in a userdefined class by creating an object first --> objectname.method(); 
// But if Static is used u can directly call by classname---> Classname.method();

class College {
    static int Code = 101;
    String name = "KIT";
}

public class Test {
    public static void main(String[] args) {
        
        System.out.println(College.Code);
        
        College n1 = new College();
        System.out.println(n1.name);
    }
}
