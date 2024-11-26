public class AlphabetIndex {
    public static void main(String[] args) {
        // Sample string
        String sample = "The quick brown fox jumps over the lazy dog.";
        
        // Convert the string to lowercase for case insensitivity
        String lowercaseSample = sample.toLowerCase();
        
        // Array to store the first index of each alphabet character
        int[] alphabetIndices = new int[26];
        
        // Initialize the array with -1 (to denote that the character is not found)
        for (int i = 0; i < 26; i++) {
            alphabetIndices[i] = -1;
        }
        
        // Loop through the string to find the first index of each alphabet
        for (int i = 0; i < lowercaseSample.length(); i++) {
            char currentChar = lowercaseSample.charAt(i);
            
            // Check if the character is a lowercase alphabet
            if (currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a'; // Calculate the position (0-25)
                if (alphabetIndices[index] == -1) { // If not already set, update it
                    alphabetIndices[index] = i;
                }
            }
        }
        
        // Print the indices of each alphabet character
        for (int i = 0; i < 26; i++) {
            char alphabet = (char) (i + 'a');
            if (alphabetIndices[i] != -1) {
                System.out.println(alphabet + " -> Index: " + alphabetIndices[i]);
            } else {
                System.out.println(alphabet + " -> Not found");
            }
        }
    }
}
//Output
//a -> Index: 36
//b -> Index: 10
//c -> Index: 7
//d -> Index: 40
//e -> Index: 2
//f -> Index: 16
//g -> Index: 42
//h -> Index: 1
//i -> Index: 6
//j -> Index: 20
//k -> Index: 8
//l -> Index: 35
//m -> Index: 22
//n -> Index: 14
//o -> Index: 12
//p -> Index: 23
//q -> Index: 4
//r -> Index: 11
//s -> Index: 24
//t -> Index: 0
//u -> Index: 5
//v -> Index: 27
//w -> Index: 13
//x -> Index: 18
//y -> Index: 38
//z -> Index: 37
