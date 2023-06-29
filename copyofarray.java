import java.util.Arrays;
import java.util.Scanner;

public class copyofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="233 2435 1123 109 103 4434 2347 993 880 1117 1801 991;";
        int count=0;
        input=input.replace(";", "");
        String [] inputarray=input.split(" ");
        int []result=new int[0];
        for(int i=0;i<inputarray.length;i++){
            boolean abhi=checkprimenumber(Integer.parseInt(inputarray[i]));
            if(abhi==true){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = Integer.parseInt(inputarray[i]);
                count++;
            }
        }
        Arrays.sort(result);
        System.out.println(result[result.length-2]+count);
    }
    public static boolean checkprimenumber(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }

        }
     return true;
    
}
}
