package gui;

<<<<<<< HEAD
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import connectDB.ConnectDB;
import dao.NhanVien_DAO;
import entity.NhanVien;

/**
 *
 * @author Admin
 */
public class CapNhatNhanVien_GUI extends javax.swing.JFrame implements ActionListener{
=======
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CapNhatNhanVien_GUI extends JFrame implements ActionListener {
	
    private JButton jButton_huyBo;
    private JButton jButton_sua;
    private JComboBox<String> jComboBox_chucVu;
    private com.toedter.calendar.JDateChooser jDateChooser_ngaySinh;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel_chuDe;
    private JLabel jLabel_maNhanVien;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JRadioButton jRadioButton_nam;
    private JRadioButton jRadioButton_nu;
    private JTextField jTextField_diaChi;
    private JTextField jTextField_email;
    private JTextField jTextField_soDienThoai;
    private JTextField jTextField_tenNhanVien;
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43

    public CapNhatNhanVien_GUI() {
        khoiTao();
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void khoiTao() {

        jPanel1 = new JPanel();
        jLabel_chuDe = new JLabel();
        jPanel4 = new JPanel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jTextField_tenNhanVien = new JTextField();
        jLabel6 = new JLabel();
        jLabel8 = new JLabel();
        jTextField_email = new JTextField();
        jLabel9 = new JLabel();
        jTextField_soDienThoai = new JTextField();
        jLabel11 = new JLabel();
        jTextField_diaChi = new JTextField();
        jLabel12 = new JLabel();
        jComboBox_chucVu = new JComboBox<>();
        jDateChooser_ngaySinh = new com.toedter.calendar.JDateChooser();
        jRadioButton_nam = new JRadioButton();
        jRadioButton_nu = new JRadioButton();
        jLabel_maNhanVien = new JLabel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        jButton_sua = new JButton();
        jButton_sua.addActionListener(this);
        jButton_huyBo = new JButton();
        jButton_huyBo.addActionListener(this);

<<<<<<< HEAD
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cập nhật thông tin nhân viên");
        setResizable(false);
=======
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Cập nhật thông tin nhân viên");
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43

        jLabel_chuDe.setFont(new Font("Times New Roman", 1, 24)); 
        jLabel_chuDe.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel_chuDe.setText("THÔNG TIN NHÂN VIÊN");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel_chuDe, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );

        jPanel4.setAutoscrolls(true);
        jPanel4.setPreferredSize(new Dimension(400, 434));

        jLabel3.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel3.setText("Tên nhân viên");

        jLabel4.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel4.setText("Giới tính");

        jLabel6.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel6.setText("Ngày sinh");

        jLabel8.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel8.setText("Email");

        jLabel9.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel9.setText("Số điện thoại");

        jLabel11.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel11.setText("Địa chỉ");

        jLabel12.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel12.setText("Chức vụ");

<<<<<<< HEAD
        jComboBox_chucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý" }));
=======
        jComboBox_chucVu.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43

        jRadioButton_nam.setText("Nam");

        jRadioButton_nu.setText("Nữ");

        jLabel_maNhanVien.setFont(new Font("Times New Roman", 2, 14)); 
        jLabel_maNhanVien.setText("NV0001");

        jLabel1.setFont(new Font("Times New Roman", 1, 14)); 
        jLabel1.setText("Mã nhân viên");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jRadioButton_nam, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_nu, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_chucVu, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_diaChi, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_email, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_ngaySinh, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_soDienThoai, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_tenNhanVien, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_maNhanVien, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_maNhanVien)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tenNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_nam)
                    .addComponent(jRadioButton_nu))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser_ngaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_soDienThoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_diaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox_chucVu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton_sua.setFont(new Font("Times New Roman", 1, 14)); 
        jButton_sua.setText("Sửa");
        jButton_sua.addActionListener(this);

        jButton_huyBo.setFont(new Font("Times New Roman", 1, 14)); 
        jButton_huyBo.setText("Huỷ bỏ");
        jButton_huyBo.addActionListener(this);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton_sua, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton_huyBo, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_sua)
                    .addComponent(jButton_huyBo))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhanVien_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhanVien_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhanVien_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhatNhanVien_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
<<<<<<< HEAD
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CapNhatNhanVien_GUI().setVisible(true);
            }
        });
    }
    
    public void SuaThongTin(NhanVien nv)
    {
    	this.jTextField_tenNhanVien.setText(nv.getHoTen());
    	if(nv.getGioiTinh().equals("Nam"))
    	{
    		this.jRadioButton_nam.setSelected(true);
    		this.jRadioButton_nu.setSelected(false);
    	}
    	if(nv.getGioiTinh().equals("Nữ"))
    	{
    		this.jRadioButton_nam.setSelected(false);
    		this.jRadioButton_nu.setSelected(true);
    	}
    	this.jLabel_maNhanVien.setText(nv.getNhanVienID());
    	this.jDateChooser_ngaySinh.setDate(nv.getNgaySinh());
    	this.jTextField_email.setText(nv.getEmail());
    	this.jTextField_soDienThoai.setText(nv.getSoDienThoai());
    	this.jTextField_diaChi.setText(nv.getDiaChi());
    	if(nv.getChucVu().equals("Nhân viên"))
    	{
    		this.jComboBox_chucVu.setSelectedIndex(0);
    	}
    	else if(nv.getChucVu().equals("Quản lý"))
    	{
    		this.jComboBox_chucVu.setSelectedIndex(1);
    	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_huyBo;
    private javax.swing.JButton jButton_sua;
    private javax.swing.JComboBox<String> jComboBox_chucVu;
    private com.toedter.calendar.JDateChooser jDateChooser_ngaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_chuDe;
    private javax.swing.JLabel jLabel_maNhanVien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton_nam;
    private javax.swing.JRadioButton jRadioButton_nu;
    private javax.swing.JTextField jTextField_diaChi;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_soDienThoai;
    private javax.swing.JTextField jTextField_tenNhanVien;
    // End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals("Sửa"))
		{

			NhanVien nv = new NhanVien();
			try {
				nv.setNhanVienID(jLabel_maNhanVien.getText());
				nv.setHoTen(this.jTextField_tenNhanVien.getText());
				if(jRadioButton_nam.isSelected())
				{
					nv.setGioiTinh("Nam");
				}
				if(jRadioButton_nu.isSelected())
				{
					nv.setGioiTinh("Nữ");
				}
				SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
			    String date = dcn.format(jDateChooser_ngaySinh.getDate() );
				//nv.setNgaySinh((new SimpleDateFormat("yyyy-MM-dd").parse(date)));
				Date DATE = Date.valueOf(date);
				nv.setNgaySinh(DATE);
				nv.setEmail(jTextField_email.getText());
				nv.setSoDienThoai(jTextField_soDienThoai.getText());
				nv.setDiaChi(jTextField_diaChi.getText());
				nv.setChucVu(jComboBox_chucVu.getSelectedItem()+"");
				
				try {
					ConnectDB.getInstance().connect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				NhanVien_DAO nhanVien_DAO = new NhanVien_DAO();
				nhanVien_DAO.editNhanVien(nv);
				
				this.setVisible(false);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else if(button.equals("Huỷ bỏ"))
		{
			this.setVisible(false);
		}
=======
      
        new CapNhatNhanVien_GUI().setVisible(true);
    }
    
    // Code
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source.equals(jButton_huyBo)) {
			dispose();
		}
		if(source.equals(jButton_sua)) {
			
		}
		
>>>>>>> f65a2bef5f0f77ba61bd0b80f207524668abca43
	}
}
