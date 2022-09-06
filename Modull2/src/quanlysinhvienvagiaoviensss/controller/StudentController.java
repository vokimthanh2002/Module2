package quanlysinhvienvagiaoviensss.controller;

import quanlysinhvienvagiaoviensss.model.Student;
import quanlysinhvienvagiaoviensss.service.IServiceStudent;
import quanlysinhvienvagiaoviensss.service.StudentService;
import java.util.Scanner;

public class StudentController {
    private static IServiceStudent implStudentService = new StudentService();
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        while (true) {
            System.out.println("-----------MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                              "1.   Thêm sinh viên vào danh sách.\n"
                            + "2.  In danh sách sinh viên ra màn hình.\n"
                            + "3.  Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.  Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.  Làm rỗng danh sách sinh viên.\n"
                            + "6.  Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.  Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.  Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.  Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "0.   Thoát");
            int luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1->
                    implStudentService.themSinhVien(implStudentService.nhapSinhVien());
                case 2->
                    implStudentService.inDanhSachSinhVien();
                case 3-> System.out.println("Danh sach sinh vien rong: "+implStudentService.kiemTraDanhSachRong());
                case 4-> System.out.println("So luong sinh vien co trong danh sach: "+implStudentService.laySoLuongSinhVien());
                case 5->
                    implStudentService.lamRongDanhSach();
                case 6->
                {
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    Student sv = new Student(maSinhVien);
                    System.out.println("Sinh vien ton tai: "+implStudentService.kiemTraTonTai(sv));
                }
                case 7->
                {
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Ban chac chan muon xoa!!");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    int choose= Integer.parseInt(sc.nextLine());
                    switch (choose){
                        case 1->{
                            Student sv = new Student(maSinhVien);
                            System.out.println("Xóa sinh viên trong danh sách: "+implStudentService.xoaSinhVien(sv));
                        }
                        case 2-> System.out.println("Ban chua xac nhan xoa!!");
                    }
                }
                case 8->
                {
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    implStudentService.timSinhVien(hoVaTen);
                }
                case 9->
                {
                    implStudentService.sapXepSinhVienGiamDanTheoDiem();
                    implStudentService.inDanhSachSinhVien();
                }
                case 0->
                {
                    return;
                }
            }
        }
    }
}
