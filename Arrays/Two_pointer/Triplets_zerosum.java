import java.util.Arrays;
class Solution {
    public boolean findTriplets(int[] arr) {
   
        Arrays.sort(arr);
        //[-3,-1,0,1,2]
      
        for(int i=0;i<arr.length-2;i++){
        int left=i+1,right=arr.length-1;
         while(left<right){
           int sum=arr[i]+arr[left]+arr[right];
           if(sum==0)
           {
               return true;
           }
           else if(sum<0){
               left++;
           }
           else{
               right--;
           }
        }
        }
        return false;
    }
}
