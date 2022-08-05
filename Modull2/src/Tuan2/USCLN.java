package Tuan2;

import java.util.Scanner;

public class USCLN {
    public static  void main(String[] args){
        int a,b;
        Scanner scan= new Scanner(System.in);
        System.out.print("Nhap a:  ");
        a=scan.nextInt();
        System.out.print("Nhap b:  ");
        b=scan.nextInt();
        if(a==0 || b==0)
        {
            System.out.print("Khong co uoc so chung");
        }
        while (a!=b)
        {
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.print(a);

    }
}
