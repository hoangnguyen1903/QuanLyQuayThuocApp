package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NhaCungCap_Panel extends javax.swing.JPanel implements ActionListener {
	
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
    
    public NhaCungCap_Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

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
        jLabel_chuDe.setText("QUẢN LÝ NHÀ CUNG CẤP");

        javax.swing.GroupLayout jPanel_northLayout = new javax.swing.GroupLayout(jPanel_north);
        jPanel_north.setLayout(jPanel_northLayout);
        jPanel_northLayout.setHorizontalGroup(
            jPanel_northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_northLayout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        jPanel_northLayout.setVerticalGroup(
            jPanel_northLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_northLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_chuDe, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        jTextField_nhapMa.addActionListener(this);

        jButton_timKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_timKiem.setText("Tìm kiếm");
        jButton_timKiem.addActionListener(this);

        jButton_lamMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(this);

        jButton_them.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_them.setText("Thêm");
        jButton_them.addActionListener(this);

        jButton_sua.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton_sua.setText("Sửa");
        jButton_sua.addActionListener(this);

        jButton_xoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jButton_xoa.setText("Xoá");
        jButton_xoa.addActionListener(this);

        jLabel_nhapMa.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel_nhapMa.setText("Nhập mã:");

        jLabel_soDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel_soDienThoai.setText("Nhập số điện thoại:");

        javax.swing.GroupLayout jPanel_centerLayout = new javax.swing.GroupLayout(jPanel_center);
        jPanel_center.setLayout(jPanel_centerLayout);
        jPanel_centerLayout.setHorizontalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_centerLayout.createSequentialGroup()
                        .addComponent(jLabel_nhapMa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel_soDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_soDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(jTextField_nhapMa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_timKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_lamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_xoa)
                .addGap(84, 84, 84))
        );
        jPanel_centerLayout.setVerticalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nhapMa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nhapMa)
                    .addComponent(jButton_timKiem)
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

        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTable);

        jLabel_nguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        jLabel_nguoiDung.setText("NV0001_Nguyễn Huy Hoàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_center, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_north, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_nguoiDung)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_north, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nguoiDung))
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
