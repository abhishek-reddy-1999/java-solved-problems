import java.util.*;
public class sumofarr {
    public static int[] twoSum(int[] nums, int target) {
        
        int k=0;
        int []z=new int[2];
       outer: for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
               if( nums[i]+nums[j]==target){
                  z[k]=i;
                  k=k+1;
                  z[k]=j;
                  break outer;
               }
            }
            
        }
        return z;
        
    }
    public static void main(String[] args){
        int [] arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    
}
