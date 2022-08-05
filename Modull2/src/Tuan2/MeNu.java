package Tuan2;

import java.util.Scanner;

public class MeNu {
    public static void main(String[] args){
        int lc;
        System.out.println("------MENU------");
        System.out.println("1.Ve hinh tam giac");
        System.out.println("2.Ve hinh chu nhat");
        System.out.println("3.Ve hinh vuong");
        System.out.println("4.Thoat");
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban");
        lc=scan.nextInt();
        switch (lc){
            case 1->{
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");

            }
            case 2->{
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
            }
            case 3->
            {
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                }
                case 4-> {
                System.exit(4);
            }
            default ->
            {
                System.out.print("Hay nhap lua chon");
            }
        }


    }
}
