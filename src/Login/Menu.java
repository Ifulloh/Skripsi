/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Input.input_data_barang;
import Input.input_data_dokter;
import Input.input_data_member;
import Input.input_data_order;
import Laporan.laporan_data_barang;
import Laporan.laporan_data_dokter;
import Laporan.laporan_data_order;
import Laporan.laporan_data_pengobatan_hewan;
import Laporan.laporan_data_penitipan;
import Laporan.laporan_data_penjualan_barang;
import Transaksi.transaksi_pengobatan_hewan;
import Transaksi.transaksi_penitipan;
import Transaksi.transaksi_penjualan_barang;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Ridwan
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        input_data_dokter = new javax.swing.JLabel();
        input_data_order = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        input_data_barang = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        input_data_member = new javax.swing.JLabel();
        input_data_order1 = new javax.swing.JLabel();
        input_data_dokter1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 150, 130));

        input_data_dokter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_data_dokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_data_dokterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_data_dokterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_data_dokterMouseExited(evt);
            }
        });
        getContentPane().add(input_data_dokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 150, 130));

        input_data_order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_data_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_data_orderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_data_orderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_data_orderMouseExited(evt);
            }
        });
        getContentPane().add(input_data_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 150, 130));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 150, 120));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 150, 120));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 150, 130));

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 150, 130));

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 150, 130));

        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 150, 130));

        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 150, 130));

        input_data_barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_data_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_data_barangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_data_barangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_data_barangMouseExited(evt);
            }
        });
        getContentPane().add(input_data_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 150, 130));

        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 150, 130));

        input_data_member.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_data_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_data_memberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_data_memberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_data_memberMouseExited(evt);
            }
        });
        getContentPane().add(input_data_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 150, 130));

        input_data_order1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_data_order1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_data_order1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_data_order1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_data_order1MouseExited(evt);
            }
        });
        getContentPane().add(input_data_order1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 150, 130));

        input_data_dokter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_data_dokter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_data_dokter1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                input_data_dokter1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                input_data_dokter1MouseExited(evt);
            }
        });
        getContentPane().add(input_data_dokter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 150, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\menunew.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1253, 471));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_data_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_barangMouseClicked
        new input_data_barang().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_barangMouseClicked

    private void input_data_barangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_barangMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/input_data_barang.png"));
        jLabel1.setIcon(AS);          // TODO add your handling code here:
    }//GEN-LAST:event_input_data_barangMouseEntered

    private void input_data_barangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_barangMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_barangMouseExited

    private void input_data_dokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_dokterMouseClicked
        new input_data_dokter().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_dokterMouseClicked

    private void input_data_dokterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_dokterMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/input_data_dokter.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_dokterMouseEntered

    private void input_data_dokterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_dokterMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_input_data_dokterMouseExited

    private void input_data_orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_orderMouseClicked
        new input_data_order().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_orderMouseClicked

    private void input_data_orderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_orderMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/input_data_order.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_orderMouseEntered

    private void input_data_orderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_orderMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_input_data_orderMouseExited

    private void input_data_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_memberMouseClicked
        new input_data_member().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_memberMouseClicked

    private void input_data_memberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_memberMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/input_data_member.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_memberMouseEntered

    private void input_data_memberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_memberMouseExited
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);       // TODO add your handling code here:
    }//GEN-LAST:event_input_data_memberMouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new laporan_data_barang().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/laporan_data_barang.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new laporan_data_dokter().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/laporan_data_dokter.png"));
        jLabel1.setIcon(AS);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new laporan_data_order().setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/laporan_data_order.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         new laporan_data_pengobatan_hewan().setVisible(true);
        dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/laporan_pengobatan_hewan.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new laporan_data_penitipan().setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/laporan_data_penitipan.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new laporan_data_penjualan_barang().setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/laporan_data_penjualan_barang.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new transaksi_pengobatan_hewan().setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/transaksi_pengobatan_hewan.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new transaksi_penitipan().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/transaksi_penitipan.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
          ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new transaksi_penjualan_barang().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/transaksi_penjualan_barang.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
          ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void input_data_order1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_order1MouseClicked
        new Login1().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_order1MouseClicked

    private void input_data_order1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_order1MouseEntered
         ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Logout.png"));
        jLabel1.setIcon(AS);       // TODO add your handling code here:
    }//GEN-LAST:event_input_data_order1MouseEntered

    private void input_data_order1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_order1MouseExited
          ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_order1MouseExited

    private void input_data_dokter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_dokter1MouseClicked

        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_input_data_dokter1MouseClicked

    private void input_data_dokter1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_dokter1MouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Exit.png"));
        jLabel1.setIcon(AS);         // TODO add your handling code here:
    }//GEN-LAST:event_input_data_dokter1MouseEntered

    private void input_data_dokter1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_data_dokter1MouseExited
            ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/menunew.png"));
        jLabel1.setIcon(AS);      // TODO add your handling code here:
    }//GEN-LAST:event_input_data_dokter1MouseExited

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel input_data_barang;
    private javax.swing.JLabel input_data_dokter;
    private javax.swing.JLabel input_data_dokter1;
    private javax.swing.JLabel input_data_member;
    private javax.swing.JLabel input_data_order;
    private javax.swing.JLabel input_data_order1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
