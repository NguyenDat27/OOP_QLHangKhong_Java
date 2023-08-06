package mypack;

import java.time.LocalDate;

public class LichBay {
	 // Automatic Properties
    public String maChuyenBay; // Primary Key = Foreign Key
    public LocalDate ngayDi; // Primary Key
    public String soHieu;
    public String maLoai; // Foreign Key

    // Constructor
    public LichBay() { }
    public LichBay(LocalDate ngayDi, String maChuyenBay, String soHieu, String maLoai,
        ChuyenBay chuyenbay, MayBay maybay)
    {
        this.ngayDi = ngayDi;
        this.maChuyenBay = maChuyenBay;          
        this.soHieu = soHieu;
        this.maLoai = maLoai;
        this.chuyenbay = chuyenbay;
        this.maybay = maybay;
    }
    public LichBay(LichBay lb)
    {
        this.ngayDi = lb.ngayDi;
        this.maChuyenBay = lb.maChuyenBay;         
        this.soHieu = lb.soHieu;
        this.maLoai = lb.maLoai;
        this.chuyenbay = lb.chuyenbay;
        this.maybay = lb.maybay;
    }

    // Related = Single
    public ChuyenBay chuyenbay;
    public MayBay maybay;
    
    // Getter - Setter
    public LocalDate getNgayDi() {
    	return this.ngayDi;
    }
    public void setNgayDi(LocalDate ngayDi) {
    	this.ngayDi = ngayDi;
    }
    
    public String getMaChuyenBay() {
    	return this.maChuyenBay;
    }
    public void setMaChuyenBay(String maChuyenBay) {
    	this.maChuyenBay = maChuyenBay;
    }
    
    public String getSoHieu() {
    	return this.soHieu;
    }
    public void setSoHieu(String soHieu) {
    	this.soHieu = soHieu;
    }
    
    public String getMaLoai() {
    	return this.maLoai;
    }
    public void setMaLoai(String maLoai) {
    	this.maLoai = maLoai;
    }
    
    public ChuyenBay getChuyenbay() {
    	return this.chuyenbay;
    }
    public void setChuyenbay(ChuyenBay chuyenbay) {
    	this.chuyenbay = chuyenbay;
    }
    
    public MayBay getMaybay() {
    	return this.maybay;
    }
    public void setMaybay(MayBay maybay) {
    	this.maybay = maybay;
    }
}
