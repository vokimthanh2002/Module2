package quanlyphuongtiengiaothongsss.service;

import quanlyphuongtiengiaothongsss.repository.IRepositoryPhuongTien;
import quanlyphuongtiengiaothongsss.repository.RepositoryXeTai;

public class ServiceXeTai implements IServicePhuongTien{
    private IRepositoryPhuongTien iRepositoryPhuongTien = new RepositoryXeTai();
    @Override
    public void themMoi() {
        iRepositoryPhuongTien.themMoi();
    }
    @Override
    public void hienThi() {
        iRepositoryPhuongTien.hienThi();
    }

    @Override
    public boolean xoa(String bienSoXe) {
        return iRepositoryPhuongTien.xoa(bienSoXe);
    }

    @Override
    public void timKiem(String bienSoXe) {
        iRepositoryPhuongTien.timKiem(bienSoXe);
    }
}
