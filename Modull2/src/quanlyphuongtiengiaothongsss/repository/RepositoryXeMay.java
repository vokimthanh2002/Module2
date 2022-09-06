package quanlyphuongtiengiaothongsss.repository;

import quanlyphuongtiengiaothongsss.model.HangSanXuat;
import quanlyphuongtiengiaothongsss.model.XeMay;

import java.util.ArrayList;
import java.util.Scanner;

public class RepositoryXeMay implements IRepositoryPhuongTien{
    private Scanner sc= new Scanner(System.in);
    private ArrayList<XeMay> xeMayArrayList= new ArrayList<>();
    @Override
    public void themMoi() {
        System.out.println("Nhap bien kiem soat: ");
        String bienKiemSoat= sc.nextLine();
        HangSanXuat hangSanXuat= new HangSanXuat();
        System.out.println("Hang san xuat");
        ArrayList<HangSanXuat> hangSanXuatArrayList = new ArrayList<>();
        hangSanXuatArrayList.add(hangSanXuat.nhapHangSanXuat());
        System.out.println("Nhap nam san xuat");
        int nam= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap chu so huu: ");
        String chuSohuu= sc.nextLine();
        System.out.println("Nhap cong xuat: ");
        float congXuat = Float.parseFloat(sc.nextLine());
        XeMay xeMay= new XeMay(bienKiemSoat,hangSanXuatArrayList,nam,chuSohuu,congXuat);
        xeMayArrayList.add(xeMay);
    }

    @Override
    public void hienThi() {
        if(xeMayArrayList.isEmpty()){
            System.out.println("Chua co xe may duoc them vao!!!");
        }else{
            for(XeMay xeMay: xeMayArrayList){
                System.out.println( xeMay);
            }
        }
    }
    @Override
    public boolean xoa(String bienSoXe) {
        for(XeMay xeMay: xeMayArrayList){
            if(xeMay.getBienKiemSoat().equals(bienSoXe)){
                xeMayArrayList.remove(xeMay);
                return true;
            }
        }
        return false;
    }

    @Override
    public void timKiem(String bienSoXe) {
        for (XeMay xeMay: xeMayArrayList) {
            if(xeMay.getBienKiemSoat().indexOf(bienSoXe)>=0) {
                System.out.println(xeMay);
            }
        }
    }
}
