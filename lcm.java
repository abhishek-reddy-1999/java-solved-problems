import java.nio.file.NotLinkException;
import java.util.Scanner;

public class lcm {
    static int hcf;
    static int lcm;
    public static int findlcm(int n1,int n2){
        int small,great;

        if(n1>n2){
            great=n1;
            small=n2;
        }else{
            great=n2;
            small=n1;
        }
        while(true){
            if(great%n1==0 && great%n2==0){
                lcm=great;
                break;
            }
            great++;
         }
         return lcm;
            
        
    }
    public static int findhcf(int n1,int n2){
        int great,small;
        if(n1>n2){
            great=n1;
            small=n2;
        }else{
            great=n2;
            small=n1;
        }
        for(int i=1;i<=small+1;i++){
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        return hcf ;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(findlcm(n1,n2));
    }
    
}
