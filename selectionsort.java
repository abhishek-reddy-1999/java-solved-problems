import java.util.Arrays;

public class selectionsort {
    public static int[] selectionsort(int []arr,int n){
        int mid=0,temp;
        for(int i=0;i<n-1;i++){
            mid=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[mid]){
                    mid=j;
                }
            
            }
            temp=arr[mid];
            arr[mid]=arr[i];
            arr[i]=temp;
            
        }
        return arr;
    }
    public static void main (String[]args){
        int [] arr={2,3,5,4,8,9,7,5};
        int n=arr.length;
        System.out.println(Arrays.toString(selectionsort(arr,n)));
    }
    
}
