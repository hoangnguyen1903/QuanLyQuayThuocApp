package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.NhanVien;
import util.GenerateID;

public class NhanVien_DAO {
	
    public NhanVien getNhanVien(String tenTaiKhoan) throws SQLException {
        
        PreparedStatement statement = null;
        try {Connection conn =ConnectDB.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE TenTaiKhoan = ? ";
            statement = conn.prepareStatement(sql);
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
            try {Connection conn =ConnectDB.getConnection();
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public ArrayList<NhanVien> getAllNhanVien()
    {
    	ArrayList<NhanVien> list = new ArrayList<>();
		    String query = "SELECT * FROM NhanVien";
		    try (Connection conn =ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		         ResultSet rs = pstmt.executeQuery();       
		        while (rs.next()) {
		            NhanVien nhanVien = new NhanVien(
		                rs.getString("nhanVienID"),
		                rs.getString("tenTaiKhoan"),
		                rs.getString("matKhau"),
		                rs.getString("hoTen"),
		                rs.getString("gioiTinh"),
		                rs.getString("soDienThoai"),
		                rs.getString("chucVu"),
		                rs.getString("email"),
		                rs.getDate("ngaySinh"),
		                rs.getString("diaChi")
		            
		            );
		            list.add(nhanVien);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return list;
    }
    
    
    public NhanVien getNhanVienByID(String nhanVienID)
    {
    	NhanVien nhanVien = null;
		    String query = "SELECT * FROM NhanVien WHERE nhanVienID = ?";
		    
		    try (Connection conn =ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		        pstmt.setString(1, nhanVienID);
		        ResultSet rs = pstmt.executeQuery();
		        
		        if (rs.next()) {
		        	nhanVien = new NhanVien(
		                rs.getString("nhanVienID"),
		                rs.getString("tenTaiKhoan"),
		                rs.getString("matKhau"),
		                rs.getString("hoTen"),
		                rs.getString("gioiTinh"),
		                rs.getString("soDienThoai"),
		                rs.getString("chucVu"),
		                rs.getString("email"),
		                rs.getDate("ngaySinh"),
		                rs.getString("diaChi")
		            
		            );
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return nhanVien;
    }
    
    public NhanVien getNhanVienByNumberPhone(String numberPhone)
    {
    		NhanVien nhanVien = null;
		    String query = "SELECT * FROM NhanVien WHERE soDienThoai = ?";
		    
		    try (Connection conn = ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		        pstmt.setString(1, numberPhone);
		        ResultSet rs = pstmt.executeQuery();
		        
		        if (rs.next()) {
		            nhanVien = new NhanVien(
		                rs.getString("nhanVienID"),
		                rs.getString("tenTaiKhoan"),
		                rs.getString("matKhau"),
		                rs.getString("hoTen"),
		                rs.getString("gioiTinh"),
		                rs.getString("soDienThoai"),
		                rs.getString("chucVu"),
		                rs.getString("email"),
		                rs.getDate("ngaySinh"),
		                rs.getString("diaChi")
		            
		            );
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return nhanVien;
    }
    
    public boolean addNhanVien(NhanVien nv)
    {
    	
    	String id = GenerateID.sinhMa("NV");
		    String query = "INSERT INTO NhanVien(HoTen, TenTaiKhoan, MatKhau, GioiTinh, SoDienThoai, ChucVu, Email, NgaySinh, DiaChi, NhanVienID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		    
		    try (Connection conn = ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		  
		        pstmt.setString(1, nv.getHoTen());
		        pstmt.setString(2, nv.getTenTaiKhoan());
		        pstmt.setString(3, nv.getMatKhau());
		        pstmt.setString(4, nv.getGioiTinh());
		        pstmt.setString(5, nv.getSoDienThoai());
		        pstmt.setString(6, nv.getChucVu());
		        pstmt.setString(7, nv.getEmail());
		        pstmt.setDate(8, (Date) nv.getNgaySinh());
		        pstmt.setString(9, nv.getDiaChi());
		        pstmt.setString(10, id);
		
		        return (pstmt.executeUpdate() > 0) ? true : false;
		        
		      
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    return false;
    }
    
    public boolean removeNhanVien(String id)
    {
    	 String query = "DELETE FROM NhanVien WHERE NhanVienID= ?";
		    
		    try (Connection conn = ConnectDB.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(query)) {
		    	pstmt.setString(1, id);
		        return (pstmt.executeUpdate() > 0) ? true : false;
		        
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
    	return false;
    }
    
    public boolean editNhanVien(NhanVien nv) {
		String id = nv.getNhanVienID();
		try(Connection conn = ConnectDB.getConnection();) {
								
			String sql = "UPDATE NhanVien "
					+ "SET  "
					+ "HoTen = ?," 
					+ "GioiTinh = ?," 
					+ "SoDienThoai = ?," 
					+ "ChucVu = ?," 
					+ "NgaySinh = ?," 
					+ "DiaChi = ?,"  
					+ "Email = ?" 				
					+ " WHERE NhanVienID = ?";

			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, nv.getHoTen());
			pstm.setString(2, nv.getGioiTinh());
			pstm.setString(3, nv.getSoDienThoai());
			pstm.setString(4, nv.getChucVu());
			pstm.setDate(5, (Date)nv.getNgaySinh());
			pstm.setString(6, nv.getDiaChi());
			pstm.setString(7, nv.getEmail());
			pstm.setString(8, id);
			int check = pstm.executeUpdate();

//			System.out.println("Số dòng thay đổi: " + check);
//			
//			if(check > 0)
//			{
//				System.out.println("Thay đổi dữ liệu thành công");
//				return true;
//			}
//			else
//			{
//				System.out.println("Thay đổi dữ liệu thất bại");	
//				return false;
//			}
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(nv.getNgaySinh());
			e.printStackTrace();
			System.out.println("Lỗi");
			return false;
		}
		return true;
    }
}
