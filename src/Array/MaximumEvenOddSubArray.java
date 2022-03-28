// Maximum length even odd subArray

//  I/P : {10,12,14,7,8}
//  O/P : 3



package Array;

import java.util.Arrays;

public class MaximumEvenOddSubArray {

    public int max(int[] arr,int n){
        int ans =1;
        int c=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                c++;
                ans=Math.max(ans,c);
            }
            else c=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumEvenOddSubArray ob = new MaximumEvenOddSubArray();
        int[] a ={10,12,14,8};
        int[] b ={5,10,20,6,3,8};
        System.out.println(ob.max(a,a.length));
        System.out.println(ob.max(b,b.length));

        int[] arr={1,3,3,4,4,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }







}
