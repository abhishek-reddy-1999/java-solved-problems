import java.util.Scanner;

public class pali {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int r;
        int n=0;
        while(num>0){
            r=num%10;
            n=(n*10)+r;
            num=num/10;


        }
        System.out.println(n);
    }
    
}
