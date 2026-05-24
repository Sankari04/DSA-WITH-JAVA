import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];

        int i = 0;

        while(i < m + n){

            if(i < m){
                result[i] = nums1[i];
            }
            else{
                result[i] = nums2[i - m];
            }

            i++;
        }

        Arrays.sort(result);

        for(i = 0; i < m + n; i++){
            nums1[i] = result[i];
        }
    }
}
