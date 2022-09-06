package quanlysinhvienvagiaoviensss.repository;

import quanlysinhvienvagiaoviensss.model.Teacher;

public interface IRepositoryTeacher {
    void themGiangVien(Teacher teacher);
    boolean xoaGiangVien(Teacher teacher);
    void inDanhSachGiangVien();
    Teacher nhapGiangVien();
}
