package quanlysinhvienvagiaoviensss.service;

import quanlysinhvienvagiaoviensss.model.Student;
import quanlysinhvienvagiaoviensss.repository.IRepositoryStudent;
import quanlysinhvienvagiaoviensss.repository.StudentRepository;

public class StudentService implements IServiceStudent {
    private IRepositoryStudent iStudentRepository= new StudentRepository();
    @Override
    public void themSinhVien(Student st) {
        iStudentRepository.themSinhVien(st);
    }

    @Override
    public void inDanhSachSinhVien() {
        iStudentRepository.inDanhSachSinhVien();
    }

    @Override
    public boolean kiemTraDanhSachRong() {
        return iStudentRepository.kiemTraDanhSachRong();
    }

    @Override
    public Student nhapSinhVien() {
        return iStudentRepository.nhapSinhVien();
    }

    @Override
    public int laySoLuongSinhVien() {
        return iStudentRepository.laySoLuongSinhVien();
    }

    @Override
    public void lamRongDanhSach() {
        iStudentRepository.lamRongDanhSach();
    }

    @Override
    public boolean kiemTraTonTai(Student sv) {
        return iStudentRepository.kiemTraTonTai(sv);
    }

    @Override
    public boolean xoaSinhVien(Student sv) {
        return iStudentRepository.xoaSinhVien(sv);
    }

    @Override
    public void timSinhVien(String ten) {
        iStudentRepository.timSinhVien(ten);
    }

    @Override
    public void sapXepSinhVienGiamDanTheoDiem() {
        iStudentRepository.sapXepSinhVienGiamDanTheoDiem();

    }
}
