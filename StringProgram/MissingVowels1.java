public class MissingVowels1 {
    public static void miVowels(String s){
        String v="aeiou";
        boolean avilable=false;
        for(char ch:v.toCharArray()){
            if(s.toLowerCase().indexOf(ch)==-1){
                System.out.println("Missing Vowels:"+ch+ " ");
                avilable=true;
            }

        }
        if(!avilable)
        System.out.println("Vowels are not missing");
    }
    public static void main(String[] args) {
        String str="educatn";
        miVowels(str);
    }
    
}
