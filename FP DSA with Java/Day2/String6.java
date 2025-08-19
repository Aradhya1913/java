package Day2;

public class String6 {
    public static void main(String[] args) {
        String str = "HelloWorld123";
        
        StringBuilder reverse = new StringBuilder();

        
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) reverse.append(Character.toLowerCase(ch)); // Character.tolowerCase /  --->convert to lowercase 
                                                                                    // Character.isLowerCase ,/ islowercase ---> check the case
            else if(Character.isLowerCase(ch)) reverse.append(Character.toUpperCase(ch));
        }
        System.out.println(reverse); // HELLOWORLD123
    }
}