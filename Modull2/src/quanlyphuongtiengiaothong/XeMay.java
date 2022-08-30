package quanlyphuongtiengiaothong;

import java.util.ArrayList;

public class XeMay extends PhuongTien{
   private float congXuat;

    public XeMay(String bienKiemSoat, ArrayList<HangSanXuat> tenHangSX, int namSX, String chuSoHuu, float congXuat) {
        super(bienKiemSoat, tenHangSX, namSX, chuSoHuu);
        this.congXuat = congXuat;
    }
    public XeMay(String bienKiemSoat){
        this.bienKiemSoat=bienKiemSoat;
    }

    public XeMay(float congXuat) {
        this.congXuat = congXuat;
    }

    public float getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(float congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congXuat=" + congXuat +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
