package quanlysinhvien.repository;
import quanlysinhvien.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RepositorySinhVienImpl implements RepositorySinhVien {
    private ArrayList<Student> danhSach;

    public RepositorySinhVienImpl() {
        this.danhSach = new ArrayList<Student>();
    }

    public RepositorySinhVienImpl(ArrayList<Student> danhSach) {
        this.danhSach = danhSach;
    }
    public void themSinhVien(Student sv) {
        this.danhSach.add(sv);
    }
    public Student nhapSinhVien(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        String maSinhVien = sc.nextLine();
        System.out.println("Nhap ten sinh vien:");
        String tenSV= sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String ngaySinh= sc.nextLine();
        System.out.println("Gioi tinh: ");
        String gioiTinh= sc.nextLine();
        System.out.println("Lop: ");
        String lop= sc.nextLine();
        System.out.println("Diem so: ");
        float diemSo= Float.parseFloat(sc.nextLine());
        Student st= new Student(maSinhVien,tenSV,ngaySinh,gioiTinh,lop,diemSo);
        return st;
    }
    public void inDanhSachSinhVien() {
        int i=1;
        for (Student sinhVien : danhSach) {
            System.out.println("Sinh vien thu "+i+" la: ");
            System.out.println(sinhVien);
            i++;
        }
    }

    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTai(Student sv) {
        return this.danhSach.contains(sv);
    }

    public boolean xoaSinhVien(Student sv) {
        return this.danhSach.remove(sv);
    }

    public void timSinhVien(String ten) {
        for (Student sinhVien : danhSach) {
            if(sinhVien.getTen().indexOf(ten)>=0) {
                System.out.println(sinhVien);
            }
        }
    }

    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                if(sv1.getDiemSo()<sv2.getDiemSo()) {
                    return 1;
                }else if(sv1.getDiemSo()>sv2.getDiemSo()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}

