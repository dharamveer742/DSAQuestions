// Find the maximum difference in array ie. arr[j]-arr[i] where j should be greater than i
// I/P : {2,3,10,6,4,8,1}
// O/P : 10-2 = 8



package Array;

public class MaximumDifference {
    public int maxDifference(int[] arr,int n){
        int j=1;
        int min =arr[0];
        int max=arr[1];
        for(int i=0;i<n-1;i++){
            max=Math.max(max,arr[j]);
            min=Math.min(min,arr[i]);
            j=j+1;


        }
        int result=max-min;
        return result;

    }


    public static void main(String[] args) {
        int [] a = {2,3,10,6,4,8,1};
        MaximumDifference h = new MaximumDifference();
        System.out.println(h.maxDifference(a,a.length));
    }


}
