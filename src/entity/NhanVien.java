package entity;

import java.sql.Date;

public class NhanVien {
	
	private String nhanVienID;
	private String hoTen;
	private String gioiTinh;
	private Date ngaySinh;
	private String email;
	private String soDienThoai;
	private String diaChi;
	private String chucVu; // Nhan vien va quan ly
	private String tenTaiKhoan;
	private String matKhau;
	
	public NhanVien() {
		
	}

	public String getNhanVienID() {
		return nhanVienID;
	}

	public void setNhanVienID(String nhanVienID) {
		this.nhanVienID = nhanVienID;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
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

	public void setNgaySinh(Date date) {
		this.ngaySinh = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Override
	public String toString() {
		return "NhanVien [nhanVienID=" + nhanVienID + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", ngaySinh="
				+ ngaySinh + ", email=" + email + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", chucVu="
				+ chucVu + ", tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + "]";
	}
	
}
