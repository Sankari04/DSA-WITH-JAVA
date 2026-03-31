import java.util.*;

class Solution {
    public static List<Integer> intersection(int[] arr, int[] brr) {
        Arrays.sort(arr);
        Arrays.sort(brr);

        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                i++;
            } 
            else if (arr[i] > brr[j]) {
                j++;
            } 
            else {
                // avoid duplicates
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);
                }
                i++;
                j++;
            }
        }

        return ans;
    }
}
