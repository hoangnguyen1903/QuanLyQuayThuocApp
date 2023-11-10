package gui;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.KhachHang_DAO;
import dao.NhanVien_DAO;
import entity.KhachHang;
import entity.NhanVien;

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

public class KhachHang_Panel extends JPanel implements ActionListener{
	
<<<<<<< HEAD
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton_lamMoi;
    private javax.swing.JButton jButton_sua;
    private javax.swing.JButton jButton_them;
    private javax.swing.JButton jButton_timKiem;
    private javax.swing.JButton jButton_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_chuDe;
    private javax.swing.JLabel jLabel_nguoiDung;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField_ma;
    private javax.swing.JTextField jTextField_soDienThoai;
	private DefaultTableModel table_model;



    public KhachHang_Panel() throws SQLException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() throws SQLException {
    	ConnectDB.getInstance().connect();
        jPanel3 = new javax.swing.JPanel();
        jLabel_chuDe = new javax.swing.JLabel();
        jLabel_nguoiDung = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_ma = new javax.swing.JTextField();
        jButton_timKiem = new javax.swing.JButton();
        jButton_lamMoi = new javax.swing.JButton();
        jButton_them = new javax.swing.JButton();
        jButton_sua = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_soDienThoai = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
=======
    private JButton jButton7;
    private JButton jButton_lamMoi;
    private JButton jButton_sua;
    private JButton jButton_them;
    private JButton jButton_timKiem;
    private JButton jButton_xoa;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel_chuDe;
    private JLabel jLabel_nguoiDung;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JTable jTable;
    private DefaultTableModel tableModel;
    private JTextField jTextField_ma;
    private JTextField jTextField_soDienThoai;

    public KhachHang_Panel() {
        khoiTao();
    }

    private void khoiTao() {
        jPanel3 = new JPanel();
        jLabel_chuDe = new JLabel();
        jLabel_nguoiDung = new JLabel();
        jPanel1 = new JPanel();
        jTextField_ma = new JTextField();
        jButton_timKiem = new JButton();
        jButton_timKiem.addActionListener(this);
        jButton_lamMoi = new JButton();
        jButton_lamMoi.addActionListener(this);
        jButton_them = new JButton();
        jButton_them.addActionListener(this);
        jButton_sua = new JButton();
        jButton_sua.addActionListener(this);
        jButton_xoa = new JButton();
        jButton_xoa.addActionListener(this);
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField_soDienThoai = new JTextField();
        jButton7 = new JButton();
        // Table
        String[] cols = {"Mã", "Tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Email", "Địa chỉ"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable = new JTable(tableModel);
        jScrollPane1 = new JScrollPane(jTable);

        jLabel_chuDe.setFont(new Font("Times New Roman", 1, 24)); 
        jLabel_chuDe.setHorizontalAlignment(SwingConstants.CENTER);
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
        jLabel_chuDe.setText("QUẢN LÝ KHÁCH HÀNG");

        jLabel_nguoiDung.setFont(new Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(jLabel_nguoiDung, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
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

        jButton_timKiem.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(this);

        jButton_lamMoi.setFont(new Font("Times New Roman", 0, 14));
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jButton_them.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_them.setText("Thêm");
        jButton_them.addActionListener(this);

        jButton_sua.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_sua.setText("Sửa");
        jButton_sua.addActionListener(this);

<<<<<<< HEAD
        jButton_xoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_xoa.setText("Xóa");
        jButton_xoa.addActionListener(this);
=======
        jButton_xoa.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_xoa.setText("Xoá");
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43

        jLabel1.setFont(new Font("Times New Roman", 1, 14));
        jLabel1.setText("Nhập mã:");

        jLabel2.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel2.setText("Nhập số điện thoại:");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jTextField_ma, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_soDienThoai)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_timKiem)
                .addGap(18, 18, 18)
                .addComponent(jButton_lamMoi)
                .addGap(18, 18, 18)
                .addComponent(jButton_them)
                .addGap(18, 18, 18)
                .addComponent(jButton_sua)
                .addGap(18, 18, 18)
                .addComponent(jButton_xoa)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_ma, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_timKiem)
                    .addComponent(jButton_lamMoi)
                    .addComponent(jButton_them)
                    .addComponent(jButton_sua)
                    .addComponent(jButton_xoa))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_soDienThoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

<<<<<<< HEAD
        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14));
//        jTable.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//               
//            },
//            new String [] {
//                "Mã", "Tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Email", "Địa chỉ"
//            }
//        ) {
//            Class[] types = new Class [] {
//                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//        });
//        jScrollPane1.setViewportView(jTable);
        KhachHang_DAO khachHang_DAO = new KhachHang_DAO();
        ArrayList<KhachHang> list = khachHang_DAO.getAllKhachHang();
        Object[][] data = {};
        String[] column = {"Mã", "Tên", "Giới tính", "Ngày sinh", "Email", "Số điện thoại", "Địa chỉ"};
        table_model = new DefaultTableModel(data, column);
        
        jTable = new JTable(table_model);
        for(KhachHang kh: list)
        {
        	Object[] obj = {kh.getKhachHangID(), kh.getHoTen(), kh.getGioiTinh(), kh.getNgaySinh(), kh.getEmail(), kh.getSoDienThoai(), kh.getDiaChi()};
        	table_model.addRow(obj);
        }
        jScrollPane.setViewportView(jTable);

