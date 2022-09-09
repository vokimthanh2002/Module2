package quanlysanpham.repository;

import quanlysanpham.model.SanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RepositorySanPham implements IRepositorySanPham {
    private ArrayList<SanPham> sanPhamArrayList= new ArrayList<>();
    private Scanner sc= new Scanner(System.in);
    @Override
    public void themSanPham() {
        System.out.println("Nhap id san pham can them: ");
        int idSanPham= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten san pham can them: ");
        String tenSanPham= sc.nextLine();
        System.out.println("Nhap gia san pham can them: ");
        float giaSanPham= Float.parseFloat(sc.nextLine());
        SanPham sanPham= new SanPham(idSanPham,tenSanPham,giaSanPham);
        sanPhamArrayList.add(sanPham);
    }

    @Override
    public void suaSanPhamTheoId(int id) {
        for(SanPham sanPham: sanPhamArrayList){
            if(sanPham.getId()==id){
                System.out.println("Nhap ten san pham can sua: ");
                String tenSanPham= sc.nextLine();
                System.out.println("Nhap gia san pham can sua: ");
                float giaSanPham= Float.parseFloat(sc.nextLine());
                sanPham.setTen(tenSanPham);
                sanPham.setGia(giaSanPham);
            }else{
                System.out.println("khong tim thay id san pham ");
            }
        }

    }

    @Override
    public boolean xoaSanPhamTheoId(int id) {
       for(SanPham sanPham : sanPhamArrayList){
            if(sanPham.getId()==id){
                sanPhamArrayList.remove(sanPham);
                return true;
            }
       }
       return false;
    }

    @Override
    public void hienThiDanhSachSanPham() {
        for(SanPham sanPham: sanPhamArrayList){
            System.out.println(sanPham);
        }

    }

    @Override
    public void timKiemTheoTenSanPham(String tenSanPham) {
        for(SanPham sanPham: sanPhamArrayList){
           if(sanPham.getTen().indexOf(tenSanPham)>=0){
               System.out.println(sanPham);
           }
        }
    }

    @Override
    public void sapXepSanPhamTheoGia() {
        Collections.sort(sanPhamArrayList);
    }
}
