public class Terniary {
    public static void main(String[] args) {
        String n;
        int num=8;
    
        // Terniary Operator =>  ?(iftrue):(iffalse)
        n=num%2==0&&num>0 ?"even":"odd";
        
        System.out.println(n);
}
}
