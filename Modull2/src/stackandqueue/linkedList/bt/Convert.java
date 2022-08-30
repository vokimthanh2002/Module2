package stackandqueue.linkedList.bt;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void convert(int numberBinari) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so can  chuyen doi: ");
        int number = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int temp = number % numberBinari;
            stack.push(temp);
            number /= numberBinari;
        }
        System.out.println("Sau khi da chuyen doi: ");
        while (!stack.empty()) {
            if (stack.peek() < 10) {
                System.out.print(stack.pop() + " ");
         }
            else {
                System.out.println((char) (stack.pop() + 55) + " ");
            }
        }
    }
    public static void main(String[] args) {
        convert(2);
    }
    }
