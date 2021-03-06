/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSprmhn;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HAFIZH UMAR SYAFIQH
 */
public class perumahan_form extends javax.swing.JFrame {

    private Statement st;
    
    public perumahan_form() {
        initComponents();
        load_table();
        kosong();
    }
    
    private void load_table (){
    DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama_Perumahan");
        model.addColumn("Alamat");
        model.addColumn("No_Telephone");
        model.addColumn("Email");
        model.addColumn("Pengembang");
        model.addColumn("Tipe_Perumahan");
        model.addColumn("File_Brosur");
        
        String cari = txt_Cari.getText();
            try{
                int no = 1;
                String sql = "SELECT * FROM perumahan WHERE Nama_Perumahan LIKE '%"+cari+"%'";
                java.sql.Connection conn = (Connection)config.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                
                while(res.next()){
                    model.addRow(new Object[]{no++,res.getString(1),res.getString(2),
                        res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
                }
                tbl_Perumahan.setModel(model);
            }catch (SQLException e){
                System.out.println("Error : " + e.getMessage());
            }
    }
            
 private void tampilkan(){        
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nama_Perumahan");
            model.addColumn("Alamat");
            model.addColumn("No_Telephone");
            model.addColumn("Email");
            model.addColumn("Pengembang");
            model.addColumn("Tipe_Perumahan");
            model.addColumn("File_Brosur");
            tbl_Perumahan.setModel(model);
             
            String cari = txt_Cari.getText();
            try{
                int no = 1;
                String sql = "SELECT * FROM perumahan WHERE Nama_Perumahan LIKE '%"+cari+"%' OR Alamat LIKE '%"+cari+"%' OR No_Telephone LIKE '%"+cari+"%' OR Email LIKE '%"+cari+"%'OR Pengembang LIKE '%"+cari+"%'OR Tipe_Perumahan LIKE '%"+cari+"%'OR File_Brosur LIKE '%"+cari+"%';";
                java.sql.Connection conn = (Connection)config.configDB();                                                                                                                  
                java.sql.Statement stm = conn.createStatement();                
                java.sql.ResultSet res = stm.executeQuery(sql);
                
                while(res.next()){
                    model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
                }
                tbl_Perumahan.setModel(model);
            }catch (SQLException e){
                System.out.println("Error : " + e.getMessage());
            }
}
    
    private void kosong(){
        txt_NamaPerumahan.setText(null);
        txt_Alamat.setText(null);
        txt_Telephone.setText(null);
        txt_Email.setText(null);
        txt_Pengembang.setText(null);
        txt_Tipe.setText(null);
        txt_File.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Alamat = new javax.swing.JTextField();
        txt_NamaPerumahan = new javax.swing.JTextField();
        txt_Telephone = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Pengembang = new javax.swing.JTextField();
        txt_Tipe = new javax.swing.JTextField();
        txt_File = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Perumahan = new javax.swing.JTable();
        btn_Tambah = new javax.swing.JButton();
        btn_Hapus = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        txt_Cari = new javax.swing.JTextField();
        btn_Cari = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Perumahan");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Perumahan");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. Telephone");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pengembang");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipe Perumahan");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("File Brosur");

        tbl_Perumahan.setBackground(new java.awt.Color(51, 255, 255));
        tbl_Perumahan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_Perumahan.setColumnSelectionAllowed(true);
        tbl_Perumahan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PerumahanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Perumahan);

