import java.util.Scanner;

public class Stack {
    int top=-1;
    int max=4;
    int[] stack = new int[max];
    void push(int ele){
        if(top==max-1){
            System.out.println("overflow");
        }
        else {
            stack[++top] = ele;
        }

    }

    int pop(){
        int ele=0;
        if (top==-1){
            System.out.println("underflow");
        }else {
            ele = stack[top--];

        }
        return ele;
    }

    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else {
        System.out.println("Stack elements are");
        for(int i=top;i>=0;i--) {
            System.out.println("Stack[" + i + "]" + stack[i]);
        }
        }
    }
    public static void main(String[] args) {
        int choice;
        Stack s1 = new Stack();
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("Menu");
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.display");
        System.out.println("Enter choice");
        choice = sc.nextInt();
        switch (choice){
            case 1:System.out.println("Enter the element you want to push");
                    int ele = sc.nextInt();
                    s1.push(ele);
                    s1.display();
                    break;
            case 2:int poppedEle = s1.pop();
                   System.out.println("Popped element is "+poppedEle);
                   s1.display();
                   break;

            case 3:s1.display();
                   break;

        }
         }
    }
}
