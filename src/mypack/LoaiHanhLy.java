package mypack;

import java.util.ArrayList;
import java.util.List;

enum TenLoaiHanhLy
{
	Xach_Tay,
	Ky_Gui
}
public class LoaiHanhLy 
{
	// Automatic properties
	public String maLHL;
	public TenLoaiHanhLy tenLHL;
	
	// Constructors
	public LoaiHanhLy() { }
	public LoaiHanhLy(LoaiHanhLy LHL)
	{
		this.maLHL = LHL.maLHL;
		this.tenLHL = LHL.tenLHL;
		this.dsHL_LHL = LHL.dsHL_LHL;
	}
	public LoaiHanhLy(String maLHL, TenLoaiHanhLy tenLHL,
			ArrayList<HanhLy> dsHL_LHL)
	{
		this.maLHL = maLHL;
		this.tenLHL = tenLHL;
		this.dsHL_LHL = dsHL_LHL;
	}
	
	// related = plural
	public List<HanhLy> dsHL_LHL;
	
	// getter - setter
	public String getMaLHL()
	{
		return maLHL;
	}
	public void setMaLHL(String maLHL)
	{
		this.maLHL = maLHL;
	}
	public TenLoaiHanhLy getTenLHL()
	{
		return tenLHL;
	}
	public void setTenLHL(TenLoaiHanhLy tenLHL)
	{
		this.tenLHL = tenLHL;
	}
	public List<HanhLy> getDShl_lhl()
	{
		return dsHL_LHL;
	}
	public void setDShl_lhl(List<HanhLy> dsHL_LHL)
	{
		this.dsHL_LHL = dsHL_LHL;
	}
}
