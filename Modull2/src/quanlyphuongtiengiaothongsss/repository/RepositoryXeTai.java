package quanlyphuongtiengiaothongsss.repository;

import quanlyphuongtiengiaothongsss.model.HangSanXuat;
import quanlyphuongtiengiaothongsss.model.XeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class RepositoryXeTai implements IRepositoryPhuongTien {
    private Scanner sc= new Scanner(System.in);
    private ArrayList<XeTai> xeTaiArrayList= new ArrayList<>();
    @Override
    public void themMoi() {
        System.out.println("Nhap bien kiem soat: ");
        String bienKiemSoat= sc.nextLine();
        HangSanXuat hangSanXuat= new HangSanXuat();
        System.out.println("Hang san xuat");
        ArrayList<HangSanXuat> hangSanXuatArrayList= new ArrayList<>();
        hangSanXuatArrayList.add(hangSanXuat.nhapHangSanXuat());
        System.out.println("Nhap nam san xuat");
        int nam= Integer.parseInt(sc.nextLine());
        System.out.println("Nhap chu so huu: ");
        String chuSohuu= sc.nextLine();
        System.out.println("Nhap tai trong(Don vi:tan): ");
        int taiTrong= Integer.parseInt(sc.nextLine());
        XeTai xeTai= new XeTai(bienKiemSoat,hangSanXuatArrayList,nam,chuSohuu,taiTrong);
        xeTaiArrayList.add(xeTai);
    }

    @Override
    public void hienThi() {
        if(xeTaiArrayList.isEmpty()){
            System.out.println("Chua co xe tai duoc them vao!!!");
        }else{
            for(XeTai xeTai: xeTaiArrayList){
                System.out.println( xeTai);
            }
        }

    }

    @Override
    public boolean xoa(String bienSoXe) {
        for(XeTai xeTai: xeTaiArrayList){
            if(xeTai.getBienKiemSoat().equals(bienSoXe)){
                xeTaiArrayList.remove(xeTai);
                return true;
            }
        }
        return false;
    }

    @Override
    public void timKiem(String bienSoXe) {
        for (XeTai xeTai:xeTaiArrayList) {
            if(xeTai.getBienKiemSoat().indexOf(bienSoXe)>=0) {
                System.out.println(xeTai);
            }
        }
    }
}
