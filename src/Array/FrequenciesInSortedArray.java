//  Method to count the frequencies of elements in a sorted array
//  does not work for elements repeat after a gap
//  I/P : {40,50,50,50}
//  O/P : 40-1, 50-3
package Array;

public class FrequenciesInSortedArray {

    public void frequencies(int[] arr,int n){
        int element =arr[0];
        int frequency = 1;
        for(int i=1;i<n;i++){
            if(arr[i]==element){
                frequency+=1;
            }
            else{
                System.out.println(""+element+" - "+frequency);
                element=arr[i];
                frequency=1;
            }
        }
        System.out.println(""+arr[n-1]+" - "+frequency);

    }

    public static void main(String[] args) {
        FrequenciesInSortedArray ob = new FrequenciesInSortedArray();
        int[] a={40,10,10,50,50,50};
        ob.frequencies(a,a.length);

    }
}
