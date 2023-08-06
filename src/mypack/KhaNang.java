package mypack;

public class KhaNang {
	 // Automatic Properties
    public String maNV;
    public String maLoai;

    // Constructor
    public KhaNang(String maNV, String maLoai, NhanVien nhanvien, LoaiMayBay loaimaybay)
    {
        this.maNV = maNV;
        this.maLoai = maLoai;
        this.nhanvien = nhanvien;
        this.loaimaybay = loaimaybay;
    }

    // Related = Singular
    public NhanVien nhanvien;
    public LoaiMayBay loaimaybay;
    
    // Getter - Setter
    public String getMaNV() {
    	return this.maNV;
    }
    public void setMaNV(String maNV) {
    	this.maNV = maNV;
    }
    
    public String getMaLoai() {
    	return this.maLoai;
    }
    public void setMaLoai(String maLoai) {
    	this.maLoai = maLoai;
    }
    
    public NhanVien getNhanvien() {
    	return this.nhanvien;
    }
    public void setMaLoai(NhanVien nhanvien) {
    	this.nhanvien = nhanvien;
    }
    
    public LoaiMayBay getLoaimaybay() {
    	return this.loaimaybay;
    }
    public void setLoaimaybay(LoaiMayBay loaimaybay) {
    	this.loaimaybay = loaimaybay;
    }
}
