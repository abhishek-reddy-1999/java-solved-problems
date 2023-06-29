import java.util.Scanner;

public class swaping {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swaping "+a+","+b);
       
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("after swaping "+a+","+b);
        

        

    }

    
}
