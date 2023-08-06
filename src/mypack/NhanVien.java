package mypack;

public class NhanVien {

	// Automatic Properties
	public String maNV; // Primary Key
	public String tenNV;
	public String diaChi;
	public double Luong;
	public String soDT;
	public String maNhom; // Foreign Key

	// Constructor
	public NhanVien() {
	}

	public NhanVien(String maNV, String tenNV, String diaChi, double Luong, 
			String soDT, String maNhom, NhomNhanVien nhomnhanvien) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.diaChi = diaChi;
		this.Luong = Luong;
		this.soDT = soDT;
		this.maNhom = maNhom;
		this.nhomnhanvien = nhomnhanvien;
	}

	public NhanVien(NhanVien nv) {
		this.maNV = nv.maNV;
		this.tenNV = nv.tenNV;
		this.diaChi = nv.diaChi;
		this.Luong = nv.Luong;
		this.soDT = nv.soDT;
		this.maNhom = nv.maNhom;
		this.nhomnhanvien = nv.nhomnhanvien;
	}

	// Related = Singular
	public NhomNhanVien nhomnhanvien;
	
	// Getter - Setter
	public String getMaNV() {
		return this.maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	
	public String getTenNV() {
		return this.tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	
	public String getDiaChi() {
		return this.diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public double getLuong() {
		return this.Luong;
	}
	public void setLuong(double Luong) {
		this.Luong = Luong;
	}
	
	public String getSoDT() {
		return this.soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	
	public String getMaNhom() {
		return this.maNhom;
	}
	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}
	
	public NhomNhanVien getNhomnhanvien() {
		return this.nhomnhanvien;
	}
	public void setNhomnhanvien(NhomNhanVien nhomnhanvien) {
		this.nhomnhanvien = nhomnhanvien;
	}
}
