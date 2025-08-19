package Day2;

public class String4 {
    public static void main(String[] args) {
        String str = "HelloWorld123";
        
        StringBuilder upper = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) upper.append(Character.toUpperCase(ch)); // Character.toUpperCase /  --->convert to uppercase 
                                                                                    // Character.isLowerCase ,/ isUppercase ---> check the case
            else upper.append(ch);
        }
        System.out.println(upper); // HELLOWORLD123
    }
}