package entity;

<<<<<<< HEAD
import java.util.Objects;

public class NhaCungCap {
=======
public class NhaCungCap {
	private String nhaCungCapID;
	private String tenNhaCungCap;
	private String soDienThoai;
	private String diaChi;
	
	public NhaCungCap() {
		
	}

	public NhaCungCap(String nhaCungCapID, String tenNhaCungCap, String soDienThoai, String diaChi) {
		this.nhaCungCapID = nhaCungCapID;
		this.tenNhaCungCap = tenNhaCungCap;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}

	public String getNhaCungCapID() {
		return nhaCungCapID;
	}

	public void setNhaCungCapID(String nhaCungCapID) {
		this.nhaCungCapID = nhaCungCapID;
	}

	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}

	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
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

>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
	@Override
	public String toString() {
		return "NhaCungCap [nhaCungCapID=" + nhaCungCapID + ", tenNhaCungCap=" + tenNhaCungCap + ", soDienThoai="
				+ soDienThoai + ", diaChi=" + diaChi + "]";
	}
<<<<<<< HEAD
	private String nhaCungCapID;
	private String tenNhaCungCap;
	private String soDienThoai;
	private String diaChi;
	
	public String getNhaCungCapID() {
		return nhaCungCapID;
	}
	public void setNhaCungCapID(String nhaCungCapID) throws Exception {
		if(nhaCungCapID==null || nhaCungCapID.trim().isEmpty())
			throw new Exception("Mã nhà cung cấp rỗng! Đã có lỗi trong quá trình phát sinh");
		this.nhaCungCapID = nhaCungCapID;
	}
	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}
	public void setTenNhaCungCap(String tenNhaCungCap) throws Exception {
		if (tenNhaCungCap.trim() == "" || tenNhaCungCap.isBlank() || tenNhaCungCap.isEmpty())
			throw new Exception("Tên nhà cung cấp là trường bắt buộc!");
		this.tenNhaCungCap = tenNhaCungCap;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) throws Exception {
		if (soDienThoai.trim()== "" || soDienThoai.isBlank() || soDienThoai.isEmpty())
			throw new Exception("Số điện thoại là một trường bắt buộc!");
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) throws Exception {
		if (diaChi.trim() == "" || diaChi.isBlank() || diaChi.isEmpty())
			throw new Exception("Địa chỉ là một trường bắt buộc!");
		
		this.diaChi = diaChi;
	}
	public NhaCungCap(String nhaCungCapID, String tenNhaCungCap, String soDienThoai, String diaChi) {
		super();
		this.nhaCungCapID = nhaCungCapID;
		this.tenNhaCungCap = tenNhaCungCap;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}
	public NhaCungCap() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(nhaCungCapID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhaCungCap other = (NhaCungCap) obj;
		return Objects.equals(nhaCungCapID, other.nhaCungCapID);
	}
	
	
	
	
	
=======
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
	
}
