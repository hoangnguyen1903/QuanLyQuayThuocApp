package entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class NhanVien {
	private String nhanVienID;
<<<<<<< HEAD
=======
	private String hoTen;
	private String gioiTinh;
	private Date ngaySinh;
	private String email;
	private String soDienThoai;
	private String diaChi;
	private String chucVu; // Nhan vien va quan ly
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
	private String tenTaiKhoan;
	private String matKhau;
	private LocalDate ngayTaoTK;
	private String hoTen;
	private String gioiTinh;
	private String soDienThoai;
	private String chucVu;
	private String email;
	private Date ngaySinh;
	private String diaChi;
	
	
	public NhanVien( String nhanVienID ) {
		this.nhanVienID=nhanVienID;
	}

	public String getNhanVienID() {
		return nhanVienID;
	}

	public void setNhanVienID(String nhanVienID) throws Exception {
//		 kiểm tra chuỗi rỗng hoặc chỉ chứa khoảng trắng.
		if(nhanVienID==null || nhanVienID.trim().isEmpty())
			throw new Exception("Mã khách hàng rỗng! Đã có lỗi trong quá trình phát sinh");
		this.nhanVienID = nhanVienID;
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

	public LocalDate getNgayTaoTK() {
		return ngayTaoTK;
	}

	public void setNgayTaoTK(LocalDate ngayTaoTK) {
		this.ngayTaoTK = ngayTaoTK;
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

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) throws Exception {
		if (soDienThoai.trim()== "" || soDienThoai.isBlank() || soDienThoai.isEmpty())
			throw new Exception("Số điện thoại là một trường bắt buộc!");
		this.soDienThoai = soDienThoai;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date date) {
		this.ngaySinh = date;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) throws Exception {
		
		if (diaChi.trim() == "" || diaChi.isBlank() || diaChi.isEmpty())
			throw new Exception("Địa chỉ là một trường bắt buộc!");
		
		this.diaChi = diaChi;
	}


	public NhanVien(String nhanVienID, String tenTaiKhoan, String matKhau, String hoTen, String gioiTinh,
			String soDienThoai, String chucVu, String email, Date ngaySinh, String diaChi) throws Exception {
		setNhanVienID(nhanVienID);
		setTenTaiKhoan(tenTaiKhoan);
		setMatKhau(matKhau);
		setHoTen(hoTen);
		setGioiTinh(gioiTinh);
		setSoDienThoai(soDienThoai);
		setChucVu(chucVu);
		setEmail(email);
		setNgaySinh(ngaySinh);
		setDiaChi(diaChi);
		
	}
	
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(nhanVienID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(nhanVienID, other.nhanVienID);
	}
	
	
}
