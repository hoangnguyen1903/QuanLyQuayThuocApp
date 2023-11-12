package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import entity.NhanVien;

public class PhieuNhapHang_Panel extends JPanel implements ActionListener {

    private JButton jButton_lamMoi;
    private JButton jButton_nhapHang;
    private JButton jButton_timKiemNhaCungCap;
    private JButton jButton_timKiemSanPham;
    private JLabel jLabel_chuDe;
    private JLabel jLabel_maNhaCungCap;
    private JLabel jLabel_maSanPham;
    private JLabel jLabel_nguoiDung;
    private JLabel jLabel_soLuong;
    private JLabel jLabel_tongTien;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable_nhaCungCap;
    private JTable jTable_sanPham;
    private DefaultTableModel tableModel_nhaCungCap;
    private DefaultTableModel tableModel_sanPham;
    private JTextField jTextField_maNhaCungCap;
    private JTextField jTextField_maSanPham;
    private JTextField jTextField_soLuong;
    private JTextField jTextField_tongTien;
    
    private NhanVien nhanVien = new NhanVien();
    
    public PhieuNhapHang_Panel(NhanVien nhanVien) {
    	this.nhanVien = nhanVien;
        khoiTao();
    }

    private void khoiTao() {
        jPanel3 = new JPanel();
        jLabel_chuDe = new JLabel();
        jLabel_nguoiDung = new JLabel();
        jPanel1 = new JPanel();
        jTextField_maNhaCungCap = new JTextField();
        jButton_timKiemNhaCungCap = new JButton();
        jLabel_maNhaCungCap = new JLabel();
        // Table
        String[] cols_sp = {"Mã", "Tên", "Ảnh", "Thành phần", "Xuất xứ", "Ngày SX", "Ngày HH", "Lô sản xuất", "Đơn giá", "Loại", "Số lượng tồn", "Tình trạng"};
        tableModel_sanPham = new DefaultTableModel(cols_sp, 0);
        jTable_sanPham = new JTable(tableModel_sanPham);
        jScrollPane1 = new JScrollPane(jTable_sanPham);

        String[] cols_ncc = {"Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"};
        tableModel_nhaCungCap = new DefaultTableModel(cols_ncc, 0);
        jTable_nhaCungCap = new JTable(tableModel_nhaCungCap);
        jScrollPane2 = new JScrollPane(jTable_nhaCungCap);
        
        jPanel6 = new JPanel();
        jTextField_maSanPham = new JTextField();
        jButton_timKiemSanPham = new JButton();
        jButton_lamMoi = new JButton();
        jLabel_maSanPham = new JLabel();
        jPanel5 = new JPanel();
        jLabel_soLuong = new JLabel();
        jTextField_soLuong = new JTextField();
        jLabel_tongTien = new JLabel();
        jTextField_tongTien = new JTextField();
        jButton_nhapHang = new JButton();
        
        jLabel_chuDe.setFont(new Font("Times New Roman", 1, 24)); 
        jLabel_chuDe.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_chuDe.setText("PHIẾU NHẬP HÀNG");

        jLabel_nguoiDung.setFont(new Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText(nhanVien.getChucVu() + " : "+ nhanVien.getHoTen()+ "-"+nhanVien.getNhanVienID());

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(jLabel_nguoiDung, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel_nguoiDung))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_maNhaCungCap.setFont(new Font("Times New Roman", 0, 14)); 
        jTextField_maNhaCungCap.addActionListener(this);

        jButton_timKiemNhaCungCap.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_timKiemNhaCungCap.setText("Tìm kiếm");
        jButton_timKiemNhaCungCap.addActionListener(this);

        jLabel_maNhaCungCap.setFont(new Font("Times New Roman", 1, 14));
        jLabel_maNhaCungCap.setText("Nhập mã nhà cung cấp:");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_maNhaCungCap, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_maNhaCungCap, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_timKiemNhaCungCap)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_maNhaCungCap, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_maNhaCungCap)
                    .addComponent(jButton_timKiemNhaCungCap))
                .addGap(10, 10, 10))
        );

        jTable_sanPham.setFont(new Font("Times New Roman", 0, 14)); 
        
        if (jTable_sanPham.getColumnModel().getColumnCount() > 0) {
            jTable_sanPham.getColumnModel().getColumn(2).setHeaderValue("Ảnh");
            jTable_sanPham.getColumnModel().getColumn(3).setHeaderValue("Thành phần");
            jTable_sanPham.getColumnModel().getColumn(4).setHeaderValue("Xuất xứ");
            jTable_sanPham.getColumnModel().getColumn(5).setHeaderValue("Ngày SX");
            jTable_sanPham.getColumnModel().getColumn(6).setHeaderValue("Ngày HH");
            jTable_sanPham.getColumnModel().getColumn(7).setHeaderValue("Lô sản xuất");
            jTable_sanPham.getColumnModel().getColumn(9).setHeaderValue("Loại");
            jTable_sanPham.getColumnModel().getColumn(11).setHeaderValue("Tình trạng");
        }

        jTable_nhaCungCap.setFont(new Font("Times New Roman", 0, 14)); 

        jTextField_maSanPham.setFont(new Font("Times New Roman", 0, 14)); 
        jTextField_maSanPham.addActionListener(this);

        jButton_timKiemSanPham.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_timKiemSanPham.setText("Tìm kiếm");
        jButton_timKiemSanPham.addActionListener(this);
        
        jButton_lamMoi.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jLabel_maSanPham.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel_maSanPham.setText("Nhập mã sản phẩm:");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_maSanPham, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_maSanPham, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_timKiemSanPham)
                .addGap(18, 18, 18)
                .addComponent(jButton_lamMoi)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_maSanPham, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_maSanPham)
                    .addComponent(jButton_lamMoi)
                    .addComponent(jButton_timKiemSanPham))
                .addGap(10, 10, 10))
        );

        jLabel_soLuong.setText("Nhập số lượng");

        jLabel_tongTien.setText("Nhập tổng tiền");

        jButton_nhapHang.setText("Nhập hàng");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_soLuong, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_tongTien, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_tongTien, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jTextField_soLuong))
                .addGap(18, 18, 18)
                .addComponent(jButton_nhapHang, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_soLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_soLuong))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_tongTien)
                            .addComponent(jTextField_tongTien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_nhapHang, GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }
    
    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source.equals(jButton_lamMoi)) {
			
		}
		
	}
}
