USE [master]
GO
/****** Object:  Database [QuanLyNhaThuoc]    Script Date: 11/15/2023 11:06:17 PM ******/
CREATE DATABASE [QuanLyNhaThuoc]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyNhaThuoc', FILENAME = N'D:\SQLServer\QuanLyNhaThuoc.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QuanLyNhaThuoc_log', FILENAME = N'D:\SQLServer\QuanLyNhaThuoc_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
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
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[SanPhamID] [varchar](255) NOT NULL,
	[HoaDonID] [varchar](255) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[GiaBan] [money] NOT NULL,
	[ThanhTien] [money] NOT NULL,
 CONSTRAINT [PK__ChiTietH__0F815A7D7B2DCB90] PRIMARY KEY CLUSTERED 
(
	[SanPhamID] ASC,
	[HoaDonID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HangNhap]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HangNhap](
	[SanPhamID] [varchar](255) NOT NULL,
	[NhaCungCapID] [varchar](255) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[TongTien] [money] NOT NULL,
	[NgayNhap] [datetime] NOT NULL,
 CONSTRAINT [PK_HangNhap] PRIMARY KEY CLUSTERED 
(
	[SanPhamID] ASC,
	[NhaCungCapID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[HoaDonID] [varchar](255) NOT NULL,
	[NhanVienID] [varchar](255) NOT NULL,
	[KhachHangID] [varchar](255) NOT NULL,
	[TongTien] [money] NOT NULL,
	[NgayLap] [datetime] NOT NULL,
 CONSTRAINT [PK__HoaDon__6956CE692B8FAF36] PRIMARY KEY CLUSTERED 
(
	[HoaDonID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[KhachHangID] [varchar](255) NOT NULL,
	[HoTen] [nvarchar](255) NOT NULL,
	[GioiTinh] [nvarchar](255) NOT NULL,
	[NgaySinh] [datetime] NULL,
	[SoDienThoai] [varchar](255) NOT NULL,
	[Email] [varchar](255) NOT NULL,
	[DiaChi] [nvarchar](255) NOT NULL,
 CONSTRAINT [PK__KhachHan__880F211B81C57FDD] PRIMARY KEY CLUSTERED 
(
	[KhachHangID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[LoaiID] [varchar](255) NOT NULL,
	[TenLoai] [nvarchar](255) NOT NULL,
 CONSTRAINT [PK_LoaiSanPham] PRIMARY KEY CLUSTERED 
(
	[LoaiID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[NhaCungCapID] [varchar](255) NOT NULL,
	[TenNhaCungCap] [nvarchar](255) NOT NULL,
	[SoDienThoai] [varchar](255) NOT NULL,
	[DiaChi] [nvarchar](255) NOT NULL,
 CONSTRAINT [PK__NhaCungC__8B89172786D71F78] PRIMARY KEY CLUSTERED 
(
	[NhaCungCapID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[NhanVienID] [varchar](255) NOT NULL,
	[HoTen] [nvarchar](255) NOT NULL,
	[GioiTinh] [nvarchar](255) NOT NULL,
	[NgaySinh] [datetime] NULL,
	[Email] [varchar](255) NOT NULL,
	[SoDienThoai] [varchar](255) NOT NULL,
	[DiaChi] [nvarchar](255) NOT NULL,
	[ChucVu] [nvarchar](255) NOT NULL,
	[TenTaiKhoan] [varchar](255) NOT NULL,
	[MatKhau] [varchar](255) NOT NULL,
 CONSTRAINT [PK__NhanVien__E27FD7EA824E98C7] PRIMARY KEY CLUSTERED 
(
	[NhanVienID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[SanPhamID] [varchar](255) NOT NULL,
	[ImgPath] [varchar](255) NULL,
	[TenSanPham] [nvarchar](255) NOT NULL,
	[ThanhPhan] [nvarchar](500) NOT NULL,
	[CachDung] [nvarchar](1000) NOT NULL,
	[XuatXu] [nvarchar](255) NOT NULL,
	[NgaySanXuat] [datetime] NOT NULL,
	[NgayHetHan] [datetime] NOT NULL,
	[DonGia] [money] NOT NULL,
	[SoLuongTon] [int] NOT NULL,
	[LoaiID] [varchar](255) NOT NULL,
	[TinhTrang] [nvarchar](255) NOT NULL,
 CONSTRAINT [PK__SanPham__05180FF4F778C2C4] PRIMARY KEY CLUSTERED 
(
	[SanPhamID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChiTietHoaDon] ([SanPhamID], [HoaDonID], [SoLuong], [GiaBan], [ThanhTien]) VALUES (N'SP110123103101', N'HD141123160454', 4, 489999.0000, 1959996.0000)
INSERT [dbo].[ChiTietHoaDon] ([SanPhamID], [HoaDonID], [SoLuong], [GiaBan], [ThanhTien]) VALUES (N'SP110123103102', N'HD151123213649', 2, 92400.0000, 184800.0000)
INSERT [dbo].[ChiTietHoaDon] ([SanPhamID], [HoaDonID], [SoLuong], [GiaBan], [ThanhTien]) VALUES (N'SP110123103104', N'HD151123213649', 3, 98000.0000, 294000.0000)
INSERT [dbo].[ChiTietHoaDon] ([SanPhamID], [HoaDonID], [SoLuong], [GiaBan], [ThanhTien]) VALUES (N'SP110123105001', N'HD141123160454', 3, 464799.0000, 1394397.0000)
INSERT [dbo].[ChiTietHoaDon] ([SanPhamID], [HoaDonID], [SoLuong], [GiaBan], [ThanhTien]) VALUES (N'SP131123151025', N'HD151123221623', 2, 2800.0000, 5600.0000)
INSERT [dbo].[ChiTietHoaDon] ([SanPhamID], [HoaDonID], [SoLuong], [GiaBan], [ThanhTien]) VALUES (N'SP131123233608', N'HD151123221623', 3, 30099.0000, 90297.0000)
GO
INSERT [dbo].[HangNhap] ([SanPhamID], [NhaCungCapID], [SoLuong], [TongTien], [NgayNhap]) VALUES (N'SP110123103101', N'NCC110123110101', 10, 500000.0000, CAST(N'2023-11-15T00:00:00.000' AS DateTime))
INSERT [dbo].[HangNhap] ([SanPhamID], [NhaCungCapID], [SoLuong], [TongTien], [NgayNhap]) VALUES (N'SP110123103101', N'NCC110123110102', 25, 500000.0000, CAST(N'2023-11-15T00:00:00.000' AS DateTime))
GO
INSERT [dbo].[HoaDon] ([HoaDonID], [NhanVienID], [KhachHangID], [TongTien], [NgayLap]) VALUES (N'HD141123160454', N'NV28102302', N'KH110123110401', 3354393.0000, CAST(N'2023-11-14T00:00:00.000' AS DateTime))
INSERT [dbo].[HoaDon] ([HoaDonID], [NhanVienID], [KhachHangID], [TongTien], [NgayLap]) VALUES (N'HD151123213649', N'NV28102302', N'KH110123110401', 478800.0000, CAST(N'2023-11-15T00:00:00.000' AS DateTime))
INSERT [dbo].[HoaDon] ([HoaDonID], [NhanVienID], [KhachHangID], [TongTien], [NgayLap]) VALUES (N'HD151123221623', N'NV28102302', N'KH110123110401', 95897.0000, CAST(N'2023-11-15T00:00:00.000' AS DateTime))
GO
INSERT [dbo].[KhachHang] ([KhachHangID], [HoTen], [GioiTinh], [NgaySinh], [SoDienThoai], [Email], [DiaChi]) VALUES (N'KH110123110401', N'Nguyễn Văn Quốc', N'Nam', CAST(N'1990-10-12T00:00:00.000' AS DateTime), N'0123456789', N'quoc123@gmail.com', N'Quận 1, TPHCM')
INSERT [dbo].[KhachHang] ([KhachHangID], [HoTen], [GioiTinh], [NgaySinh], [SoDienThoai], [Email], [DiaChi]) VALUES (N'KH110123110501', N'Phạm Thị Khánh An', N'Nữ', CAST(N'1992-12-10T00:00:00.000' AS DateTime), N'0213456789', N'an123@gmail.com', N'Quận 2, TPHCM')
INSERT [dbo].[KhachHang] ([KhachHangID], [HoTen], [GioiTinh], [NgaySinh], [SoDienThoai], [Email], [DiaChi]) VALUES (N'KH110123110601', N'Đặng Văn Quang', N'Nam', CAST(N'1890-02-02T00:00:00.000' AS DateTime), N'0312456789', N'quang123@gmail.com', N'Quận 3, TPHCM')
INSERT [dbo].[KhachHang] ([KhachHangID], [HoTen], [GioiTinh], [NgaySinh], [SoDienThoai], [Email], [DiaChi]) VALUES (N'KH110123110602', N'Trần Thị Như Ngọc', N'Nữ', CAST(N'2000-01-10T00:00:00.000' AS DateTime), N'0412346789', N'ngoc123@gmail.com', N'Quận 4, TPHCM')
INSERT [dbo].[KhachHang] ([KhachHangID], [HoTen], [GioiTinh], [NgaySinh], [SoDienThoai], [Email], [DiaChi]) VALUES (N'KH110123110603', N'Lê Khánh Hoà', N'Nam', CAST(N'1999-10-10T00:00:00.000' AS DateTime), N'0512346789', N'hoa123@gmail.com', N'Quận 5, TPHCM')
INSERT [dbo].[KhachHang] ([KhachHangID], [HoTen], [GioiTinh], [NgaySinh], [SoDienThoai], [Email], [DiaChi]) VALUES (N'KH151123213416', N'Nguyễn Huy Hoàng', N'Nam', CAST(N'2000-11-03T00:00:00.000' AS DateTime), N'0908070605', N'hoang123456@gmail.com', N'Quận 2, TPHCM')
INSERT [dbo].[KhachHang] ([KhachHangID], [HoTen], [GioiTinh], [NgaySinh], [SoDienThoai], [Email], [DiaChi]) VALUES (N'KH151123220508', N'Phạm Thị Hà', N'Nữ', CAST(N'1999-11-12T00:00:00.000' AS DateTime), N'0605040302', N'ha123@gmail.com', N'Quận Thủ Đức, TPHCM')
GO
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102601', N'Thuốc kháng dị ứng')
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102602', N'Thuốc kháng viêm')
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102603', N'Thuốc ngừa thai')
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102604', N'Thuốc cảm lạnh')
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102605', N'Thuốc da liễu')
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102606', N'Thuốc giảm cân')
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102607', N'Thuốc tiêu hoá')
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102608', N'Thuốc thần kinh')
INSERT [dbo].[LoaiSanPham] ([LoaiID], [TenLoai]) VALUES (N'LSP110123102609', N'Thuốc cơ xương khớp')
GO
INSERT [dbo].[NhaCungCap] ([NhaCungCapID], [TenNhaCungCap], [SoDienThoai], [DiaChi]) VALUES (N'NCC110123110101', N'Công ty Cổ phần Dược phẩm Agimexpharm (Việt Nam)
', N'0123456789', N'Quận Tân Bình, TPHCM')
INSERT [dbo].[NhaCungCap] ([NhaCungCapID], [TenNhaCungCap], [SoDienThoai], [DiaChi]) VALUES (N'NCC110123110102', N'Nhà máy STADA Việt Nam (Việt Nam)', N'0213456789', N'Quận 1, TPHCM')
INSERT [dbo].[NhaCungCap] ([NhaCungCapID], [TenNhaCungCap], [SoDienThoai], [DiaChi]) VALUES (N'NCC110123110201', N'Công ty TNHH Phil Inter Pharma (Việt Nam)', N'0312456789', N'Gò Công, Tiền Giang')
INSERT [dbo].[NhaCungCap] ([NhaCungCapID], [TenNhaCungCap], [SoDienThoai], [DiaChi]) VALUES (N'NCC110123110203', N'Công ty HOE Pharmaceuticals (Malaysia)', N'0412356789', N'Cam Ranh, Khánh Hoà')
INSERT [dbo].[NhaCungCap] ([NhaCungCapID], [TenNhaCungCap], [SoDienThoai], [DiaChi]) VALUES (N'NCC110123110301', N'Công ty Cổ phần Dược phẩm Nam Hà (Việt Nam)', N'0512346789', N'Châu Đốc, An Giang')
INSERT [dbo].[NhaCungCap] ([NhaCungCapID], [TenNhaCungCap], [SoDienThoai], [DiaChi]) VALUES (N'NCC151123214733', N'Cty TNHH Thời trang', N'0102050607', N'Quận 1, TPHCM')
GO
INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [NgaySinh], [Email], [SoDienThoai], [DiaChi], [ChucVu], [TenTaiKhoan], [MatKhau]) VALUES (N'NV151123214139', N'Nguyễn Lê Nhật Huy', N'Nam', CAST(N'2000-11-02T00:00:00.000' AS DateTime), N'huy123@gmail.com', N'0304050607', N'Quận 9, TPHCM', N'Nhân viên', N'0304050607', N'123456')
INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [NgaySinh], [Email], [SoDienThoai], [DiaChi], [ChucVu], [TenTaiKhoan], [MatKhau]) VALUES (N'NV28102301', N'Nguyễn Huy Hoàng', N'Nam', CAST(N'2003-10-19T00:00:00.000' AS DateTime), N'hoangnguyen.19032003@gmail.com', N'0123456789', N'Quận Tân Bình, TPHCM', N'Nhân viên', N'0123456789', N'123456')
INSERT [dbo].[NhanVien] ([NhanVienID], [HoTen], [GioiTinh], [NgaySinh], [Email], [SoDienThoai], [DiaChi], [ChucVu], [TenTaiKhoan], [MatKhau]) VALUES (N'NV28102302', N'Trần Gia Huy', N'Nam', CAST(N'2003-10-28T00:00:00.000' AS DateTime), N'tranhuy12072003@gmail.com', N'0367819442', N'Quận Gò Vấp, TPHCM', N'Nhân viên', N'0367819442', N'123456')
GO
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123103101', N'src//img//Agilodin-10g.png', N'Agilodin 10g (Hộp 10 vỉ x 10 viên)', N'Mỗi viên nén chứa: Loratadin 10mg
Tá dược vừa đủ 1 viên.', N'Người lớn và trẻ em từ 12 tuổi trở lên: Uống 1 viên một lần trong ngày
Trẻ em 2-12 tuổi:
- Chỉ dùng cho trẻ em có trọng lượng cơ thể >30kg: Uống 1 viên một lần trong ngày
- Không dùng dạng viên nén cho trẻ em có trọng lượng cơ thể <30kg.
An toàn và hiệu quả khi dùng loratadin cho trẻ em dưới 2 tuổi chưa được xác định.
Suy gan nặng: Liều khởi đầu là 1 viên, 2 ngày một lần cho người lớn và trẻ em có trọng lượng cơ thể >30kg
Suy thận nhẹ và người cao tuổi: Không cần điều chỉnh liều
Suy thận nặng (Clcr <30ml/phút):
- Uống 1 viên, 2 ngày một lần cho người lớn và trẻ em trên 6 tuổi.
- Uống ½ viên, 2 ngày một lần cho trẻ em 2-5 tuổi', N'Công ty Cổ phần Dược phẩm Agimexpharm (Việt Nam)
', CAST(N'2023-01-11T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 350000.0000, 10, N'LSP110123102602', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123103102', N'src//img//Bostanex.png', N'Bostanex (Hộp 3 vỉ x 10 viên)', N'Mỗi viên nén bao phim có chứa:
Thành phần hoạt chất: Desloratadin 5 mg
Thành phần tá dược: Lactose monohydrat, cellulose vi tinh thể type 102, calci phosphat, tinh bột ngô, talc, magnesi stearat, polyvinyl alcohol, PEG 6000, titan dioxyd, màu xanh số 2.', N'BOSTANEX được dùng bằng đường uống, cùng hoặc không cùng bữa ăn.

- Người lớn và thanh thiếu niên (≥12 tuổi): 1 viên x 1 lần/ngày.
- Viêm mũi dị ứng gián đoạn (triệu chứng xuất hiện < 4 ngày/tuần hoặc < 4 tuần) nên được điều trị phù hợp dựa trên đánh giá tiền sử bệnh của bệnh nhân, nên ngừng điều trị khi hết triệu chứng và tái điều trị khi tái xuất hiện triệu chứng.
- Viêm mũi dị ứng dai dẳng (triệu chứng xuất hiện ≥ 4 ngày/tuần và kéo dài > 4 tuần), có thể điều trị liên tục trong thời gian tiếp xúc với dị nguyên.
- Độ an toàn và hiệu quả của desloratadin dưới dạng viên nén bao phim đối với trẻ em <12 tuổi chưa được chứng minh. Nên dùng dạng bào chế khác thích hợp.
', N'Việt Nam', CAST(N'2023-01-11T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 66000.0000, 10, N'LSP110123102601', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123103103', N'src//img//Cetirizine-STADA-10mg.png', N'Cetirizine STADA 10mg (10 Vỉ x 10 Viên)', N'Mỗi viên nén chứa:
Dược chất: Cetirizin dihydrocloride 10mg
Tá dược: Maize starch, lactose monohydrate, croscarmellose sodium, PVP K30, sodium lauryl sulfate, sodium starch glycolate, acid stearic, magnesium stearate, colloidal silicon dioxide.', N'Người lớn: 10mg x 1 lần/ngày
Người cao tuổi: Không cần giảm liều ở người cao tuổi có chức năng thận bình thường.
Suy gan: Không cần điều chỉnh liều ở bệnh nhân suy gan đơn độc. Ở những bệnh nhân bị suy gan và suy thận, nên điều chỉnh liều (xem phần hướng dẫn liều cho bệnh nhân suy thận)', N'Nhà máy STADA Việt Nam (Việt Nam)', CAST(N'2023-01-11T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 50000.0000, 10, N'LSP110123102601', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123103104', N'src//img//Desbebe.png', N'Desbebe (Chai 60ml)', N'– Hoạt chất: Desloratadine 30mg.
 – Tá dược vừa đủ 1 viên (Sucrose, glycerol, propylene glycol, dinatri edetate, citric acid monohydrate, colour sunset yellow supra, natri benzoate, natri citrate, essence mix fruit, purified water).', N'Người lớn và thanh thiếu niên (> 12 tuổi): 10ml (5mg) sirô Desbebe, uống 1 lần/ngày, uống cùng hoặc không cùng bữa ăn, để giảm các triệu chứng liên quan đến viêm mũi dị ứng (bao hồm viêm mũi dị ứng không liên tục và viêm mũi dị ứng kéo dài) và mề đay. Chỉ dùng đường uống.
 Trẻ em từ 6 đến 11 tuổi: 5ml (2,5mg) sirô Desbebe, uống 1 lần/ngày, uống cùng hoặc không cùng bữa ăn, để giảm các triệu chứng liên quan đến viêm mũi dị ứng (bao hồm viêm mũi dị ứng không liên tục và viêm mũi dị ứng kéo dài) và mày đay.', N'Gracure Pharmaceuticals Ltd (Ấn Độ)', CAST(N'2023-01-11T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 70000.0000, 10, N'LSP110123102601', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123104401', N'src//img//Desloratadin.png', N'Desloratadin (Hộp 10 vỉ x 10 viên)', N'Desloratadin 5mg', N'- Người lớn và trẻ em từ 6 tuổi trở lên, uống 1 viên 10 mg/ngày hoặc 5 mg x 2 lần/ngày.
- Bệnh nhân suy thận: Dùng 1⁄2 liều khuyến cáo.
- Bệnh nhân suy gan: Dùng 5 mg/ lần/ngày.', N'Công ty Cổ phần Dược phẩm Khánh Hòa (Việt Nam)', CAST(N'2023-01-11T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 60000.0000, 10, N'LSP110123102601', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123104601', N'src//img//Voltaren Emulgel.jpg', N'Voltaren Emulgel (Tuýp 20g)', N'Hoạt chất: 100g Voltaren Emulgel chứa diclofenac diethylamine 1.16g (tương ứng với diclofenac natri 1g).

Tá dược: Carbomer, ether macrogol cetostearyl, cocoyl caprylocaprate, diethylamine, alcd isopropyl, paraffin lỏng, dầu khoáng, kem thơm 45, propylene glycol, nước tinh khiết.', N'Người lớn và trẻ em từ 12 tuổi trở lên

Tùy thuộc vào kích thước của vùng đau cần điều trị, bôi 2 - 4g Voltaren Emulgel (lượng cỡ bằng quả anh đào đến quả hạch, đủ để điều trị cho một vùng khoảng 400 - 800 cm2), 3 - 4 lần/ngày vào vùng bệnh và xoa nhẹ nhàng.', N'Việt Nam', CAST(N'2023-01-11T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 70000.0000, 10, N'LSP110123102602', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123105001', N'src//img//Philcotam.png', N'Philcotam 250mg (Hộp 10 vỉ x 10 viên)', N'Mỗi viên nang mềm chứa:
Hoạt chất: Naproxen ... 250 mg
Tá dược: Polyethylen glycol 600, Polyoxyl 40 hydrogenat castor oil, Kali hydroxyd, Butylated hydroxytoluen, Gelatin, Dung dịch sorbitol sorbitan, Nước tinh khiết, Ethyl vanillin, Sunset yellow FCF, Brilliant blue FCF.', N'+ Người lớn
Viêm khớp dạng thấp, thoái hóa xương khớp và viêm cột sống dính khớp.
500mg đến 1g mỗi ngày chia thành 2 lần mỗi lần cách nhau 12 giờ hoặc uống 1 lần. Sử dụng liều khởi đầu 750mg hoặc 1g/ngày trong giai đoạn cấp tính đối với các trường hợp sau:
a) Bệnh nhân đau nhiều về đêm hoặc cứng khớp buổi sáng.
b) Bệnh nhân chuyển sang dùng naproxen sau khi đã sử dụng một thuốc điều trị thấp khớp khác với liều cao.
c) Bệnh nhân thoái hóa khớp có triệu chứng đau rõ rệt.', N'Công ty TNHH Phil Inter Pharma (Việt Nam)', CAST(N'2023-01-11T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 332000.0000, 10, N'LSP110123102607', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123105401', N'src//img//Cetirizine-EG.png', N'Cetirizine EG 10mg Pymepharco (Hộp 10 vỉ x 10 viên)', N'Cetirizin dihydroclorid 10mg.', N'- Người lớn và trẻ em từ 6 tuổi trở lên, uống 1 viên 10 mg/ngày hoặc 5 mg x 2 lần/ngày.
 - Bệnh nhân suy thận: Dùng 1⁄2 liều khuyến cáo.
 - Bệnh nhân suy gan: Dùng 5 mg/ lần/ngày.', N'Công ty TNHH Phil Inter Pharma (Việt Nam)', CAST(N'2023-01-13T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 40000.0000, 10, N'LSP110123102601', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP110123105801', N'src//img//Hoe-Tramsone.png', N'Hoe Tramsone 0,1% 15g (1 tuýp)', N'Triamcinolone 0.1%
 Tá dược vừa đủ 1 tuýp', N'Tramsone được dùng để bôi ngoài da.Rửa sạch, lau khô vùng da bệnh, bôi lớp kem mỏng lên vùng da bệnh và chà xát nhẹ nhàng, 1-2 lần/ngày ', N'Công ty HOE Pharmaceuticals (Malaysia)', CAST(N'2023-01-11T00:00:00.000' AS DateTime), CAST(N'2024-01-11T00:00:00.000' AS DateTime), 35000.0000, 50, N'LSP110123102602', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP131123115551', N'src//img//thuoc-ho-p-h-100ml-thumb-1-600x600.jpg', N'Thuốc ho P/H (Chai 100ml)', N' Cao đặc Bách bộ 2g (tương đương 15g dược liệu), cao đặc Cát cánh 1g (tương đương 10g dược liệu)...', N' Ngày uống 2 - 3 lần sau bữa ăn. - Người lớn: mỗi lần 4 thìa cà phê (20ml). - Trẻ em dưới 6 tuổi: mỗi lẩn 2 thìa cà phê (10ml). - Trẻ em từ 6 -14 tuổi: mỗi lần 3 thìa cà phê (15ml).', N'Công ty TNHH Đông Dược Phúc Hưng (Việt Nam)', CAST(N'2023-11-12T00:00:00.000' AS DateTime), CAST(N'2025-11-23T00:00:00.000' AS DateTime), 100000.0000, 150, N'LSP110123102601', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP131123151025', N'src//img//yasmin.png', N'Yasmin', N'Chất chống oxi hoá', N'LONOLO', N'Thái Lan', CAST(N'2023-11-13T00:00:00.000' AS DateTime), CAST(N'2024-11-12T00:00:00.000' AS DateTime), 2000.0000, 100, N'LSP110123102603', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP131123232548', N'src//img//Boncinor.jpg', N'Thuốc tránh thai BOCINOR TAB 1.5MG (Hộp 1 Vi x 1 Viên)', N'Levonorgestrel 1,5 mg Tá dược: Lactose, Avicel, Magnesi stearat, Povidon K30, Sodium Starch glycolat: vừa đủ 1 viên.', N'Tránh thai khẩn cấp, dùng trong vòng 72 giờ sau các cuộc giao hợp không dùng biện pháp tránh thai hoặc sau cuộc giao hợp mà biện pháp tránh thai sử dụng không đạt hiệu quả.', N'Công ty CP TNHH Rostex Pharma USA', CAST(N'2023-11-12T00:00:00.000' AS DateTime), CAST(N'2025-11-12T00:00:00.000' AS DateTime), 10000.0000, 50, N'LSP110123102603', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP131123232949', N'src//img//cerciorat.jpg', N'Cerciorat (Hộp 1 vỉ x 1 viên)', N'Thành phần hoạt chất: Levonorgestrel 1.5mg. Thành phần tá dược: Cellulose microcrystalline, lactose, monohydrate, poloxamer, croscamellose natri natri, magnesi stearat.', N'Uống một viên càng sớm càng tốt, tốt nhất trong vòng 12 giờ và không quá 72 giờ sau giao hợp không có phương pháp tránh thai. Nếu nôn sau khi uống thuốc trong vòng ba giờ, cần uống viên khác ngay lập tức. Cerciorat có thể được uống bất cứ lúc nào trong chu kỳ kinh nguyệt, trừ khi trễ kinh.', N'aboratorios Leon Farma S.A. (Tây Ban Nha)', CAST(N'2022-11-01T00:00:00.000' AS DateTime), CAST(N'2024-11-13T00:00:00.000' AS DateTime), 30000.0000, 400, N'LSP110123102603', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP131123233608', N'src//img//Cetirizine-EG.png', N'Hoạt huyết dưỡng não (Hộp 1 vỉ x 20 viên)', N' Cao đặc rễ Đinh lăng 150mg, Cao khô lá Bạch quả 5mg', N'Phòng và điều trị các bệnh sau:  + Suy giảm trí nhớ, căng thẳng thần kinh, kém tập trung.  + Thiểu năng tuần hoàn não, hội chứng tiền đình với các biểu hiện: Đau đầu, hoa mắt, chóng mặt, mất ngủ, mất thăng bằng.  + Giảm chức năng não bộ: giảm trí nhớ, suy nhược thần kinh, di chứng não.  - Hỗ trợ điều trị chứng run giật của bệnh nhân Parkinson.', N'Công ty CP Công nghệ cao Traphaco (Việt Nam)', CAST(N'2021-11-03T00:00:00.000' AS DateTime), CAST(N'2024-11-13T00:00:00.000' AS DateTime), 21500.0000, 100, N'LSP110123102608', N'Đang bán')
INSERT [dbo].[SanPham] ([SanPhamID], [ImgPath], [TenSanPham], [ThanhPhan], [CachDung], [XuatXu], [NgaySanXuat], [NgayHetHan], [DonGia], [SoLuongTon], [LoaiID], [TinhTrang]) VALUES (N'SP131123235200', N'src//img//salonship.jpg', N'SalonShip', N'Giam dau xuat su', N'Dán lên chỗ đau nhức', N'Long An', CAST(N'2023-08-09T00:00:00.000' AS DateTime), CAST(N'2024-11-07T00:00:00.000' AS DateTime), 300000.0000, 100, N'LSP110123102609', N'Đang bán')
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
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSanPham] FOREIGN KEY([LoaiID])
REFERENCES [dbo].[LoaiSanPham] ([LoaiID])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSanPham]
GO
/****** Object:  StoredProcedure [dbo].[CapNhatSoLuongTon]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[CapNhatSoLuongTon] @soluong int, @masp varchar(255)
as 
begin
	update SanPham
	set SoLuongTon = SoLuongTon + @soluong
	where SanPhamID=@masp
end
GO
/****** Object:  StoredProcedure [dbo].[GiamSoLuongTon]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[GiamSoLuongTon] @soluong int, @masp varchar(255)
as
begin
	update SanPham
	set SoLuongTon = SoLuongTon - @soluong
	where SanPhamID=@masp
end
GO
/****** Object:  Trigger [dbo].[CapNhatSanPhamSauKhiThem]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create trigger [dbo].[CapNhatSanPhamSauKhiThem] 
on [dbo].[HangNhap] after insert
as
	declare @soluong int, @masp varchar(255)
	select @soluong=hn.SoLuong, @masp=hn.SanPhamID from HangNhap as hn inner join inserted as i
	on hn.SanPhamID = i.SanPhamID
	if(@soluong > 0)
		exec CapNhatSoLuongTon @soluong, @masp
	else
		rollback
GO
ALTER TABLE [dbo].[HangNhap] ENABLE TRIGGER [CapNhatSanPhamSauKhiThem]
GO
/****** Object:  Trigger [dbo].[CapNhatSanPhamSauKhiXoa]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create trigger [dbo].[CapNhatSanPhamSauKhiXoa]
on [dbo].[HangNhap] after delete
as
	declare @soluong int, @masp varchar(255)
	if exists (select * from deleted)
		begin
			select @soluong=SoLuong, @masp=SanPhamID from deleted
			exec GiamSoLuongTon @soluong, @masp
		end
	else
		rollback
GO
ALTER TABLE [dbo].[HangNhap] ENABLE TRIGGER [CapNhatSanPhamSauKhiXoa]
GO
/****** Object:  Trigger [dbo].[XoaHoaDon]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create trigger [dbo].[XoaHoaDon]
on [dbo].[HoaDon] instead of delete
as
	declare @mahd varchar(255)
	select @mahd=HoaDonID from deleted
	delete from ChiTietHoaDon where HoaDonID=@mahd
	delete from HoaDon where HoaDonID=@mahd
GO
ALTER TABLE [dbo].[HoaDon] ENABLE TRIGGER [XoaHoaDon]
GO
/****** Object:  Trigger [dbo].[KiemTraSDTEmailNhanVien]    Script Date: 11/15/2023 11:06:17 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create trigger [dbo].[KiemTraSDTEmailNhanVien]
on [dbo].[NhanVien] instead of insert
as
	declare @sdt varchar(255), @email varchar(255)
	select @sdt=SoDienThoai, @email=Email from inserted
	
	if exists (select * from NhanVien where SoDienThoai=@sdt or Email=@email)
		rollback
	else
		insert NhanVien
		select * from inserted
GO
ALTER TABLE [dbo].[NhanVien] ENABLE TRIGGER [KiemTraSDTEmailNhanVien]
GO
USE [master]
GO
ALTER DATABASE [QuanLyNhaThuoc] SET  READ_WRITE 
GO
