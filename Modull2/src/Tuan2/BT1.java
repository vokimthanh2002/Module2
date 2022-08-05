package Tuan2;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        int lc;
        System.out.println("------MENU------");
        System.out.println("1.In hinh nhat");
        System.out.println("2.In tam giac vuong goc duoi");
        System.out.println("3.In tam giac vuong goc tren");
        System.out.println("4.In tam giac can");
        System.out.println("0.Thoat");
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban");
        lc = scan.nextInt();
        switch (lc) {
            case 1 -> {
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
                System.out.println("* * * * * * * * * *");
            }
            case 2-> {
               for(int i=0;i<6;i++){
                   for(int j=0;j<=i;j++)
                   {
                       System.out.print("*");
                   }
                   System.out.print("\n");
               }
            }
            case 3->
            {
                for(int i=5;i>=0;i--)
                {
                    for(int j=0; j<=i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            }
            case 4->
            {
                int n;
                System.out.print("Nhap chieu cao tam giac");
                n=scan.nextInt();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*i-1;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            }
            case 0->
            {
                System.exit(0);
            }
            default ->
            {
                System.out.print("Hay nhap lua chon");
            }

        }

    }
    }
