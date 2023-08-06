package mypack;

import java.time.LocalDate;

public class PhanCong {
	 // Automatic Properties
    public String maCB;
    public LocalDate ngayDi;
    public String maNV;

    // Constructor
    public PhanCong(String maNV, LocalDate ngayDi, String maCB, LichBay lichbay, NhanVien nhanvien)
    {
        this.maCB = maCB;
        this.maNV = maNV;
        this.ngayDi = ngayDi;
        this.lichbay = lichbay;
        this.nhanvien = nhanvien;
    }

    // Related = Singular
    public LichBay lichbay;
    public NhanVien nhanvien;
    
    // Getter - Setter
    public String getMaCB() {
		return this.maCB;
	}
	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}
	
	public String getMaNV() {
		return this.maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	
	public LocalDate getNgayDi() {
		return this.ngayDi;
	}
	public void setNgayDi(LocalDate ngayDi) {
		this.ngayDi = ngayDi;
	}
	
	public LichBay getLichbay() {
		return this.lichbay;
	}
	public void setLichbay(LichBay lichbay) {
		this.lichbay = lichbay;
	}
	
	public NhanVien getNhanvien() {
		return this.nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
}
