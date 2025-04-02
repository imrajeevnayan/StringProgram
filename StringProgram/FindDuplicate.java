public class FindDuplicate {
    public static int dupicate(String s){
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if (s.indexOf(ch, i + 1) != -1) {
                return i; // Return the index of the first duplicate character
            }
         }
        return -1;

    }
    public static void main(String[] args) {
        String str="JAVA DEVELOPER";
        int index=(dupicate(str));
        if (index != -1) {
            System.out.println("First duplicate character: '" + str.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No duplicate characters found.");
        }
    }
    
}
