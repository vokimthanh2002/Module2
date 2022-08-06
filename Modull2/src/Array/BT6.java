package Array;

import java.util.Scanner;

public class BT6 {
    public static Scanner sc= new Scanner(System.in);

    public  static void  main(String[] args)
    {
        int lc;
        int[][] array;
        int col=4,row=4;
        array = new int[row][col];
        System.out.println("MA TRAN 4*4");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("Nhap phan tu thu ["+i+"]["+j+"] :");
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println("");
        System.out.println("Ban muon tinh tong cot nao: ");
        System.out.println("1.Cot 0: ");
        System.out.println("2.Cot 1: ");
        System.out.println("3.Cot 2: ");
        System.out.println("4.Cot 3: ");
        System.out.println("0.Thoat ");
        System.out.println("Nhap cot ma ban muon tinh tong vao day: ");
        lc=sc.nextInt();
        switch (lc)
        {
            case 1->
            {
                int s=0;
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<1;j++) {
                        s = s + array[i][j];
                    }
                }
                System.out.print("Tong cac so o cot 0 la: "+s);
            }
            case 2->
            {
                int s1=0;
                for(int i=0;i<row;i++)
                {
                    for(int j=1;j<2;j++)
                        s1 = s1 + array[i][j];
                }
                System.out.print("Tong cac so o cot 0 la: "+s1);
            }
            case 3->
            {
                int s2=0;
                for(int i=0;i<row;i++)
                {
                    for(int j=2;j<3;j++)
                     s2 = s2 + array[i][j];
                }
                System.out.print("Tong cac so o cot 2 la: "+s2);
            }
            case 4->
            {
                int s3=0;
                for(int i=0;i<row;i++)
                {
                    for(int j=3;j<4;j++) {
                        s3 = s3 + array[i][j];
                    }
                }
                System.out.print("Tong cac so o cot 3 la: "+s3);
            }
            case 0->
            {
                System.exit(0);
            }
            default ->
            {
                System.out.print("Hay nhap lua chon dung");
            }
        }


    }
}
