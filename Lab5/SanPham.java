package Lab5;

import java.math.BigDecimal;

public class SanPham {
    String maSanPham;
    String tenSP;
    BigDecimal donGia;
    int soLuong;
    LoaiSanPham loaiSanPham;

    public SanPham() {}

    public SanPham(String maSanPham, String tenSP, BigDecimal donGia, int soLuong, LoaiSanPham loaiSanPham) {
        this.maSanPham = maSanPham;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.loaiSanPham = loaiSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    //    public void setForeignKey(Object obj) {
//
//    }
//
//    public void setPrimaryKey(Object obj) {
//
//    }
}
