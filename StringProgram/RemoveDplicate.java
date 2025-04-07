public class RemoveDplicate {
    public static String removeDuplicate(String s){
        String result="";
        for(char c:s.toLowerCase().toCharArray()){
            if(result.indexOf(c)==-1) result+=c;
        }
        return result;

    }
    public static void main(String[] args) {
        String input="JAVA PROGRAMmING";
        System.out.println(removeDuplicate(input));
    }
    
}
