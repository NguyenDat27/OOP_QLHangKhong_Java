package mypack;

import java.util.ArrayList;
import java.util.List;

enum Loai2
{
	Nuoc_uong_co_gas,
	Nuoc_uong_khong_gas,
	Nuoc_ep,
	Nuoc_khoang
}

public class LoaiThucUong
{
	// Automatic properties
	public Loai2 tenLoaiTU;
	public int Min2;
	public int Max2;
	
	// Constructors
	public LoaiThucUong() { }
	public LoaiThucUong(LoaiThucUong LTU)
	{
		this.tenLoaiTU = LTU.tenLoaiTU;
		this.Min2 = LTU.Min2;
		this.Max2 = LTU.Max2;
		this.dsTU_LTU = LTU.dsTU_LTU;
	}
	public LoaiThucUong(Loai2 tenLoaiTU, int Min2, int Max2,
			ArrayList<ThucUong> dsTU_LTU)
	{
		this.tenLoaiTU = tenLoaiTU;
		this.Min2 = Min2;
		this.Max2 = Max2;
		this.dsTU_LTU = dsTU_LTU;
	}
	
	// related - plural
	public List<ThucUong> dsTU_LTU;
	
	// getter - setter
	public Loai2 getTenLoaiTU()
	{
		return tenLoaiTU;
	}
	public void setTenLoaiTU(Loai2 tenLoaiTU)
	{
		this.tenLoaiTU = tenLoaiTU;
	}
	public int getMin2()
	{
		return Min2;
	}
	public void setMin2(int Min2)
	{
		this.Min2 = Min2;
	}
	public int getMax2()
	{
		return Max2;
	}
	public void setMax2(int Max2)
	{
		this.Max2 = Max2;
	}
	public List<ThucUong> getDStu_ltu()
	{
		return dsTU_LTU;
	}
	public void setDStu_ltu(List<ThucUong> dsTU_LTU)
	{
		this.dsTU_LTU = dsTU_LTU;
	}
}
