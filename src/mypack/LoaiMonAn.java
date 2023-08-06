package mypack;

import java.util.ArrayList;
import java.util.List;

enum Loai1
{
	Trang_mieng,
	Thuc_an_nhanh,
	Do_man,
	Do_chay
}

public class LoaiMonAn 
{
	// Automatic properties
	public Loai1 tenLoaiMA;
	public int Min1;
	public int Max1;
	
	// Constructors
	public LoaiMonAn() { }
	public LoaiMonAn(LoaiMonAn LMA)
	{
		this.tenLoaiMA = LMA.tenLoaiMA;
		this.Min1 = LMA.Min1;
		this.Max1 = LMA.Max1;
		this.dsMA_LMA = LMA.dsMA_LMA;
	}
	public LoaiMonAn(Loai1 tenLoaiMA, int Min1, int Max1,
			ArrayList<MonAn> dsMA_LMA)
	{
		this.tenLoaiMA = tenLoaiMA;
		this.Min1 = Min1;
		this.Max1 = Max1;
		this.dsMA_LMA = dsMA_LMA;
	}
	
	// related - plural
	public List<MonAn> dsMA_LMA;
	
	// getter - setter
	public Loai1 getTenLoaiMA()
	{
		return tenLoaiMA;
	}
	public void setTenLoaiMA(Loai1 tenLoaiMA)
	{
		this.tenLoaiMA = tenLoaiMA;
	}
	public int getMin1()
	{
		return Min1;
	}
	public void setMin1(int Min1)
	{
		this.Min1 = Min1;
	}
	public int getMax1()
	{
		return Max1;
	}
	public void setMax1(int Max1)
	{
		this.Max1 = Max1;
	}
	public List<MonAn> getDSma_lma()
	{
		return dsMA_LMA;
	}
	public void setDSma_lma(List<MonAn> dsMA_LMA)
	{
		this.dsMA_LMA = dsMA_LMA;
	}
}
