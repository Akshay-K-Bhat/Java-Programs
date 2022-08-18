import javax.swing.text.Style;
import java.util.Scanner;
import java.util.StringTokenizer;

class Customer{
    String name;
    String dob;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter Date of birth in dd/mm/yyyy format");
        dob = sc.next();
    }
    void printData(){
        StringTokenizer st = new StringTokenizer(dob,"/");
        System.out.print(name);
        while (st.hasMoreTokens()){
            System.out.print(","+st.nextToken());
        }
    }
    public static void main(String[] args) {
        Customer c = new Customer();
        c.getdata();
        c.printData();
    }
}