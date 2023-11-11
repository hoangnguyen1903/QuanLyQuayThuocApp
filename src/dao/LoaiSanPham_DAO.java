package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.LoaiSanPham;
import entity.SanPham;

public class LoaiSanPham_DAO {
	
	public LoaiSanPham_DAO() {
		
	}
	
	public ArrayList<LoaiSanPham> getAllLoaiSanPham() {
        PreparedStatement statement = null;
        try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Connection con = ConnectDB.getConnection();
        ArrayList<LoaiSanPham> loaiSPList = new ArrayList<LoaiSanPham>();
        try {
            String sql = "Select * from LoaiSanPham";
            statement = con.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()) {
            	LoaiSanPham loaiSP = new LoaiSanPham();
            	loaiSP.setLoaiID(rs.getString("LoaiID"));
            	loaiSP.setTenLoai(rs.getString("TenLoai"));
            	
            	loaiSPList.add(loaiSP);
            }
            return loaiSPList; 
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
