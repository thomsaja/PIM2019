/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManganRek;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Stack;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author denny
 */
public class MasukanMakan extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    Stack<String> stk = new Stack<>();
    private Connection conn = new koneksi().connect();

    void combo() {
        Hashtable<Integer, String> hash = new Hashtable<>();
        hash.put(1, "Makanan");
        hash.put(2, "Minuman");
        hash.put(3, "Snack");

        String makan = hash.get(1);
        String minum = hash.get(2);
        String snack = hash.get(3);
        String[] bookTitles = new String[]{makan, minum, snack};

        JComboBox<String> bookList = new JComboBox<>(bookTitles);
        for (String bookTitle : bookTitles) {
            jeniscombo.addItem(bookTitle);
        }
    }

    void aktif() {
        makantxt.setEnabled(true);
        jeniscombo.setEnabled(true);
        hrgtxtm.setEnabled(true);
        jButton3.setEnabled(false);
    }

    void clean() {
        makantxt.setText("");
        hrgtxtm.setText("");
    }

    /**
     * Creates new form MasukanMakan
     */
    public MasukanMakan() {
        initComponents();
        combo();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TbMakanrek = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jeniscombo = new javax.swing.JComboBox<>();
        makantxt = new javax.swing.JTextField();
        hrgtxtm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputbtn = new javax.swing.JButton();
        finishbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TbMakanrek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Makanan", "Jenis", "Harga"
            }
        ));
        TbMakanrek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbMakanrekMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbMakanrek);

        jLabel1.setText("Makanan");

        jLabel2.setText("Jenis");

        jLabel3.setText("Harga");

        jeniscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeniscomboActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DATA MAKANAN");

        inputbtn.setText("Input");
        inputbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbtnActionPerformed(evt);
            }
        });

        finishbtn.setText("Finish");
        finishbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishbtnActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jeniscombo, 0, 147, Short.MAX_VALUE)
                                    .addComponent(hrgtxtm)
                                    .addComponent(makantxt))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(finishbtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(backbtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backbtn))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(makantxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jeniscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(hrgtxtm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputbtn)
                            .addComponent(finishbtn)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbtnActionPerformed
        String makan = makantxt.getText();
        String jenis = jeniscombo.getSelectedItem().toString();
        String harga = hrgtxtm.getText();
        Queue<String> que = new LinkedList<String>();
        que.add(makan.toString());
        que.add(jenis.toString());
        que.add(harga.toString());
        System.out.println(que.toString());
        List list = (List) que;
        Object row[] = {list.get(0), list.get(1), list.get(2)};
        DefaultTableModel model = (DefaultTableModel) TbMakanrek.getModel();
        model.addRow(row);
        clean();
    }//GEN-LAST:event_inputbtnActionPerformed

    private void finishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishbtnActionPerformed

        int rows = TbMakanrek.getRowCount();
        String sql = "insert into makanan values (?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            for (int row = 0; row < rows; row++) {
                String nama = (String) TbMakanrek.getValueAt(row, 0);
                String jenis = (String) TbMakanrek.getValueAt(row, 1);
                String harga = (String) TbMakanrek.getValueAt(row, 2);

                stat.setString(1, null);
                stat.setString(2, nama.toString());
                stat.setString(3, jenis.toString());
                stat.setString(4, harga);
                stat.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN" + e);
        }
    }//GEN-LAST:event_finishbtnActionPerformed

    private void TbMakanrekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbMakanrekMouseClicked
        int bar = TbMakanrek.getSelectedRow();
        String nama = TbMakanrek.getValueAt(bar, 0).toString();
        String hargaa = TbMakanrek.getValueAt(bar, 2).toString();
        String jns = TbMakanrek.getValueAt(bar, 1).toString();

        makantxt.setText(nama);
        jeniscombo.setSelectedItem(jns);
        hrgtxtm.setText(hargaa);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_TbMakanrekMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int bar = TbMakanrek.getSelectedRow();

        if (TbMakanrek.getRowCount() > 0) {
            ((DefaultTableModel) TbMakanrek.getModel()).removeRow(bar);
        } else {
            JOptionPane.showMessageDialog(null, "Pilih yang akan di hapus");
            clean();
        }
        aktif();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jeniscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeniscomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeniscomboActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        String us = "admin";
        this.dispose();
        stok_barang stbr = new stok_barang(us);
        stbr.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(MasukanMakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasukanMakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasukanMakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasukanMakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasukanMakan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbMakanrek;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton finishbtn;
    private javax.swing.JTextField hrgtxtm;
    private javax.swing.JButton inputbtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jeniscombo;
    private javax.swing.JTextField makantxt;
    // End of variables declaration//GEN-END:variables
}
