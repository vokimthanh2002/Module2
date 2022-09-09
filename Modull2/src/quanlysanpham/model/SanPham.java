package quanlysanpham.model;

import java.util.Objects;

public class SanPham implements Comparable<SanPham> {
    private int id;
    private String ten;
    private float gia;

    public SanPham(int id, String ten, float gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }
    public SanPham(){
        
    }
    public SanPham(int id){
        this.id= id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SanPham other = (SanPham) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ten, gia);
    }

    @Override
    public int compareTo(SanPham o) {
        return (int) (this.gia-o.gia);
    }
}
