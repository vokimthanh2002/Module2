package quanlyphuongtiengiaothong.controller;
import quanlyphuongtiengiaothong.service.ServicePhuongTien;
import quanlyphuongtiengiaothong.service.ServicephuongTienImpl;

import java.util.Scanner;

public class ControllerPhuongTien {
    public static   void main(String[] args){
        ServicePhuongTien servicePhuongTien = new ServicephuongTienImpl();
        Scanner sc= new Scanner(System.in);
        int choose;
        do {
            System.out.println("-----CHUONG TRINH QUAN LY PHUONG TIEN GIAO THONG-----");
            System.out.println("1.  Thêm mới phương tiện.");
            System.out.println("2.  Hiện thị phương tiện.");
            System.out.println("3.  Xóa phương tiện.");
            System.out.println("4.  Tìm kiếm theo biển kiểm soát.");
            System.out.println("5. Hien thi danh sach tat ca cac xe: ");
            System.out.println("6. Thoát.");
            System.out.println("Chon chuc nang thuc hien: ");
            choose= Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1->
                        servicePhuongTien.themMoiPhuongTien();
                case 2->
                        servicePhuongTien.hienThiPhuongTien();
                case 3->
                        servicePhuongTien.xoaPhuongTien();
                case 4->
                        servicePhuongTien.timKiemTheoBienSoXe();
                case 5->
                        servicePhuongTien.hienThiTatCa();
                case 6->
                        System.exit(0);
            }
        }while (choose!=0);
    }

}