class Solution{
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++)
      {
      if(set.contains(nums[i]){
          return true;
      }
        set.add(nums[i]);
      }
    return false;
}
}

//Level:Easy
//Time complexity:O(n)
//Space complexity:O(n)
