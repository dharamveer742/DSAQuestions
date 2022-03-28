//Check if Array Is Sorted and  rotated some number of positions (including zero). Otherwise, return false.

package Array;

public class ArraySortedAndRotated {

    public boolean check(int[] nums) {
        int count=0;
        int pos= 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){count++; pos=i;}
              // if  sorted  and rotated by 0

        }
        if(nums[0]<nums[nums.length-1]){count++;}
       if(count==1){ System.out.println(pos);}
        return count==1;
    }

    public static void main(String[] args) {
        ArraySortedAndRotated ob = new ArraySortedAndRotated();
        int[] a={1,2,3};
        System.out.println(ob.check(a));

    }


}
// if array is sorted and rotated by a position x then only element at index n-x will be greater than (n-x)-1
// if array is  sorted and rotated by 0 position ->  if(nums[0]<nums[nums.length-1]){count++;}
// < for {1,1,1}
