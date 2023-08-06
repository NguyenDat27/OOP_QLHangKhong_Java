package mypack;

import java.util.ArrayList;
import java.util.List;

public class ChuyenBay {
	 // Automatic Properties
    public String maChuyenBay; // Primary Key
    public String sanBayDi;
    public String gioDi;
    public String sanBayDen;
    public String gioDen;

    // Constructor
    public ChuyenBay() { }
    public ChuyenBay(String maChuyenBay, String sanBayDi, String sanBayDen,
    		String gioDi, String gioDen, ArrayList<LichBay> dslichbay_chuyenbay)
    {
        this.maChuyenBay = maChuyenBay;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.gioDi = gioDi;         
        this.gioDen = gioDen;
        this.dslichbay_chuyenbay = dslichbay_chuyenbay;
    }
    public ChuyenBay(ChuyenBay cb)
    {
        this.maChuyenBay = cb.maChuyenBay;
        this.sanBayDi = cb.sanBayDi;
        this.sanBayDen = cb.sanBayDen;
        this.gioDi = cb.gioDi;
        this.gioDen = cb.gioDen;
        this.dslichbay_chuyenbay = cb.dslichbay_chuyenbay;
    }

    // Related = Plural
    public List<LichBay> dslichbay_chuyenbay;

    // Getter - Setter
    public String getMaChuyenBay() {
    	return this.maChuyenBay;
    }
    public void setMaChuyenBay(String maChuyenBay) {
    	this.maChuyenBay = maChuyenBay;
    }
    
    public String getSanBayDi() {
    	return this.sanBayDi;
    }
    public void setSanBayDi(String sanBayDi) {
    	this.sanBayDi = sanBayDi;
    }
    
    public String getSanBayDen() {
    	return this.sanBayDen;
    }
    public void setSanBayDen(String sanBayDen) {
    	this.sanBayDen = sanBayDen;
    }
    
    public String getGioDi() {
    	return this.gioDi;
    }
    public void setGioDi(String gioDi) {
    	this.gioDi = gioDi;
    }
    
    public String getGioDen() {
    	return this.gioDen;
    }
    public void setGioDen(String gioDen) {
    	this.gioDen = gioDen;
    }
    
    public List<LichBay> getDslichbay_chuyenbay() {
    	return this.dslichbay_chuyenbay;
    }
    public void setDslichbay_chuyenbay(List<LichBay> dslichbay_chuyenbay) {
    	this.dslichbay_chuyenbay = dslichbay_chuyenbay;
    }
}

