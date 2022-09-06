package quanlysinhvienvagiaoviensss.model;

import java.util.Objects;

public class Teacher extends Person implements Comparable<Teacher> {
    private String chuyenMon;

    public Teacher(String ma, String ten, String ngaySinh, String gioiTinh, String chuyenMon) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    public Teacher(String ma) {
        this.ma = ma;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "chuyenMon='" + chuyenMon + '\'' +
                ", ma=" + ma +
                ", ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(chuyenMon, ten, ma, ngaySinh);
    }
    @Override
    public int compareTo(Teacher o) {
        return this.ma.compareTo(o.ma);
    }
}
