import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args){
        int [] arr={1,2,5,4,6,8,3,7};
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

        }
    }
    
}
System.out.println(Arrays.toString(arr));
 }
}