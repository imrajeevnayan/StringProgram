public class MissingVowels {
        public static String findMissingVowels(String s) {
            String vowels = "aeiou";
            StringBuilder missing = new StringBuilder();
    
            for (char v : vowels.toCharArray()) {
                if (s.toLowerCase().indexOf(v) == -1) { // If the vowel is not present in the string
                    missing.append(v);
                }
            }
    
            return missing.length() == 0 ? "No vowels are missing!" : missing.toString();
        }
    
        public static void main(String[] args) {
            System.out.println(findMissingVowels("hellO wOrld")); // Output: "aiu"
            System.out.println(findMissingVowels("education"));  // Output: "No vowels are missing!"
        }
    }
    
