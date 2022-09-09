package quanlysanpham.controller;

import quanlysanpham.service.IServiceSanPham;
import quanlysanpham.service.ServiceSanPham;

import java.util.Scanner;

public class MainController {
    private static Scanner sc= new Scanner(System.in);
    private static IServiceSanPham iServiceSanPham= new ServiceSanPham();
    public static void main(String[] args) {
      while (true){
          System.out.println("----QUAN LY SAN PHAM----");
          System.out.println("1.Thêm sản phẩm ");
          System.out.println("2. Sửa thông tin sản phẩm theo id ");
          System.out.println("3. Xoá sản phẩm theo id ");
          System.out.println("4.Hiển thị danh sách sản phẩm");
          System.out.println("5. Tìm kiếm sản phẩm theo tên");
          System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
          System.out.println("0.Thoat");
          System.out.println("Xin moi nhap lua chon: ");
          int choose = Integer.parseInt(sc.nextLine());
          switch (choose){
              case 1->
                  iServiceSanPham.themSanPham();
              case 2->
              {
                  System.out.println("Nhap id san pham can sua: ");
                  int idSanPham= Integer.parseInt(sc.nextLine());
                  iServiceSanPham.suaSanPhamTheoId(idSanPham);
              }
              case 3->{
                  System.out.println("Nhap id san pham can xoa: ");
                  int idSanPham= Integer.parseInt(sc.nextLine());
                  iServiceSanPham.xoaSanPhamTheoId(idSanPham);
              }
              case 4->
                  iServiceSanPham.hienThiDanhSachSanPham();
              case 5->
              {
                  System.out.println("Nhap ten san pham can tim kiem: ");
                  String tenSanPham = sc.nextLine();
                  iServiceSanPham.timKiemTheoTenSanPham(tenSanPham);
              }
              case 6->
                  iServiceSanPham.sapXepSanPhamTheoGia();
              case 0->
                  System.exit(0);
          }
      }

    }
}
