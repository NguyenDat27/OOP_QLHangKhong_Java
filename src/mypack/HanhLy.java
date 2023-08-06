package mypack;

public class HanhLy 
{
	// Automatic properties
	public String maHL;
	public double trongLuong;
	public String maKH;
	public String maLHL;
	// Constructors
	public HanhLy() { }
	public HanhLy(HanhLy HL)
	{
		this.maHL = HL.maHL;
		this.trongLuong = HL.trongLuong;
		this.maKH = HL.maKH;
		this.maLHL = HL.maLHL;
		this.KH_HL = HL.KH_HL;
		this.LHL_HL = HL.LHL_HL;
	}
	public HanhLy(String maHL, double trongLuong, String maKH, 
			String maLHL, KhachHang KH_HL, LoaiHanhLy LHL_HL)
	{
		this.maHL = maHL;
		this.trongLuong = trongLuong;
		this.maKH = maKH;
		this.maLHL = maLHL;
		this.KH_HL = KH_HL;
		this.LHL_HL = LHL_HL;
	}
	
	// related = singular
	public KhachHang KH_HL;
	public LoaiHanhLy LHL_HL;
	
	// getter - setter
	public String getMaHL()
	{
		return maHL;
	}
	public void setMaHL(String maHL)
	{
		this.maHL = maHL;
	}
	public double getTrongLuong()
	{
		return trongLuong;
	}
	public void setTrongLuong(double trongLuong)
	{
		this.trongLuong = trongLuong;
	}
	public String getMaKH()
	{
		return maKH;
	}
	public void setMaKH(String maKH)
	{
		this.maKH = maKH;
	}
	public String getMaLHL()
	{
		return maLHL;
	}
	public void setMaLHL(String maLHL)
	{
		this.maLHL = maLHL;
	}
	public KhachHang getKH_HL()
	{
		return KH_HL;
	}
	public void setKH_HL(KhachHang KH_HL)
	{
		this.KH_HL = KH_HL;
	}
	public LoaiHanhLy getLHL_HL()
	{
		return LHL_HL;
	}
	public void setLHL_HL(LoaiHanhLy LHL_HL)
	{
		this.LHL_HL = LHL_HL;
	}
}
