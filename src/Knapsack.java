import java.util.Arrays;
import java.util.Scanner;

class Knapsack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no items");
        int n = sc.nextInt();
        System.out.println("enter capacity of bag");
        int w = sc.nextInt();
        int wt[] = new int[n];
        System.out.println("Enter weight of items");
        for (int i=0;i<n;i++){
            wt[i] =sc.nextInt();
        }
        System.out.println("Enter value of items");
        int val[] = new int[n];
        for (int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }
        int mat[][] = new int[n+1][w+1];

        for (int r=0;r<=n;r++){
            mat[r][0] =0;
        }
        for (int c=0;c<=w;c++){
            mat[0][c]=0;
        }

        for (int item=1;item<n+1;item++){
            for (int capacity = 1;capacity<w+1;capacity++){
                int maxValwithoutCurr = mat[item-1][capacity];
                int maxvalwithCurr = 0;

                int weightOfCur = wt[item-1];

                if(capacity>=weightOfCur){
                    maxvalwithCurr = val[item-1];
                    int remainingCapacity = capacity-weightOfCur;
                    maxvalwithCurr+=mat[item-1][remainingCapacity];
                }

                mat[item][capacity] = Math.max(maxvalwithCurr,maxValwithoutCurr);
            }
        }

        System.out.println("Max value "+mat[n][w]);
        System.out.println(Arrays.deepToString(mat));
        int j=w;
        for (int i=n;i>=1;i--){
            if (mat[i][j]!=mat[i-1][j]){
                System.out.println("item "+i);
                j=j-wt[i-1];
            }
        }
    }
}