public class RemoveDplicate {
    public static String removeDuplicate(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!result.contains(String .valueOf(ch))){
                result+=ch;
            }

        }
        return result;

    }
    public static void main(String[] args) {
        String input="JAVA PROGRAMMING";
        System.out.println(removeDuplicate(input));
    }
    
}
