package Tuan2;

import java.util.Scanner;

public class KTSNT {
        public static void main(String[] args){
            int number;
            int dem=0;
            int i;
            Scanner scanner= new Scanner(System.in);
            System.out.print("Input number");
            number= scanner.nextInt();
            if(number<2) {
                System.out.print("Day khong phai so nguyen to");
            }else {
             for( i=1; i<=number;i++)
             {
                 if (number % i == 0) {
                     dem++;
                 }
             }
             if(dem==2)
             {
                 System.out.print("Day la so nguyen to");
             }else {
                 System.out.print("Day khong phai so nguyen to");
             }
            }
        }

}
