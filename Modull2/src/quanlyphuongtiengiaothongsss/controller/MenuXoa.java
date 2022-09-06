package quanlyphuongtiengiaothongsss.controller;

import java.util.Scanner;

public class MenuXoa {
    private static Scanner sc= new Scanner(System.in);
    public static void menuXoa(){
        System.out.println("Nhap vao bien so xe can xoa: ");
        String bienSoXe = sc.nextLine();
        if(MenuThem.iServiceOto.xoa(bienSoXe)|| MenuThem.iServiceXeTai.xoa(bienSoXe)|| MenuThem.iServiceXeMay.xoa(bienSoXe)){
            MenuThem.iServiceOto.xoa(bienSoXe);
            MenuThem.iServiceXeTai.xoa(bienSoXe);
            MenuThem.iServiceXeMay.xoa(bienSoXe);
            System.out.println("xoa thanh cong");
        }else{
            System.out.println("Bien so xe khong ton tai!!!");
        }

    }

    }
