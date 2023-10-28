
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.DangNhap_DAO;

public class DangNhap_GUI extends javax.swing.JFrame implements ActionListener{
	
    private javax.swing.JButton jButton_dangNhap;
    private javax.swing.JButton jButton_quenMatKhau;
    private javax.swing.JLabel jLabel_chuDe;
    private javax.swing.JLabel jLabel_matKhau;
    private javax.swing.JLabel jLabel_tenDangNhap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_matKhau;
    private javax.swing.JTextField jTextField_tenDangNhap;

    public DangNhap_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_chuDe = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_tenDangNhap = new javax.swing.JLabel();
        jTextField_tenDangNhap = new javax.swing.JTextField();
        jLabel_matKhau = new javax.swing.JLabel();
        jPasswordField_matKhau = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jButton_dangNhap = new javax.swing.JButton();
        jButton_quenMatKhau = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 3;
        int y = (screenSize.height - getHeight()) / 3;
        setLocation(x, y);
        setResizable(false);

        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_chuDe.setText("ĐĂNG NHẬP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel_chuDe)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_tenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel_tenDangNhap.setText("Tên đăng nhập");

        jLabel_matKhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel_matKhau.setText("Mật khẩu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_tenDangNhap)
                    .addComponent(jLabel_matKhau))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_tenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jPasswordField_matKhau))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_tenDangNhap)
                    .addComponent(jTextField_tenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_matKhau)
                    .addComponent(jPasswordField_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton_dangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jButton_dangNhap.setText("Đăng nhập");
        jButton_dangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_dangNhap.addActionListener(this);

        jButton_quenMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jButton_quenMatKhau.setText("Quên mật khẩu ?");
        jButton_quenMatKhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_quenMatKhau.addActionListener(this);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton_dangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_quenMatKhau)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_dangNhap)
                    .addComponent(jButton_quenMatKhau))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap_GUI().setVisible(true);
            }
        });
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source.equals(jButton_dangNhap)) {
			String tenTaiKhoan = jTextField_tenDangNhap.getText().trim();
			String matKhau = jTextField_tenDangNhap.getText().trim();
			
			try {
				boolean ketQua = new DangNhap_DAO().dangNhap(tenTaiKhoan, matKhau);
				if(ketQua) {
					this.dispose();
					new ManHinh_GUI(tenTaiKhoan).setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không chính xác! Vui lòng nhập lại!");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
		
		if(source.equals(jButton_quenMatKhau)) {
			this.dispose();
			new LamMoi_GUI().setVisible(true);;
		}
	}
}
