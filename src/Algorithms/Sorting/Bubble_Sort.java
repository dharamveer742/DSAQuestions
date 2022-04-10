package Algorithms.Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public void sort(int[] arr,int size){
        for(int p=0;p<size-1;p++){
            boolean swapped =false;
            for(int c=0;c<(size-1-p);c++){
                if(arr[c]>arr[c+1]){
                    swap(arr,c,c+1);
                    swapped =true;

                }
            }
            if(swapped==false){
                System.out.println("O(?)");   // 4 3 2 1
                break;
            }
        }

    }
    public void swap(int[] arr,int index1,int index2){
        arr[index1]=arr[index1]^arr[index2];
        arr[index2]=arr[index1]^arr[index2];
        arr[index1]=arr[index1]^arr[index2];
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Bubble_Sort ob = new Bubble_Sort();
        ob.sort(arr,n);
        ob.printArray(arr);

    }



}
