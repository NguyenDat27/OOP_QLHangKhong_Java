package mypack;

import java.util.ArrayList;
import java.util.List;

public class NhomNhanVien {
	// Automatic Properties
	public String maNhom; // Primary Key
	public String tenNhom;
	public String congViec;
	public String maTruongNhom;

	// Constructor
	public NhomNhanVien() {
	}

	public NhomNhanVien(String maNhom, String tenNhom, String congViec, 
			ArrayList<NhanVien> dsnhanvien_nhom) {
		this.maNhom = maNhom;
		this.tenNhom = tenNhom;
		this.congViec = congViec;
		this.dsnhanvien_nhom = dsnhanvien_nhom;
	}

	public NhomNhanVien(NhomNhanVien nhom_nv) {
		this.maNhom = nhom_nv.maNhom;
		this.tenNhom = nhom_nv.tenNhom;
		this.congViec = nhom_nv.congViec;
		this.dsnhanvien_nhom = nhom_nv.dsnhanvien_nhom;
	}

	// Related - Plural
	public List<NhanVien> dsnhanvien_nhom;
	public NhanVien truongnhom;
	
	// Getter - Setter
	public String getMaNhom() {
		return this.maNhom;
	}
	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}

	public String getTenNhom() {
		return this.tenNhom;
	}
	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}
	
	public List<NhanVien> getDsnhanvien_nhom() {
		return this.dsnhanvien_nhom;
	}
	public void setDsnhanvien_nhom(List<NhanVien> dsnhanvien_nhom) {
		this.dsnhanvien_nhom = dsnhanvien_nhom;
	}
	
	public String getCongViec() {
		return this.congViec;
	}
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
}
