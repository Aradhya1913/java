package Day2;

public class String5 {
    public static void main(String[] args) {
        String str = "HelloWorld123";
        
        StringBuilder lower = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) lower.append(Character.toLowerCase(ch)); // Character.tolowerCase /  --->convert to lowercase 
                                                                                    // Character.isLowerCase ,/ islowercase ---> check the case
            else lower.append(ch);
        }
        System.out.println(lower); // HELLOWORLD123
    }
}