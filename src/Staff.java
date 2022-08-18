class  Staff1{
    String Name;
    String Staffid;
    String Salary;
    String PhoneNum;
    Staff1(String name,String staffid,String salary,String phoneNum){
        Name=name;
        Staffid=staffid;
        Salary=salary;
        PhoneNum=phoneNum;
    }
    void display(){
        System.out.println(Name+" "+Staffid+" "+Salary+" "+PhoneNum);
    }

}

class  Teaching extends  Staff1{
    String publication;
    String domain;
    Teaching(String name,String staffid,String salary,String phoneNum,String pu,String doa){
        super(name,staffid,salary,phoneNum);
        publication=pu;
        domain=doa;

    }
    void display(){
        super.display();
        System.out.println(publication+" "+domain);
    }
}
public class Staff {
    public static void main(String[] args) {
        Staff1 s1 = new Staff1("Akshay","123","50,000","978856432");
        s1.display();
        Teaching t1 = new Teaching("anj","010","10,000,000","123456879","IEEE","ISE");
        t1.display();
    }

}