        btn_Tambah.setBackground(new java.awt.Color(51, 255, 255));
        btn_Tambah.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_Tambah.setText("Tambah");
        btn_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TambahActionPerformed(evt);
            }
        });

        btn_Hapus.setBackground(new java.awt.Color(51, 255, 255));
        btn_Hapus.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_Hapus.setText("Hapus");
        btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusActionPerformed(evt);
            }
        });

        btn_Edit.setBackground(new java.awt.Color(51, 255, 255));
        btn_Edit.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_Edit.setText("Edit");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        btn_Cari.setBackground(new java.awt.Color(51, 255, 255));
        btn_Cari.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_Cari.setText("Cari");
        btn_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CariActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(51, 255, 255));
        btn_clear.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_clear.setText("Batal");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_keluar.setBackground(new java.awt.Color(51, 255, 255));
        btn_keluar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel9.setText("<");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_NamaPerumahan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Email)
                                    .addComponent(txt_Pengembang)
                                    .addComponent(txt_Tipe)
                                    .addComponent(txt_File)
                                    .addComponent(txt_Alamat)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txt_Telephone))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(575, 575, 575)
                .addComponent(btn_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NamaPerumahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Pengembang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Tipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_File, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TambahActionPerformed
try{
           String sql = "INSERT INTO perumahan VALUES ('"+txt_NamaPerumahan.getText()+
                   "','"+txt_Alamat.getText()+"','"+txt_Telephone.getText()+
                   "','"+txt_Email.getText()+"','"+txt_Pengembang.getText()+
                   "','"+txt_Tipe.getText()+"','"+txt_File.getText()+"')";
           java.sql.Connection conn = (Connection)config.configDB();
           java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.execute();
           JOptionPane.showMessageDialog(null, "Data Berhasi DiSimpan");
           load_table();
           kosong();
        }catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_TambahActionPerformed

    private void tbl_PerumahanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PerumahanMouseClicked
     int baris = tbl_Perumahan.rowAtPoint(evt.getPoint());
        String Nama = tbl_Perumahan.getValueAt(baris, 1).toString();
        txt_NamaPerumahan.setText(Nama);
        
        String Alamat = tbl_Perumahan.getValueAt(baris, 2).toString();
        txt_Alamat.setText(Alamat);
        
        String Telephone = tbl_Perumahan.getValueAt(baris, 3).toString();
        txt_Telephone.setText(Telephone);
        
        String Email = tbl_Perumahan.getValueAt(baris, 4).toString();
        txt_Email.setText(Email);
        
        String Pengembang = tbl_Perumahan.getValueAt(baris, 5).toString();
        txt_Pengembang.setText(Pengembang);
        
        String Tipe = tbl_Perumahan.getValueAt(baris, 6).toString();
        txt_Tipe.setText(Tipe);
        
        String File = tbl_Perumahan.getValueAt(baris, 7).toString();
        txt_File.setText(File);
    }//GEN-LAST:event_tbl_PerumahanMouseClicked

    
    
    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        try{
            String sql = "UPDATE perumahan SET Nama_Perumahan ='"+ txt_NamaPerumahan.getText()+
                    "',Alamat='"+txt_Alamat.getText()+
                    "',No_Telephone='"+txt_Telephone.getText()+
                    "',Email='"+txt_Email.getText()+
                    "',Pengembang='"+txt_Pengembang.getText()+
                    "',Tipe_Perumahan='"+txt_Tipe.getText()+
                    "',File_Brosur='"+txt_File.getText()+
                    "' WHERE Nama_Perumahan ='"+txt_NamaPerumahan.getText()+"'";
            
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
            
            load_table();
            kosong();
        }catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusActionPerformed
    try{
            String sql = "DELETE FROM perumahan  WHERE Nama_Perumahan ='"+txt_NamaPerumahan.getText()+"'";
            java.sql.Connection conn= (Connection)config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        }catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());   
        }
        load_table();
        kosong();
        
    }//GEN-LAST:event_btn_HapusActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        kosong();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CariActionPerformed
        tampilkan();
    }//GEN-LAST:event_btn_CariActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
    if(JOptionPane.showConfirmDialog(null, "Yakin keluar?", "yakin?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
         Halaman_Utama h  = new Halaman_Utama();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(perumahan_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perumahan_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perumahan_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perumahan_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perumahan_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cari;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_Hapus;
    private javax.swing.JButton btn_Tambah;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Perumahan;
    private javax.swing.JTextField txt_Alamat;
    private javax.swing.JTextField txt_Cari;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_File;
    private javax.swing.JTextField txt_NamaPerumahan;
    private javax.swing.JTextField txt_Pengembang;
    private javax.swing.JTextField txt_Telephone;
    private javax.swing.JTextField txt_Tipe;
    // End of variables declaration//GEN-END:variables
}
