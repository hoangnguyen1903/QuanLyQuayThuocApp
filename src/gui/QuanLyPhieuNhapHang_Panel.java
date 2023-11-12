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
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import entity.NhanVien;

public class QuanLyPhieuNhapHang_Panel extends JPanel implements ActionListener {
	
    private JButton jButton_lamMoi;
    private JButton jButton_timKiem;
    private JButton jButton_xemChiTiet;
    private JButton jButton_xoa;
    private JDateChooser jDateChooser_ngayNhap;
    private JLabel jLabel_chuDe;
    private JLabel jLabel_ngayNhap;
    private JLabel jLabel_nguoiDung;
    private JPanel jPanel_center;
    private JPanel jPanel_north;
    private JScrollPane jScrollPane;
    private JTable jTable;
    private DefaultTableModel tableModel;
    
    private NhanVien nhanVien = new NhanVien();
    
    public QuanLyPhieuNhapHang_Panel(NhanVien nhanVien) {
    	this.nhanVien = nhanVien;
    	khoiTao();
    }
    
    private void khoiTao() {
        jPanel_north = new JPanel();
        jLabel_chuDe = new JLabel();
        jLabel_nguoiDung = new JLabel();
        jPanel_center = new JPanel();
        jButton_timKiem = new JButton();
        jButton_lamMoi = new JButton();
        jButton_xoa = new JButton();
        jLabel_ngayNhap = new JLabel();
        jDateChooser_ngayNhap = new com.toedter.calendar.JDateChooser();
        jButton_xemChiTiet = new JButton();
        // Table
        String[] cols = {"Mã nhà cung cấp", "Mã sản phẩm", "Số lượng", "Tổng tiền", "Ngày nhập"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable = new JTable(tableModel);
        jScrollPane = new JScrollPane(jTable);
        
        jLabel_chuDe.setFont(new Font("Times New Roman", 1, 24));
        jLabel_chuDe.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_chuDe.setText("QUẢN LÝ PHIẾU NHẬP HÀNG");

        jLabel_nguoiDung.setFont(new Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText(nhanVien.getChucVu() + " : "+ nhanVien.getHoTen()+ "-"+nhanVien.getNhanVienID());

        GroupLayout jPanel_northLayout = new GroupLayout(jPanel_north);
        jPanel_north.setLayout(jPanel_northLayout);
        jPanel_northLayout.setHorizontalGroup(
            jPanel_northLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jLabel_nguoiDung, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel_northLayout.setVerticalGroup(
            jPanel_northLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel_nguoiDung))
            .addGroup(jPanel_northLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_timKiem.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(this);

        jButton_lamMoi.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jButton_xoa.setFont(new Font("Times New Roman", 0, 14));
        jButton_xoa.setText("Xoá");
        jButton_xoa.addActionListener(this);

        jLabel_ngayNhap.setFont(new Font("Times New Roman", 1, 14));
        jLabel_ngayNhap.setText("Ngày nhập:");
        
        jButton_xemChiTiet.setFont(new Font("Times New Roman", 0, 14));
        jButton_xemChiTiet.setText("Xem chi tiết");
        jButton_xemChiTiet.addActionListener(this);

        GroupLayout jPanel_centerLayout = new GroupLayout(jPanel_center);
        jPanel_center.setLayout(jPanel_centerLayout);
        jPanel_centerLayout.setHorizontalGroup(
            jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_ngayNhap, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser_ngayNhap, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_timKiem)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_lamMoi)
                .addGap(11, 11, 11)
                .addComponent(jButton_xemChiTiet)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_xoa, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel_centerLayout.setVerticalGroup(
            jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel_centerLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_lamMoi)
                        .addComponent(jButton_timKiem)
                        .addComponent(jButton_xoa)
                        .addComponent(jButton_xemChiTiet))
                    .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_ngayNhap)
                        .addComponent(jDateChooser_ngayNhap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jTable.setFont(new Font("Times New Roman", 0, 14)); 

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_north, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_center, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, GroupLayout.PREFERRED_SIZE, 1042, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_north, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_center, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

    }

    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source.equals(jButton_lamMoi)) {
			
		}
		if(source.equals(jButton_timKiem)) {
			
		}
		if(source.equals(jButton_xemChiTiet)) {
			new ChiTietPhieuNhapHang_GUI().setVisible(true);
		}
		if(source.equals(jButton_xoa)) {
			
		}
		
	}

    
}
