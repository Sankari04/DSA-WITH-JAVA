class Solution{
public int[] twoSum(int[] nums, int target){
HashMap<Integer,Integer> map=new HashMap<>();
  for(int i=0;i<nums.length;i++)
  {
      int remainder=target-nums[i];
      if(map.containsKey(remainder))
      {
      int index=map.get(remainder);
      return new int[] {index,i};
      }
      map.put(nums[i],i);    
  }
  return new int[] {};
}
}

//Easy level
//Time Complexity:O(n)
//Space Complexity:O(n)
