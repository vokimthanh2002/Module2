package quanlyphuongtiengiaothong.service;

import quanlyphuongtiengiaothong.repository.RepositoryPhuongTien;
import quanlyphuongtiengiaothong.repository.RepositoryPhuongTienImpl;

public class ServicephuongTienImpl implements ServicePhuongTien {
    private RepositoryPhuongTien repositoryPhuongTien= new RepositoryPhuongTienImpl();
    @Override
    public void themMoiPhuongTien() {
        repositoryPhuongTien.themMoiPhuongTien();
    }

    @Override
    public void hienThiPhuongTien() {
        repositoryPhuongTien.hienThiPhuongTien();
    }

    @Override
    public void hienThiTatCa() {
        repositoryPhuongTien.hienThiTatCa();
    }

    @Override
    public void xoaPhuongTien() {
        repositoryPhuongTien.xoaPhuongTien();
    }

    @Override
    public void timKiemTheoBienSoXe() {
        repositoryPhuongTien.timKiemTheoBienSoXe();
    }
}
