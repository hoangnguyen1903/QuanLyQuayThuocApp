use master
go
CREATE DATABASE QuanLyNhaThuoc
GO

use QuanLyNhaThuoc
GO 

CREATE TABLE ChiTietHoaDon (SanPhamID varchar(255) NOT NULL, HoaDonHoaDonID varchar(255) NOT NULL, SoLuong int NOT NULL, DonGia float(10) NOT NULL, PRIMARY KEY (SanPhamID, HoaDonHoaDonID));
CREATE TABLE SanPham (SanPhamID varchar(255) NOT NULL, NhaCungCapID varchar(255) NOT NULL, TenSanPham varchar(255) NULL, ImgPath varchar(255) NULL, GiaBan float(10) NOT NULL, TinhTrang varchar(255) NULL, LoSanXuat varchar(255) NULL, LoaiSanPham varchar(255) NULL, ThanhPhan varchar(255) NULL, XuatXu varchar(255) NULL, NgayHetHan datetime NULL, NgaySanXuat datetime NULL, SoLuongTon int NOT NULL, TrangThai varchar(255) NULL, PRIMARY KEY (SanPhamID));
CREATE TABLE HoaDon (HoaDonID varchar(255) NOT NULL, KhachHangKhachHangID varchar(255) NOT NULL, NhanVienNhanVienID varchar(255) NOT NULL, NgayLapHoaDon datetime NULL, TongTien float(10) NOT NULL, TrangThai varchar(255) NULL, PRIMARY KEY (HoaDonID));
CREATE TABLE KhachHang (KhachHangID varchar(255) NOT NULL, HoTen varchar(255) NULL, SoDIenThoai varchar(255) NULL, NgaySInh datetime NULL, GioiTinh bit NOT NULL, Email varchar(255) NULL, DiaChi varchar(255) NULL, PRIMARY KEY (KhachHangID));
CREATE TABLE NhanVien (NhanVienID varchar(255) NOT NULL, HoTen varchar(255) NULL, GioiTinh varchar(255) NULL, SoDIenThoai varchar(255) NULL, NgaySinh datetime NULL, Email varchar(255) NULL, DiaChi varchar(255) NULL, TenDangNhap varchar(255) NULL, MatKhau varchar(255) NULL, ChucVu varchar(255) NULL, PRIMARY KEY (NhanVienID));
CREATE TABLE NhaCungCap (NhaCungCapID varchar(255) NOT NULL, HangNhapHangNhapID varchar(255) NOT NULL, TenNhaCungCap varchar(255) NULL, SoDienThoai varchar(255) NULL, DiaChi varchar(255) NULL, PRIMARY KEY (NhaCungCapID));
CREATE TABLE HangNhap (HangNhapID varchar(255) NOT NULL, SoLuong int NOT NULL, NgayNhap datetime NULL, TongTien float(10) NOT NULL, PRIMARY KEY (HangNhapID));
CREATE TABLE ChiTietHangNhap (SanPhamSanPhamID varchar(255) NOT NULL, HangNhapHangNhapID varchar(255) NOT NULL, SoLuong int NOT NULL, DonGia float(10) NOT NULL, PRIMARY KEY (SanPhamSanPhamID, HangNhapHangNhapID));
ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FKChiTietHoa549264 FOREIGN KEY (HoaDonHoaDonID) REFERENCES HoaDon (HoaDonID);
ALTER TABLE HoaDon ADD CONSTRAINT FKHoaDon362329 FOREIGN KEY (NhanVienNhanVienID) REFERENCES NhanVien (NhanVienID);
ALTER TABLE HoaDon ADD CONSTRAINT FKHoaDon716679 FOREIGN KEY (KhachHangKhachHangID) REFERENCES KhachHang (KhachHangID);
ALTER TABLE NhaCungCap ADD CONSTRAINT FKNhaCungCap928869 FOREIGN KEY (HangNhapHangNhapID) REFERENCES HangNhap (HangNhapID);
ALTER TABLE SanPham ADD CONSTRAINT FKSanPham819527 FOREIGN KEY (NhaCungCapID) REFERENCES NhaCungCap (NhaCungCapID);
ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FKChiTietHoa598636 FOREIGN KEY (SanPhamID) REFERENCES SanPham (SanPhamID);
ALTER TABLE ChiTietHangNhap ADD CONSTRAINT FKChiTietHan985801 FOREIGN KEY (HangNhapHangNhapID) REFERENCES HangNhap (HangNhapID);
ALTER TABLE ChiTietHangNhap ADD CONSTRAINT FKChiTietHan62471 FOREIGN KEY (SanPhamSanPhamID) REFERENCES SanPham (SanPhamID);
