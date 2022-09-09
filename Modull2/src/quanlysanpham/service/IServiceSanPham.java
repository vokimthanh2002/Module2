package quanlysanpham.service;

public interface IServiceSanPham {
    void themSanPham();
    void suaSanPhamTheoId(int id);
    boolean xoaSanPhamTheoId(int id);
    void hienThiDanhSachSanPham();
    void timKiemTheoTenSanPham(String tenSanPham);
    void sapXepSanPhamTheoGia();
}