=======
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
        jButton7.setText("jButton7");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
<<<<<<< HEAD
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
=======
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
                .addContainerGap())
        );

    }
    public void emptyForTable(DefaultTableModel model_table)
	{
		while(model_table.getRowCount() > 0)
		{
			model_table.removeRow(0);
		}
	}

    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String button = e.getActionCommand();

		if(button.equals("Tìm kiếm"))
		{
			try {
				ConnectDB.getInstance().connect();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			KhachHang_DAO khachHang_DAO = new KhachHang_DAO();
			KhachHang kh = khachHang_DAO.getKhachHangByNumberPhone(this.jTextField_soDienThoai.getText());
			
			if(kh == null)
			{
				try {
					ConnectDB.getInstance().connect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(this.jTextField_ma.getText().length() == 0 && this.jTextField_soDienThoai.getText().length() == 0)
				{
					JOptionPane.showMessageDialog(null, "Vui lòng nhập ít nhất 1 trường");
					return;
				}
				kh = khachHang_DAO.getKhachHangByID(this.jTextField_ma.getText());
				if(kh == null)
				{
					JOptionPane.showMessageDialog(null, "Khách hàng không tồn tại");
					return;
				}
				emptyForTable(table_model);
				Object[] obj = {kh.getKhachHangID(), kh.getHoTen(), kh.getGioiTinh(), kh.getNgaySinh(), kh.getEmail(), kh.getSoDienThoai(), kh.getDiaChi()};
				table_model.addRow(obj);
				return;
			}
			emptyForTable(table_model);
			Object[] obj = {kh.getKhachHangID(), kh.getHoTen(), kh.getGioiTinh(), kh.getNgaySinh(), kh.getEmail(), kh.getSoDienThoai(), kh.getDiaChi()};
			table_model.addRow(obj);
			return;
			
		}
		if(button.equals("Làm mới"))
		{
			refresh();
		}
		
		if(button.equals("Thêm"))
		{
			try {
				ConnectDB.getInstance().connect();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			KhachHang_DAO khachHang_DAO = new KhachHang_DAO();
			ThemKhachHang_GUI gd_Them =  new ThemKhachHang_GUI();
			gd_Them.setVisible(true);
			
//			String tenNhanVien = gd_Them.
//			NhanVien nv = new NhanVien();
			
			return;
			
		}
		if(button.equals("Sửa"))
		{
			KhachHang kh = new KhachHang();
			if(jTable.getSelectedRow() != -1)
			{
				int row = jTable.getSelectedRow();
				String makh = jTable.getValueAt(row, 0) + "";
				try {
					ConnectDB.getInstance().connect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				KhachHang_DAO khachHang_DAO = new KhachHang_DAO();
				kh = khachHang_DAO.getKhachHangByID(makh);
				
				CapNhatKhachHang_GUI gui_capnhat = new CapNhatKhachHang_GUI();
				gui_capnhat.setVisible(true);
				gui_capnhat.SuaThongTin(kh);
				return;		
			}
		}
		
		if(button.equals("Xóa"))
		{
			if(jTable.getSelectedRow() != -1)
			{
				int row = jTable.getSelectedRow();
				int decided = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xóa không?");
				if(decided == 0)
				{
					String makh = table_model.getValueAt(row, 0).toString();
					table_model.removeRow(row);
					try {
						ConnectDB.getInstance().connect();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					KhachHang_DAO khachHang_DAO = new KhachHang_DAO();
					if(khachHang_DAO.removeKhachHang(makh));
					{
						JOptionPane.showMessageDialog(null, "Đã xóa");
						return;
					}
				}
				if(decided == 1)
				{
					return;
				}
				if(decided == 2)
				{
					return;
				}
			}
		}
=======
		Object source = e.getSource();
		if(source.equals(jButton_them)) {
			new ThemKhachHang_GUI().setVisible(true);
		}
		if(source.equals(jButton_xoa)) {
			
		}
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
		
		if(source.equals(jButton_sua)) {
			new CapNhatKhachHang_GUI().setVisible(true);
		}
		if(source.equals(jButton_lamMoi)) {
			
		}
		if(source.equals(jButton_timKiem)) {
			
		}
	}
	public void refresh()
	{
		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		KhachHang_DAO khachHang_DAO = new KhachHang_DAO();
		jTextField_ma.setText("");
		jTextField_soDienThoai.setText("");
		emptyForTable(table_model);
		ArrayList<KhachHang> list = khachHang_DAO.getAllKhachHang();
		for(KhachHang kh: list)
        {
        	Object[] obj = {kh.getKhachHangID(), kh.getHoTen(), kh.getGioiTinh(), kh.getNgaySinh(), kh.getEmail(), kh.getSoDienThoai(), kh.getDiaChi()};
        	table_model.addRow(obj);
        }
		
		return;
	}
}
