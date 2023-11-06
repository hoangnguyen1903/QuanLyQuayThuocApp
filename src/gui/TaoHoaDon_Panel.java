package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import dao.KhachHang_DAO;
import dao.SanPham_DAO;
import entity.KhachHang;
import entity.SanPham;

public class TaoHoaDon_Panel extends javax.swing.JPanel implements ActionListener {
	
    private javax.swing.JButton jButton_lamMoi;
    private javax.swing.JButton jButton_taoHoaDon;
    private javax.swing.JButton jButton_themGioHang;
    private javax.swing.JButton jButton_tim;
    private javax.swing.JButton jButton_timKiem;
    private javax.swing.JButton jButton_xoaGioHang;
    private javax.swing.JButton jButton_tinh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_chuDe;
    private javax.swing.JLabel jLabel_nguoiDung;
    private javax.swing.JLabel jLabel_nhapMa;
    private javax.swing.JLabel jLabel_soLuong;
    private javax.swing.JLabel jLabel_tenKhachHang;
    private javax.swing.JLabel jLabel_tienGuiLai;
    private javax.swing.JLabel jLabel_tongTien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPanel_sanPham;
    private javax.swing.JScrollPane jScrollPanel_gioHang;
    private javax.swing.JTable jTable_gioHang;
    private javax.swing.table.DefaultTableModel tableModel_gioHang;
    private javax.swing.JTable jTable_sanPham;
    private javax.swing.table.DefaultTableModel tableModel_sanPham;
    private javax.swing.JTextField jTextField_ma;
    private javax.swing.JTextField jTextField_soDienThoai;
    private javax.swing.JTextField jTextField_soLuong;
    private javax.swing.JTextField jTextField_tienNhan;
    
    private ArrayList<SanPham> sanPhamList;
    public TaoHoaDon_Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel_chuDe = new javax.swing.JLabel();
        jLabel_nguoiDung = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_ma = new javax.swing.JTextField();
        jButton_timKiem = new javax.swing.JButton();
        jButton_lamMoi = new javax.swing.JButton();
        jLabel_nhapMa = new javax.swing.JLabel();
        
        jPanel2 = new javax.swing.JPanel();
        jButton_themGioHang = new javax.swing.JButton();
        jTextField_soLuong = new javax.swing.JTextField();
        jLabel_soLuong = new javax.swing.JLabel();
        jButton_xoaGioHang = new javax.swing.JButton();
        jScrollPanel_gioHang = new javax.swing.JScrollPane();
        
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_soDienThoai = new javax.swing.JTextField();
        jButton_tim = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel_tenKhachHang = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_tinh = new javax.swing.JButton();
        
        jLabel_tongTien = new javax.swing.JLabel();
        jButton_taoHoaDon = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_tienNhan = new javax.swing.JTextField();
        jLabel_tienGuiLai = new javax.swing.JLabel();

        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_chuDe.setText("TẠO HOÁ ĐƠN");

