package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.NhaCungCap;
import entity.NhanVien;
import util.GenerateID;

public class NhaCungCap_DAO {
	public NhaCungCap getNhaCungCapByID(String nhaCungCapID)
    {
    	NhaCungCap nhaCungCap = null;
		    String query = "SELECT * FROM NhaCungCap WHERE NhaCungCapID = ?";
		    
		    try (Connection conn =ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		        pstmt.setString(1, nhaCungCapID);
		        ResultSet rs = pstmt.executeQuery();
		        
		        if (rs.next()) {
		        	nhaCungCap = new NhaCungCap(
		                rs.getString("nhaCungCapID"),
		                rs.getString("tenNhaCungCap"),
		                rs.getString("soDienThoai"),
		                rs.getString("diaChi")
		            
		            );
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return nhaCungCap;
    }
	
	public NhaCungCap getNhaCungCapByNumber(String numberPhone)
    {
    		NhaCungCap nhaCungCap = null;
		    String query = "SELECT * FROM NhaCungCap WHERE soDienThoai = ?";
		    
		    try (Connection conn = ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		        pstmt.setString(1, numberPhone);
		        ResultSet rs = pstmt.executeQuery();
		        
		        if (rs.next()) {
		        	nhaCungCap = new NhaCungCap(
		                rs.getString("nhaCungCapID"),
		                rs.getString("tenNhaCungCap"),
		                rs.getString("soDienThoai"),
		                rs.getString("diaChi")
		            
		            );
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return nhaCungCap;
    }
	
	public boolean addNhaCungCap(NhaCungCap ncc)
    {
    	
    	String id = GenerateID.sinhMa("NCC");
		    String query = "INSERT INTO NhaCungCap(TenNhaCungCap, SoDienThoai, DiaChi, NhaCungCapID) VALUES (?, ?, ?, ?) ";
		    
		    try (Connection conn = ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		  
		        pstmt.setString(1, ncc.getTenNhaCungCap());
		        pstmt.setString(2, ncc.getSoDienThoai());
		        pstmt.setString(3, ncc.getDiaChi());
		        pstmt.setString(4, id);
		
		        return (pstmt.executeUpdate() > 0) ? true : false;
		        
		      
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return false;
    }
	public boolean removeNhaCungCap(String id)
    {
    	 String query = "DELETE FROM NhaCungCap WHERE NhaCungCapID= ?";
		    
		    try (Connection conn = ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		    	pstmt.setString(1, id);
		        return (pstmt.executeUpdate() > 0) ? true : false;
		        
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
    	return false;
    }
	public boolean editNhaCungCap(NhaCungCap ncc) {
		String id = ncc.getNhaCungCapID();
		try(Connection conn = ConnectDB.getConnection();) {
								
			String sql = "UPDATE NhaCungCap "
					+ "SET  "
					+ "TenNhaCungCap = ?," 
					+ "SoDienThoai = ?," 
					+ "DiaChi = ?"  						
					+ " WHERE NhaCungCapID = ?";

			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, ncc.getTenNhaCungCap());
			pstm.setString(2, ncc.getSoDienThoai());
			pstm.setString(3, ncc.getDiaChi());
			pstm.setString(4, id);

			return (pstm.executeUpdate() > 0) ? true : false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Lỗi");
			return false;
		}
    }
	
	public ArrayList<NhaCungCap> getAllNhaCungCap()
    {
    	ArrayList<NhaCungCap> list = new ArrayList<>();
		    String query = "SELECT * FROM NhaCungCap";
		    try (Connection conn =ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		         ResultSet rs = pstmt.executeQuery();       
		        while (rs.next()) {
		            NhaCungCap nhaCungCap = new NhaCungCap(
		            		 rs.getString("nhaCungCapID"),
				             rs.getString("tenNhaCungCap"),
				             rs.getString("soDienThoai"),
				             rs.getString("diaChi")
		            
		            );
		            list.add(nhaCungCap);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return list;
    }
	
}
