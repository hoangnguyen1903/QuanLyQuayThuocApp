package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.KhachHang;

public class KhachHang_DAO {
	
	public KhachHang_DAO() {
		
	}
	
	public KhachHang getKhachHangTheoSDT(String soDienThoai) {
        try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "SELECT * FROM KhachHang WHERE SoDienThoai=?";
            statement = con.prepareStatement(sql);
            statement.setString(1, soDienThoai);
            
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
            
            return khachHang; 
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
	
	public KhachHang getKhachHangTheoMa(String khachHangID) throws SQLException {
        ConnectDB.getInstance().connect();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "SELECT * FROM KhachHang WHERE KhachHangID=?";
            statement = con.prepareStatement(sql);
            statement.setString(1, khachHangID);
            
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
            
            return khachHang; 
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
