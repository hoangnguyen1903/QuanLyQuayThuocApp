package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ThongKeSanPham;

public class ThongKe_DAO {
	
	public ThongKe_DAO() {
		
	}
	
//	public ArrayList<ThongKeSanPham> getAllSanPhamBanChayNhat() {
//		try {
//			ConnectDB.getInstance().connect();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Connection con = ConnectDB.getConnection();
//		PreparedStatement statement = null;
//		
//		try {
//			String sql = "Select  from SanPham as sp inner join HoaDon as hd on sp.SanPhamID=?";
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
}
