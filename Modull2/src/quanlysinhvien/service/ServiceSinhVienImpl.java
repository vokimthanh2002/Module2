package quanlysinhvien.service;

import quanlysinhvien.model.Student;
import quanlysinhvien.repository.RepositorySinhVien;
import quanlysinhvien.repository.RepositorySinhVienImpl;

public class ServiceSinhVienImpl implements ServiceSinhVien {
    private RepositorySinhVien repositorySinhVien= new RepositorySinhVienImpl();
    @Override
    public void themSinhVien(Student st) {
        repositorySinhVien.themSinhVien(st);
    }
    @Override
    public void inDanhSachSinhVien() {
        repositorySinhVien.inDanhSachSinhVien();
    }

    @Override
    public boolean kiemTraDanhSachRong() {
        return repositorySinhVien.kiemTraDanhSachRong();
    }

    @Override
    public Student nhapSinhVien() {
        return repositorySinhVien.nhapSinhVien();
    }

    @Override
    public int laySoLuongSinhVien() {
        return repositorySinhVien.laySoLuongSinhVien();
    }

    @Override
    public void lamRongDanhSach() {
        repositorySinhVien.lamRongDanhSach();
    }

    @Override
    public boolean kiemTraTonTai(Student sv) {
       return repositorySinhVien.kiemTraTonTai(sv);
    }

    @Override
    public boolean xoaSinhVien(Student sv) {
        return repositorySinhVien.xoaSinhVien(sv);
    }

    @Override
    public void timSinhVien(String ten) {
        repositorySinhVien.timSinhVien(ten);
    }

    @Override
    public void sapXepSinhVienGiamDanTheoDiem() {
        repositorySinhVien.sapXepSinhVienGiamDanTheoDiem();
    }
}
