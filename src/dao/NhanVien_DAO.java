package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectDB.ConnectDB;
import entity.NhanVien;

public class NhanVien_DAO {
	
	public NhanVien_DAO() {

    }

    public NhanVien getNhanVien(String tenTaiKhoan) throws SQLException {
        ConnectDB.getInstance().connect();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "SELECT * FROM NhanVien WHERE TenTaiKhoan = ? ";
            statement = con.prepareStatement(sql);
            statement.setString(1, tenTaiKhoan);
            
            ResultSet rs = statement.executeQuery();
            
            NhanVien nhanVien = new NhanVien(); 
            while(rs.next()) {
            	nhanVien.setNhanVienID(rs.getString(1));
            	nhanVien.setHoTen(rs.getString(2));
            	nhanVien.setGioiTinh(rs.getString(3));
            	nhanVien.setNgaySinh(rs.getDate(4));
            	nhanVien.setEmail(rs.getString(5));
            	nhanVien.setSoDienThoai(rs.getString(6));
            	nhanVien.setDiaChi(rs.getString(7));
            	nhanVien.setChucVu(rs.getString(8));
            	nhanVien.setTenTaiKhoan(rs.getString(9));
            }
            
            return nhanVien;
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
