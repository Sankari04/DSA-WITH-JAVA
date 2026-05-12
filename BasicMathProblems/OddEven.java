package BasicMathProblems;
class Solution{
    boolean isEven(int N){
        if(N%2==0){
            return true;
        }
        return false;

    }
}



public class OddEven{
    public static void main(String[] args) {
        Solution obj1=new Solution();
        boolean res=obj1.isEven(15);
        System.out.println(res);
    }
}