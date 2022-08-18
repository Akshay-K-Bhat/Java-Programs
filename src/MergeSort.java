import java.util.Random;

import java.util.Scanner;

class MergeSort{
    void conquer(int arr[],int si,int mid,int ei){

        int merged[] =new int[ei-si+1];
        int x=0;
        int idx1 =si;
        int idx2 =mid+1;

        while (idx1<=mid &&idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++] = arr[idx1++];
            }else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1<=mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2<=ei){
            merged[x++] = arr[idx2++];
        }
        for (int i=0,j=si;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
    void divide(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);


    }
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        n= sc.nextInt();
        Random ra = new Random();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= ra.nextInt(1000);
        }
        System.out.println("Before Sorting");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        long startTime =System.currentTimeMillis();
        MergeSort m = new MergeSort();
        m.divide(arr,0,arr.length-1);
        long endTime = System.currentTimeMillis()-startTime;
        System.out.println("after sorting");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Time taken "+endTime);
    }
}