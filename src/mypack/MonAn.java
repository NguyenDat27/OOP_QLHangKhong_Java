package mypack;

public class MonAn
{
	// Automatic properties
	public String tenMA;
	public int donGia;
	public Loai1 loaiMA;
	
	// Constructors
	public MonAn() { }
	public MonAn(MonAn MA)
	{
		this.tenMA = MA.tenMA;
		this.donGia = MA.donGia;
		this.loaiMA = MA.loaiMA;
		this.LMA_MA = MA.LMA_MA;
	}
	public MonAn(String tenMA, int donGia, Loai1 loaiMA,
			LoaiMonAn LMA_MA)
	{
		this.tenMA = tenMA;
		this.donGia = donGia;
		this.loaiMA = loaiMA;
		this.LMA_MA = LMA_MA;
	}
	
	// related singular
	public LoaiMonAn LMA_MA;
	
	// getter - setter
	public String getTenMA()
	{
		return tenMA;
	}
	public void setTenMA(String tenMA)
	{
		this.tenMA = tenMA;
	}
	public int getDonGia()
	{
		return donGia;
	}
	public void setDonGia(int donGia)
	{
		this.donGia = donGia;
	}
	public Loai1 getLoaiMA()
	{
		return loaiMA;
	}
	public void setLoaiMA(Loai1 loaiMA)
	{
		this.loaiMA = loaiMA;
	}
	public LoaiMonAn getLMA_MA()
	{
		return LMA_MA;
	}
	public void setLMA_MA(LoaiMonAn LMA_MA)
	{
		this.LMA_MA = LMA_MA;
	}
}
