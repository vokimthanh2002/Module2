package quanlysinhvienvagiaoviensss.service;

import quanlysinhvienvagiaoviensss.model.Teacher;

public interface IServiceTeacher {
    Teacher nhapGiangVien();
    void themGiangVien(Teacher teacher);
    boolean xoaGiangVien(Teacher teacher);
    void inDanhSachGiangVien();
}
