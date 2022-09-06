package quanlyphuongtiengiaothongsss.service;

import quanlyphuongtiengiaothongsss.repository.IRepositoryPhuongTien;
import quanlyphuongtiengiaothongsss.repository.RepositoryOto;

public class ServiceOto implements IServicePhuongTien {
    private IRepositoryPhuongTien iRepositoryPhuongTien = new RepositoryOto();


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
