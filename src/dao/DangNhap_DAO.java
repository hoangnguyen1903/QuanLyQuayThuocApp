package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectDB.ConnectDB;

public class DangNhap_DAO {

    public DangNhap_DAO() {

    }

    public boolean dangNhap(String tenTaiKhoan, String matKhau) throws SQLException {
        ConnectDB.getInstance().connect();
        Connection con = ConnectDB.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "SELECT COUNT(*) FROM NhanVien WHERE TenTaiKhoan = ? AND MatKhau = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, tenTaiKhoan);
            statement.setString(2, matKhau);
            
            ResultSet rs = statement.executeQuery();
            
            if (rs.next() &&  rs.getInt(1) > 0) {
                return true; 
            }
            return false; 
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
