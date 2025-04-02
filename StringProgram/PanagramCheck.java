public class PanagramCheck {
        public static void main(String[] args) {
        String test1 = "The quick brown fox jumps over the lazy dog";
        String test2 = "Hello World";
        String test3 = "Pack my box with five dozen liquor jugs";

        System.out.println("Is test1 a pangram? " + isPangram(test1)); 
        System.out.println("Is test2 a pangram? " + isPangram(test2)); 
        System.out.println("Is test3 a pangram? " + isPangram(test3));
        
    }
    public static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        for (boolean letterSeen : seen) {
            if (!letterSeen) return false;
        }
        return true;
    }
    
}
