package entity;

import java.sql.Date;
import java.util.Objects;

public class KhachHang {
	private String khachHangID;
	private String hoTen;
	private String gioiTinh;
	private Date ngaySinh;
	private String soDienThoai;
	private String email;
	private String diaChi;
	
	public KhachHang() {
		
	}

	public KhachHang(String khachHangID, String hoTen, String gioiTinh, Date ngaySinh, String soDienThoai, String email,
			String diaChi) {
		this.khachHangID = khachHangID;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.diaChi = diaChi;
	}

	public String getKhachHangID() {
		return khachHangID;
	}

	public void setKhachHangID(String khachHangID) throws Exception {
//		 kiểm tra chuỗi rỗng hoặc chỉ chứa khoảng trắng.
		if(khachHangID==null || khachHangID.trim().isEmpty())
			throw new Exception("Mã khách hàng rỗng! Đã có lỗi trong quá trình phát sinh");
		this.khachHangID = khachHangID;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) throws Exception {
		if (hoTen.trim() == "" || hoTen.isBlank() || hoTen.isEmpty())
			throw new Exception("Tên khách hàng là trường bắt buộc!");
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) throws Exception {
		if (soDienThoai.trim()== "" || soDienThoai.isBlank() || soDienThoai.isEmpty())
			throw new Exception("Số điện thoại là một trường bắt buộc!");
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) throws Exception {
		
		if (diaChi.trim() == "" || diaChi.isBlank() || diaChi.isEmpty())
			throw new Exception("Địa chỉ là một trường bắt buộc!");
		
		this.diaChi = diaChi;
	}
	
	
	
	public KhachHang(String khachHangID, String hoTen, String gioiTinh, Date ngaySinh, String soDienThoai, String email,
			String diaChi) throws Exception {
		super();
		setKhachHangID(khachHangID);
		setHoTen(hoTen);
		setGioiTinh(gioiTinh);
		setNgaySinh(ngaySinh);;
		setSoDienThoai(soDienThoai);;
		setEmail(email);
		setDiaChi(diaChi);
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(khachHangID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(khachHangID, other.khachHangID);
	}

	@Override
	public String toString() {
		return khachHangID + ";" + hoTen + ";" + gioiTinh + ";"
				+ ngaySinh + ";" + soDienThoai + ";" + email + ";" + diaChi;
	}
	
	
}
