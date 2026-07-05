class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                int res=map.get(rem);
                return new int[] {res,i}; 
            }
            map.put(nums[i],i);
        }
       return new int[] {};
    }
}