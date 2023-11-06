package entity;

import java.sql.Date;

public class SanPham {
	private String sanPhamID;
	private String tenSanPham;
	private String imgPath;
	private String thanhPhan;
	private String cachDung;
	private String xuatXu;
	private Date ngaySanXuat;
	private Date ngayHetHan;
	private double donGia;
	private int soLuongTon;
	private String loai;
	private String tinhTrang;
	
	public SanPham() {
		
	}

	public String getSanPhamID() {
		return sanPhamID;
	}

	public void setSanPhamID(String sanPhamID) {
		this.sanPhamID = sanPhamID;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public String getThanhPhan() {
		return thanhPhan;
	}

	public void setThanhPhan(String thanhPhan) {
		this.thanhPhan = thanhPhan;
	}

	public String getCachDung() {
		return cachDung;
	}

	public void setCachDung(String cachDung) {
		this.cachDung = cachDung;
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public Date getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public String toString() {
		return sanPhamID + ";" + tenSanPham + ";" + imgPath
				+ ";" + thanhPhan + ";" + cachDung + ";" + xuatXu + ";"
				+ ngaySanXuat + ";" + ngayHetHan + ";" + (int) donGia + ";" + soLuongTon
				+ ";" + loai + ";" + tinhTrang;
	}
	
}
