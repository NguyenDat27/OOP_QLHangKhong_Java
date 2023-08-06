package mypack;

import java.util.ArrayList;
import java.util.List;

public class KhachHang 
{
	// Automatic Properties
	public String maKH;
	public String tenKH;
	public String diaChi;
	public String soDienThoai;
	
	// Constructors
	public KhachHang() { }
	public KhachHang(KhachHang KH)
	{
		this.maKH = KH.maKH;
		this.tenKH = KH.tenKH;
		this.diaChi = KH.diaChi;
		this.soDienThoai = KH.soDienThoai;
		this.ds_hanhly = KH.ds_hanhly;
	}
	public KhachHang(String maKH, String tenKH, String diaChi,
			String soDienThoai, ArrayList<HanhLy> ds_hanhly)
	{
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.ds_hanhly = ds_hanhly;
	}
	
	// related = plural
	public List<HanhLy> ds_hanhly;
	
	// getter -setter
	public String getMaKH()
	{
		return maKH;
	}
	public void setMaKH(String maKH)
	{
		this.maKH = maKH;
	}
	public String getTenKH()
	{
		return tenKH;
	}
	public void setTenKH(String tenKH)
	{
		this.tenKH = tenKH;
	}
	public String getDiaChi()
	{
		return diaChi;
	}
	public void setDiaChi(String diaChi)
	{
		this.diaChi = diaChi;
	}
	public String getSoDienThoai()
	{
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai)
	{
		this.soDienThoai = soDienThoai;
	}
	public List<HanhLy> getDS_hanhly()
	{
		return ds_hanhly;
	}
	public void setDS_hanhly(List<HanhLy> ds_hanhly)
	{
		this.ds_hanhly = ds_hanhly;
	}
}
