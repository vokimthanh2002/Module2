package quanlyphuongtiengiaothong.model;

import java.util.ArrayList;
import java.util.Objects;

public abstract class PhuongTien  {
    protected String bienKiemSoat;
    protected ArrayList<HangSanXuat> tenHangSX;
    protected int namSX;
    protected String chuSoHuu;

    public PhuongTien(String bienKiemSoat, ArrayList<HangSanXuat> tenHangSX, int namSX, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSX = tenHangSX;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }
    public PhuongTien(){
    }


    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public ArrayList getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(ArrayList<HangSanXuat> tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PhuongTien other = (PhuongTien) obj;
        return Objects.equals(bienKiemSoat, other.bienKiemSoat);
    }

}
