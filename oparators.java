import java.util.Scanner;

public class oparators {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a>>b;
        int max=(a>b)?a:b;
        System.out.println(c);
        System.out.println(a<<b);
        System.out.println(~a);
        System.out.println(a&b);
        System.out.println(max);
        System.out.println(a|b);
    }
    
}
