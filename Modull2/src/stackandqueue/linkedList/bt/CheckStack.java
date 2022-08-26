package stackandqueue.linkedList.bt;

import java.util.Scanner;
import java.util.Stack;

public class CheckStack {
    public static boolean isBracket(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao bieu thuc can tinh: ");
        String input= sc.nextLine();
        if(isBracket(input)){
            System.out.println("Valie");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
