/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan;
import Input.input_data_barang;
import Login.Menu;
import java.io.File;
import java.sql.Connection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Ridwan
 */
public class laporan_data_dokter extends javax.swing.JFrame {
private final Connection conn = koneksi.connect();
private DefaultTableModel tabmode;
        private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    private final Map<String, Object> param = new HashMap<>();
    private JasperDesign jasperDesign;
    String Response;
    String Response1;
    private String driver;
    /**
     * Creates new form laporan_data_dokter
     */
    public laporan_data_dokter() {
        initComponents();
                 setLocationRelativeTo(null);
                 datatable();
    }
protected void datatable(){
    Object [] Baris = {"Id Dokter","Nama","Jenis Kelamin","Tanggal Lahir","Email","No Telepon","Alamat"};
        tabmode = new DefaultTableModel(null, Baris);
        dokter.setModel(tabmode);
        String sql = "select * from data_dokter";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
            String a = hasil.getString("id_dokter");
            String s = hasil.getString("nama");
            String d = hasil.getString("jenkel");
            String f = hasil.getString("tgl_lahir");
            String g = hasil.getString("email");
            String h = hasil.getString("no_telepon");
            String i = hasil.getString("alamat");
            
            String[] data={a,s,d,f,g,h,i};
            tabmode.addRow(data);
        }
    } catch (Exception e) {
        
    }
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
        dokter = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Search2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        s2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dokter.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dokter);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 960, 390));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Back.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 450, 70, 90));

        Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ActionPerformed(evt);
            }
        });
        getContentPane().add(Search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*Pencarian Berdasarkan Id_Dokter");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, 20));

        s2.setText("Search");
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\LaporanBg.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Menu().setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            File file = new File("src/Report/laporan_data_dokter.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param,    koneksi.connect());
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            e.printStackTrace();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search2ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        try
        {
            Statement st = conn.createStatement();
            String search = Search2.getText();
            ResultSet rs = st.executeQuery("SELECT * FROM data_dokter WHERE id_dokter like '%"+search+"%' OR nama like '%"+search+"%'");
            DefaultTableModel dtm = (DefaultTableModel) dokter.getModel();

            dtm.setRowCount(0);
            String [] data = new String[8];
            int i = 1;

            while(rs.next())
            {
            data[0] = rs.getString("id_dokter");
            data[1] = rs.getString("nama");
            data[2] = rs.getString("jenkel");
            data[3] = rs.getString("tgl_lahir");
            data[4] = rs.getString("email");
            data[5] = rs.getString("no_telepon");
            data[6] = rs.getString("alamat");
                dtm.addRow(data);
                i++;
            }
            rs.close();
            Search2.setText("");
        }
        catch(Exception ex)  {
            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan");
            System.err.println("error (search) : " +ex);
        }    // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

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
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(laporan_data_dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporan_data_dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporan_data_dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporan_data_dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laporan_data_dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search2;
    private javax.swing.JTable dokter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton s;
    private javax.swing.JButton s1;
    private javax.swing.JButton s2;
    // End of variables declaration//GEN-END:variables
}
