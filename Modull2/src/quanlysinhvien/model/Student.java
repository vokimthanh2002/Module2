package quanlysinhvien.model;
import java.util.Objects;
public class Student extends Person implements Comparable<Student> {
    private String lop;
    private float diemSo;

    public Student(String ma, String ten, String ngaySinh, String gioiTinh, String lop, float diemSo) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.lop = lop;
        this.diemSo = diemSo;
    }

    public Student(String ma){
        this.ma=ma;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(float diemSo) {
        this.diemSo = diemSo;
    }


    @Override
    public String toString() {
        return "Ma: "+ma+ " Ten: "+ten + " Lop: "+lop+ " Ngay sinh: "+ngaySinh+"Gioi tinh: "+gioiTinh+" Diem so: "+diemSo;
    }

    @Override
    public int compareTo(Student o) {
        return this.ma.compareTo(o.ma);
    }
    @Override
    public int hashCode() {
        return Objects.hash(diemSo, ten, ma, ngaySinh);
    }

}
