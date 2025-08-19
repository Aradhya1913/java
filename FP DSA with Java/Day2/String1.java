package Day2;

public class String1 {

    public static void main(String[] args) {

        String str = "Hi t&*$here @ % !";
    
        String cleaned = str.replaceAll("[^a-zA-Z0-9 ]", "");

        System.out.println("Original: " + str);
        System.out.println("Cleaned : " + cleaned);

    }
    
    
}
