public class CountAInString {
    public static void main(String[] args) {
        String input = "this is a java class";
        
        // Character to count
        char target = 'a';
        
        // Call the method to count occurrences
        int count = countCharacter(input, target);
        
        // Output the result
        System.out.println("The number of 'a' in the string is: " + count);
    }

    
    public static int countCharacter(String str, char ch) {
        int count = 0;
        
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
