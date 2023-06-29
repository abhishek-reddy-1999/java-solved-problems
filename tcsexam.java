import java.util.Scanner;

public class tcsexam {
    public static void purchase(int []arr,int n){
        int count=1, sum=0;
        for(int i=0;i<n;i++){
            if(i==0){
                sum=arr[i];
            }
            else{
                if(sum==arr[i]){
                    count++;
                    sum+=arr[i];
                }
            }
            
        }
        if(count==n){
            System.out.println("transaction is seccuesfull");
        }
        else{
            System.out.println("transaction is not seccuesfull");
        }
    }
    public static  void takeInpute(int []arr,int n){
        Scanner sx=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sx.nextInt();
        }
    }
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        takeInpute(arr,n);
        purchase(arr,n);

    }
    
}
