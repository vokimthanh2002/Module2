package quanlyphuongtiengiaothongsss.repository;

import quanlyphuongtiengiaothongsss.model.HangSanXuat;
import quanlyphuongtiengiaothongsss.model.Oto;

import java.util.ArrayList;
import java.util.Scanner;

public class RepositoryOto implements IRepositoryPhuongTien {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Oto> otoArrayList = new ArrayList<>();

    @Override
    public void themMoi() {
        System.out.println("Nhap bien kiem soat: ");
        String bienKiemSoat = sc.nextLine();
        HangSanXuat hangSanXuat = new HangSanXuat();
        System.out.println("Hang san xuat");
        ArrayList<HangSanXuat> hangSanXuatArrayList = new ArrayList<>();
        hangSanXuatArrayList.add(hangSanXuat.nhapHangSanXuat());
        System.out.println("Nhap nam san xuat");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap chu so huu: ");
        String chuSohuu = sc.nextLine();
        System.out.println("Nhap kieu xe: ");
        String kieuXe = sc.nextLine();
        System.out.println("Nhap so cho ngoi: ");
        int soCho = Integer.parseInt(sc.nextLine());
        Oto oto = new Oto(bienKiemSoat, hangSanXuatArrayList, nam, chuSohuu, soCho, kieuXe);
        otoArrayList.add(oto);
    }

    @Override
    public void hienThi() {
        if (otoArrayList.isEmpty()) {
            System.out.println("Chua co xe oto duoc them vao!!!");
        } else {
            for (Oto oto : otoArrayList) {
                System.out.println(oto);
            }
        }

    }

    @Override
    public boolean xoa(String bienSoXe) {
        for(Oto oto: otoArrayList){
            if(oto.getBienKiemSoat().equals(bienSoXe)){
                otoArrayList.remove(oto);
                return true;
            }
        }
        return false;
    }

    @Override
    public void timKiem(String bienSoXe) {
        for (Oto oto: otoArrayList) {
            if(oto.getBienKiemSoat().indexOf(bienSoXe)>=0) {
                System.out.println(oto);
            }
        }

    }

}
