public class RemoveDupicate {
    public static void main(String[] args) {
        String str = " Java Programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += str.substring(i, i + 1);
            }
        }
       System.out.println("String without duplicates: " + result);
    }
}