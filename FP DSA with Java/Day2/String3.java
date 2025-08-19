package Day2;

public class String3 {
    public static void main(String[] args) {
        String str = "He@l2Lo!1Wo3Rld#";
        String clean = str.replaceAll("[^a-zA-Z0-9]", "");
        
        StringBuilder alphabets = new StringBuilder();
        int sum = 0;
        
        for (char ch : clean.toCharArray()) {
            if (Character.isLetter(ch)) alphabets.append(ch);
            else sum += Character.getNumericValue(ch);
        }
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Sum of digits: " + sum); 
        // Alphabets: HelLoWoRld, Sum: 6
    }
}