import java.util.Arrays;
class Solution {
    public static int intersectSize(int a[], int b[]) {
        int count=0,i=0,j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int n=a.length,m=b.length;
        while(i<n && j<m){
            if(a[i]==b[j]){
                count++;
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
