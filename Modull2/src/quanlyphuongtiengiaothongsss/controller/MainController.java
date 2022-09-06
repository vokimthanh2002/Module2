package quanlyphuongtiengiaothongsss.controller;

import java.util.Scanner;

public class MainController {
    private static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("-----CHUONG TRINH QUAN LY PHUONG TIEN GIAO THONG-----");
            System.out.println("1.  Thêm mới phương tiện.");
            System.out.println("2.  Hiện thị phương tiện.");
            System.out.println("3.  Xóa phương tiện.");
            System.out.println("4.  Tìm kiếm theo biển kiểm soát.");
            System.out.println("5.  Hien thi danh sach tat ca cac xe: ");
            System.out.println("6.  Thoát.");
            System.out.println("Chon chuc nang thuc hien: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1->
                    MenuThem.menuThem();
                case 2->
                    MenuHienThi.menuHienThi();
                case 3->
                    MenuXoa.menuXoa();
                case 4->
                    MenuTimKiem.menuTimKiem();
                case 5->
                    MenuHienThitatCa.menuHienThiTatCa();

            }
        }
    }
}
