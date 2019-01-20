/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManganRek;

/**
 *
 * @author varian
 */
import java.sql.*;
import javax.swing.JOptionPane;
import ManganRek.koneksi;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;

public class Pemesanan extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;

    SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");

    protected void aktif() {
        jumlahTXT.setEnabled(true);
    }

    void dat() {
        SimpleDateFormat tgl = new SimpleDateFormat("yyyy/MM/dd");
        Date tgle = new Date();
        System.out.println(tgl.format(tgle));
        String tempdat = tgl.format(tgle);
        datelbl.setText(tempdat.toString());

    }

    protected void kosong() {
        jumlahTXT.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"id_makanan", "nama_makanan", "jenis", "harga"};
        tabmode = new DefaultTableModel(null, Baris);
        jTableMENU.setModel(tabmode);
        String sql = "select * from makanan";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String id_mkn = hasil.getString("id_makanan");
                String nama = hasil.getString("nama_makanan");
                String jml = hasil.getString("jenis");
                String harga = hasil.getString("harga");

                String[] data = {id_mkn, nama, jml, harga};
                tabmode.addRow(data);
            }
        } catch (Exception e) {

        }
    }

    void awal() {
        PesanBtn.setEnabled(false);
    }

    /**
     * Creates new form Pemesanan
     */
    public Pemesanan(String para) {
        initComponents();
        datatable();
        aktif();
        userlol.setText(para);
        awal();
        dat();

    }

    public Pemesanan() {
        initComponents();
        datatable();
        awal();
        dat();

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
        hg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        profilebtn = new javax.swing.JButton();
        userlol = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMENU = new javax.swing.JTable();
        itemTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        id_makanan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jumlahTXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PesanBtn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        hg.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        hg.setForeground(new java.awt.Color(0, 0, 153));
        hg.setText("0");

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Total Bayar");

        userlabel.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        userlabel.setForeground(new java.awt.Color(0, 0, 153));
        userlabel.setText("Selamat Datang ");

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        profilebtn.setBackground(new java.awt.Color(204, 204, 255));
        profilebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManganRek/images/profle.png"))); // NOI18N
        profilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebtnActionPerformed(evt);
            }
        });

        userlol.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        userlol.setForeground(new java.awt.Color(0, 0, 153));
        userlol.setText("user");

        datelbl.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        datelbl.setForeground(new java.awt.Color(0, 0, 153));
        datelbl.setText("jLabel11");

        jTableMENU.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jTableMENU.setForeground(new java.awt.Color(0, 0, 153));
        jTableMENU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID MAKANAN", "NAMA", "JENIS", "HARGA"
            }
        ));
        jTableMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMENUMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMENU);

        itemTXT.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Jumlah");

        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManganRek/images/logout.png"))); // NOI18N
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        id_makanan.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Rp");

        jumlahTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahTXTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Rp");

        PesanBtn.setText("Pesan");
        PesanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesanBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Daftar Menu");

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Item");

        tb.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        tb.setForeground(new java.awt.Color(0, 0, 153));
        tb.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(hg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(126, 126, 126))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(itemTXT)
                                                .addGap(108, 108, 108))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26)
                                        .addComponent(jumlahTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addGap(45, 45, 45)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(146, 146, 146)
                                    .addComponent(id_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(95, 95, 95)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(datelbl)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addComponent(PesanBtn))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8)
                                    .addGap(31, 31, 31)
                                    .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(profilebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(userlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userlol)
                        .addGap(18, 18, 18)
                        .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(userlabel)
                                .addComponent(userlol))
                            .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profilebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(id_makanan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(datelbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(tb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PesanBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(itemTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(hg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jumlahTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PesanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesanBtnActionPerformed
        String sql = "insert into pembeli values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, null);
            stat.setString(2, id_makanan.getText());
            stat.setString(3, userlol.getText());
            stat.setString(4, jumlahTXT.getText());
            stat.setString(5, tb.getText());
            stat.setString(6, datelbl.getText());
            stat.setString(7, "Belum Diterima");

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "PESANAN BERHASIL");
            pesanprint psn = new pesanprint(userlol.getText(), itemTXT.getText(), hg.getText(), jumlahTXT.getText(), tb.getText(), datelbl.getText());
            psn.setVisible(true);
            this.dispose();
            kosong();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN" + e);
        }

    }//GEN-LAST:event_PesanBtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        login log = new login();
        this.dispose();
        log.setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void jumlahTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahTXTActionPerformed

    private void jTableMENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMENUMouseClicked
        int bar = jTableMENU.getSelectedRow();
        String id_mkn = tabmode.getValueAt(bar, 0).toString();
        String nama = tabmode.getValueAt(bar, 1).toString();
        String jml = tabmode.getValueAt(bar, 2).toString();
        String harga = tabmode.getValueAt(bar, 3).toString();

        itemTXT.setText(nama);
        hg.setText(harga);
        id_makanan.setText(id_mkn);

    }//GEN-LAST:event_jTableMENUMouseClicked

    private void profilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebtnActionPerformed
        profile pro = new profile(userlol.getText());
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PesanBtn.setEnabled(true);
        String b = hg.getText();
        Integer hg_label = Integer.valueOf(b);
        String a = jumlahTXT.getText();
        Integer jumlah = Integer.valueOf(a);
        int tbb = hg_label * jumlah;
        String c = String.valueOf(tbb);
        tb.setText(c);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton PesanBtn;
    private javax.swing.JLabel datelbl;
    private javax.swing.JLabel hg;
    private javax.swing.JLabel id_makanan;
    private javax.swing.JTextField itemTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMENU;
    private javax.swing.JTextField jumlahTXT;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton profilebtn;
    private javax.swing.JLabel tb;
    private javax.swing.JLabel userlabel;
    private javax.swing.JLabel userlol;
    // End of variables declaration//GEN-END:variables
}