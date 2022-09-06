package quanlyphuongtiengiaothongsss.controller;

import java.util.Scanner;

public class MenuHienThi {
    private static Scanner sc= new Scanner(System.in);
    public static void menuHienThi(){
        while (true){
            System.out.println("1. Hien thi danh sach xe tai");
            System.out.println("2. Hien thi danh sach o to");
            System.out.println("3. Hien thi danh sach xe may");
            System.out.println("4. Thoat");
            System.out.println("Nhap phuong tien can hien thi: ");
            int choose= Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1->
                        MenuThem.iServiceXeTai.hienThi();
                case 2->
                        MenuThem.iServiceOto.hienThi();
                case 3->
                        MenuThem.iServiceXeMay.hienThi();
                case 4->{
                    return;
                }
            }
        }
    }
}
