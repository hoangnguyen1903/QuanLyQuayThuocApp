package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectDB.ConnectDB;
import entity.KhachHang;

public class HoaDon_DAO {
	
	public HoaDon_DAO() {
		
	}
	
	public boolean taoHoaDon(String hoaDonID, String nhanVienID, String khachHangID, int tongTien, Date ngayLap ) throws SQLException {
        ConnectDB.getInstance().connect();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "INSERT INTO HoaDon VALUES (?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);
            statement.setString(1, hoaDonID);
            statement.setString(2, nhanVienID);
            statement.setString(3, khachHangID);
            statement.setInt(4, tongTien);
            statement.setDate(5, ngayLap);
            
            ResultSet rs = statement.executeQuery();
            
            KhachHang khachHang = new KhachHang();
            if(rs.next()) {
            	khachHang.setKhachHangID(rs.getString(1));
            	khachHang.setHoTen(rs.getString(2));
            	khachHang.setGioiTinh(rs.getString(3));
            	khachHang.setNgaySinh(rs.getDate(4));
            	khachHang.setSoDienThoai(rs.getString(5));
            	khachHang.setEmail(rs.getString(6));
            	khachHang.setDiaChi(rs.getString(7));
            }
            
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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
