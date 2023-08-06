package mypack;

public class ChiTietThucDon 
{
	// Automatic properties
	public String maTD;
	public String tenMA;
	public int soLuongMA;
	public int thanhTienMA;
	public String tenTU;
	public int soLuongTU;
	public int thanhTienTU;
	
	//Constructors
	public ChiTietThucDon() { }
	public ChiTietThucDon(ChiTietThucDon CTTD)
	{
		this.maTD = CTTD.maTD;
		this.tenMA = CTTD.tenMA;
		this.soLuongMA = CTTD.soLuongMA;
		this.thanhTienMA = CTTD.thanhTienMA;
		this.tenTU = CTTD.tenTU;
		this.soLuongTU = CTTD.soLuongTU;
		this.thanhTienTU = CTTD.thanhTienTU;
		this.thucdon = CTTD.thucdon;
		this.monan = CTTD.monan;
		this.thucuong = CTTD.thucuong;
	}
	public ChiTietThucDon(String maTD, String tenMA, int soLuongMA,
			int thanhTienMA, String tenTU, int soLuongTU, int thanhTienTU, 
			ThucDon thucdon, MonAn monan, ThucUong thucuong)
	{
		this.maTD = maTD;
		this.tenMA = tenMA;
		this.soLuongMA = soLuongMA;
		this.thanhTienMA = thanhTienMA;
		this.tenTU = tenTU;
		this.soLuongTU = soLuongTU;
		this.thanhTienTU = thanhTienTU;
		this.thucdon = thucdon;
		this.monan = monan;
		this.thucuong = thucuong;
	}
	
	// related = singular
	public ThucDon thucdon;
	public MonAn monan;
	public ThucUong thucuong;
	
	// getter - setter
	public String getMaTD()
	{ 
		return maTD;
	}
	public void setMaTD(String maTD)
	{
		this.maTD = maTD;
	}
	public String getTenMA()
	{
		return tenMA;
	}
	public void setTenMA(String tenMA)
	{
		this.tenMA = tenMA;
	}
	public int getSoLuongMA()
	{
		return soLuongMA;
	}
	public void setSoLuongMA(int soLuongMA)
	{
		this.soLuongMA = soLuongMA;
	}
	public int getThanhTienMA()
	{
		return thanhTienMA;
	}
	public void setThanhTienMA(int thanhTienMA)
	{
		this.thanhTienMA = thanhTienMA;
	}
	public String getTenTU()
	{
		return tenTU;
	}
	public void setTenTU(String tenTU)
	{
		this.tenTU = tenTU;
	}
	public int getSoLuongTU()
	{
		return soLuongTU;
	}
	public void setSoLuongTU(int soLuongTU)
	{
		this.soLuongTU = soLuongTU;
	}
	public int getThanhTienTU()
	{
		return thanhTienTU;
	}
	public void setThanhTienTU(int thanhTienTU)
	{
		this.thanhTienTU = thanhTienTU;
	}
	public ThucDon getThucdon()
	{
		return thucdon;
	}
	public void setThucdon(ThucDon thucdon)
	{
		this.thucdon = thucdon;
	}
	public MonAn getMonan()
	{
		return monan;
	}
	public void setMonan(MonAn monan)
	{
		this.monan = monan;
	}
	public ThucUong getThucuong()
	{
		return thucuong;
	}
	public void setThucuong(ThucUong thucuong)
	{
		this.thucuong = thucuong;
	}
}
