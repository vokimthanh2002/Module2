package quanlyphuongtiengiaothongsss.controller;

import java.util.Scanner;

public class MenuTimKiem {
    private static Scanner sc= new Scanner(System.in);
    public static void menuTimKiem(){
        System.out.println();
        System.out.println("Nhap bien so xe can tim kiem: ");
        String bienSoXe = sc.nextLine();
        MenuThem.iServiceOto.timKiem(bienSoXe);
        MenuThem.iServiceXeMay.timKiem(bienSoXe);
        MenuThem.iServiceXeTai.timKiem(bienSoXe);
    }
}
