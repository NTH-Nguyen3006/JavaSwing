package Assignment1.dto;

public class Students {
    private String MASV, Hoten, Email, SoDT;
    private boolean Gioitinh;
    private String Diachi, Hinh;

    public Students() {
    }

    public Students(String MASV, String hoten, String email, String soDT, String diachi, String hinh, boolean gioitinh) {
        this.MASV = MASV;
        Hoten = hoten;
        Email = email;
        SoDT = soDT;
        Diachi = diachi;
        Hinh = hinh;
        Gioitinh = gioitinh;
    }

    public String getMASV() {
        return MASV;
    }

    public void setMASV(String MASV) {
        this.MASV = MASV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String soDT) {
        SoDT = soDT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String hinh) {
        Hinh = hinh;
    }

    public boolean isGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        Gioitinh = gioitinh;
    }
}
