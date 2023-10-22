package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuanLyHoaDon_Panel extends javax.swing.JPanel implements ActionListener {
	   
    private javax.swing.JButton jButton_lamMoi;
    private javax.swing.JButton jButton_sua;
    private javax.swing.JButton jButton_timKiem;
    private javax.swing.JButton jButton_xem;
    private javax.swing.JButton jButton_xoa;
    private com.toedter.calendar.JDateChooser jDateChooser_ngayLap;
    private javax.swing.JLabel jLabel_chuDe;
    private javax.swing.JLabel jLabel_ngayLap;
    private javax.swing.JLabel jLabel_nguoiDung;
    private javax.swing.JLabel jLabel_nhapMa;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem_phieuNhapHang;
    private javax.swing.JMenuItem jMenuItem_quanLyHoaDon;
    private javax.swing.JMenuItem jMenuItem_quanLyNhaCungCap;
    private javax.swing.JMenuItem jMenuItem_quanLyPhieuNhapHang;
    private javax.swing.JMenuItem jMenuItem_taoHoaDon;
    private javax.swing.JMenu jMenu_dangXuat;
    private javax.swing.JMenu jMenu_hoaDon;
    private javax.swing.JMenu jMenu_khachHang;
    private javax.swing.JMenu jMenu_nhaCungCap;
    private javax.swing.JMenu jMenu_nhanVien;
    private javax.swing.JMenu jMenu_sanPham;
    private javax.swing.JMenu jMenu_thongKe;
    private javax.swing.JMenu jMenu_trangChu;
    private javax.swing.JMenu jMenu_troGiup;
    private javax.swing.JPanel jPanel_center;
    private javax.swing.JPanel jPanel_north;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField_ma;

    public QuanLyHoaDon_Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel_north = new javax.swing.JPanel();
        jLabel_chuDe = new javax.swing.JLabel();
        jLabel_nguoiDung = new javax.swing.JLabel();
        jPanel_center = new javax.swing.JPanel();
        jTextField_ma = new javax.swing.JTextField();
        jButton_timKiem = new javax.swing.JButton();
        jButton_lamMoi = new javax.swing.JButton();
        jButton_sua = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jLabel_nhapMa = new javax.swing.JLabel();
        jLabel_ngayLap = new javax.swing.JLabel();
        jButton_xem = new javax.swing.JButton();
        jDateChooser_ngayLap = new com.toedter.calendar.JDateChooser();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_chuDe.setText("QUẢN LÝ HOÁ ĐƠN");

        jLabel_nguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        javax.swing.GroupLayout jPanel_northLayout = new javax.swing.GroupLayout(jPanel_north);
        jPanel_north.setLayout(jPanel_northLayout);
        jPanel_northLayout.setHorizontalGroup(
            jPanel_northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(jLabel_nguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jTextField_ma.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jTextField_ma.addActionListener(this);

        jButton_timKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(this);

        jButton_lamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jButton_sua.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_sua.setText("Sửa");

        jButton_xoa.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton_xoa.setText("Xoá");

        jLabel_nhapMa.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel_nhapMa.setText("Nhập mã:");

        jLabel_ngayLap.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel_ngayLap.setText("Ngày lập:");

        jButton_xem.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_xem.setText("Xem");
        jButton_xem.addActionListener(this);

        javax.swing.GroupLayout jPanel_centerLayout = new javax.swing.GroupLayout(jPanel_center);
        jPanel_center.setLayout(jPanel_centerLayout);
        jPanel_centerLayout.setHorizontalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_centerLayout.createSequentialGroup()
                        .addComponent(jLabel_nhapMa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(jLabel_ngayLap, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_ma, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addComponent(jDateChooser_ngayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_timKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_xem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_lamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_xoa)
                .addGap(72, 72, 72))
        );
        jPanel_centerLayout.setVerticalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_sua)
                        .addComponent(jButton_lamMoi)
                        .addComponent(jButton_timKiem)
                        .addComponent(jButton_xoa))
                    .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_nhapMa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_xem)
                    .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_ngayLap)
                        .addComponent(jDateChooser_ngayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                "Mã hoá đơn", "Mã nhân viên", "Mã khách hàng", "Tổng tiền", "Ngày lập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_north, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
    }
    
    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
