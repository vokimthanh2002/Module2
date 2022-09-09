package quanlysanpham.service;

import quanlysanpham.repository.IRepositorySanPham;
import quanlysanpham.repository.RepositorySanPham;

public class ServiceSanPham implements IServiceSanPham{
    private IRepositorySanPham iRepositorySanPham= new RepositorySanPham();
    @Override
    public void themSanPham() {
        iRepositorySanPham.themSanPham();
    }

    @Override
    public void suaSanPhamTheoId(int id) {
        iRepositorySanPham.suaSanPhamTheoId(id);
    }

    @Override
    public boolean xoaSanPhamTheoId(int id) {
        return iRepositorySanPham.xoaSanPhamTheoId(id);
    }

    @Override
    public void hienThiDanhSachSanPham() {
        iRepositorySanPham.hienThiDanhSachSanPham();
    }

    @Override
    public void timKiemTheoTenSanPham(String tenSanPham) {
        iRepositorySanPham.timKiemTheoTenSanPham(tenSanPham);
    }

    @Override
    public void sapXepSanPhamTheoGia() {
        iRepositorySanPham.sapXepSanPhamTheoGia();
    }
}
