package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuanLyPhieuNhapHang_Panel extends javax.swing.JPanel implements ActionListener {
	
    private javax.swing.JButton jButton_lamMoi;
    private javax.swing.JButton jButton_timKiem;
    private javax.swing.JButton jButton_xemChiTiet;
    private javax.swing.JButton jButton_xoa;
    private com.toedter.calendar.JDateChooser jDateChooser_ngayNhap;
    private javax.swing.JLabel jLabel_chuDe;
    private javax.swing.JLabel jLabel_ngayNhap;
    private javax.swing.JLabel jLabel_nguoiDung;
    private javax.swing.JPanel jPanel_center;
    private javax.swing.JPanel jPanel_north;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    
    public QuanLyPhieuNhapHang_Panel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel_north = new javax.swing.JPanel();
        jLabel_chuDe = new javax.swing.JLabel();
        jLabel_nguoiDung = new javax.swing.JLabel();
        jPanel_center = new javax.swing.JPanel();
        jButton_timKiem = new javax.swing.JButton();
        jButton_lamMoi = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jLabel_ngayNhap = new javax.swing.JLabel();
        jDateChooser_ngayNhap = new com.toedter.calendar.JDateChooser();
        jButton_xemChiTiet = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        
        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_chuDe.setText("QUẢN LÝ PHIẾU NHẬP HÀNG");

        jLabel_nguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        javax.swing.GroupLayout jPanel_northLayout = new javax.swing.GroupLayout(jPanel_north);
        jPanel_north.setLayout(jPanel_northLayout);
        jPanel_northLayout.setHorizontalGroup(
            jPanel_northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jLabel_nguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel_northLayout.setVerticalGroup(
            jPanel_northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel_nguoiDung))
            .addGroup(jPanel_northLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_timKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(this);

        jButton_lamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jButton_xoa.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton_xoa.setText("Xoá");
        jButton_xoa.addActionListener(this);

        jLabel_ngayNhap.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel_ngayNhap.setText("Ngày nhập:");

        jButton_xemChiTiet.setText("Xem chi tiết");
        jButton_xemChiTiet.addActionListener(this);

        javax.swing.GroupLayout jPanel_centerLayout = new javax.swing.GroupLayout(jPanel_center);
        jPanel_center.setLayout(jPanel_centerLayout);
        jPanel_centerLayout.setHorizontalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_ngayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser_ngayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_timKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_lamMoi)
                .addGap(11, 11, 11)
                .addComponent(jButton_xemChiTiet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel_centerLayout.setVerticalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_centerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_lamMoi)
                        .addComponent(jButton_timKiem)
                        .addComponent(jButton_xoa)
                        .addComponent(jButton_xemChiTiet))
                    .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_ngayNhap)
                        .addComponent(jDateChooser_ngayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Mã sản phẩm", "Số lượng", "Tổng tiền", "Ngày nhập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_north, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_center, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_north, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_center, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

    }

    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

    
}
