package mypack;

public class ThucDon 
{
	// Automatic properties
	public String maTD;
	public int gia;
	public String maKH;
	
	// Constructors
	public ThucDon() { }
	public ThucDon(ThucDon TD)
	{
		this.maTD = TD.maTD;
		this.gia = TD.gia;
		this.maKH = TD.maKH;
		this.KH_TD = TD.KH_TD;
	}
	public ThucDon(String maTD, int gia, String maKH, KhachHang KH_TD)
	{
		this.maTD = maTD;
		this.gia = gia;
		this.maKH = maKH;
		this.KH_TD = KH_TD;
	}
	
	// related = singular
	public KhachHang KH_TD;
	
	// getter - setter
	public String getMaTD()
	{
		return maTD;
	}
	public void setMaTD(String maTD)
	{
		this.maTD = maTD;
	}
	public int getGia()
	{
		return gia;
	}
	public void setGia(int gia)
	{
		this.gia = gia;
	}
	public String getMaKH()
	{
		return maKH;
	}
	public void setMaKH(String maKH)
	{
		this.maKH = maKH;
	}
	public KhachHang getKH_TD()
	{
		return KH_TD;
	}
	public void setKH_TD(KhachHang KH_TD)
	{
		this.KH_TD = KH_TD;
	}
}
