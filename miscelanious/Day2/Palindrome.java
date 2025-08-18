package Day2;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String lresversed ;

        for(int i=word.length()-1;i>0;i--){
            
        }

        String reversed = new StringBuilder(word).reverse().toString();
    
        if(word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
