package quanlyphuongtiengiaothong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<XeTai> xeTaiList= new ArrayList();
    public static ArrayList<XeMay> xeMayList= new ArrayList();
    public static ArrayList<Oto> oToList= new ArrayList();
    public static   Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int choose;
        do {
            System.out.println("-----CHUONG TRINH QUAN LY PHUONG TIEN GIAO THONG-----");
            System.out.println("1.  Thêm mới phương tiện.");
            System.out.println("2.  Hiện thị phương tiện.");
            System.out.println("3.  Xóa phương tiện.");
            System.out.println("4.  Tìm kiếm theo biển kiểm soát.");
            System.out.println("5. Hien thi danh sach tat ca cac xe: ");
            System.out.println("6. Thoát.");
            System.out.println("Chon chuc nang thuc hien: ");
            choose= Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1->
                        themMoiPhuongTien();
                case 2->
                        hienThiPhuongTien();
                case 3->
                        xoaPhuongTien();
                case 4->
                        timKiemTheoBienSoXe();
                case 5->
                        hienThiTatCa();
                case 6->
                        System.exit(0);
            }
        }while (choose!=0);
    }
    public static void themMoiPhuongTien(){
        System.out.println("1. Them xe tai");
        System.out.println("2. Them o to");
        System.out.println("3. Them xe may");
        System.out.println("Nhap phuong tien can them vao");
        int choose= Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1->
                nhapXeTai();
            case 2->
                nhapOto();
            case 3->
                nhapXeMay();
        }
    }

    private static void nhapXeMay() {
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
        System.out.println("Nhap cong xuat: ");
        float congXuat = Float.parseFloat(sc.nextLine());
        XeMay xeMay= new XeMay(bienKiemSoat,hangSanXuatArrayList,nam,chuSohuu,congXuat);
        xeMayList.add(xeMay);
    }

    private static void nhapOto() {
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
        System.out.println("Nhap kieu xe: ");
        String kieuXe = sc.nextLine();
        System.out.println("Nhap so cho ngoi: ");
        int soCho= Integer.parseInt(sc.nextLine());
        Oto oto= new Oto(bienKiemSoat,hangSanXuatArrayList,nam,chuSohuu,soCho,kieuXe);
        oToList.add(oto);
    }

    private static void nhapXeTai() {
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
        xeTaiList.add(xeTai);
    }

    public static void hienThiPhuongTien(){
        System.out.println("1. Hien thi danh sach xe tai");
        System.out.println("2. Hien thi danh sach o to");
        System.out.println("3. Hien thi danh sach xe may");
        System.out.println("Nhap phuong tien can hien thi: ");
        int choose= Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1->{
                if(xeTaiList.isEmpty()){
                    System.out.println("Chua co xe may duoc them vao!!!");
                }else{
                    for(int i=0; i<xeTaiList.size();i++){
                        System.out.println( xeTaiList.get(i));
                    }
                }
            }
            case 2->{
                if(oToList.isEmpty()){
                    System.out.println("Chua co xe may duoc them vao!!!");
                }else{
                    for(int i=0; i<oToList.size();i++){
                        System.out.println( oToList.get(i));
                    }
                }
            }
            case 3->{
                if(xeMayList.isEmpty()){
                    System.out.println("Chua co xe may duoc them vao!!!");
                }else{
                    for(int i=0; i<xeMayList.size();i++){
                        System.out.println( xeMayList.get(i));
                    }
                }
            }
        }
    }
    public static void hienThiTatCa(){
        if(oToList.isEmpty() && xeMayList.isEmpty() && xeTaiList.isEmpty()){
            System.out.println("Chua co xe nao trong danh sach!!!");
        }else{
            System.out.println("Danh sach xe tai: ");
            for(int i=0; i<xeTaiList.size();i++){
                System.out.println( xeTaiList.get(i));;
            }
            System.out.println("Danh sach xe oto: ");
            for(int i=0; i<oToList.size();i++){
                System.out.println( oToList.get(i));;
            }
            System.out.println("Danh sach xe  may");
            for(int i=0; i<xeMayList.size();i++){
                System.out.println( xeMayList.get(i));;
            }

        }
    }
    public static void xoaPhuongTien(){
        System.out.println("Nhap vao bien kiem soat can xoa: ");
        String bienXoa= sc.nextLine();
        if(oToList.isEmpty() && xeMayList.isEmpty() && xeTaiList.isEmpty()){
            System.out.println("Chua co xe nao trong danh sach!!!");
        }else{
            Oto oto= new Oto(bienXoa);
            XeMay xeMay= new XeMay(bienXoa);
            XeTai xeTai= new XeTai(bienXoa);
            if(oToList.contains(oto) || xeMayList.contains(xeMay)|| xeTaiList.contains(xeTai)){
                System.out.println("lua chon: ");
                System.out.println("1. Yes ");
                System.out.println("2. No ");
                int choose= Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1->{
                        xeMayList.remove(xeMay);
                        oToList.remove(oto);
                        xeTaiList.remove(xeTai);
                        System.out.println("Ban da xoa thanh cong !!!");
                    }
                    case 2->
                            System.out.println("Ban chua xac nhan xoa!!!");
                }

            }else{
                System.out.println("Bien so xe khong ton tai!!");
            }
        }
    }
    public static void timKiemTheoBienSoXe() {
        System.out.println("Nhap vao bien so xe can tim kiem: ");
        String bienTim = sc.nextLine();
        if (oToList.isEmpty() && xeMayList.isEmpty() && xeTaiList.isEmpty()) {
            System.out.println("Chua co xe nao trong danh sach!!!");
        } else {
            Oto oto= new Oto(bienTim);
            XeTai xeTai= new XeTai(bienTim);
            XeMay xeMay= new XeMay(bienTim);
            if(oToList.contains(oto)){
                for(Oto oto1: oToList){
                    if(oto1.getBienKiemSoat().equals(bienTim)){
                        System.out.println(oto1);
                    }
                }
            }else if(xeMayList.contains(xeMay)){
                for(XeMay xeMay1: xeMayList){
                    if(xeMay1.getBienKiemSoat().equals(bienTim)){
                        System.out.println(xeMay1);
                    }
                }
            }else if(xeTaiList.contains(xeTai)){
                for(XeTai xeTai1: xeTaiList){
                    if(xeTai1.getBienKiemSoat().equals(bienTim)){
                        System.out.println(xeTai1);
                    }
                }
            }else{
                System.out.println("Khong tim thay bien so xe!!!");
            }
        }
    }
}