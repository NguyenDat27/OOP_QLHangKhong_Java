package mypack;

import java.time.LocalDate;

public class DatCho 
{
	// Automatic properties
	public String maKH;
	public LocalDate ngayDi;
	public String maChuyenBay;
	
	// Constructors
	public DatCho() { }
	public DatCho(DatCho DC)
	{
		this.maKH = DC.maKH;
		this.ngayDi = DC.ngayDi;
		this.maChuyenBay = DC.maChuyenBay;
		this.lichbay = DC.lichbay;
		this.khachhang = DC.khachhang;
	}
	public DatCho(String maKH, LocalDate ngayDi, String maChuyenBay,
			LichBay lichbay, KhachHang khachhang)
	{
		this.maKH = maKH;
		this.ngayDi = ngayDi;
		this.maChuyenBay = maChuyenBay;
		this.lichbay = lichbay;
		this.khachhang = khachhang;
	}
	
	// related = singular
	public LichBay lichbay;
	public KhachHang khachhang;
	
	// getter - setter
	public String getmaKH()
	{
		return maKH;
	}
	public void setmaKH(String maKH)
	{
		this.maKH = maKH;
	}
	public LocalDate getNgayDi()
	{
		return ngayDi;
	}
	public void setNgayDi(LocalDate ngayDi)
	{
		this.ngayDi = ngayDi;
	}
	public String getMaChuyenBay()
	{
		return maChuyenBay;
	}
	public void setMaChuyenBay(String maChuyenBay)
	{
		this.maChuyenBay = maChuyenBay;
	}
	public LichBay getlichBay()
	{
		return lichbay;
	}
	public void setlichBay(LichBay lichbay)
	{
		this.lichbay = lichbay;
	}
	public KhachHang getkhachHang()
	{
		return khachhang;
	}
	public void setkhachHang(KhachHang khachhang)
	{
		this.khachhang = khachhang;
	}
}
