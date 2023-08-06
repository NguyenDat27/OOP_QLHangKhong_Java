package mypack;

import java.util.ArrayList;
import java.util.List;

public class MayBay {
	
	// Automatic Properties
    public String soHieu; // Primary Key
    public String maLoai; // Primary Key = Foreign Key

    // Constructor
    public MayBay() { }
    public MayBay(String soHieu, String maLoai,
        LoaiMayBay loaimaybay, ArrayList<LichBay> dslichbay_maybay )
    {
        this.soHieu = soHieu;
        this.maLoai = maLoai;         
        this.loaimaybay = loaimaybay;
        this.dslichbay_maybay = dslichbay_maybay;
    }
    public MayBay(MayBay mb)
    {
        this.soHieu = mb.soHieu;
        this.maLoai = mb.maLoai;         
        this.loaimaybay = mb.loaimaybay;
        this.dslichbay_maybay = mb.dslichbay_maybay;
    }

    // Related = Singular
    public LoaiMayBay loaimaybay;
    // Related = Plural
    public List<LichBay> dslichbay_maybay;
    
    // Getter - Setter
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
    
    public LoaiMayBay getLoaimaybay() {
    	return this.loaimaybay;
    }
    public void setLoaimaybay(LoaiMayBay loaimaybay) {
    	this.loaimaybay = loaimaybay;
    }
    
    public List<LichBay> getDslichbay_maybay() {
    	return this.dslichbay_maybay;
    }
    public void setDslichbay_maybay(List<LichBay> dslichbay_maybay) {
    	this.dslichbay_maybay = dslichbay_maybay;
    }
}