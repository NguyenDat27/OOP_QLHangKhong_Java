package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Map;
import java.util.Objects;

public class QuanLy 
{
	// Data
	public static List<KhachHang> dsKhachHang = new ArrayList<KhachHang>();
	public static List<LoaiHanhLy> dsLoaiHanhLy = new ArrayList<LoaiHanhLy>();
	public static List<HanhLy> dsHanhLy = new ArrayList<HanhLy>();
	public static List<ThucDon> dsThucDon = new ArrayList<ThucDon>();
	public static List<LoaiMonAn> dsLoaiMonAn = new ArrayList<LoaiMonAn>();
	public static List<MonAn> dsMonAn = new ArrayList<MonAn>();
	public static List<LoaiThucUong> dsLoaiThucUong = new ArrayList<LoaiThucUong>();
	public static List<ThucUong> dsThucUong = new ArrayList<ThucUong>();
	public static List<ChiTietThucDon> dsChiTietThucDon = new ArrayList<ChiTietThucDon>();
	public static List<NhomNhanVien> dsNhomNhanVien = new ArrayList<NhomNhanVien>();
	public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
	public static List<LoaiMayBay> dsLoaiMayBay = new ArrayList<LoaiMayBay>();
	public static List<MayBay> dsMayBay = new ArrayList<MayBay>();
	public static List<ChuyenBay> dsChuyenBay = new ArrayList<ChuyenBay>();
	public static List<LichBay> dsLichBay = new ArrayList<LichBay>();
	public static List<PhanCong> dsPhanCong = new ArrayList<PhanCong>();
	public static List<KhaNang> dsKhaNang = new ArrayList<KhaNang>();
	public static List<DatCho> dsDatCho = new ArrayList<DatCho>();

	public static void taoDSkhachhang()
	{
		dsKhachHang.add(new KhachHang("0009", "Nga", "223 Nguyen Trai", "8932220",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0101", "Anh", "567 Tran Phu", "8826729",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0045", "Thu", "285 Le Loi", "8932203",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0012", "Ha", "435 Quang Trung", "8933232",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0238", "Hung", "456 Pasteur", "9812101",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0397", "Thanh", "234 Le Van Sy", "8952943",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0582", "Mai", "789 Nguyen Du", "NULL",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0934", "Minh", "678 Le Lai", "NULL",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0091", "Hai", "345 Hung Vuong", "8893223",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0314", "Phuong", "385 Vo Van Tuan", "8232320",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0613", "Vu", "348 CMT8", "8343232",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0586", "Son", "123 Bach Dang", "8556223",
				new ArrayList<HanhLy>()));
		dsKhachHang.add(new KhachHang("0422", "Tien", "75 Nguyen Thong", "8332222",
				new ArrayList<HanhLy>()));
	}

	public static void taoDSloaihanhly()
	{
		dsLoaiHanhLy.add(new LoaiHanhLy("MLHL01", TenLoaiHanhLy.Xach_Tay, new ArrayList<HanhLy>()));
		dsLoaiHanhLy.add(new LoaiHanhLy("MLHL02", TenLoaiHanhLy.Ky_Gui, new ArrayList<HanhLy>()));
	}

