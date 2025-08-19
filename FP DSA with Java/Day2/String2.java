package Day2;
public class String2 {
    public static void main(String[] args) {
        String str = "He@lLo!WoRld#";
        str = str.replaceAll("[^a-zA-Z0-9 ]", "");
        
        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) upper.append(ch);
            else lower.append(ch);
        }
        System.out.println(upper.toString() + lower.toString()); 

        
    }
}