package Test;

import java.util.Scanner;
public class BT3 {
    public static void  main(String[] args){
        double USD;
        double VND;
        double rate= 23000;
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap  vao so usd:  ");
        USD= scanner.nextDouble();
        VND= USD*rate;
        System.out.print(USD+ "  Convert  VND:  "+  VND);
    }
}
