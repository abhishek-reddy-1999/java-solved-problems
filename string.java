import java.util.*;
import java.util.Arrays;
public class string {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        //int []arr1=a.toCharArray().split(' ');
        a.toLowerCase();
        b.toLowerCase();
        int m=a.length();
        int n=b.length();

        char arr1[]=new char[m];
        char arr2[]=new char[n];
        for(int i=0;i<m;i++){
            arr1[i]=a.charAt(i);
        }
        for(int i=0;i<n;i++){
            arr2[i]=b.charAt(i);

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean var=Arrays.equals(arr1, arr2);
        System.out.println(var);
        
    }
    
}
