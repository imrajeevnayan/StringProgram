public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String concat = s1 + s1;
        return concat.contains(s2);
    }
    
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(isRotation(s1, s2));  // Output: true
        System.out.println(isRotation(s2, s1));
    }
}
