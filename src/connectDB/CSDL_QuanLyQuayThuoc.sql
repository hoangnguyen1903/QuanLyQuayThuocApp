USE [master]
GO
/****** Object:  Database [QuanLyNhaThuoc]    Script Date: 10/29/2023 8:41:19 AM ******/
CREATE DATABASE [QuanLyNhaThuoc]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyNhaThuoc', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\QuanLyNhaThuoc.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QuanLyNhaThuoc_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\QuanLyNhaThuoc_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [QuanLyNhaThuoc] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyNhaThuoc].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyNhaThuoc] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET  ENABLE_BROKER 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET RECOVERY FULL 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyNhaThuoc] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QuanLyNhaThuoc] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'QuanLyNhaThuoc', N'ON'
GO
ALTER DATABASE [QuanLyNhaThuoc] SET QUERY_STORE = OFF
GO
USE [QuanLyNhaThuoc]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 10/29/2023 8:41:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[SanPhamID] [varchar](255) NOT NULL,
	[HoaDonID] [varchar](255) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[DonGia] [real] NOT NULL,
	[ThanhTien] [real] NOT NULL,
 CONSTRAINT [PK__ChiTietH__0F815A7D7B2DCB90] PRIMARY KEY CLUSTERED 
(
	[SanPhamID] ASC,
	[HoaDonID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HangNhap]    Script Date: 10/29/2023 8:41:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HangNhap](
	[SanPhamID] [varchar](255) NOT NULL,
	[NhaCungCapID] [varchar](255) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[TongTien] [real] NOT NULL,
	[NgayNhap] [datetime] NULL,
 CONSTRAINT [PK_HangNhap] PRIMARY KEY CLUSTERED 
(
	[SanPhamID] ASC,
	[NhaCungCapID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 10/29/2023 8:41:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[HoaDonID] [varchar](255) NOT NULL,
	[NhanVienID] [varchar](255) NOT NULL,
	[KhachHangID] [varchar](255) NOT NULL,
	[TongTien] [real] NOT NULL,
	[NgayLapHoaDon] [datetime] NOT NULL,
 CONSTRAINT [PK__HoaDon__6956CE692B8FAF36] PRIMARY KEY CLUSTERED 
(
	[HoaDonID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 10/29/2023 8:41:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[KhachHangID] [varchar](255) NOT NULL,
	[NgaySinh] [datetime] NULL,
	[SoDienThoai] [varchar](255) NOT NULL,
	[Email] [varchar](255) NULL,
	[HoTen] [varchar](255) NULL,
	[GioiTinh] [varchar](255) NULL,
	[DiaChi] [varchar](255) NULL,
 CONSTRAINT [PK__KhachHan__880F211B81C57FDD] PRIMARY KEY CLUSTERED 
(
	[KhachHangID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 10/29/2023 8:41:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[NhaCungCapID] [varchar](255) NOT NULL,
	[SoDienThoai] [varchar](255) NOT NULL,
	[TenNhaCungCap] [varchar](255) NULL,
	[DiaChi] [varchar](255) NULL,
 CONSTRAINT [PK__NhaCungC__8B89172786D71F78] PRIMARY KEY CLUSTERED 
(
	[NhaCungCapID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 10/29/2023 8:41:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[NhanVienID] [varchar](255) NOT NULL,
	[HoTen] [varchar](255) NULL,
	[GioiTinh] [varchar](255) NULL,
	[NgaySinh] [datetime] NULL,
	[Email] [varchar](255) NULL,
	[SoDienThoai] [varchar](255) NULL,
	[DiaChi] [varchar](255) NULL,
	[ChucVu] [varchar](255) NULL,
	[TenTaiKhoan] [varchar](255) NULL,
	[MatKhau] [varchar](255) NULL,
 CONSTRAINT [PK__NhanVien__E27FD7EA824E98C7] PRIMARY KEY CLUSTERED 
(
	[NhanVienID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 10/29/2023 8:41:19 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[SanPhamID] [varchar](255) NOT NULL,
	[ImgPath] [varchar](255) NULL,
	[NgaySanXuat] [datetime] NULL,
	[NgayHetHan] [datetime] NULL,
	[LoSanXuat] [varchar](255) NULL,
	[DonGia] [real] NOT NULL,
	[SoLuongTon] [int] NOT NULL,
	[TenSanPham] [varchar](255) NULL,
	[ThanhPhan] [varchar](255) NULL,
	[XuatXu] [varchar](255) NULL,
	[Loai] [varchar](255) NULL,
	[TinhTrang] [varchar](255) NULL,
 CONSTRAINT [PK__SanPham__05180FF4F778C2C4] PRIMARY KEY CLUSTERED 
(
	[SanPhamID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [NgaySinh], [Email], [SoDienThoai], [DiaChi], [ChucVu], [TenTaiKhoan], [MatKhau]) VALUES (N'NV28102301', N'Nguyễn Huy Hoàng', N'Nam', CAST(N'2003-10-19T00:00:00.000' AS DateTime), N'hoangnguyen.19032003@gmail.com', N'1234567890', N'Quận Tân Bình, TPHCM', N'Nhân viên', N'hoangnguyen123', N'hoangnguyen123')
INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [NgaySinh], [Email], [SoDienThoai], [DiaChi], [ChucVu], [TenTaiKhoan], [MatKhau]) VALUES (N'NV28102302', N'Trần Gia Huy', N'Nam', CAST(N'2003-10-28T00:00:00.000' AS DateTime), N'huytran123@gmail.com', N'0102030405', N'Quận Gò Vấp, TPHCM', N'Nhân viên', N'huytran123', N'huytran123')
INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [NgaySinh], [Email], [SoDienThoai], [DiaChi], [ChucVu], [TenTaiKhoan], [MatKhau]) VALUES (N'NV28102303', N'Nguyễn Thị Kim Tuyền', N'Nữ', CAST(N'2000-11-12T00:00:00.000' AS DateTime), N'kimtuyen123@gmail.com', N'0304050607', N'Cam Ranh, Khánh Hoà', N'Quản lý', N'kimtuyen123', N'kimtuyen123')
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([HoaDonID])
REFERENCES [dbo].[HoaDon] ([HoaDonID])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_SanPham] FOREIGN KEY([SanPhamID])
REFERENCES [dbo].[SanPham] ([SanPhamID])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_SanPham]
GO
ALTER TABLE [dbo].[HangNhap]  WITH CHECK ADD  CONSTRAINT [FK_HangNhap_NhaCungCap] FOREIGN KEY([NhaCungCapID])
REFERENCES [dbo].[NhaCungCap] ([NhaCungCapID])
GO
ALTER TABLE [dbo].[HangNhap] CHECK CONSTRAINT [FK_HangNhap_NhaCungCap]
GO
ALTER TABLE [dbo].[HangNhap]  WITH CHECK ADD  CONSTRAINT [FK_HangNhap_SanPham] FOREIGN KEY([SanPhamID])
REFERENCES [dbo].[SanPham] ([SanPhamID])
GO
ALTER TABLE [dbo].[HangNhap] CHECK CONSTRAINT [FK_HangNhap_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([KhachHangID])
REFERENCES [dbo].[KhachHang] ([KhachHangID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([NhanVienID])
REFERENCES [dbo].[NhanVien] ([NhanVienID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
USE [master]
GO
ALTER DATABASE [QuanLyNhaThuoc] SET  READ_WRITE 
GO