        jLabel_nguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(jLabel_nguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel_nguoiDung))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_ma.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jTextField_ma.addActionListener(this);

        jButton_timKiem.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(this);

        jButton_lamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jLabel_nhapMa.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel_nhapMa.setText("Nhập mã:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_nhapMa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_timKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_lamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nhapMa)
                    .addComponent(jButton_timKiem)
                    .addComponent(jButton_lamMoi))
                .addGap(10, 10, 10))
        );
        
        // Table SanPham
		String[] cols = {"Mã sản phẩm", "Tên sản phẩm", "Ảnh", "Thành phần", "Cách dùng", "Xuất xứ", "Ngày sản xuất", "Ngày hết hạn", "Đơn giá", "Số lượng tồn", "Loại", "Tình trạng"};
		tableModel_sanPham = new javax.swing.table.DefaultTableModel(cols, 0);
		importSanPham();
		jTable_sanPham = new javax.swing.JTable(tableModel_sanPham);
        jTable_sanPham.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jScrollPanel_sanPham = new javax.swing.JScrollPane(jTable_sanPham);

        jButton_themGioHang.setText("Thêm vào giỏ hàng");
        jButton_themGioHang.addActionListener(this);

        jTextField_soLuong.addActionListener(this);

        jLabel_soLuong.setText("Nhập số lượng");

        jButton_xoaGioHang.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton_xoaGioHang.setText("Xoá khỏi giỏ hàng");
        jButton_xoaGioHang.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel_soLuong)
                .addGap(18, 18, 18)
                .addComponent(jTextField_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_themGioHang)
                .addGap(18, 18, 18)
                .addComponent(jButton_xoaGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_soLuong)
                    .addComponent(jTextField_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_themGioHang)
                    .addComponent(jButton_xoaGioHang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        // Table gio hang
        String[] cols_gioHang = {"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá bán", "Thành tiền"};
		tableModel_gioHang = new javax.swing.table.DefaultTableModel(cols_gioHang, 0);
		jTable_gioHang = new javax.swing.JTable(tableModel_gioHang);
        jTable_gioHang.setFont(new java.awt.Font("Times New Roman", 0, 14));
		jScrollPanel_gioHang = new JScrollPane(jTable_gioHang);

        jLabel5.setText("Nhập số điện thoại");

        jTextField_soDienThoai.addActionListener(this);

        jButton_tim.setText("Tìm kiếm");
        jButton_tim.addActionListener(this);

        jLabel6.setText("Tên khách hàng");

        jLabel_tenKhachHang.setText("");

        jLabel8.setText("Tổng tiền");

        jLabel_tongTien.setText("0 VND");

        jButton_taoHoaDon.setText("Tạo hoá đơn");
        jButton_taoHoaDon.addActionListener(this);

        jLabel10.setText("Tiền nhận");
        
        jButton_tinh.setText("Tính");
        jButton_tinh.addActionListener(this);

        jLabel11.setText("Tiền gửi lại");

        jLabel_tienGuiLai.setText("50.000 VND");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_tienGuiLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_tongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_tienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton_tinh)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jButton_tim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_taoHoaDon)
                .addGap(156, 156, 156))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton_tim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_tenKhachHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_tongTien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton_tinh)
                    .addComponent(jTextField_tienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel_tienGuiLai))
                .addGap(32, 32, 32)
                .addComponent(jButton_taoHoaDon)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPanel_sanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPanel_gioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanel_sanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPanel_gioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

    }
    
    
    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source.equals(jButton_timKiem)) {
			timKiemSanPham();
			return;
		}
		if(source.equals(jButton_lamMoi)) {
			lamMoi();
			return;
		}
		if(source.equals(jButton_themGioHang)) {
			themVaoGioHang();
			return;
		}
		if(source.equals(jButton_xoaGioHang)) {
			xoaKhoiGioHang();
			return;
		}
		if(source.equals(jButton_tim)) {
			timKiemKhachHang();
			return;
		}
		if(source.equals(jButton_tinh)) {
			tinhTien();
			return;
		}
		if(source.equals(jButton_taoHoaDon)) {
			taoHoaDon();
			return;
		}
	}
	
	public void timKiemSanPham() {
		String ma = jTextField_ma.getText().trim();
		SanPham sanPham = null;
		for (SanPham sp : sanPhamList) {
			if(sp.getSanPhamID().equals(ma)) {
				sanPham = sp;
				break;
			}
		}
		if(sanPham != null) {
			tableModel_sanPham.getDataVector().removeAllElements();
			tableModel_sanPham.addRow(sanPham.toString().split(";"));
		} else {
			JOptionPane.showMessageDialog(this, "Mã sản phẩm không tồn tại!");
		}
	}
	
	public void lamMoi() {
		jTextField_ma.setText("");
		jTextField_soLuong.setText("");
		jTable_sanPham.clearSelection();
		jTable_gioHang.clearSelection();
		tableModel_sanPham.getDataVector().removeAllElements();
		importSanPham();
	}
	
	public void importSanPham() {
		try {
			sanPhamList = new SanPham_DAO().getAllSanPham();
			for (SanPham sanPham : sanPhamList) {
				tableModel_sanPham.addRow(sanPham.toString().split(";"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void themVaoGioHang() {
		int row = jTable_sanPham.getSelectedRow();
		if(jTextField_soLuong.getText().trim().equals("") || row < 0) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng hoặc chưa chọn sản phẩm!");
			return;
		}
		
		boolean flag = false;
		String maSanPham = jTable_sanPham.getValueAt(row, 0).toString();
		int soLuong = Integer.parseInt(jTextField_soLuong.getText().trim());
		if(jTable_gioHang.getRowCount() > 0) {
			for(int i = 0; i < jTable_gioHang.getRowCount(); i++) {
			       String maSP = jTable_gioHang.getValueAt(i, 0).toString();
			       if(maSP.equals(maSanPham)) {
			    	   flag = true;
			    	   int sl = Integer.parseInt(jTable_gioHang.getValueAt(i, 2).toString());
			    	   int giaBan = Integer.parseInt(jTable_gioHang.getValueAt(i, 3).toString());
			    	   jTable_gioHang.setValueAt(sl+soLuong, i, 2);
			    	   jTable_gioHang.setValueAt(giaBan*(sl+soLuong), i, 4);
			    	   break;
			       }
			}
		}
		
		if(!flag) {
			String tenSanPham = jTable_sanPham.getValueAt(row, 1).toString();
			double donGia = Double.parseDouble(jTable_sanPham.getValueAt(row, 8).toString());
			int giaBan = (int) (donGia*1.4);
			int thanhTien = giaBan*soLuong;
			
			String[] data = {maSanPham, tenSanPham, soLuong+"", giaBan+"", thanhTien+""};
			tableModel_gioHang.addRow(data);
			jTextField_soLuong.setText("");
			jTable_sanPham.clearSelection();
		}
		int tongTien=0;
		for(int i = 0; i < jTable_gioHang.getRowCount(); i++) {
		       int thanhTien = Integer.parseInt(jTable_gioHang.getValueAt(i, 4).toString());
		       tongTien+=thanhTien;
		}
		jLabel_tongTien.setText(tongTien+""+" VND");
		
		lamMoi();
	}
	
	public void xoaKhoiGioHang() {
		int row = jTable_gioHang.getSelectedRow();
		if(row < 0) {
			JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm để xoá!");
			return;
		}
		
		tableModel_gioHang.removeRow(row);
	}
	
	public void timKiemKhachHang() {
		String soDienThoai = jTextField_soDienThoai.getText().trim();
		if(soDienThoai.equals("")) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện thoại!");
			return;
		}
		try {
			KhachHang khachHang = new KhachHang_DAO().getKhachHangTheoSDT(soDienThoai);
			if(!khachHang.toString().split(";")[0].equals("null")) {
				jLabel_tenKhachHang.setText(khachHang.getHoTen());				
			} else {				
				jLabel_tenKhachHang.setText("");
				JOptionPane.showMessageDialog(this, "Số điện thoại không tồn tại!");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void tinhTien() {
		if(jTextField_tienNhan.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập tiền nhận!");
			return;
		}
		int tienNhan = Integer.parseInt(jTextField_tienNhan.getText().trim());
		int tongTien = Integer.parseInt(jLabel_tongTien.getText().split(" ")[0]);
		if(tienNhan < tongTien) {
			JOptionPane.showMessageDialog(this, "Tiền nhận phải lớn hơn tổng tiền!");
			return;
		}
		int tienGuiLai = tienNhan - tongTien;
		jLabel_tienGuiLai.setText(tienGuiLai+" VND");
	}
	
	public void taoHoaDon() {
		
	}
}
