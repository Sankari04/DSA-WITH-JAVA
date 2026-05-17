class Solution{
public class {
int n=nums.length;  
int[] ans=new int[n*2];
  for(int i=0;i<n;i++)
    {
      ans[i]=nums[i];
      ans[i+n]=nums[i];
    }
  return ans;
}
}

//Level:Easy
//Time Complexity:O(n)
//Space complexity:O(n)
