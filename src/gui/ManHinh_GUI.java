package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class ManHinh_GUI extends JFrame{
    private JMenuBar jMenuBar;
    private JMenuItem jMenuItem_thayDoiMatKhau;
    private JMenuItem jMenuItem_dangXuat;
    private JMenuItem jMenuItem_phieuNhapHang;
    private JMenuItem jMenuItem_quanLyHoaDon;
    private JMenuItem jMenuItem_quanLyNhaCungCap;
    private JMenuItem jMenuItem_quanLyPhieuNhapHang;
    private JMenuItem jMenuItem_taoHoaDon;
    private JMenu jMenu_taiKhoan;
    private JMenu jMenu_hoaDon;
    private JMenu jMenu_khachHang;
    private JMenu jMenu_nhaCungCap;
    private JMenu jMenu_nhanVien;
    private JMenu jMenu_sanPham;
    private JMenu jMenu_thongKe;
    private JMenu jMenu_trangChu;
    private JMenu jMenu_troGiup; 
    private CardLayout cardLayout;
    private JPanel cardPanel;
    
	public ManHinh_GUI(String tenTaiKhoan) throws SQLException {
//		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Quản Lý Quầy Thuốc");
        setPreferredSize(new java.awt.Dimension(1070, 600));
        setResizable(false);
        
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
        setLocationRelativeTo(null);
	}
	
	public void createMenu() {
        jMenuBar = new JMenuBar();
        
        jMenu_trangChu = new JMenu();
        jMenu_trangChu.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "TrangChu");
        	}
		});
        
        jMenu_sanPham = new JMenu();
        jMenu_sanPham.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "SanPham");
        	}
		});
        
        jMenu_khachHang = new JMenu();
        jMenu_khachHang.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "KhachHang");
        	}
		});
        
        jMenu_hoaDon = new JMenu();
        
        jMenuItem_taoHoaDon = new JMenuItem();
        jMenuItem_taoHoaDon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "TaoHoaDon");
			}
		});
        
        jMenuItem_quanLyHoaDon = new JMenuItem();
        jMenuItem_quanLyHoaDon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "QuanLyHoaDon");
			}
		});
        
        jMenu_nhanVien = new JMenu();
        jMenu_nhanVien.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "NhanVien");
        	}
		});
        
        jMenu_nhaCungCap = new JMenu();
        
        jMenuItem_phieuNhapHang = new JMenuItem();
        jMenuItem_phieuNhapHang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "PhieuNhapHang");
			}
		});
        
        jMenuItem_quanLyPhieuNhapHang = new JMenuItem();
        jMenuItem_quanLyPhieuNhapHang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "QuanLyPhieuNhapHang");
			}
		});
        
        jMenuItem_quanLyNhaCungCap = new JMenuItem();
        jMenuItem_quanLyNhaCungCap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "NhaCungCap");
			}
		});
        
        jMenu_thongKe = new JMenu();
        jMenu_thongKe.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cardLayout.show(cardPanel, "ThongKe");
        	}
		});
        
        jMenu_troGiup = new JMenu();
        
        jMenu_taiKhoan = new JMenu();
        
        jMenuItem_thayDoiMatKhau = new JMenuItem();
        jMenuItem_thayDoiMatKhau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ThayDoiMatKhau_GUI().setVisible(true);
			}
		});
        jMenuItem_dangXuat = new JMenuItem();
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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
			new ManHinh_GUI("huytran123").setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

	
}
