package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.text.SimpleDateFormat;

<<<<<<< HEAD
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.NhanVien_DAO;
import entity.NhanVien;

public class NhanVien_Panel extends javax.swing.JPanel implements ActionListener, MouseListener {

    private javax.swing.JButton jButton_lamMoi;
    private javax.swing.JButton jButton_sua;
    private javax.swing.JButton jButton_them;
    private javax.swing.JButton jButton_timKie;
    private javax.swing.JButton jButton_xoa;
    private javax.swing.JLabel jLabel_chuDe;
    private javax.swing.JLabel jLabel_nguoiDung;
    private javax.swing.JLabel jLabel_nhapMa;
    private javax.swing.JLabel jLabel_soDienThoai;
    private javax.swing.JPanel jPanel_center;
    private javax.swing.JPanel jPanel_north;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField_nhapMa;
    private javax.swing.JTextField jTextField_soDienThoai;
	private DefaultTableModel table_model;
    
    public NhanVien_Panel() throws SQLException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() throws SQLException {
		ConnectDB.getInstance().connect();
        jPanel_north = new javax.swing.JPanel();
        jLabel_chuDe = new javax.swing.JLabel();
        jLabel_nguoiDung = new javax.swing.JLabel();
        jPanel_center = new javax.swing.JPanel();
        jTextField_nhapMa = new javax.swing.JTextField();
        jButton_timKie = new javax.swing.JButton();
        jButton_lamMoi = new javax.swing.JButton();
        jButton_them = new javax.swing.JButton();
        jButton_sua = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jLabel_nhapMa = new javax.swing.JLabel();
        jLabel_soDienThoai = new javax.swing.JLabel();
        jTextField_soDienThoai = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
=======
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

public class NhanVien_Panel extends JPanel implements ActionListener {

    private JButton jButton_lamMoi;
    private JButton jButton_sua;
    private JButton jButton_them;
    private JButton jButton_timKiem;
    private JButton jButton_xoa;
    private JLabel jLabel_chuDe;
    private JLabel jLabel_nguoiDung;
    private JLabel jLabel_nhapMa;
    private JLabel jLabel_soDienThoai;
    private JPanel jPanel_center;
    private JPanel jPanel_north;
    private JScrollPane jScrollPane;
    private JTable jTable;
    private DefaultTableModel tableModel;
    private JTextField jTextField_nhapMa;
    private JTextField jTextField_soDienThoai;
    
    public NhanVien_Panel() {
        khoiTao();
    }

    private void khoiTao() {
        jPanel_north = new JPanel();
        jLabel_chuDe = new JLabel();
        jLabel_nguoiDung = new JLabel();
        jPanel_center = new JPanel();
        jTextField_nhapMa = new JTextField();
        jButton_timKiem = new JButton();
        jButton_lamMoi = new JButton();
        jButton_them = new JButton();
        jButton_sua = new JButton();
        jButton_xoa = new JButton();
        jLabel_nhapMa = new JLabel();
        jLabel_soDienThoai = new JLabel();
        jTextField_soDienThoai = new JTextField();
        String[] cols = {"Mã", "Tên", "Giới tính", "Ngày sinh", "Email", "Số điện thoại", "Địa chỉ", "Chức vụ", "Tên tài khoản", "Mật khẩu"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable = new JTable(tableModel);
        jScrollPane = new JScrollPane(jTable);

        jLabel_chuDe.setFont(new Font("Times New Roman", 1, 24));
        jLabel_chuDe.setHorizontalAlignment(SwingConstants.CENTER);
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
        jLabel_chuDe.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel_nguoiDung.setFont(new Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        GroupLayout jPanel_northLayout = new GroupLayout(jPanel_north);
        jPanel_north.setLayout(jPanel_northLayout);
        jPanel_northLayout.setHorizontalGroup(
            jPanel_northLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(jLabel_nguoiDung, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
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

        jTextField_nhapMa.addActionListener(this);

        jButton_timKiem.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(this);

        jButton_lamMoi.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jButton_them.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_them.setText("Thêm");
        jButton_them.addActionListener(this);
<<<<<<< HEAD
        
        jButton_sua.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_sua.setText("Sửa");
        jButton_sua.addActionListener(this);

        jButton_xoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_xoa.setText("Xóa");
=======

        jButton_sua.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_sua.setText("Sửa");
        jButton_sua.addActionListener(this);

        jButton_xoa.setFont(new Font("Times New Roman", 0, 14)); 
        jButton_xoa.setText("Xoá");
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
        jButton_xoa.addActionListener(this);

        jLabel_nhapMa.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel_nhapMa.setText("Nhập mã:");

        jLabel_soDienThoai.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel_soDienThoai.setText("Nhập số điện thoại:");

        GroupLayout jPanel_centerLayout = new GroupLayout(jPanel_center);
        jPanel_center.setLayout(jPanel_centerLayout);
        jPanel_centerLayout.setHorizontalGroup(
            jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_centerLayout.createSequentialGroup()
                        .addComponent(jLabel_nhapMa, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))
                    .addComponent(jLabel_soDienThoai, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_nhapMa, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(jTextField_soDienThoai))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_timKiem)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_lamMoi)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_them)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_sua)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_xoa)
                .addGap(74, 74, 74))
        );
        jPanel_centerLayout.setVerticalGroup(
            jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nhapMa)
                    .addComponent(jTextField_nhapMa, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_timKiem)
                    .addComponent(jButton_lamMoi)
                    .addComponent(jButton_them)
                    .addComponent(jButton_sua)
                    .addComponent(jButton_xoa))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_soDienThoai)
                    .addComponent(jTextField_soDienThoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

<<<<<<< HEAD
        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
        ArrayList<NhanVien> list = nhanVien_DAO.getAllNhanVien();
        Object[][] data = {};
        String[] column = {"Mã", "Tên", "Giới tính", "Ngày sinh", "Email", "Số điện thoại", "Địa chỉ", "Chức vụ"};
        table_model = new DefaultTableModel(data, column);
        
        jTable = new JTable(table_model);
        for(NhanVien nv: list)
        {
        	Object[] obj = {nv.getNhanVienID(), nv.getHoTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getEmail(), nv.getSoDienThoai(), nv.getDiaChi(), nv.getChucVu()};
        	table_model.addRow(obj);
        }
        jScrollPane.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
=======
        jTable.setFont(new Font("Times New Roman", 0, 14)); 

        GroupLayout layout = new GroupLayout(this);
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
       setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_north, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_center, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_north, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_center, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
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
			NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
			NhanVien nv = nhanVien_DAO.getNhanVienByNumberPhone(this.jTextField_soDienThoai.getText());
;
			if(nv == null)
			{
				try {
					ConnectDB.getInstance().connect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(this.jTextField_nhapMa.getText().length() == 0 && this.jTextField_soDienThoai.getText().length() == 0)
				{
					JOptionPane.showMessageDialog(null, "Vui lòng nhập ít nhất 1 trường");
					return;
				}
				nv = nhanVien_DAO.getNhanVienByID(this.jTextField_nhapMa.getText());
				if(nv == null)
				{
					JOptionPane.showMessageDialog(null, "Nhân viên không tồn tại");
					return;
				}
				emptyForTable(table_model);
				Object[] obj = {nv.getNhanVienID(), nv.getHoTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getEmail(), nv.getSoDienThoai(), nv.getDiaChi(), nv.getChucVu()};
				table_model.addRow(obj);
				return;
			}
			emptyForTable(table_model);
			Object[] obj = {nv.getNhanVienID(), nv.getHoTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getEmail(), nv.getSoDienThoai(), nv.getDiaChi(), nv.getChucVu()};
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
			NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
			ThemNhanVien_GUI gd_Them =  new ThemNhanVien_GUI();
			gd_Them.setVisible(true);
			
//			String tenNhanVien = gd_Them.
//			NhanVien nv = new NhanVien();
			
			return;
			
		}
		if(button.equals("Sửa"))
		{
			NhanVien nv = new NhanVien();
			if(jTable.getSelectedRow() != -1)
			{
				int row = jTable.getSelectedRow();
				String manv = jTable.getValueAt(row, 0) + "";
				try {
					ConnectDB.getInstance().connect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
				nv = nhanVien_DAO.getNhanVienByID(manv);
				
				CapNhatNhanVien_GUI gui_capnhat = new CapNhatNhanVien_GUI();
				gui_capnhat.setVisible(true);
				gui_capnhat.SuaThongTin(nv);
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
					String manv = table_model.getValueAt(row, 0).toString();
					table_model.removeRow(row);
					try {
						ConnectDB.getInstance().connect();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
					if(nhanVien_DAO.removeNhanVien(manv));
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
		
	}
	public void refresh()
	{
		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
		jTextField_nhapMa.setText("");
		jTextField_soDienThoai.setText("");
		emptyForTable(table_model);
		ArrayList<NhanVien> list = nhanVien_DAO.getAllNhanVien();
		for(NhanVien nv: list)
        {
        	Object[] obj = {nv.getNhanVienID(), nv.getHoTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getEmail(), nv.getSoDienThoai(), nv.getDiaChi(), nv.getChucVu()};
        	table_model.addRow(obj);
        }
		
		return;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
=======
		Object source = e.getSource();
		if(source.equals(jButton_them)) {
			new ThemNhanVien_GUI().setVisible(true);
		}
		if(source.equals(jButton_lamMoi)) {
			
		}
		if(source.equals(jButton_sua)) {
			new CapNhatNhanVien_GUI().setVisible(true);
		}
		if(source.equals(jButton_timKiem)) {
			
		}
		if(source.equals(jButton_xoa)) {
			
		}
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
		
	}
}
