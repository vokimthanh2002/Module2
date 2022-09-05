package quanlysinhvien.service;

import quanlysinhvien.model.Student;

public interface ServiceSinhVien {
    void themSinhVien(Student st);
    void inDanhSachSinhVien();
    boolean kiemTraDanhSachRong();
    Student nhapSinhVien();
    int laySoLuongSinhVien();
    void lamRongDanhSach();
    boolean kiemTraTonTai(Student sv);
    boolean xoaSinhVien(Student sv);
    void timSinhVien(String ten);
    void sapXepSinhVienGiamDanTheoDiem();


}
