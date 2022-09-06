package quanlysinhvienvagiaoviensss.controller;
import quanlysinhvienvagiaoviensss.model.Teacher;
import quanlysinhvienvagiaoviensss.service.IServiceTeacher;
import quanlysinhvienvagiaoviensss.service.TeacherService;
import java.util.Scanner;
public class TeacherController {
    private static Scanner sc= new Scanner(System.in);
    public static IServiceTeacher iServiceTeacher = new TeacherService();
    public  static  void menu() {
        while (true) {
            System.out.println("-----------MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                              "1.   Thêm giang vien vào danh sách.\n"
                            + "2.  In danh sách giang viên ra màn hình.\n"
                            + "3.  Xóa một giang viên ra khỏi danh sách dựa trên mã giang viên.\n"
                            + "0.  Thoat.\n");

            int luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1 -> iServiceTeacher.themGiangVien(iServiceTeacher.nhapGiangVien());
                case 2 -> iServiceTeacher.inDanhSachGiangVien();
                case 3 -> {
                    System.out.println("Nhap ma giang vien can xoa: ");
                    String maGiangVien = sc.nextLine();
                    Teacher teacher = new Teacher(maGiangVien);
                    iServiceTeacher.xoaGiangVien(teacher);
                }
                case 0 ->
                {
                    return;
                }
            }
        }
    }
}
