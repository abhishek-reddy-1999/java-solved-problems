import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class tcs { 
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String rem=sc.next();
       // String abhi=str.replaceAll(rem, "");
      for(int i=0;i<rem.length();i++){
        System.out.println(rem.charAt(i));
        String z=rem.charAt(i);
        str.replaceAll(z,' '); 

      }
        System.out.println(str);
    
}
}