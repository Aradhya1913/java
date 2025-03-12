public class Forloop2 {
    public static void main(String[] args) {
        {
            for(int i=0;i<=6;i++){
                System.out.println("DAY "+i);
                for(int j=1;j<=9;j++){
                    System.out.println(" "+(j+8)+ "_"+ (j+9));
                }
            }
        }
    }
    
}
