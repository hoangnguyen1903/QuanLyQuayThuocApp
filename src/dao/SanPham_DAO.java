package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.LoaiSanPham;
import entity.SanPham;

public class SanPham_DAO {
	
	public SanPham_DAO() {
		
	}
	
	public ArrayList<SanPham> getAllSanPham() {
		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        PreparedStatement statement = null;
        ArrayList<SanPham> sanPhamList = new ArrayList<SanPham>();
        Connection con = ConnectDB.getConnection();
        try {
            String sql = "SELECT sp.SanPhamID, ImgPath, TenSanPham, ThanhPhan, CachDung, XuatXu, NgaySanXuat, NgayHetHan, DonGia, SoLuongTon, TenLoai, TinhTrang, sp.LoaiID  FROM SanPham as sp inner join LoaiSanPham as lsp on sp.LoaiID=lsp.LoaiID";
            statement = con.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()) {
            	SanPham sanPham = new SanPham();
            	sanPham.setSanPhamID(rs.getString(1));
            	sanPham.setImgPath(rs.getString(2));
            	sanPham.setTenSanPham(rs.getString(3));
            	sanPham.setThanhPhan(rs.getString(4));
            	sanPham.setCachDung(rs.getString(5));
            	sanPham.setXuatXu(rs.getString(6));
            	sanPham.setNgaySanXuat(rs.getDate(7));
            	sanPham.setNgayHetHan(rs.getDate(8));
            	sanPham.setDonGia(rs.getDouble(9));
            	sanPham.setSoLuongTon(rs.getInt(10));
            	LoaiSanPham loai = new LoaiSanPham(rs.getString(13), rs.getString(11));
            	sanPham.setLoaiSanPham(loai);
            	sanPham.setTinhTrang(rs.getString(12));
            	
            	sanPhamList.add(sanPham);
            }
            return sanPhamList; 
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            	
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	
	public SanPham timKiemSanPhamTheoMa(String ma) {
		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		try {
			String sql = "SELECT sp.*, lsp.TenLoai  FROM SanPham as sp inner join LoaiSanPham as lsp on sp.LoaiID=lsp.LoaiID where SanPhamID=?";
			statement = con.prepareStatement(sql);
			statement.setString(1, ma);
			
			ResultSet rs = statement.executeQuery();
			SanPham sanPham = null; 
			if(rs.next()) {
				sanPham = new SanPham();
            	sanPham.setSanPhamID(rs.getString("SanPhamID"));
            	sanPham.setImgPath(rs.getString("ImgPath"));
            	sanPham.setTenSanPham(rs.getString("TenSanPham"));
            	sanPham.setThanhPhan(rs.getString("ThanhPhan"));
            	sanPham.setCachDung(rs.getString("CachDung"));
            	sanPham.setXuatXu(rs.getString("XuatXu"));
            	sanPham.setNgaySanXuat(rs.getDate("NgaySanXuat"));
            	sanPham.setNgayHetHan(rs.getDate("NgayHetHan"));
            	sanPham.setDonGia(rs.getDouble("DonGia"));
            	sanPham.setSoLuongTon(rs.getInt("SoLuongTon"));
            	LoaiSanPham loai = new LoaiSanPham(rs.getString("LoaiID"), rs.getString("TenLoai"));
            	sanPham.setLoaiSanPham(loai);
            	sanPham.setTinhTrang(rs.getString("TinhTrang"));
			}
			return sanPham;
		} catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            	
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}
}
