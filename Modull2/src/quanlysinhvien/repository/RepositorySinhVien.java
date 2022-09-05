package quanlysinhvien.repository;

import quanlysinhvien.model.Student;

public interface RepositorySinhVien {
    void themSinhVien(Student sv);
    Student nhapSinhVien();
    void inDanhSachSinhVien();
    boolean kiemTraDanhSachRong();
    int laySoLuongSinhVien();
    void lamRongDanhSach();
    boolean kiemTraTonTai(Student sv);
    boolean xoaSinhVien(Student sv);
    void timSinhVien(String ten);
    void sapXepSinhVienGiamDanTheoDiem();
}
