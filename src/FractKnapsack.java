import java.util.Scanner;

public class FractKnapsack {
    static void knapsack(int n,float weight[],float profit[],float capacity){
        float x[] = new float[20];
        float totalProfit=0;
        int i;
        int u = (int)capacity;
        for (i=0;i<n;i++){
            x[i] = (float)0.0;
        }
        for (i=0;i<n;i++){
            if(weight[i]>u){
                break;
            }
            else {
                x[i] = (float) 1.0;
                totalProfit=totalProfit+profit[i];
                u=(int)(u-weight[i]);
            }
        }
        if(i<n){
            x[i]= u/weight[i];
            totalProfit=totalProfit+(x[i]*profit[i]);
            System.out.println("result vecotr is ");
            for (i=0;i<n;i++){
                System.out.println(+x[i]);
            }
            System.out.println("Maximum profit "+totalProfit);
        }
    }
        public static void main(String[] args) {
            float temp;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no of items");
        int n = sc.nextInt();
        System.out.println("Enter weight of items");
        float weight[] = new float[n];
        for (int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }
        System.out.println("Enter profit of item");
        float profit[] = new float[n];
        for (int i=0;i<n;i++){
            profit[i]=sc.nextInt();
        }
        System.out.println("Enter capacity of knapsack");
        float capacity = sc.nextInt();
        float ratio[] = new float[n];
        for (int i=0;i<n;i++ ){
            ratio[i]=profit[i]/weight[i];
        }

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(ratio[i]<ratio[j]){

                    temp= ratio[j];
                    ratio[j] = ratio[i];
                    ratio[i] = temp;

                    temp = weight[j];
                    weight[j]=weight[i];
                    weight[i]=temp;

                    temp = profit[i];
                    profit[i] = profit[j];
                    profit
                            [j]=temp;


                }
            }
        }
        knapsack(n,weight,profit,capacity);
    }
}

