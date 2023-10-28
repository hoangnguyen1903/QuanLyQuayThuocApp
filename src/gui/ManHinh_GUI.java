package gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManHinh_GUI extends JFrame{
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem_thayDoiMatKhau;
    private javax.swing.JMenuItem jMenuItem_dangXuat;
    private javax.swing.JMenuItem jMenuItem_phieuNhapHang;
    private javax.swing.JMenuItem jMenuItem_quanLyHoaDon;
    private javax.swing.JMenuItem jMenuItem_quanLyNhaCungCap;
    private javax.swing.JMenuItem jMenuItem_quanLyPhieuNhapHang;
    private javax.swing.JMenuItem jMenuItem_taoHoaDon;
    private javax.swing.JMenu jMenu_taiKhoan;
    private javax.swing.JMenu jMenu_hoaDon;
    private javax.swing.JMenu jMenu_khachHang;
    private javax.swing.JMenu jMenu_nhaCungCap;
    private javax.swing.JMenu jMenu_nhanVien;
    private javax.swing.JMenu jMenu_sanPham;
    private javax.swing.JMenu jMenu_thongKe;
    private javax.swing.JMenu jMenu_trangChu;
    private javax.swing.JMenu jMenu_troGiup; 
    private CardLayout cardLayout;
    private JPanel cardPanel;
    
	public ManHinh_GUI(String tenTaiKhoan) throws SQLException {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Quầy Thuốc");
        setLocationRelativeTo(null);
        setPreferredSize(new java.awt.Dimension(1070, 600));
        setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 6;
        int y = (screenSize.height - getHeight()) / 6;
        
        setLocation(x, y);
        
        createMenu();
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        cardPanel.add(new TrangChu_Panel(tenTaiKhoan), "TrangChu");
        cardPanel.add(new SanPham_Panel(), "SanPham");
        cardPanel.add(new KhachHang_Panel(), "KhachHang");
        cardPanel.add(new TaoHoaDon_Panel(), "TaoHoaDon");
        cardPanel.add(new QuanLyHoaDon_Panel(), "QuanLyHoaDon");
        cardPanel.add(new NhanVien_Panel(), "NhanVien");
        cardPanel.add(new PhieuNhapHang_Panel(), "PhieuNhapHang");
        cardPanel.add(new QuanLyPhieuNhapHang_Panel(), "QuanLyPhieuNhapHang");
        cardPanel.add(new NhaCungCap_Panel(), "NhaCungCap");
        cardPanel.add(new ThongKe_Panel(), "ThongKe");

        setJMenuBar(jMenuBar);
        setContentPane(cardPanel);
        
        pack();
	}
	
	public void createMenu() {
        jMenuBar = new javax.swing.JMenuBar();
        
        jMenu_trangChu = new javax.swing.JMenu();
        jMenu_trangChu.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "TrangChu");
        	}
		});
        
        jMenu_sanPham = new javax.swing.JMenu();
        jMenu_sanPham.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "SanPham");
        	}
		});
        
        jMenu_khachHang = new javax.swing.JMenu();
        jMenu_khachHang.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "KhachHang");
        	}
		});
        
        jMenu_hoaDon = new javax.swing.JMenu();
        
        jMenuItem_taoHoaDon = new javax.swing.JMenuItem();
        jMenuItem_taoHoaDon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "TaoHoaDon");
			}
		});
        
        jMenuItem_quanLyHoaDon = new javax.swing.JMenuItem();
        jMenuItem_quanLyHoaDon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "QuanLyHoaDon");
			}
		});
        
        jMenu_nhanVien = new javax.swing.JMenu();
        jMenu_nhanVien.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "NhanVien");
        	}
		});
        
        jMenu_nhaCungCap = new javax.swing.JMenu();
        
        jMenuItem_phieuNhapHang = new javax.swing.JMenuItem();
        jMenuItem_phieuNhapHang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "PhieuNhapHang");
			}
		});
        
        jMenuItem_quanLyPhieuNhapHang = new javax.swing.JMenuItem();
        jMenuItem_quanLyPhieuNhapHang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "QuanLyPhieuNhapHang");
			}
		});
        
        jMenuItem_quanLyNhaCungCap = new javax.swing.JMenuItem();
        jMenuItem_quanLyNhaCungCap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "NhaCungCap");
			}
		});
        
        jMenu_thongKe = new javax.swing.JMenu();
        jMenu_thongKe.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "ThongKe");
        	}
		});
        
        jMenu_troGiup = new javax.swing.JMenu();
        
        jMenu_taiKhoan = new javax.swing.JMenu();
        
        jMenuItem_thayDoiMatKhau = new javax.swing.JMenuItem();
        jMenuItem_thayDoiMatKhau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ThayDoiMatKhau_GUI().setVisible(true);
			}
		});
        jMenuItem_dangXuat = new javax.swing.JMenuItem();
        jMenuItem_dangXuat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
        
        
        jMenu_trangChu.setText("Trang Chủ");
        jMenuBar.add(jMenu_trangChu);

        jMenu_sanPham.setText("Sản Phẩm");
        jMenuBar.add(jMenu_sanPham);

        jMenu_khachHang.setText("Khách Hàng");
        jMenuBar.add(jMenu_khachHang);

        jMenu_hoaDon.setText("Hoá Đơn");

        jMenuItem_taoHoaDon.setText("Tạo hoá đơn");
        jMenu_hoaDon.add(jMenuItem_taoHoaDon);

        jMenuItem_quanLyHoaDon.setText("Quản lý hoá đơn");
        jMenu_hoaDon.add(jMenuItem_quanLyHoaDon);

        jMenuBar.add(jMenu_hoaDon);

        jMenu_nhanVien.setText("Nhân Viên");
        jMenuBar.add(jMenu_nhanVien);

        jMenu_nhaCungCap.setText("Nhà Cung Cấp");

        jMenuItem_phieuNhapHang.setText("Phiếu nhập hàng");
        jMenu_nhaCungCap.add(jMenuItem_phieuNhapHang);

        jMenuItem_quanLyPhieuNhapHang.setText("Quản lý phiếu nhập hàng");
        jMenu_nhaCungCap.add(jMenuItem_quanLyPhieuNhapHang);

        jMenuItem_quanLyNhaCungCap.setText("Quản lý nhà cung cấp");
        jMenu_nhaCungCap.add(jMenuItem_quanLyNhaCungCap);

        jMenuBar.add(jMenu_nhaCungCap);

        jMenu_thongKe.setText("Thống kê");
        jMenuBar.add(jMenu_thongKe);

        jMenu_troGiup.setText("Trợ Giúp");
        jMenuBar.add(jMenu_troGiup);

        jMenu_taiKhoan.setText("Tài khoản");

        jMenuItem_thayDoiMatKhau.setText("Thay đổi mật khẩu");
        jMenu_taiKhoan.add(jMenuItem_thayDoiMatKhau);

        jMenuItem_dangXuat.setText("Đăng xuất");
        jMenu_taiKhoan.add(jMenuItem_dangXuat);

        jMenuBar.add(jMenu_taiKhoan);
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
            java.util.logging.Logger.getLogger(TrangChu_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new ManHinh_GUI("huytran123").setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

	
}
