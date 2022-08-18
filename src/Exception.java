import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int a;
        int b;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a");
        a=sc.nextInt();
        System.out.println("Enter value for b");
        b=sc.nextInt();
        try {
            result = a/b;
            System.out.println(result);

        }catch (ArithmeticException e){
            System.out.println("Exception caught divided by zero");
        }
    }
}
