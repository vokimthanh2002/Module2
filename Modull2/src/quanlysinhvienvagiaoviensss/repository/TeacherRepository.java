package quanlysinhvienvagiaoviensss.repository;

import quanlysinhvienvagiaoviensss.model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherRepository implements IRepositoryTeacher{
    private ArrayList<Teacher> arrayList= new ArrayList<>();
    public TeacherRepository() {
        this.arrayList = new ArrayList<Teacher>();
    }

    public TeacherRepository(ArrayList<Teacher> arrayList) {
        this.arrayList = arrayList;
    }


    public Teacher nhapGiangVien() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập mã giang vien: ");
        String maGiangVien = sc.nextLine();
        System.out.println("Nhap ten giang vien:");
        String tenGiangVien= sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String ngaySinh= sc.nextLine();
        System.out.println("Gioi tinh: ");
        String gioiTinh= sc.nextLine();
        System.out.println("Chuyen Mon: ");
        String chuyenMon= sc.nextLine();
        Teacher teacher= new Teacher(maGiangVien,tenGiangVien,ngaySinh,gioiTinh,chuyenMon);
        return teacher;
    }

    @Override
    public void themGiangVien(Teacher teacher) {
        arrayList.add(teacher);
    }

    @Override
    public boolean xoaGiangVien(Teacher teacher) {
      return arrayList.remove(teacher);
    }

    @Override
    public void inDanhSachGiangVien() {
        int i=1;
        for (Teacher teacher : arrayList) {
            System.out.println("Giang vien thu "+i+" la: ");
            System.out.println(teacher);
            i++;
        }

    }
}
