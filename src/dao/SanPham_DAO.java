package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.SanPham;

public class SanPham_DAO {
	
	public SanPham_DAO() {
		
	}
	
	public ArrayList<SanPham> getAllSanPham() throws SQLException {
        ConnectDB.getInstance().connect();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        ArrayList<SanPham> sanPhamList = new ArrayList<SanPham>();
        try {
            String sql = "SELECT sp.SanPhamID, ImgPath, TenSanPham, ThanhPhan, CachDung, XuatXu, NgaySanXuat, NgayHetHan, DonGia, SoLuongTon, TenLoai, TinhTrang  FROM SanPham as sp inner join LoaiSanPham as lsp on sp.LoaiID=lsp.LoaiID";
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
            	sanPham.setLoai(rs.getString(11));
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
}
