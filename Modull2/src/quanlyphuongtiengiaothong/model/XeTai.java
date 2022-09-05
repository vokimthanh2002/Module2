package quanlyphuongtiengiaothong.model;

import java.util.ArrayList;

public class XeTai extends PhuongTien{
    private int trongTai;

    public XeTai(String bienKiemSoat, ArrayList<HangSanXuat> tenHangSX, int namSX, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSX, namSX, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }
    public XeTai(String bienKiemSoat){
        this.bienKiemSoat=bienKiemSoat;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                ", bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
