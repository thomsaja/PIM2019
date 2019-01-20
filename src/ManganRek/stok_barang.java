/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManganRek;

import java.sql.*;
import javax.swing.JOptionPane;
import ManganRek.koneksi;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author denny
 */
public class stok_barang extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    login log = new login();

    String getadmin = log.getuser.toString();

    protected void aktif() {
        Id_brgtxt.setEnabled(true);
        Id_brgtxt.requestFocus();
        System.out.println("Coba" + getadmin);
        getusertxt.setText("Selamat Datang " + getadmin);
    }

    protected void kosong() {
        Id_brgtxt.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"id_makanan", "nama", "jenis", "harga"};
        tabmode = new DefaultTableModel(null, Baris);
        tblstokbarang.setModel(tabmode);
        String sql = "select * from makanan";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String id_brg = hasil.getString("id_makanan");
                String nama = hasil.getString("nama_makanan");
                String jml = hasil.getString("jenis");
                String hrgsatuan = hasil.getString("harga");

                String[] data = {id_brg, nama, jml, hrgsatuan};
                tabmode.addRow(data);
            }
        } catch (Exception e) {

        }
    }

    public stok_barang(String para) {
        initComponents();
        datatable();
        aktif();
        getusertxt.setText("Selamat Datang ");
        usertxt.setText(para);
    }

    public stok_barang() {
        initComponents();
        datatable();
        aktif();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Id_brgtxt = new javax.swing.JTextField();
        btnInput = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstokbarang = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JToggleButton();
        getusertxt = new javax.swing.JLabel();
        dtpsnbtn = new javax.swing.JButton();
        usertxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID_makanan");

        Id_brgtxt.setEditable(false);

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        tblstokbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Alamat", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblstokbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstokbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblstokbarang);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setText("DATA MENU ");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        getusertxt.setText("Selamat Datang ");

        dtpsnbtn.setText("Data Pemesanan");
        dtpsnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtpsnbtnActionPerformed(evt);
            }
        });

        usertxt.setText("user");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(getusertxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usertxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(Id_brgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(dtpsnbtn)
                        .addGap(18, 18, 18)
                        .addComponent(btnInput)
                        .addGap(32, 32, 32)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(getusertxt)
                        .addComponent(usertxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Id_brgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInput)
                    .addComponent(btnDelete)
                    .addComponent(dtpsnbtn))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            this.dispose();
            login log = new login();
            log.setVisible(true);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        this.dispose();
        MasukanMakan mama = new MasukanMakan();
        mama.setVisible(true);
    }//GEN-LAST:event_btnInputActionPerformed

    private void tblstokbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstokbarangMouseClicked
        int bar = tblstokbarang.getSelectedRow();
        String id_brg = tabmode.getValueAt(bar, 0).toString();
        String nama = tabmode.getValueAt(bar, 1).toString();
        String jns = tabmode.getValueAt(bar, 2).toString();
        String hrg_satuan = tabmode.getValueAt(bar, 3).toString();

        Id_brgtxt.setText(id_brg);
    }//GEN-LAST:event_tblstokbarangMouseClicked

    private void dtpsnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtpsnbtnActionPerformed
        detailpesananadmin dtpa = new detailpesananadmin(usertxt.getText());
        dtpa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dtpsnbtnActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "YAKIN MAU HAPUS?", "PESAN KONFIRMASI", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "DELETE FROM `makanan` WHERE ID_MAKANAN = '" + Id_brgtxt.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
                kosong();
                Id_brgtxt.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus" + e);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(stok_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stok_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stok_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stok_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stok_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_brgtxt;
    private javax.swing.JToggleButton btnDelete;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JToggleButton btnInput;
    private javax.swing.JButton dtpsnbtn;
    private javax.swing.JLabel getusertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblstokbarang;
    private javax.swing.JLabel usertxt;
    // End of variables declaration//GEN-END:variables
}
