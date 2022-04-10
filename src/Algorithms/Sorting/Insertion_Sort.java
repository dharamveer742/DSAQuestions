package Algorithms.Sorting;

// move in the left till elements greater than key are present and move the greater elements one position ahead
// to create a space for key in the left part

import java.util.Scanner;

public class Insertion_Sort {
    public void InsertionSort(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Insertion_Sort ob = new Insertion_Sort();
        ob.InsertionSort(arr);
        ob.printArray(arr);

    }

}
