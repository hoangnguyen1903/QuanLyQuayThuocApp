package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.KhachHang;
import entity.NhanVien;
import util.GenerateID;

public class KhachHang_DAO {
	

	
	public KhachHang getKhachHangByNumberPhone(String numberPhone){
		KhachHang khachHang = null;
	    String query = "SELECT * FROM KhachHang WHERE SoDienThoai = ?";
	    
	    try (Connection conn = ConnectDB.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {
	        pstmt.setString(1, numberPhone);
	        ResultSet rs = pstmt.executeQuery();
	        
	        if (rs.next()) {
	        	khachHang = new KhachHang(
	                rs.getString("khachHangID"),
	                rs.getString("hoTen"),
	                rs.getString("gioiTinh"),
	                rs.getDate("ngaySinh"),
	                rs.getString("soDienThoai"),
	                rs.getString("email"),
	                rs.getString("diaChi")
	            
	            );
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return khachHang;
    }
	
    public KhachHang getKhachHangByID(String khachHangID)
    {
    	KhachHang khachHang = null;
		    String query = "SELECT * FROM KhachHang WHERE KhachHangID = ?";
		    
		    try (Connection conn =ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		        pstmt.setString(1, khachHangID);
		        ResultSet rs = pstmt.executeQuery();
		        
		        if (rs.next()) {
		        	khachHang = new KhachHang(
			                rs.getString("khachHangID"),
			                rs.getString("hoTen"),
			                rs.getString("gioiTinh"),
			                rs.getDate("ngaySinh"),
			                rs.getString("soDienThoai"),
			                rs.getString("email"),
			                rs.getString("diaChi")
			            
			            );
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return khachHang;
    }
    public ArrayList<KhachHang> getAllKhachHang()
    {
    	ArrayList<KhachHang> list = new ArrayList<>();
		    String query = "SELECT * FROM KhachHang";
		    try (Connection conn =ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		         ResultSet rs = pstmt.executeQuery();    
		         
		        while (rs.next()) {
		            KhachHang khachHang = new KhachHang(
			                rs.getString("khachHangID"),
			                rs.getString("hoTen"),
			                rs.getString("gioiTinh"),
			                rs.getDate("ngaySinh"),
			                rs.getString("soDienThoai"),
			                rs.getString("email"),
			                rs.getString("diaChi")
		            
		            );
		            list.add(khachHang);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return list;
    }
    public boolean addKhachHang(KhachHang kh)
    {
    	
    	String id = GenerateID.sinhMa("KH");
		    String query = "INSERT INTO KhachHang(HoTen, GioiTinh, NgaySinh, SoDienThoai, Email, DiaChi, KhachHangID) VALUES (?, ?, ?, ?, ?, ?, ?) ";
		    
		    try (Connection conn = ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		  
		        pstmt.setString(1, kh.getHoTen());
		        pstmt.setString(2, kh.getGioiTinh());
		        pstmt.setDate(3, (Date) kh.getNgaySinh());   
		        pstmt.setString(4, kh.getEmail());
		        pstmt.setString(5, kh.getSoDienThoai());
		        pstmt.setString(6, kh.getDiaChi());
		        pstmt.setString(7, id);
		
		        return (pstmt.executeUpdate() > 0) ? true : false;
		        
		      
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return false;
    }
    
    public boolean removeKhachHang(String id)
    {
    	 String query = "DELETE FROM KhachHang WHERE KhachHangID= ?";
		    
		    try (Connection conn = ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		    	pstmt.setString(1, id);
		        return (pstmt.executeUpdate() > 0) ? true : false;
		        
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
    	return false;
    }
    
    public boolean editNhanVien(KhachHang kh) {
		String id = kh.getKhachHangID();
		try(Connection conn = ConnectDB.getConnection();) {
								
			String sql = "UPDATE KhachHang "
					+ "SET  "
					+ "HoTen = ?," 
					+ "GioiTinh = ?," 
					+ "NgaySinh = ?," 
					+ "SoDienThoai = ?," 
					+ "DiaChi = ?,"  
					+ "Email = ?" 				
					+ " WHERE KhachHangID = ?";

			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, kh.getHoTen());
			pstm.setString(2, kh.getGioiTinh());
			pstm.setDate(3, (Date)kh.getNgaySinh());
			pstm.setString(4, kh.getSoDienThoai());
			pstm.setString(5, kh.getDiaChi());
			pstm.setString(6, kh.getEmail());
			pstm.setString(7, id);
			return (pstm.executeUpdate() > 0) ? true : false;

		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(nv.getNgaySinh());
			e.printStackTrace();
			System.out.println("Lỗi");
			return false;
		}
    }
}
