package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhieuNhapHang_Panel extends javax.swing.JPanel implements ActionListener {

    private javax.swing.JButton jButton_lamMoi;
    private javax.swing.JButton jButton_nhapHang;
    private javax.swing.JButton jButton_timKiemNhaCungCap;
    private javax.swing.JButton jButton_timKiemSanPham;
    private javax.swing.JLabel jLabel_chuDe;
    private javax.swing.JLabel jLabel_maNhaCungCap;
    private javax.swing.JLabel jLabel_maSanPham;
    private javax.swing.JLabel jLabel_nguoiDung;
    private javax.swing.JLabel jLabel_soLuong;
    private javax.swing.JLabel jLabel_tongTien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_nhaCungCap;
    private javax.swing.JTable jTable_sanPham;
    private javax.swing.JTextField jTextField_maNhaCungCap;
    private javax.swing.JTextField jTextField_maSanPham;
    private javax.swing.JTextField jTextField_soLuong;
    private javax.swing.JTextField jTextField_tongTien;
    
    public PhieuNhapHang_Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel_chuDe = new javax.swing.JLabel();
        jLabel_nguoiDung = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_maNhaCungCap = new javax.swing.JTextField();
        jButton_timKiemNhaCungCap = new javax.swing.JButton();
        jLabel_maNhaCungCap = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_sanPham = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_nhaCungCap = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jTextField_maSanPham = new javax.swing.JTextField();
        jButton_timKiemSanPham = new javax.swing.JButton();
        jButton_lamMoi = new javax.swing.JButton();
        jLabel_maSanPham = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_soLuong = new javax.swing.JLabel();
        jTextField_soLuong = new javax.swing.JTextField();
        jLabel_tongTien = new javax.swing.JLabel();
        jTextField_tongTien = new javax.swing.JTextField();
        jButton_nhapHang = new javax.swing.JButton();
        
        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_chuDe.setText("PHIẾU NHẬP HÀNG");

        jLabel_nguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(jLabel_nguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel_nguoiDung))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_maNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jTextField_maNhaCungCap.addActionListener(this);

        jButton_timKiemNhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_timKiemNhaCungCap.setText("Tìm kiếm");
        jButton_timKiemNhaCungCap.addActionListener(this);

        jLabel_maNhaCungCap.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel_maNhaCungCap.setText("Nhập mã nhà cung cấp:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_maNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_maNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_timKiemNhaCungCap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_maNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_maNhaCungCap)
                    .addComponent(jButton_timKiemNhaCungCap))
                .addGap(10, 10, 10))
        );

        jTable_sanPham.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_sanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Ảnh", "Thành phần", "Xuất xứ", "Ngày SX", "Ngày HH", "Lô sản xuất", "Đơn giá", "Loại", "Số lượng tồn", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_sanPham);
        if (jTable_sanPham.getColumnModel().getColumnCount() > 0) {
            jTable_sanPham.getColumnModel().getColumn(2).setHeaderValue("Ảnh");
            jTable_sanPham.getColumnModel().getColumn(3).setHeaderValue("Thành phần");
            jTable_sanPham.getColumnModel().getColumn(4).setHeaderValue("Xuất xứ");
            jTable_sanPham.getColumnModel().getColumn(5).setHeaderValue("Ngày SX");
            jTable_sanPham.getColumnModel().getColumn(6).setHeaderValue("Ngày HH");
            jTable_sanPham.getColumnModel().getColumn(7).setHeaderValue("Lô sản xuất");
            jTable_sanPham.getColumnModel().getColumn(9).setHeaderValue("Loại");
            jTable_sanPham.getColumnModel().getColumn(11).setHeaderValue("Tình trạng");
        }

        jTable_nhaCungCap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_nhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_nhaCungCap);

        jTextField_maSanPham.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jTextField_maSanPham.addActionListener(this);

        jButton_timKiemSanPham.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_timKiemSanPham.setText("Tìm kiếm");
        jButton_timKiemSanPham.addActionListener(this);
        
        jButton_lamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jLabel_maSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel_maSanPham.setText("Nhập mã sản phẩm:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_maSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_maSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_timKiemSanPham)
                .addGap(18, 18, 18)
                .addComponent(jButton_lamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_maSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_maSanPham)
                    .addComponent(jButton_lamMoi)
                    .addComponent(jButton_timKiemSanPham))
                .addGap(10, 10, 10))
        );

        jLabel_soLuong.setText("Nhập số lượng");

        jLabel_tongTien.setText("Nhập tổng tiền");

        jButton_nhapHang.setText("Nhập hàng");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_tongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jTextField_soLuong))
                .addGap(18, 18, 18)
                .addComponent(jButton_nhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_soLuong))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_tongTien)
                            .addComponent(jTextField_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_nhapHang, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

    }
    
    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
