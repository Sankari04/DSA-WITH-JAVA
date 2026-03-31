import java.util.*;

class Solution {
    public static List<Integer> union(int[] arr, int[] brr) {
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);
                }
                i++;
            } 
            else if (arr[i] > brr[j]) {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != brr[j]) {
                    ans.add(brr[j]);
                }
                j++;
            } 
            else {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);
                }
                i++;
                j++;
            }
        }

        while (i < arr.length) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != arr[i]) {
                ans.add(arr[i]);
            }
            i++;
        }

        while (j < brr.length) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != brr[j]) {
                ans.add(brr[j]);
            }
            j++;
        }

        return ans;
    }
}
