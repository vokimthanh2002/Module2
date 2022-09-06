package quanlyphuongtiengiaothongsss.controller;

import quanlyphuongtiengiaothongsss.service.IServicePhuongTien;
import quanlyphuongtiengiaothongsss.service.ServiceOto;
import quanlyphuongtiengiaothongsss.service.ServiceXeMay;
import quanlyphuongtiengiaothongsss.service.ServiceXeTai;

import java.util.Scanner;

public class MenuThem {
    private static Scanner sc= new Scanner(System.in);
    public static IServicePhuongTien iServiceOto= new ServiceOto();
    public static IServicePhuongTien iServiceXeMay= new ServiceXeMay();
    public static IServicePhuongTien iServiceXeTai= new ServiceXeTai();

    public static void menuThem(){
         while (true){
             System.out.println("1. Them xe tai");
             System.out.println("2. Them o to");
             System.out.println("3. Them xe may");
             System.out.println("4. Thoat");
             System.out.println("Nhap phuong tien can them vao");
             int choose= Integer.parseInt(sc.nextLine());
             switch (choose){
                 case 1->{
                     iServiceXeTai.themMoi();
                     System.out.println("Them moi thanh cong !!");
                 }
                 case 2->
                 {
                     iServiceOto.themMoi();
                     System.out.println("Them moi thanh cong !!");
                 }
                 case 3->
                 {
                     iServiceXeMay.themMoi();
                     System.out.println("Them moi thanh cong !!");
                 }
                 case 4->{
                     return;
                 }
             }
         }
         }
    }
