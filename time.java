import java.util.Scanner;

public class time {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String time="12:05:00 PM";
        String []t=time.split(":");
        int n=t.length;
        System.out.println(t[n-1]);
        for(String ele:t){
           // System.out.print(ele+" ");
        }
       
        
            int k=Integer.parseInt(t[0]);
            System.out.print(k);
            int c=24-k;
            
        

    
}
}