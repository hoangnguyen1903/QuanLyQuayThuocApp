package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KhachHang_Panel extends javax.swing.JPanel implements ActionListener{
	
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField_ma;
    private javax.swing.JTextField jTextField_soDienThoai;

    public KhachHang_Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        jLabel_chuDe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_chuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_chuDe.setText("QUẢN LÝ KHÁCH HÀNG");

        jLabel_nguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(jLabel_nguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jButton_timKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(this);

        jButton_lamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jButton_them.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_them.setText("Thêm");

        jButton_sua.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_sua.setText("Sửa");

        jButton_xoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_xoa.setText("Xoá");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1.setText("Nhập mã:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel2.setText("Nhập số điện thoại:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jTextField_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_soDienThoai)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_timKiem)
                    .addComponent(jButton_lamMoi)
                    .addComponent(jButton_them)
                    .addComponent(jButton_sua)
                    .addComponent(jButton_xoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Email", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButton7.setText("jButton7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );

    }

    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
