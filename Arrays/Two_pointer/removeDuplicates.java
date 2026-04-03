import java.util.*;

class Solution {
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
                list.add(num);
            }
        }
        
        return list;
    }
}
