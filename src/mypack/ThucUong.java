package mypack;

public class ThucUong 
{
	// Automatic properties
	public String tenTU;
	public int donGia;
	public Loai2 loaiTU;
	
	// Constructors
	public ThucUong() { }
	public ThucUong(ThucUong TU)
	{
		this.tenTU = TU.tenTU;
		this.donGia = TU.donGia;
		this.loaiTU = TU.loaiTU;
		this.LTU_TU = TU.LTU_TU;
	}
	public ThucUong(String tenTU, int donGia, Loai2 loaiTU,
			LoaiThucUong LTU_TU)
	{
		this.tenTU = tenTU;
		this.donGia = donGia;
		this.loaiTU = loaiTU;
		this.LTU_TU = LTU_TU;
	}
	
	// related = singular
	public LoaiThucUong LTU_TU;
	
	// getter - setter
	public String getTenTU()
	{
		return tenTU;
	}
	public void setTenTU(String tenTU)
	{
		this.tenTU = tenTU;
	}
	public int getDonGia()
	{
		return donGia;
	}
	public void setDonGia(int donGia)
	{
		this.donGia = donGia;
	}
	public Loai2 getLoaiTU()
	{
		return loaiTU;
	}
	public void setLoaiTU(Loai2 loaiTU)
	{
		this.loaiTU = loaiTU;
	}
	public LoaiThucUong getLTU_TU()
	{
		return LTU_TU;
	}
	public void setLTU_TU(LoaiThucUong LTU_TU)
	{
		this.LTU_TU = LTU_TU;
	}
	
}
