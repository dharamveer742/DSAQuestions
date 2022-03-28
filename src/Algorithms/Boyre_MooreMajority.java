package Algorithms;

public class Boyre_MooreMajority {
    public int moore(int[] nums){
        int index=0;
        int count=1;
        for(int i=1;i< nums.length;i++){
            if(nums[index]==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                index=i;
                count=1;
            }
        }

        return nums[index];
        }


    public static void main(String[] args) {
        Boyre_MooreMajority ob = new Boyre_MooreMajority();
        int[] a={1,2,3,4,3,3,2};
        System.out.println(ob.moore(a));
    }








}
