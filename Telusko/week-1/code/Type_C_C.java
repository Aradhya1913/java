// TYPE CONVERTIN OR TYPE CASTING IN JAVA ??

public class Type_C_C {
    public static void main(String[] args) {

        byte b=127;
        int a =12;
        
        System.out.println(a);
        a=b; // Impicit convertion since int-a is larger than byte-b;
        System.out.println(a);

        b=(byte)a; // Explicit Type casting;
        System.out.println(b); 

        float f = 5.6f;
        int t = (int)f; // Explicit Type casting;
        System.out.println(t);


        // TYPE PROMOTIONS ??

        byte n=10;
        byte m=20;
        int res= n*m; // The operation on b&m is implicity promoted to store in int (res);
        System.out.println(res);

    }
}