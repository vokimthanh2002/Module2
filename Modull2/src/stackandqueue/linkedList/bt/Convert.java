package stackandqueue.linkedList.bt;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void convert(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int temp = number % 2;
            stack.push(temp);
            number /= 2;
        }
        final int SIZE= stack.size();
        for(int i=0; i<SIZE;i++){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so can chuyen doi: ");
        int number= sc.nextInt();
        convert(number);
    }
    }
