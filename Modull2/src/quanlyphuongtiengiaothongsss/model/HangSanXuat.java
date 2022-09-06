package quanlyphuongtiengiaothongsss.model;

import java.util.Scanner;

public class HangSanXuat {
    protected String maSanXuat;
    protected String tenHangSanXuat;
    protected String quocGia;

    public HangSanXuat(String maSanXuat, String tenHangSanXuat, String quocGia) {
        this.maSanXuat = maSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }
    public HangSanXuat(){

    }

    public String getMaSanXuat() {
        return maSanXuat;
    }

    public void setMaSanXuat(String maSanXuat) {
        this.maSanXuat = maSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
    public HangSanXuat nhapHangSanXuat(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten ma san xuat: ");
        String maSX= sc.nextLine();
        System.out.println("Nhap ten hang san xuat: ");
        String tenHang= sc.nextLine();
        System.out.println("Nhap quoc gia ");
        String quocGia= sc.nextLine();
        HangSanXuat hangSanXuat= new HangSanXuat(maSX,tenHang,quocGia);
        return hangSanXuat;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "maSanXuat='" + maSanXuat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
