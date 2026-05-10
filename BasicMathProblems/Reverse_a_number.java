class Solution{
    int rev=0;
    int reverse(int N){
        while(N>0){
        int rem=N%10;
        rev=(rev*10)+rem;
        N=N/10;   
    }
        return rev;
    }
}

public class Reverse_a_number {
    public static void main(String args[]){
        Solution obj1=new Solution();
        int res=obj1.reverse(122);
        System.out.println(res);
    }
}
