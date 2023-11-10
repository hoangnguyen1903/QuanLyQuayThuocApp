package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.NhaCungCap_DAO;
import dao.NhanVien_DAO;
import entity.NhaCungCap;
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

public class NhaCungCap_Panel extends JPanel implements ActionListener {
	
<<<<<<< HEAD
    private javax.swing.JButton jButton_lamMoi;
    private javax.swing.JButton jButton_sua;
    private javax.swing.JButton jButton_them;
    private javax.swing.JButton jButton_timKiem;
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
    
    public NhaCungCap_Panel() throws SQLException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() throws SQLException {
    	ConnectDB.getInstance().connect();
        jPanel_north = new javax.swing.JPanel();
        jLabel_chuDe = new javax.swing.JLabel();
        jPanel_center = new javax.swing.JPanel();
        jTextField_nhapMa = new javax.swing.JTextField();
        jButton_timKiem = new javax.swing.JButton();
        jButton_lamMoi = new javax.swing.JButton();
        jButton_them = new javax.swing.JButton();
        jButton_sua = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jLabel_nhapMa = new javax.swing.JLabel();
        jLabel_soDienThoai = new javax.swing.JLabel();
        jTextField_soDienThoai = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel_nguoiDung = new javax.swing.JLabel();

        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
=======
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
    
    public NhaCungCap_Panel() {
        khoiTao();
    }

    private void khoiTao() {
        jPanel_north = new JPanel();
        jLabel_chuDe = new JLabel();
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
        jLabel_nguoiDung = new JLabel();
        String[] cols = {"Mã", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable = new JTable(tableModel);
        jScrollPane = new JScrollPane(jTable);

        jLabel_chuDe.setFont(new Font("Times New Roman", 1, 24)); 
        jLabel_chuDe.setHorizontalAlignment(SwingConstants.CENTER);
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
        jLabel_chuDe.setText("QUẢN LÝ NHÀ CUNG CẤP");

        GroupLayout jPanel_northLayout = new GroupLayout(jPanel_north);
        jPanel_north.setLayout(jPanel_northLayout);
        jPanel_northLayout.setHorizontalGroup(
            jPanel_northLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        jPanel_northLayout.setVerticalGroup(
            jPanel_northLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_northLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
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
=======
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
                .addGap(18, 18, 18)
                .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_centerLayout.createSequentialGroup()
                        .addComponent(jLabel_nhapMa, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel_soDienThoai, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_soDienThoai, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(jTextField_nhapMa))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_timKiem)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_lamMoi)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_them)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_sua)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_xoa)
                .addGap(84, 84, 84))
        );
        jPanel_centerLayout.setVerticalGroup(
            jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nhapMa, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nhapMa)
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
//        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
//        jTable.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null}
//            },
//            new String [] {
//                "Mã", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
//            }
//        ) {
//            Class[] types = new Class [] {
//                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//        });
//        jScrollPane.setViewportView(jTable);
        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NhaCungCap_DAO nhaCungCap_DAO = new NhaCungCap_DAO();
        ArrayList<NhaCungCap> list = nhaCungCap_DAO.getAllNhaCungCap();
        Object[][] data = {};
        String[] column = {"Mã", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"};
        table_model = new DefaultTableModel(data, column);
        
        jTable = new JTable(table_model);
        for(NhaCungCap ncc: list)
        {
        	Object[] obj = {ncc.getNhaCungCapID(), ncc.getTenNhaCungCap(), ncc.getSoDienThoai(), ncc.getDiaChi()};
        	table_model.addRow(obj);
        }
        jScrollPane.setViewportView(jTable);

        jLabel_nguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
=======
        jTable.setFont(new Font("Times New Roman", 0, 14)); 

        jLabel_nguoiDung.setFont(new Font("Times New Roman", 0, 14)); 
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_center, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_north, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_nguoiDung)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, GroupLayout.PREFERRED_SIZE, 1040, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_north, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nguoiDung))
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
			NhaCungCap_DAO nhaCungCap_DAO = new NhaCungCap_DAO();
			NhaCungCap ncc = nhaCungCap_DAO.getNhaCungCapByNumber(this.jTextField_soDienThoai.getText());
;
			if(ncc == null)
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
				ncc = nhaCungCap_DAO.getNhaCungCapByID(this.jTextField_nhapMa.getText());
				if(ncc == null)
				{
					JOptionPane.showMessageDialog(null, "Nhân viên không tồn tại");
					return;
				}
				emptyForTable(table_model);
				Object[] obj = {ncc.getNhaCungCapID(), ncc.getTenNhaCungCap(), ncc.getSoDienThoai(), ncc.getDiaChi()};
				table_model.addRow(obj);
				return;
			}
			emptyForTable(table_model);
			Object[] obj = {ncc.getNhaCungCapID(), ncc.getTenNhaCungCap(), ncc.getSoDienThoai(), ncc.getDiaChi()};
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
			NhaCungCap_DAO nhaCungCap_DAO = new NhaCungCap_DAO();
			ThemNhaCungCap_GUI gd_Them =  new ThemNhaCungCap_GUI();
			gd_Them.setVisible(true);
			
//			String tenNhanVien = gd_Them.
//			NhanVien nv = new NhanVien();
			
			return;
			
		}
		if(button.equals("Sửa"))
		{
			NhaCungCap ncc = new NhaCungCap();
			if(jTable.getSelectedRow() != -1)
			{
				int row = jTable.getSelectedRow();
				String mancc = jTable.getValueAt(row, 0) + "";
				try {
					ConnectDB.getInstance().connect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				NhaCungCap_DAO nhaCungCap_DAO = new NhaCungCap_DAO();
				ncc = nhaCungCap_DAO.getNhaCungCapByID(mancc);
				
				CapNhatNhaCungCap_GUI gui_capnhat = new CapNhatNhaCungCap_GUI();
				gui_capnhat.setVisible(true);
				gui_capnhat.SuaThongTin(ncc);
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
					String mancc = table_model.getValueAt(row, 0).toString();
					table_model.removeRow(row);
					try {
						ConnectDB.getInstance().connect();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					NhaCungCap_DAO nhaCungCap_DAO = new NhaCungCap_DAO();
					if(nhaCungCap_DAO.removeNhaCungCap(mancc));
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
=======
		Object source = e.getSource();
		if(source.equals(jButton_them)) {
			new ThemNhaCungCap_GUI().setVisible(true);
		}
		if(source.equals(jButton_lamMoi)) {
			
		}
		if(source.equals(jButton_sua)) {
			new CapNhatNhaCungCap_GUI().setVisible(true);
		}
		if(source.equals(jButton_timKiem)) {
			
		}
		if(source.equals(jButton_xoa)) {
			
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
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
		NhaCungCap_DAO nhaCungCap_DAO = new NhaCungCap_DAO();
		jTextField_nhapMa.setText("");
		jTextField_soDienThoai.setText("");
		emptyForTable(table_model);
		ArrayList<NhaCungCap> list = nhaCungCap_DAO.getAllNhaCungCap();
		for(NhaCungCap ncc: list)
        {
        	Object[] obj = {ncc.getNhaCungCapID(), ncc.getTenNhaCungCap(), ncc.getSoDienThoai(), ncc.getDiaChi()};
        	table_model.addRow(obj);
        }
		
		return;
	}
}
