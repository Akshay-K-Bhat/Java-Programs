import java.util.Random;

class square implements Runnable{
    int x;
    square(int x){
        this.x=x;
    }
   public void run(){
        System.out.println("squre ="+x*x);
    }
}

class cube implements Runnable{
    int x;
    cube(int x){
        this.x=x;
    }
    public void run(){
        System.out.println("cube = "+x*x*x);
    }
}

class First extends Thread{
    public void run(){
        int num;
        Random ra = new Random();
        try {
            for (int i=0;i<5;i++){
                num=ra.nextInt(2,10);
                System.out.println("----------------------------------");
                System.out.println("main thread starts= number is "+num);
                Thread t2 = new Thread(new square(num));
                t2.start();
                Thread t3 = new Thread(new cube(num));
                t3.start();
                Thread.sleep(1000);

            }

        }catch (java.lang.Exception e){
            System.out.println(e.getMessage());

        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        First f1 = new First();
        Thread t1 = new Thread(f1);
        t1.start();

    }
}
