import java.util.Random;
import java.util.Scanner;

public class Quicksort {

    int partition(int arr[],int low,int high){

        int i = low-1;
        int pivot = arr[high];

        for (int j=low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;

    }

    void  quicksort(int arr[],int low,int high){

        if(low<high){
            int pidx = partition(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
        }


    }
    public static void main(String[] args) {
        int num=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of elements");
        num = sc.nextInt();
        Random ra = new Random();
        int arr[] = new int[num];
        for (int i=0;i<num;i++){
            arr[i] = ra.nextInt(1000);
        }
        System.out.println("Before");
        for (int i =0;i<num;i++){
            System.out.println(arr[i]);
        }
        long startTime = System.currentTimeMillis();
        Quicksort q = new Quicksort();
        q.quicksort(arr,0,num-1);
        long endTime = System.currentTimeMillis()-startTime;
        System.out.println("after");
        for (int i =0;i<num;i++){
            System.out.println(arr[i]);
        }
        System.out.println("time taken "+endTime);
    }
}
