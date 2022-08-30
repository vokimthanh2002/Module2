package stackandqueue.linkedList.bt;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
// use stack and queue
public class CheckPalindrome {
    public static boolean check(String str){
        Stack<String> stack= new Stack<>();
        String[] array= str.split(" ");
        for(String x: array ){
            stack.push(x);
        }

        Queue<String> queue= new LinkedList<>();
        for(String x: array){
            queue.add(x);
        }

        String s1="";
        String s2="";
        while (!stack.empty())
            s1 = s1 + stack.pop();
        while (!queue.isEmpty())
            s2 = s2 + queue.poll();
        return s1.equals(s2);
    }
//use stack
public static boolean checkStack(String str){
    Stack<String> stack= new Stack<>();
    String[] array= str.split(" ");
    for(String s: array){
        stack.push(s);
    }
    Stack<String> tmp= new Stack<>();
    tmp.addAll(stack);
    final int SIZE= tmp.size();
    Stack<String> stack2= new Stack<>();
    for(int i=0;i<SIZE;i++){
        stack2.push(tmp.pop());
    }
    String s1="";
    String s2="";
    while (!stack.isEmpty()){
        s1=s1+stack.pop();
    }
    System.out.println("-------------------");
    System.out.println(s1);
    while (!stack2.isEmpty()){
        s2=s2+stack2.pop();
    }
    System.out.println("-------------------");
    System.out.println(s2);
    return  s1.equals(s2);
}
//main
    public static void main(String[] args) {
        System.out.println("hay nhap chuoi vao day :");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (checkStack(string))
            System.out.println( string + "' is a symmetric string.");
        else
            System.out.println(string + "' is not a symmetric string!");
    }
    }
