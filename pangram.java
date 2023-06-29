public class pangram {
    public static  String ispangram(String s){
        if(s.length()<26){
            return "not panagram";
        }
        else{
            for(char ch='a';ch<='z';ch++){
                if(s.indexOf(ch)<0){
                    return "not panagram";
                }
            
            }
            return "pangram";  
        }
        
    }
    public static void main (String[] args){
        String str="We promptly judged antique ivory buckles for the next prize";
        System.out.println(ispangram(str.toLowerCase()));
    }
    
}
