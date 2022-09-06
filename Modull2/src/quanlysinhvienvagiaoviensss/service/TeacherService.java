package quanlysinhvienvagiaoviensss.service;

import quanlysinhvienvagiaoviensss.model.Teacher;
import quanlysinhvienvagiaoviensss.repository.IRepositoryTeacher;
import quanlysinhvienvagiaoviensss.repository.TeacherRepository;

public class TeacherService implements IServiceTeacher {
    private IRepositoryTeacher iRepositoryTeacher= new TeacherRepository();
    @Override
    public Teacher nhapGiangVien() {
        return iRepositoryTeacher.nhapGiangVien();
    }

    @Override
    public void themGiangVien(Teacher teacher) {
        iRepositoryTeacher.themGiangVien(teacher);
    }

    @Override
    public boolean xoaGiangVien(Teacher teacher) {
        return iRepositoryTeacher.xoaGiangVien(teacher);
    }

    @Override
    public void inDanhSachGiangVien() {
        iRepositoryTeacher.inDanhSachGiangVien();

    }
}