	public static void taoDShanhly()
	{
		dsHanhLy.add(new HanhLy("HL01", 18.0, dsKhachHang.get(0).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(0), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL02", 19.0, dsKhachHang.get(1).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(1), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL03", 11.0, dsKhachHang.get(2).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(2), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL04", 12.0, dsKhachHang.get(3).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(3), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL05", 5.0, dsKhachHang.get(3).maKH, dsLoaiHanhLy.get(0).maLHL, dsKhachHang.get(3), dsLoaiHanhLy.get(0)));
		dsHanhLy.add(new HanhLy("HL06", 7.0, dsKhachHang.get(4).maKH, dsLoaiHanhLy.get(0).maLHL, dsKhachHang.get(4), dsLoaiHanhLy.get(0)));
		dsHanhLy.add(new HanhLy("HL07", 32.0, dsKhachHang.get(4).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(4), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL08", 23.0, dsKhachHang.get(5).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(5), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL09", 30.0, dsKhachHang.get(6).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(6), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL10", 22.0, dsKhachHang.get(7).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(7), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL11", 7.0, dsKhachHang.get(8).maKH, dsLoaiHanhLy.get(0).maLHL, dsKhachHang.get(8), dsLoaiHanhLy.get(0)));
		dsHanhLy.add(new HanhLy("HL12", 9.0, dsKhachHang.get(9).maKH, dsLoaiHanhLy.get(0).maLHL, dsKhachHang.get(9), dsLoaiHanhLy.get(0)));
		dsHanhLy.add(new HanhLy("HL13", 17.0, dsKhachHang.get(9).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(9), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL14", 35.0, dsKhachHang.get(10).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(10), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL15", 19.0, dsKhachHang.get(11).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(11), dsLoaiHanhLy.get(1)));
		dsHanhLy.add(new HanhLy("HL16", 3.0, dsKhachHang.get(12).maKH, dsLoaiHanhLy.get(0).maLHL, dsKhachHang.get(12), dsLoaiHanhLy.get(0)));
		dsHanhLy.add(new HanhLy("HL17", 25.0, dsKhachHang.get(12).maKH, dsLoaiHanhLy.get(1).maLHL, dsKhachHang.get(12), dsLoaiHanhLy.get(1)));

		//Nhom Loai Hanh Ly
		dsLoaiHanhLy.get(0).dsHL_LHL.add(dsHanhLy.get(4));
		dsLoaiHanhLy.get(0).dsHL_LHL.add(dsHanhLy.get(5));
		dsLoaiHanhLy.get(0).dsHL_LHL.add(dsHanhLy.get(10));
		dsLoaiHanhLy.get(0).dsHL_LHL.add(dsHanhLy.get(11));
		dsLoaiHanhLy.get(0).dsHL_LHL.add(dsHanhLy.get(15));

		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(0));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(1));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(2));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(3));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(6));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(7));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(8));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(9));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(12));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(13));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(14));
		dsLoaiHanhLy.get(1).dsHL_LHL.add(dsHanhLy.get(16));

		// Nhom Khach Hang
		dsKhachHang.get(0).ds_hanhly.add(dsHanhLy.get(0));

		dsKhachHang.get(1).ds_hanhly.add(dsHanhLy.get(1));

		dsKhachHang.get(2).ds_hanhly.add(dsHanhLy.get(2));

		dsKhachHang.get(3).ds_hanhly.add(dsHanhLy.get(3));
		dsKhachHang.get(3).ds_hanhly.add(dsHanhLy.get(4));

		dsKhachHang.get(4).ds_hanhly.add(dsHanhLy.get(5));
		dsKhachHang.get(4).ds_hanhly.add(dsHanhLy.get(6));

		dsKhachHang.get(5).ds_hanhly.add(dsHanhLy.get(7));

		dsKhachHang.get(6).ds_hanhly.add(dsHanhLy.get(8));

		dsKhachHang.get(7).ds_hanhly.add(dsHanhLy.get(9));

		dsKhachHang.get(8).ds_hanhly.add(dsHanhLy.get(10));

		dsKhachHang.get(9).ds_hanhly.add(dsHanhLy.get(11));
		dsKhachHang.get(9).ds_hanhly.add(dsHanhLy.get(12));

		dsKhachHang.get(10).ds_hanhly.add(dsHanhLy.get(13));

		dsKhachHang.get(11).ds_hanhly.add(dsHanhLy.get(14));

		dsKhachHang.get(12).ds_hanhly.add(dsHanhLy.get(15));
		dsKhachHang.get(12).ds_hanhly.add(dsHanhLy.get(16));
	}

	public static void taoDSthucdon()
	{
		dsThucDon.add(new ThucDon("TD01", 65000, dsKhachHang.get(0).maKH, dsKhachHang.get(0)));
		dsThucDon.add(new ThucDon("TD02", 135000, dsKhachHang.get(1).maKH, dsKhachHang.get(1)));
		dsThucDon.add(new ThucDon("TD03", 97000, dsKhachHang.get(2).maKH, dsKhachHang.get(2)));
		dsThucDon.add(new ThucDon("TD04", 124000, dsKhachHang.get(3).maKH, dsKhachHang.get(3)));
		dsThucDon.add(new ThucDon("TD05", 94000, dsKhachHang.get(4).maKH, dsKhachHang.get(4)));
		dsThucDon.add(new ThucDon("TD06", 125000, dsKhachHang.get(5).maKH, dsKhachHang.get(5)));
		dsThucDon.add(new ThucDon("TD07", 53000, dsKhachHang.get(6).maKH, dsKhachHang.get(6)));
		dsThucDon.add(new ThucDon("TD08", 135000, dsKhachHang.get(7).maKH, dsKhachHang.get(7)));
		dsThucDon.add(new ThucDon("TD09", 40000, dsKhachHang.get(8).maKH, dsKhachHang.get(8)));
		dsThucDon.add(new ThucDon("TD10", 75000, dsKhachHang.get(9).maKH, dsKhachHang.get(9)));
		dsThucDon.add(new ThucDon("TD11", 50000, dsKhachHang.get(10).maKH, dsKhachHang.get(10)));
		dsThucDon.add(new ThucDon("TD12", 145000, dsKhachHang.get(11).maKH, dsKhachHang.get(11)));
		dsThucDon.add(new ThucDon("TD13", 130000, dsKhachHang.get(12).maKH, dsKhachHang.get(12)));
	}

	public static void taoDSloaimonan()
	{
		dsLoaiMonAn.add(new LoaiMonAn(Loai1.Trang_mieng, 10000, 100000, new ArrayList<MonAn>()));
		dsLoaiMonAn.add(new LoaiMonAn(Loai1.Thuc_an_nhanh, 30000, 200000, new ArrayList<MonAn>()));
		dsLoaiMonAn.add(new LoaiMonAn(Loai1.Do_man, 15000, 500000, new ArrayList<MonAn>()));
		dsLoaiMonAn.add(new LoaiMonAn(Loai1.Do_chay, 10000, 80000, new ArrayList<MonAn>()));
	}

	public static void taoDSmonan()
	{
		dsMonAn.add(new MonAn("Nho", 20000, Loai1.Trang_mieng, dsLoaiMonAn.get(0)));
		dsMonAn.add(new MonAn("Cam", 15000, Loai1.Trang_mieng, dsLoaiMonAn.get(0)));
		dsMonAn.add(new MonAn("Rau cau", 30000, Loai1.Trang_mieng, dsLoaiMonAn.get(0)));
		dsMonAn.add(new MonAn("Humburger", 45000, Loai1.Thuc_an_nhanh, dsLoaiMonAn.get(1)));
		dsMonAn.add(new MonAn("Ga ran", 38000, Loai1.Thuc_an_nhanh, dsLoaiMonAn.get(1)));
		dsMonAn.add(new MonAn("Khoai tay chien", 30000, Loai1.Thuc_an_nhanh, dsLoaiMonAn.get(1)));
		dsMonAn.add(new MonAn("Com suon", 80000, Loai1.Do_man, dsLoaiMonAn.get(2)));
		dsMonAn.add(new MonAn("Pho", 50000, Loai1.Do_man, dsLoaiMonAn.get(2)));
		dsMonAn.add(new MonAn("Xoi man", 20000, Loai1.Do_man, dsLoaiMonAn.get(2)));
		dsMonAn.add(new MonAn("Xoi dau xanh", 15000, Loai1.Do_chay, dsLoaiMonAn.get(3)));
		dsMonAn.add(new MonAn("Rau cu xao", 30000, Loai1.Do_chay, dsLoaiMonAn.get(3)));
		dsMonAn.add(new MonAn("Canh nam", 50000, Loai1.Do_chay, dsLoaiMonAn.get(3)));

		// Nhom theo loai mon an
		dsLoaiMonAn.get(0).dsMA_LMA.add(dsMonAn.get(0));
		dsLoaiMonAn.get(0).dsMA_LMA.add(dsMonAn.get(1));
		dsLoaiMonAn.get(0).dsMA_LMA.add(dsMonAn.get(2));

		dsLoaiMonAn.get(1).dsMA_LMA.add(dsMonAn.get(3));
		dsLoaiMonAn.get(1).dsMA_LMA.add(dsMonAn.get(4));
		dsLoaiMonAn.get(1).dsMA_LMA.add(dsMonAn.get(5));

		dsLoaiMonAn.get(2).dsMA_LMA.add(dsMonAn.get(6));
		dsLoaiMonAn.get(2).dsMA_LMA.add(dsMonAn.get(7));
		dsLoaiMonAn.get(2).dsMA_LMA.add(dsMonAn.get(8));

		dsLoaiMonAn.get(3).dsMA_LMA.add(dsMonAn.get(9));
		dsLoaiMonAn.get(3).dsMA_LMA.add(dsMonAn.get(10));
		dsLoaiMonAn.get(3).dsMA_LMA.add(dsMonAn.get(11));
	}

	public static void taoDSloaithucuong()
	{
		dsLoaiThucUong.add(new LoaiThucUong(Loai2.Nuoc_uong_co_gas, 20000, 50000, new ArrayList<ThucUong>()));
		dsLoaiThucUong.add(new LoaiThucUong(Loai2.Nuoc_uong_khong_gas, 20000, 60000, new ArrayList<ThucUong>()));
		dsLoaiThucUong.add(new LoaiThucUong(Loai2.Nuoc_ep, 30000, 100000, new ArrayList<ThucUong>()));
		dsLoaiThucUong.add(new LoaiThucUong(Loai2.Nuoc_khoang, 10000, 20000, new ArrayList<ThucUong>()));
	}

	public static void taoDSthucuong()
	{
		dsThucUong.add(new ThucUong("Sting", 20000, Loai2.Nuoc_uong_co_gas, dsLoaiThucUong.get(0)));
		dsThucUong.add(new ThucUong("Pepsi", 22000, Loai2.Nuoc_uong_co_gas, dsLoaiThucUong.get(0)));
		dsThucUong.add(new ThucUong("CocaCola", 23000, Loai2.Nuoc_uong_co_gas, dsLoaiThucUong.get(0)));
		dsThucUong.add(new ThucUong("C2", 25000, Loai2.Nuoc_uong_khong_gas, dsLoaiThucUong.get(1)));
		dsThucUong.add(new ThucUong("Tra dao", 35000, Loai2.Nuoc_uong_khong_gas, dsLoaiThucUong.get(1)));
		dsThucUong.add(new ThucUong("Tra sua", 45000, Loai2.Nuoc_uong_khong_gas, dsLoaiThucUong.get(1)));
		dsThucUong.add(new ThucUong("Nuoc ep cam", 50000, Loai2.Nuoc_ep, dsLoaiThucUong.get(2)));
		dsThucUong.add(new ThucUong("Nuoc ep tao", 55000, Loai2.Nuoc_ep, dsLoaiThucUong.get(2)));
		dsThucUong.add(new ThucUong("Nuoc ep dua hau", 44000, Loai2.Nuoc_ep, dsLoaiThucUong.get(2)));
		dsThucUong.add(new ThucUong("LaVie", 10000, Loai2.Nuoc_khoang, dsLoaiThucUong.get(3)));
		dsThucUong.add(new ThucUong("Vinh Hao", 12000, Loai2.Nuoc_khoang, dsLoaiThucUong.get(3)));
		dsThucUong.add(new ThucUong("Aquarfina", 10000, Loai2.Nuoc_khoang, dsLoaiThucUong.get(3)));

		//Nhom theo loai thuc uong
		dsLoaiThucUong.get(0).dsTU_LTU.add(dsThucUong.get(0));
		dsLoaiThucUong.get(0).dsTU_LTU.add(dsThucUong.get(1));
		dsLoaiThucUong.get(0).dsTU_LTU.add(dsThucUong.get(2));

		dsLoaiThucUong.get(1).dsTU_LTU.add(dsThucUong.get(3));
		dsLoaiThucUong.get(1).dsTU_LTU.add(dsThucUong.get(4));
		dsLoaiThucUong.get(1).dsTU_LTU.add(dsThucUong.get(5));

		dsLoaiThucUong.get(2).dsTU_LTU.add(dsThucUong.get(6));
		dsLoaiThucUong.get(2).dsTU_LTU.add(dsThucUong.get(7));
		dsLoaiThucUong.get(2).dsTU_LTU.add(dsThucUong.get(8));

		dsLoaiThucUong.get(3).dsTU_LTU.add(dsThucUong.get(9));
		dsLoaiThucUong.get(3).dsTU_LTU.add(dsThucUong.get(10));
		dsLoaiThucUong.get(3).dsTU_LTU.add(dsThucUong.get(11));
	}

	public static void taoDSchitietthucdon()
	{
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(0).maTD, dsMonAn.get(3).tenMA, 1, dsMonAn.get(3).donGia, dsThucUong.get(0).tenTU, 1, dsThucUong.get(0).donGia,
				dsThucDon.get(0), dsMonAn.get(3), dsThucUong.get(0)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(1).maTD, dsMonAn.get(6).tenMA, 1, dsMonAn.get(6).donGia, dsThucUong.get(7).tenTU, 1, dsThucUong.get(7).donGia,
				dsThucDon.get(1), dsMonAn.get(6), dsThucUong.get(7)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(2).maTD, dsMonAn.get(9).tenMA, 2, 2 * dsMonAn.get(9).donGia, dsThucUong.get(3).tenTU, 1, dsThucUong.get(3).donGia,
				dsThucDon.get(2), dsMonAn.get(9), dsThucUong.get(3)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(2).maTD, dsMonAn.get(5).tenMA, 1, dsMonAn.get(5).donGia, dsThucUong.get(3).tenTU, 1, dsThucUong.get(3).donGia,
				dsThucDon.get(2), dsMonAn.get(5), dsThucUong.get(3)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(3).maTD, dsMonAn.get(6).tenMA, 1, dsMonAn.get(6).donGia, dsThucUong.get(8).tenTU, 1, dsThucUong.get(8).donGia,
				dsThucDon.get(3), dsMonAn.get(6), dsThucUong.get(8)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(4).maTD, dsMonAn.get(11).tenMA, 1, dsMonAn.get(11).donGia, dsThucUong.get(1).tenTU, 2, 2 * dsThucUong.get(1).donGia,
				dsThucDon.get(4), dsMonAn.get(11), dsThucUong.get(1)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(5).maTD, dsMonAn.get(7).tenMA, 1, dsMonAn.get(7).donGia, dsThucUong.get(9).tenTU, 1, dsThucUong.get(9).donGia,
				dsThucDon.get(5), dsMonAn.get(7), dsThucUong.get(9)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(5).maTD, dsMonAn.get(1).tenMA, 1, dsMonAn.get(1).donGia, dsThucUong.get(6).tenTU, 1, dsThucUong.get(6).donGia,
				dsThucDon.get(5), dsMonAn.get(1), dsThucUong.get(6)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(6).maTD, dsMonAn.get(10).tenMA, 1, dsMonAn.get(10).donGia, dsThucUong.get(2).tenTU, 1, dsThucUong.get(2).donGia,
				dsThucDon.get(6), dsMonAn.get(10), dsThucUong.get(2)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(7).maTD, dsMonAn.get(8).tenMA, 2, 2 * dsMonAn.get(8).donGia, dsThucUong.get(4).tenTU, 1, dsThucUong.get(4).donGia,
				dsThucDon.get(7), dsMonAn.get(8), dsThucUong.get(4)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(7).maTD, dsMonAn.get(1).tenMA, 1, dsMonAn.get(1).donGia, dsThucUong.get(5).tenTU, 1, dsThucUong.get(5).donGia,
				dsThucDon.get(7), dsMonAn.get(1), dsThucUong.get(5)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(8).maTD, dsMonAn.get(2).tenMA, 1, dsMonAn.get(2).donGia, dsThucUong.get(11).tenTU, 1, dsThucUong.get(11).donGia,
				dsThucDon.get(8), dsMonAn.get(2), dsThucUong.get(11)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(9).maTD, dsMonAn.get(7).tenMA, 1, dsMonAn.get(7).donGia, dsThucUong.get(3).tenTU, 1, dsThucUong.get(3).donGia,
				dsThucDon.get(9), dsMonAn.get(7), dsThucUong.get(3)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(10).maTD, dsMonAn.get(4).tenMA, 1, dsMonAn.get(4).donGia, dsThucUong.get(10).tenTU, 1, dsThucUong.get(10).donGia,
				dsThucDon.get(10), dsMonAn.get(4), dsThucUong.get(10)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(11).maTD, dsMonAn.get(5).tenMA, 1, dsMonAn.get(5).donGia, dsThucUong.get(3).tenTU, 1, dsThucUong.get(3).donGia,
				dsThucDon.get(11), dsMonAn.get(5), dsThucUong.get(3)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(11).maTD, dsMonAn.get(6).tenMA, 1, dsMonAn.get(6).donGia, dsThucUong.get(9).tenTU, 1, dsThucUong.get(9).donGia,
				dsThucDon.get(11), dsMonAn.get(5), dsThucUong.get(9)));
		dsChiTietThucDon.add(new ChiTietThucDon(dsThucDon.get(12).maTD, dsMonAn.get(9).tenMA, 2, 2 * dsMonAn.get(9).donGia, dsThucUong.get(6).tenTU, 2, 2 * dsThucUong.get(6).donGia,
				dsThucDon.get(12), dsMonAn.get(9), dsThucUong.get(6)));
	}
	public static void taoDSNhomNhanVien()
	{
		dsNhomNhanVien.add(new NhomNhanVien("PC01", "Nhom phi cong",
				"Phu trach dieu khien may bay", new ArrayList<NhanVien>()));
		dsNhomNhanVien.add(new NhomNhanVien("PC02", "Nhom phi cong",
				"Phu trach dieu khien may bay", new ArrayList<NhanVien>()));
		dsNhomNhanVien.add(new NhomNhanVien("TV01", "Nhom tiep vien",
				"Phu trach phuc vu khach", new ArrayList<NhanVien>()));
		dsNhomNhanVien.add(new NhomNhanVien("TV02", "Nhom tiep vien",
				"Phu trach phuc vu khach", new ArrayList<NhanVien>()));
		dsNhomNhanVien.add(new NhomNhanVien("QL01", "Nhom quan li",
				"Phu trach dieu khien may bay", new ArrayList<NhanVien>()));
		dsNhomNhanVien.add(new NhomNhanVien("QL02", "Nhom quan li",
				"Phu trach dieu khien may bay", new ArrayList<NhanVien>()));
	}

	public static void taoDSNhanVien()
	{
		dsNhanVien.add(new NhanVien("1006", "Chi", "12/6 NguyenKim", 10000000,
				"8120022", dsNhomNhanVien.get(2).maNhom, dsNhomNhanVien.get(2)));
		dsNhanVien.add(new NhanVien("1005", "Lan", "8 Dien Bien Phu", 10000000,
				"8121222", dsNhomNhanVien.get(2).maNhom, dsNhomNhanVien.get(2)));
		dsNhanVien.add(new NhanVien("1001", "Diep", "36 Nguyen Van Cu", 10000000,
				"8650022", dsNhomNhanVien.get(3).maNhom, dsNhomNhanVien.get(3)));
		dsNhanVien.add(new NhanVien("1002", "Dao", "5 Truong Dinh", 10000000,
				"8120622", dsNhomNhanVien.get(3).maNhom, dsNhomNhanVien.get(3)));
		dsNhanVien.add(new NhanVien("1004", "Tai", "12 Nguyen Thai Hoc", 20000000,
				"8130022", dsNhomNhanVien.get(0).maNhom, dsNhomNhanVien.get(0)));
		dsNhanVien.add(new NhanVien("1003", "Nam", "16/2 Nguyen Truong To", 20000000,
				"8880022", dsNhomNhanVien.get(0).maNhom, dsNhomNhanVien.get(0)));
		dsNhanVien.add(new NhanVien("1007", "Quang", "390 Xa Lo Ha Noi", 20000000,
				"8129922", dsNhomNhanVien.get(1).maNhom, dsNhomNhanVien.get(1)));
		dsNhanVien.add(new NhanVien("1008", "Thanh", "126 Ly Thuong Kiet", 20000000,
				"8121189", dsNhomNhanVien.get(1).maNhom, dsNhomNhanVien.get(1)));
		dsNhanVien.add(new NhanVien("1009", "Tam", "01 Tran Duy Hung", 15000000,
				"8121299", dsNhomNhanVien.get(4).maNhom, dsNhomNhanVien.get(4)));
		dsNhanVien.add(new NhanVien("1010", "Phuong", "02 Vo Van Ngan", 15000000,
				"8121802", dsNhomNhanVien.get(4).maNhom, dsNhomNhanVien.get(4)));
		dsNhanVien.add(new NhanVien("1011", "Thao", "03 Hai Ba Trung", 15000000,
				"8137793", dsNhomNhanVien.get(5).maNhom, dsNhomNhanVien.get(5)));
		dsNhanVien.add(new NhanVien("1012", "Lan", "48 To Ngoc Van", 15000000,
				"8174773", dsNhomNhanVien.get(5).maNhom, dsNhomNhanVien.get(5)));
		//
		dsNhomNhanVien.get(0).dsnhanvien_nhom.add(dsNhanVien.get(4));
		dsNhomNhanVien.get(0).dsnhanvien_nhom.add(dsNhanVien.get(5));

		dsNhomNhanVien.get(1).dsnhanvien_nhom.add(dsNhanVien.get(6));
		dsNhomNhanVien.get(1).dsnhanvien_nhom.add(dsNhanVien.get(7));

		dsNhomNhanVien.get(2).dsnhanvien_nhom.add(dsNhanVien.get(0));
		dsNhomNhanVien.get(2).dsnhanvien_nhom.add(dsNhanVien.get(1));

		dsNhomNhanVien.get(3).dsnhanvien_nhom.add(dsNhanVien.get(2));
		dsNhomNhanVien.get(3).dsnhanvien_nhom.add(dsNhanVien.get(3));

		dsNhomNhanVien.get(4).dsnhanvien_nhom.add(dsNhanVien.get(8));
		dsNhomNhanVien.get(4).dsnhanvien_nhom.add(dsNhanVien.get(9));

		dsNhomNhanVien.get(5).dsnhanvien_nhom.add(dsNhanVien.get(10));
		dsNhomNhanVien.get(5).dsnhanvien_nhom.add(dsNhanVien.get(11));
		//
		dsNhomNhanVien.get(0).maTruongNhom = dsNhanVien.get(4).maNV;
		dsNhomNhanVien.get(0).truongnhom = new NhanVien(dsNhanVien.get(4));

		dsNhomNhanVien.get(1).maTruongNhom = dsNhanVien.get(6).maNV;
		dsNhomNhanVien.get(1).truongnhom = new NhanVien(dsNhanVien.get(6));

		dsNhomNhanVien.get(2).maTruongNhom = dsNhanVien.get(0).maNV;
		dsNhomNhanVien.get(2).truongnhom = new NhanVien(dsNhanVien.get(0));

		dsNhomNhanVien.get(3).maTruongNhom = dsNhanVien.get(2).maNV;
		dsNhomNhanVien.get(3).truongnhom = new NhanVien(dsNhanVien.get(2));

		dsNhomNhanVien.get(4).maTruongNhom = dsNhanVien.get(8).maNV;
		dsNhomNhanVien.get(4).truongnhom = new NhanVien(dsNhanVien.get(8));

		dsNhomNhanVien.get(5).maTruongNhom = dsNhanVien.get(10).maNV;
		dsNhomNhanVien.get(5).truongnhom = new NhanVien(dsNhanVien.get(10));
	}

	public static void taoDSChuyenBay()
	{
		dsChuyenBay.add(new ChuyenBay("100", "SLC", "BOS", "08:00", 
				"17:59", new ArrayList<LichBay>())); // 0
		dsChuyenBay.add(new ChuyenBay("112", "DCA", "DEN", "14:00", 
				"18:07", new ArrayList<LichBay>())); // 1
		dsChuyenBay.add(new ChuyenBay("121", "STL", "SLC", "07:00", 
				"09:13", new ArrayList<LichBay>())); // 2
		dsChuyenBay.add(new ChuyenBay("122", "STL", "YYV", "08:30", 
				"10:19", new ArrayList<LichBay>())); // 3
		dsChuyenBay.add(new ChuyenBay("206", "DFW", "STL", "09:00", 
				"11:40", new ArrayList<LichBay>())); // 4
		dsChuyenBay.add(new ChuyenBay("330", "JFK", "YYV", "16:00", 
				"18:53", new ArrayList<LichBay>())); // 5
		dsChuyenBay.add(new ChuyenBay("334", "ORD", "MIA", "12:00", 
				"14:14", new ArrayList<LichBay>())); // 6
		dsChuyenBay.add(new ChuyenBay("335", "MIA", "ORD", "15:00", 
				"17:14", new ArrayList<LichBay>())); // 7
		dsChuyenBay.add(new ChuyenBay("336", "ORD", "MIA", "18:00", 
				"20:14", new ArrayList<LichBay>())); // 8
		dsChuyenBay.add(new ChuyenBay("337", "MIA", "ORD", "20:30", 
				"23:53", new ArrayList<LichBay>())); // 9
		dsChuyenBay.add(new ChuyenBay("394", "DFW", "MIA", "19:00", 
				"21:30", new ArrayList<LichBay>())); // 10
		dsChuyenBay.add(new ChuyenBay("395", "MIA", "DFW", "21:00", 
				"23:43", new ArrayList<LichBay>())); // 11
		dsChuyenBay.add(new ChuyenBay("449", "CDG", "DEN", "10:00", 
				"19:29", new ArrayList<LichBay>())); // 12
		dsChuyenBay.add(new ChuyenBay("930", "YYV", "DCA", "13:00", 
				"16:10", new ArrayList<LichBay>())); // 13
		dsChuyenBay.add(new ChuyenBay("931", "DCA", "YYV", "17:00", 
				"18:10", new ArrayList<LichBay>())); // 14
		dsChuyenBay.add(new ChuyenBay("932", "DCA", "YYV", "18:00", 
				"19:10", new ArrayList<LichBay>())); // 15
		dsChuyenBay.add(new ChuyenBay("991", "BOS", "ORD", "17:00", 
				"18:22", new ArrayList<LichBay>())); // 16
	}

	public static void taoDSLoaiMayBay()
	{
		dsLoaiMayBay.add(new LoaiMayBay("A310", "Airbus", new ArrayList<MayBay>())); 
		dsLoaiMayBay.add(new LoaiMayBay("A320", "Airbus", new ArrayList<MayBay>()));
		dsLoaiMayBay.add(new LoaiMayBay("A330", "Airbus", new ArrayList<MayBay>()));
		dsLoaiMayBay.add(new LoaiMayBay("A340", "Airbus", new ArrayList<MayBay>()));
		dsLoaiMayBay.add(new LoaiMayBay("B727", "Boeing", new ArrayList<MayBay>())); 
		dsLoaiMayBay.add(new LoaiMayBay("B747", "Boeing", new ArrayList<MayBay>()));
		dsLoaiMayBay.add(new LoaiMayBay("B757", "Boeing", new ArrayList<MayBay>()));
		dsLoaiMayBay.add(new LoaiMayBay("DC10", "MD", new ArrayList<MayBay>()));    
		dsLoaiMayBay.add(new LoaiMayBay("DC9", "MD", new ArrayList<MayBay>()));      
	}

	public static void taoDSMayBay()
	{
		dsMayBay.add(new MayBay("10", dsLoaiMayBay.get(5).maLoai,
				dsLoaiMayBay.get(5), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("11", dsLoaiMayBay.get(4).maLoai,
				dsLoaiMayBay.get(4), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("13", dsLoaiMayBay.get(4).maLoai,
				dsLoaiMayBay.get(4), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("13", dsLoaiMayBay.get(5).maLoai,
				dsLoaiMayBay.get(5), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("21", dsLoaiMayBay.get(7).maLoai,
				dsLoaiMayBay.get(7), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("22", dsLoaiMayBay.get(6).maLoai,
				dsLoaiMayBay.get(6), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("22", dsLoaiMayBay.get(8).maLoai,
				dsLoaiMayBay.get(8), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("23", dsLoaiMayBay.get(8).maLoai,
				dsLoaiMayBay.get(8), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("24", dsLoaiMayBay.get(8).maLoai,
				dsLoaiMayBay.get(8), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("70", dsLoaiMayBay.get(0).maLoai,
				dsLoaiMayBay.get(0), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("80", dsLoaiMayBay.get(0).maLoai,
				dsLoaiMayBay.get(0), new ArrayList<LichBay>())); 
		dsMayBay.add(new MayBay("93", dsLoaiMayBay.get(6).maLoai,
				dsLoaiMayBay.get(6), new ArrayList<LichBay>())); 
		//
		dsLoaiMayBay.get(0).dsmaybay_loai.add(dsMayBay.get(9));
		dsLoaiMayBay.get(0).dsmaybay_loai.add(dsMayBay.get(10));                      

		dsLoaiMayBay.get(4).dsmaybay_loai.add(dsMayBay.get(1));
		dsLoaiMayBay.get(4).dsmaybay_loai.add(dsMayBay.get(2));

		dsLoaiMayBay.get(5).dsmaybay_loai.add(dsMayBay.get(0));
		dsLoaiMayBay.get(5).dsmaybay_loai.add(dsMayBay.get(3));

		dsLoaiMayBay.get(6).dsmaybay_loai.add(dsMayBay.get(5));
		dsLoaiMayBay.get(6).dsmaybay_loai.add(dsMayBay.get(11));

		dsLoaiMayBay.get(7).dsmaybay_loai.add(dsMayBay.get(4));

		dsLoaiMayBay.get(8).dsmaybay_loai.add(dsMayBay.get(6));
		dsLoaiMayBay.get(8).dsmaybay_loai.add(dsMayBay.get(7));
		dsLoaiMayBay.get(8).dsmaybay_loai.add(dsMayBay.get(8));
	}

	public static void taoDSLichBay()
	{
		dsLichBay.add(new LichBay(LocalDate.of(2000, 01, 11), dsChuyenBay.get(0).maChuyenBay, 
				dsMayBay.get(10).soHieu, dsMayBay.get(10).maLoai, dsChuyenBay.get(0), dsMayBay.get(10)));     
		dsLichBay.add(new LichBay(LocalDate.of(2000, 01, 11), dsChuyenBay.get(1).maChuyenBay, 
				dsMayBay.get(4).soHieu, dsMayBay.get(4).maLoai, dsChuyenBay.get(1), dsMayBay.get(4)));        
		dsLichBay.add(new LichBay(LocalDate.of(2000, 01, 11), dsChuyenBay.get(4).maChuyenBay,
				dsMayBay.get(6).soHieu, dsMayBay.get(6).maLoai, dsChuyenBay.get(4), dsMayBay.get(6)));        
		dsLichBay.add(new LichBay(LocalDate.of(2000, 01, 11), dsChuyenBay.get(6).maChuyenBay,
				dsMayBay.get(0).soHieu, dsMayBay.get(0).maLoai, dsChuyenBay.get(6), dsMayBay.get(0)));        
		dsLichBay.add(new LichBay(LocalDate.of(2000, 01, 11), dsChuyenBay.get(11).maChuyenBay,
				dsMayBay.get(7).soHieu, dsMayBay.get(7).maLoai, dsChuyenBay.get(11), dsMayBay.get(7)));       
		dsLichBay.add(new LichBay(LocalDate.of(2000, 01, 11), dsChuyenBay.get(16).maChuyenBay,
				dsMayBay.get(5).soHieu, dsMayBay.get(5).maLoai, dsChuyenBay.get(16), dsMayBay.get(5)));       
		dsLichBay.add(new LichBay(LocalDate.of(2000, 01, 11), dsChuyenBay.get(9).maChuyenBay,
				dsMayBay.get(0).soHieu, dsMayBay.get(0).maLoai, dsChuyenBay.get(9), dsMayBay.get(0)));        
		dsLichBay.add(new LichBay(LocalDate.of(2000, 10, 31), dsChuyenBay.get(0).maChuyenBay, 
				dsMayBay.get(1).soHieu, dsMayBay.get(1).maLoai, dsChuyenBay.get(0), dsMayBay.get(1)));        
		dsLichBay.add(new LichBay(LocalDate.of(2000, 10, 31), dsChuyenBay.get(1).maChuyenBay, 
				dsMayBay.get(1).soHieu, dsMayBay.get(1).maLoai, dsChuyenBay.get(1), dsMayBay.get(1)));        
		dsLichBay.add(new LichBay(LocalDate.of(2000, 10, 31), dsChuyenBay.get(4).maChuyenBay,
				dsMayBay.get(2).soHieu, dsMayBay.get(2).maLoai, dsChuyenBay.get(4), dsMayBay.get(2)));        
		dsLichBay.add(new LichBay(LocalDate.of(2000, 10, 31), dsChuyenBay.get(6).maChuyenBay,
				dsMayBay.get(0).soHieu, dsMayBay.get(0).maLoai, dsChuyenBay.get(6), dsMayBay.get(0)));         
		dsLichBay.add(new LichBay(LocalDate.of(2000, 10, 31), dsChuyenBay.get(7).maChuyenBay, 
				dsMayBay.get(0).soHieu, dsMayBay.get(0).maLoai, dsChuyenBay.get(7), dsMayBay.get(0)));         
		dsLichBay.add(new LichBay(LocalDate.of(2000, 10, 31), dsChuyenBay.get(9).maChuyenBay,
				dsMayBay.get(8).soHieu, dsMayBay.get(8).maLoai, dsChuyenBay.get(9), dsMayBay.get(8)));         
		dsLichBay.add(new LichBay(LocalDate.of(2000, 10, 31), dsChuyenBay.get(12).maChuyenBay,
				dsMayBay.get(9).soHieu, dsMayBay.get(9).maLoai, dsChuyenBay.get(12), dsMayBay.get(9)));        
		// 
		dsChuyenBay.get(0).dslichbay_chuyenbay.add(dsLichBay.get(0));
		dsChuyenBay.get(0).dslichbay_chuyenbay.add(dsLichBay.get(7));

		dsChuyenBay.get(1).dslichbay_chuyenbay.add(dsLichBay.get(1));
		dsChuyenBay.get(1).dslichbay_chuyenbay.add(dsLichBay.get(8));

		dsChuyenBay.get(2).dslichbay_chuyenbay.add(dsLichBay.get(1));
		dsChuyenBay.get(2).dslichbay_chuyenbay.add(dsLichBay.get(8));

		dsChuyenBay.get(4).dslichbay_chuyenbay.add(dsLichBay.get(2));
		dsChuyenBay.get(4).dslichbay_chuyenbay.add(dsLichBay.get(9));

		dsChuyenBay.get(6).dslichbay_chuyenbay.add(dsLichBay.get(3));
		dsChuyenBay.get(6).dslichbay_chuyenbay.add(dsLichBay.get(10));

		dsChuyenBay.get(7).dslichbay_chuyenbay.add(dsLichBay.get(11));

		dsChuyenBay.get(9).dslichbay_chuyenbay.add(dsLichBay.get(6));
		dsChuyenBay.get(9).dslichbay_chuyenbay.add(dsLichBay.get(12));

		dsChuyenBay.get(11).dslichbay_chuyenbay.add(dsLichBay.get(4));

		dsChuyenBay.get(12).dslichbay_chuyenbay.add(dsLichBay.get(13));

		dsChuyenBay.get(16).dslichbay_chuyenbay.add(dsLichBay.get(5));
		//
		dsMayBay.get(0).dslichbay_maybay.add(dsLichBay.get(3));
		dsMayBay.get(0).dslichbay_maybay.add(dsLichBay.get(6));
		dsMayBay.get(0).dslichbay_maybay.add(dsLichBay.get(10));
		dsMayBay.get(0).dslichbay_maybay.add(dsLichBay.get(11));

		dsMayBay.get(1).dslichbay_maybay.add(dsLichBay.get(4));
		dsMayBay.get(1).dslichbay_maybay.add(dsLichBay.get(7));
		dsMayBay.get(1).dslichbay_maybay.add(dsLichBay.get(8));

		dsMayBay.get(2).dslichbay_maybay.add(dsLichBay.get(9));

		dsMayBay.get(4).dslichbay_maybay.add(dsLichBay.get(1));

		dsMayBay.get(5).dslichbay_maybay.add(dsLichBay.get(5));

		dsMayBay.get(6).dslichbay_maybay.add(dsLichBay.get(2));

		dsMayBay.get(7).dslichbay_maybay.add(dsLichBay.get(4));

		dsMayBay.get(8).dslichbay_maybay.add(dsLichBay.get(12));

		dsMayBay.get(9).dslichbay_maybay.add(dsLichBay.get(13));

		dsMayBay.get(10).dslichbay_maybay.add(dsLichBay.get(10));
	}

	public static void taoDSKhaNang()
	{
		dsKhaNang.add(new KhaNang(dsNhanVien.get(5).maNV, dsLoaiMayBay.get(4).maLoai,
				dsNhanVien.get(5), dsLoaiMayBay.get(4)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(5).maNV, dsLoaiMayBay.get(5).maLoai,
				dsNhanVien.get(5), dsLoaiMayBay.get(5)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(5).maNV, dsLoaiMayBay.get(7).maLoai, 
				dsNhanVien.get(5), dsLoaiMayBay.get(7)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(7).maNV, dsLoaiMayBay.get(8).maLoai,
				dsNhanVien.get(7), dsLoaiMayBay.get(8)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(7).maNV, dsLoaiMayBay.get(1).maLoai,
				dsNhanVien.get(7), dsLoaiMayBay.get(1)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(7).maNV, dsLoaiMayBay.get(3).maLoai,
				dsNhanVien.get(7), dsLoaiMayBay.get(3)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(8).maNV, dsLoaiMayBay.get(6).maLoai,
				dsNhanVien.get(8), dsLoaiMayBay.get(6)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(8).maNV, dsLoaiMayBay.get(8).maLoai,
				dsNhanVien.get(8), dsLoaiMayBay.get(8)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(9).maNV, dsLoaiMayBay.get(0).maLoai,
				dsNhanVien.get(9), dsLoaiMayBay.get(0)));
		dsKhaNang.add(new KhaNang(dsNhanVien.get(9).maNV, dsLoaiMayBay.get(8).maLoai,
				dsNhanVien.get(9), dsLoaiMayBay.get(8)));
	}

	public static void taoDSPhanCong()
	{
		dsPhanCong.add(new PhanCong(dsNhanVien.get(2).maNV, dsLichBay.get(0).ngayDi, dsLichBay.get(0).maChuyenBay,
				dsLichBay.get(0), dsNhanVien.get(2)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(2).maNV, dsLichBay.get(7).ngayDi, dsLichBay.get(7).maChuyenBay,
				dsLichBay.get(7), dsNhanVien.get(2)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(3).maNV, dsLichBay.get(0).ngayDi, dsLichBay.get(0).maChuyenBay,
				dsLichBay.get(0), dsNhanVien.get(3)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(3).maNV, dsLichBay.get(7).ngayDi, dsLichBay.get(7).maChuyenBay,
				dsLichBay.get(7), dsNhanVien.get(3)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(5).maNV, dsLichBay.get(7).ngayDi, dsLichBay.get(7).maChuyenBay,
				dsLichBay.get(7), dsNhanVien.get(5)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(5).maNV, dsLichBay.get(12).ngayDi, dsLichBay.get(12).maChuyenBay,
				dsLichBay.get(12), dsNhanVien.get(5)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(4).maNV, dsLichBay.get(7).ngayDi, dsLichBay.get(7).maChuyenBay,
				dsLichBay.get(7), dsNhanVien.get(4)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(4).maNV, dsLichBay.get(12).ngayDi, dsLichBay.get(12).maChuyenBay,
				dsLichBay.get(12), dsNhanVien.get(4)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(0).maNV, dsLichBay.get(5).ngayDi, dsLichBay.get(5).maChuyenBay,
				dsLichBay.get(5), dsNhanVien.get(0)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(0).maNV, dsLichBay.get(12).ngayDi, dsLichBay.get(12).maChuyenBay,
				dsLichBay.get(12), dsNhanVien.get(0)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(6).maNV, dsLichBay.get(1).ngayDi, dsLichBay.get(1).maChuyenBay,
				dsLichBay.get(1), dsNhanVien.get(6)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(6).maNV, dsLichBay.get(5).ngayDi, dsLichBay.get(5).maChuyenBay,
				dsLichBay.get(5), dsNhanVien.get(6)));
		dsPhanCong.add(new PhanCong(dsNhanVien.get(6).maNV, dsLichBay.get(9).ngayDi, dsLichBay.get(9).maChuyenBay,
				dsLichBay.get(9), dsNhanVien.get(6)));
	}
	
	public static void taoDSDatCho()
	{
		dsDatCho.add(new DatCho("0009", LocalDate.of(2000, 11, 01), "100", dsLichBay.get(0), dsKhachHang.get(0)));
        dsDatCho.add(new DatCho("0009", LocalDate.of(2000, 10, 01), "449", dsLichBay.get(13), dsKhachHang.get(0)));
        dsDatCho.add(new DatCho("0045", LocalDate.of(2000, 11, 01), "991", dsLichBay.get(5), dsKhachHang.get(2)));
        dsDatCho.add(new DatCho("0012", LocalDate.of(2000, 10, 01), "206", dsLichBay.get(9), dsKhachHang.get(3)));
        dsDatCho.add(new DatCho("0238", LocalDate.of(2000, 10, 01), "334", dsLichBay.get(10), dsKhachHang.get(4)));
        dsDatCho.add(new DatCho("0528", LocalDate.of(2000, 11, 01), "991", dsLichBay.get(5), dsKhachHang.get(6)));
        dsDatCho.add(new DatCho("0091", LocalDate.of(2000, 11, 01), "100", dsLichBay.get(0), dsKhachHang.get(8)));
        dsDatCho.add(new DatCho("0314", LocalDate.of(2000, 10, 01), "449", dsLichBay.get(13), dsKhachHang.get(9)));
        dsDatCho.add(new DatCho("0613", LocalDate.of(2000, 11, 01), "100", dsLichBay.get(0), dsKhachHang.get(10)));
        dsDatCho.add(new DatCho("0586", LocalDate.of(2000, 11, 01), "991", dsLichBay.get(5), dsKhachHang.get(11)));
        dsDatCho.add(new DatCho("0586", LocalDate.of(2000, 10, 01), "100", dsLichBay.get(7), dsKhachHang.get(11)));
        dsDatCho.add(new DatCho("0422", LocalDate.of(2000, 10, 01), "449", dsLichBay.get(13), dsKhachHang.get(12)));
	}

	//=================Nguyen Thanh Dat - 20110121==================
	
	// Danh sach mon an, thuc uong theo tung loai
	public static void JavaStream01_NguyenThanhDat()
	{
		List<LoaiMonAn> dsmon = dsLoaiMonAn
				.stream()
				.collect(Collectors.toList());
		System.out.println("--Danh sach mon an theo tung loai--");
		System.out.println();
		for(LoaiMonAn mon:dsmon)
		{
			System.out.println(mon.tenLoaiMA);
			for(MonAn an:mon.dsMA_LMA)
			{
				System.out.println(an.getTenMA()+"-"+an.donGia);
			}
			System.out.println();
		}

		System.out.println("-----------------------------------");

		List<LoaiThucUong> dsuong = dsLoaiThucUong
				.stream()
				.collect(Collectors.toList());
		System.out.println("--Danh sach thuc uong theo tung loai--");
		System.out.println();
		for(LoaiThucUong uong:dsuong)
		{
			System.out.println(uong.tenLoaiTU);
			for(ThucUong thuc:uong.dsTU_LTU)
			{
				System.out.println(thuc.getTenTU()+"-"+thuc.donGia);
			}
			System.out.println();
		}
	}

	//Danh sach mon an va thuc uong duoc dat cua tat ca khach hang
	public static void JavaStream02_NguyenThanhDat()
	{
		List<String> dsmonAn = dsChiTietThucDon
				.stream()
				.map( e -> e.getTenMA() ) 
				.distinct()
				.collect(Collectors.toList());
		System.out.println("--Danh sach mon an duoc dat--");
		for(String monan: dsmonAn)
		{
			System.out.println(monan);
		}

		System.out.println("-----------------------------------");

		List<String> dsthucUong = dsChiTietThucDon
				.stream()
				.map( e -> e.getTenTU() ) 
				.distinct()
				.collect(Collectors.toList());
		System.out.println("--Danh sach thuc uong duoc dat--");
		for(String thucuong: dsthucUong)
		{
			System.out.println(thucuong);
		}
	}

	// Trong luong trung binh cua hanh ly xach tay cua tat ca hanh khach
	public static void JavaStream03_NguyenThanhDat()
	{
		double TBxachtay = dsHanhLy
				.stream()
				.filter(x -> x.LHL_HL.tenLHL == TenLoaiHanhLy.Xach_Tay)
				.collect(Collectors.averagingDouble(n -> n.trongLuong));
			
		System.out.println("--Trong luong trung binh cua hanh ly xach tay cua tat ca hanh khach--");
		System.out.println("--> "+TBxachtay+" kg.");
	}

	//Danh sach mon an va thuc uong co muc gia hon 20 000
	public static void JavaStream04_NguyenThanhDat()
	{
		List<MonAn> dsmon = dsMonAn
				.stream()
				.collect(Collectors.toList());
		System.out.println("--Danh sach mon an tren 20 000---");
		for(MonAn kq: dsmon)
		{
			if( kq.donGia >= 20000)
			{
				System.out.println("Ten mon: "+kq.tenMA+" - "+"Gia: "+kq.donGia);
			}
		}

		System.out.println("---------------------------------");

		List<ThucUong> dsuong = dsThucUong
				.stream()
				.collect(Collectors.toList());
		System.out.println("--Danh sach thuc uong tren 20 000---");
		for(ThucUong kq: dsuong)
		{
			if( kq.donGia >= 20000)
			{
				System.out.println("Ten mon: "+kq.tenTU+" - "+"Gia: "+kq.donGia);
			}
		}
	}

	// Danh sach khach hang mang theo hanh ly ky gui
	public static void JavaStream05_NguyenThanhDat()
	{
		List<HanhLy> dshl = dsHanhLy
				.stream()
				.filter(x -> TenLoaiHanhLy.Ky_Gui.equals(x.LHL_HL.tenLHL))
				.collect(Collectors.toList());
		System.out.println("--Danh sach khach hang mang theo hanh ly ky gui--");
		for(HanhLy kq: dshl)
		{
			System.out.println("Ten Khach Hang: "+kq.KH_HL.getTenKH()+" - "+
					"Trong luong cua hanh ly ki gui: "+kq.trongLuong);
		}
	}
	
	//===============Phan Hong Son - 20110560================
	
	// Cho biet thong tin cua phi cong dau tien
	public static void JavaStream01_HongSon() {
		System.out.println("\t\t Java Stream 01");

		NhanVien nv = dsNhanVien
				.stream()
				.filter(n -> n.nhomnhanvien.tenNhom == "Nhom phi cong")
				.findFirst().get();

		if(nv != null)
		{
			System.out.println("\t- Ma nhan vien: " + nv.maNV);
			System.out.println("\t- Ten nhan vien: " + nv.tenNV);
			System.out.println("\t- Ma nhom: " + nv.maNhom);
			System.out.println("\t- Dia chi: " + nv.diaChi);
			System.out.println("\t- Luong: " + nv.Luong);
			System.out.println("\t- So dien thoai: " + nv.soDT);
		}else
			System.out.println("\t- Khong co nhan vien nao la phi cong !"); 
	}

	// Cho biet muc luong cao nhat cua cac nhan vien la tiep vien
	public static void JavaStream02_HongSon() {
		System.out.println("\t\t Java Stream 02");

		Optional<Double> salary = dsNhanVien
				.stream()
				.filter(n -> n.nhomnhanvien.tenNhom == "Nhom tiep vien")
				.map(n -> n.Luong)
				.max((i, j) -> i.compareTo(j));

		System.out.println("\t- Muc luong cao nhat: " + salary.get()); 
	}

	// Cho biet may bay ma loai A310, so hieu 80 tham gia nhung lich bay nao,
	// in ra thong tin lich bay do
	public static void JavaStream03_HongSon() {
		System.out.println("\t\t Java Stream 03");

		List<LichBay> dslichbay = dsLichBay
				.stream()
				.filter(n -> n.soHieu == "80" && n.maLoai == "A310")
				.collect(Collectors.toList());

		for(LichBay lb:dslichbay)
		{
			System.out.println("\t- Ma chuyen bay: " + lb.maChuyenBay); 
			System.out.println("\t- Ngay di: " + lb.ngayDi); 
			System.out.println("\t- So hieu: " + lb.soHieu); 
			System.out.println("\t- Ma loai: " + lb.maLoai); 
			System.out.println("\t===================="); 
		}
	}

	// Tinh tong muc luong cua tat ca nhan vien phi cong
	public static void JavaStream04_HongSon() {
		System.out.println("\t\t Java Stream 04");

		Double salary = dsNhanVien
				.stream()
				.filter(n -> n.nhomnhanvien.tenNhom == "Nhom phi cong")
				.map(n -> n.Luong)
				.collect(Collectors.summingDouble(Double::doubleValue));

		System.out.println("\t- Tong luong: " + salary);			 
	}

	// Cho biet thong tin nhung chuyen bay ma nhan vien Quang tham gia
	public static void JavaStream05_HongSon() {
		System.out.println("\t\t Java Stream 05");

		List<ChuyenBay> dschuyenbay = dsPhanCong
				.stream()
				.filter(n -> n.nhanvien.tenNV == "Quang")
				.map(n -> n.lichbay.chuyenbay)
				.distinct()
				.collect(Collectors.toList());

		for(ChuyenBay chuyenbay:dschuyenbay)
		{
			System.out.println("\t- Ma chuyen bay:  " + chuyenbay.maChuyenBay);
			System.out.println("\t- San bay di: " + chuyenbay.sanBayDi);
			System.out.println("\t- San bay den: " + chuyenbay.sanBayDen);
			System.out.println("\t- Gio di: " + chuyenbay.gioDi);
			System.out.println("\t- Gio den: " + chuyenbay.gioDen);
			System.out.println("\t====================");
		}
	}
	
	//=================Huynh Thanh Tuan - 20110120=======================

//	// Cho biet thong tin cua nhan vien(ma, ten, loaiNV) co luong cao nhat
//	public static void Cau01() {
//		System.out.println("====== Cau 1: Tim cac nhan vien co luong cao nhat======");
//		dsNhanVien.stream()
//		.filter(x -> (dsNhanVien.stream().max(Comparator.comparingDouble(n -> n.Luong)).get()).Luong == x.Luong)
//		.forEach(x -> System.out.printf("Ma nhan vien: %s, Ten nhan vien: %s, Loai nhan vien: %s.\n", x.maNV,
//				x.tenNV, (x.loaiNV == 1) ? "Phi cong" : "Tiep vien"));
//	}
//
//	// Liet ke danh sach nhan vien theo loai nhan vien
//	public static void Cau02() {
//		System.out.println("====== Cau 2: Liet ke danh sach nhan vien theo loai======");
//		Map<Object, List<NhanVien>> q2 = dsNhanVien.stream().collect(Collectors.groupingBy(n -> n.maNhom));
//		for (Map.Entry<Object, List<NhanVien>> n : q2.entrySet()) {
//			System.out.printf("Danh sach nhan vien la: %s\n", ((int) n.getKey() == 1) ? "Phi cong" : "Tiep vien");
//			for (NhanVien i : n.getValue())
//				System.out.printf("Ma nhan vien: %s, Ten nhan vien: %s, Dia chi: %s.\n", i.maNV, i.tenNV, i.diaChi);
//		}
//	}
//
//	// Tinh luong trung binh cua phi cong
//	public static void Cau03() {
//		System.out.println("====== Cau 3: Tinh luong trung binh cua phi cong======");
//		double TB = dsNhanVien.stream().filter(n -> n.maNhom == 1).collect(Collectors.averagingDouble(n -> n.Luong));
//		System.out.printf("Luong trung binh cua nhan vien: %.2f\n", TB);
//	}
//
//	// Voi moi hang san xuat, cho biet so luong may bay ma hang do san xuat.
//	// Xuat ra hang san xuat va so luong
//	public static void Cau04() {
//		System.out.println("====== Cau 4: So luong may bay cua moi hang san xuat ======");
//		Map<Object, Long> q4 = dsMayBay.stream()
//				.flatMap(mb -> dsLoaiMayBay.stream().filter(lmb -> lmb.maLoai == mb.maLoai))
//				.collect(Collectors.groupingBy(x -> x.hangSX, Collectors.counting()));
//		for (Map.Entry<Object, Long> n : q4.entrySet()) {
//			System.out.printf("Hang san xuat: %s, So luong: %s.\n", n.getKey(), n.getValue().toString());
//		}
//	}
//
//	// Voi moi loai nhan vien co tong luong tren 60000000
//	// cho biet so luong nhan vien trong tung loai nhan vien do
//	// xuat loai nhan vien, so luong nhan vien tuong ung
//	public static void Cau05() {
//		System.out.println("======Cau 5: ======");
//		dsNhanVien.stream().collect(Collectors.groupingBy(n -> n.loaiNV)).entrySet().stream()
//		.filter(i -> i.getValue().stream().collect(Collectors.summingDouble(x -> x.Luong)) > 60000000)
//		.forEach(j -> System.out.printf("Loai Nhan Vien: %s, So Luong Nhan Vien: %d.\n",
//				(j.getKey() == 1) ? "Phi cong" : "Tiep vien", j.getValue().stream().count()));
//	}
	public static void main(String[] args)
	{
		taoDSkhachhang();
		taoDSloaihanhly();
		taoDShanhly();
		taoDSthucdon();
		taoDSloaimonan();
		taoDSmonan();
		taoDSloaithucuong();
		taoDSthucuong();
		taoDSchitietthucdon();
		taoDSNhomNhanVien();
        taoDSNhanVien();
        taoDSChuyenBay();
        taoDSLoaiMayBay();
        taoDSMayBay();
        taoDSLichBay();
        taoDSKhaNang();
        taoDSPhanCong();
        taoDSDatCho();

        //=====Nguyen Thanh Dat========
//      JavaStream01_NguyenThanhDat();
//      JavaStream02_NguyenThanhDat();
//      JavaStream03_NguyenThanhDat();
//      JavaStream04_NguyenThanhDat();
//      JavaStream05_NguyenThanhDat();
        
        //=====Phan Hong Son===========
//		JavaStream01_HongSon();
//		JavaStream02_HongSon();
//		JavaStream03_HongSon();
//		JavaStream04_HongSon();
//		JavaStream05_HongSon();
		
        //=====Huynh Thanh Tuan========
		//Cau01();
		//Cau02();
		//Cau03();
		//Cau04();
		//Cau05();
	}

}
