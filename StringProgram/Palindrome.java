public class Palindrome {
    public static boolean isPalindrome(String s){
        StringBuilder sa =new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sa.append(s.charAt(i));
        }
        return s.equals(sa.toString());
        

    }

    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str));
    }
    
}