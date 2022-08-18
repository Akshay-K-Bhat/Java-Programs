import java.util.Scanner;

public class Student {
    String Name;
    String USN;
    String Branch;
    String phone;
    Scanner sc =new Scanner(System.in);
    void getdata(){
        System.out.println("Enter name");
        Name = sc.next();
        System.out.println("Enter USN");
        USN = sc.next();
        System.out.println("Enter Branch");
        Branch = sc.next();
        System.out.println("Enter phone number");
        phone = sc.next();


    }

    void  printdata(){
        System.out.println(Name+" "+USN+" "+Branch+" "+phone);
    }
    public static void main(String[] args) {
        System.out.println("Enter the no of students");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student s[] = new Student[n];
        for(int i=0;i<n;i++){
            s[i]=new Student();
            s[i].getdata();
        }
        for (int i=0;i<n;i++){
            s[i].printdata();
        }
    }
}
