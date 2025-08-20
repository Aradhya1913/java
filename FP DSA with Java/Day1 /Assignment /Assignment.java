import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Hello, Java!");
            System.out.println("2. Sum of Two Numbers");
            System.out.println("3. Check Even or Odd");
            System.out.println("4. Largest of Three Numbers");
            System.out.println("5. Factorial of a Number");
            System.out.println("6. Reverse a Number");
            System.out.println("7. Check Prime Number");
            System.out.println("8. Sum of Digits");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Palindrome Number Check");
            System.out.println("0. Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Hello, Java!");
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum: " + (a + b));
                    break;
                case 3:
                    System.out.println("Enter a number:");
                    int n = sc.nextInt();
                    System.out.println(n % 2 == 0 ? "Even" : "Odd");
                    break;
                case 4:
                    System.out.println("Enter three numbers:");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();
                    int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
                    System.out.println("Largest: " + largest);
                    break;
                case 5:
                    System.out.println("Enter a number:");
                    int f = sc.nextInt();
                    int fact = 1;
                    for(int i = 1; i <= f; i++) fact *= i;
                    System.out.println("Factorial: " + fact);
                    break;
                case 6:
                    System.out.println("Enter a number:");
                    int num = sc.nextInt();
                    int rev = 0;
                    while(num != 0) {
                        rev = rev * 10 + num % 10;
                        num /= 10;
                    }
                    System.out.println("Reversed: " + rev);
                    break;
                case 7:
                    System.out.println("Enter a number:");
                    int p = sc.nextInt();
                    boolean prime = p > 1;
                    for(int i = 2; i <= p/2; i++) {
                        if(p % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                    System.out.println(prime ? "Prime" : "Not Prime");
                    break;
                case 8:
                    System.out.println("Enter a number:");
                    int s = sc.nextInt();
                    int sum = 0;
                    while(s != 0) {
                        sum += s % 10;
                        s /= 10;
                    }
                    System.out.println("Sum of digits: " + sum);
                    break;
                case 9:
                    System.out.println("Enter number of terms:");
                    int t = sc.nextInt();
                    int a1 = 0, b1 = 1;
                    for(int i = 0; i < t; i++) {
                        System.out.print(a1 + " ");
                        int next = a1 + b1;
                        a1 = b1;
                        b1 = next;
                    }
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Enter a number:");
                    int pn = sc.nextInt();
                    int original = pn, reversed = 0;
                    while(pn != 0) {
                        reversed = reversed * 10 + pn % 10;
                        pn /= 10;
                    }
                    System.out.println(reversed == original ? "Palindrome" : "Not Palindrome");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}