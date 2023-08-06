package mypack;

import java.util.ArrayList;
import java.util.List;

public class LoaiMayBay {
	
	// Automatic Properties
    public String maLoai; // Primary Key
    public String hangSX;

    // Constructor
    public LoaiMayBay() { }
    public LoaiMayBay(String maLoai, String hangSX, ArrayList<MayBay> dsmaybay_loai)
    {
        this.maLoai = maLoai;
        this.hangSX = hangSX;
        this.dsmaybay_loai = dsmaybay_loai;
    }
    public LoaiMayBay(LoaiMayBay lmb)
    {
        this.maLoai = lmb.maLoai;
        this.hangSX = lmb.hangSX;
        this.dsmaybay_loai = lmb.dsmaybay_loai;
    }

    // Related = Plural
    public List<MayBay> dsmaybay_loai;
    
    // Getter - Setter
    public String getMaLoai() {
    	return this.maLoai;
    }
    public void setMaLoai(String maLoai) {
    	this.maLoai = maLoai;
    }
    
    public String getHangSX() {
    	return this.hangSX;
    }
    public void setHangSX(String hangSX) {
    	this.hangSX = hangSX;
    }
    
    public List<MayBay> getDsmaybay_loai() {
    	return this.dsmaybay_loai;
    }
    public void setDsmaybay_loai(List<MayBay> dsmaybay_loai) {
    	this.dsmaybay_loai = dsmaybay_loai;
    }
}

