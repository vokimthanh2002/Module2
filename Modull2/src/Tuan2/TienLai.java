package Tuan2;

import java.util.Scanner;
public class TienLai {
    public static void main(String[] args){
        float tiengoc,tienlai,laixuat,tongtien;
        int  thang;
        Scanner scanner =  new  Scanner(System.in);
        System.out.print("nhap so tien ban dau  ");
        tiengoc= scanner.nextFloat();
        System.out.print("nhap lai  xuat  ");
        laixuat= scanner.nextFloat();
        System.out.print("nhap so thang  ");
        thang= scanner.nextInt();
        float  monney= tiengoc;
        for(int i=1; i<=thang;i++)
        {
            tongtien= monney+monney*laixuat;
            monney=tongtien;
        }
         tienlai=monney-tiengoc;
         System.out.print(tienlai);
    }
}
