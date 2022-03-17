package Array;

public class Sorted_or_not {
    public boolean check(int[] arr){

        for(int i=0;i<arr.length-1;i++){   // 4   2
            if(arr[i+1]<arr[i]){
               return false;
            }
        }
        return true;

    }
    public void print(int[] ar){
        if(check(ar)==true)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }

}
class Execution{
    public static void main(String[] args) {
        Sorted_or_not cb = new Sorted_or_not();
        int[] ar = {5, 12, 30,2,35};
        cb.print(ar);
    }


}
