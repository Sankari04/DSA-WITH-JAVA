package Arrays.EasyArrayProblems;

class ThirdLargestElement {
    int ThirdlargestElement(int arr[]) {
        // code here
        int i=0,first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        int n=arr.length;
        if(n-1<1){
            return -1;
        }
        else{
         while(i<=n-1) {  
        if(arr[i]>first){
            third=second;
            second=first;
            first=arr[i];
        }
        else if(arr[i]>second ){
            third=second;
            second=arr[i];
        }
        else if(arr[i]>third ){
            third=arr[i];
        }
        i++;
    }
}
        return third;
    }
}
