package quanlyphuongtiengiaothongsss.service;

import quanlyphuongtiengiaothongsss.repository.IRepositoryPhuongTien;
import quanlyphuongtiengiaothongsss.repository.RepositoryXeMay;

public class ServiceXeMay implements IServicePhuongTien{
    private IRepositoryPhuongTien iRepositoryPhuongTien = new RepositoryXeMay();

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
