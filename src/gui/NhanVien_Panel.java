package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NhanVien_Panel extends javax.swing.JPanel implements ActionListener {

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
    
    public NhanVien_Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

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
        jLabel_chuDe.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel_nguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        javax.swing.GroupLayout jPanel_northLayout = new javax.swing.GroupLayout(jPanel_north);
        jPanel_north.setLayout(jPanel_northLayout);
        jPanel_northLayout.setHorizontalGroup(
            jPanel_northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(jLabel_nguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jTextField_nhapMa.addActionListener(this);

        jButton_timKie.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_timKie.setText("Tìm kiếm");
        jButton_timKie.addActionListener(this);

        jButton_lamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jButton_them.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_them.setText("Thêm");

        jButton_sua.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_sua.setText("Sửa");

        jButton_xoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_xoa.setText("Xoá");

        jLabel_nhapMa.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel_nhapMa.setText("Nhập mã:");

        jLabel_soDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel_soDienThoai.setText("Nhập số điện thoại:");

        javax.swing.GroupLayout jPanel_centerLayout = new javax.swing.GroupLayout(jPanel_center);
        jPanel_center.setLayout(jPanel_centerLayout);
        jPanel_centerLayout.setHorizontalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_centerLayout.createSequentialGroup()
                        .addComponent(jLabel_nhapMa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))
                    .addComponent(jLabel_soDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_nhapMa, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(jTextField_soDienThoai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_timKie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_lamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_xoa)
                .addGap(74, 74, 74))
        );
        jPanel_centerLayout.setVerticalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nhapMa)
                    .addComponent(jTextField_nhapMa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_timKie)
                    .addComponent(jButton_lamMoi)
                    .addComponent(jButton_them)
                    .addComponent(jButton_sua)
                    .addComponent(jButton_xoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_soDienThoai)
                    .addComponent(jTextField_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Giới tính", "Ngày sinh", "Email", "Số điện thoại", "Địa chỉ", "Chức vụ", "Tên tài khoản", "Mật khẩu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );

    }

    // Code sự kiện
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
