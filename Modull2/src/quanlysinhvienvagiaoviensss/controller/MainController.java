package quanlysinhvienvagiaoviensss.controller;

import java.util.Scanner;

public class MainController {
    private static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("---Chao mung ban da den voi quan ly dang nhap hs gv---");
            System.out.println("1.Quan ly sinh vien ");
            System.out.println("2.Quan ly giang vien ");
            System.out.println("3.Thoat chuong trinh ");
            System.out.println("Moi ban nhap lua chon: ");
            int choose=Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1->
                        StudentController.menu();
                case 2->
                        TeacherController.menu();
                case 3->
                         System.exit(0);
            }


        }
    }
}
