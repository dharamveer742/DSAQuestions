//  Method to reverse an array
//  I/P : {10,5,7,30,9}
//  O/P : {9,30,7,5,10}

package Array;

public class ReverseArray {
    public int[] reverse(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
        return arr;
    }

    public  void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        ReverseArray ob = new ReverseArray();

        int[] a ={10,5,7,30,9};
        ob.print(ob.reverse(a));




    }

}
