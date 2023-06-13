/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;
import Login.Menu;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Ridwan
 */
public class input_data_member extends javax.swing.JFrame {
private final Connection conn = koneksi.connect();
private DefaultTableModel tabmode;
    int x;
    int y;
        private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    private final Map<String, Object> param = new HashMap<>();
    private JasperDesign jasperDesign;
    /**
     * Creates new form input_data_member
     */
    public input_data_member() {
        initComponents();
        setLocationRelativeTo(null);
        setJam();
    }

    public void setJam(){
    ActionListener taskPerformer = new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    String nol_jam = "", nol_menit = "",nol_detik = "";
    java.util.Date dateTime = new java.util.Date();
    int nilai_jam = dateTime.getHours();
    int nilai_menit = dateTime.getMinutes();
    int nilai_detik = dateTime.getSeconds();
    if(nilai_jam <= 9) nol_jam= "0";
    if(nilai_menit <= 9) nol_menit= "0";
    if(nilai_detik <= 9) nol_detik= "0";
    String waktu = nol_jam + Integer.toString(nilai_jam);
    String menit = nol_menit + Integer.toString(nilai_menit);
    String detik = nol_detik + Integer.toString(nilai_detik);
    Jam1.setText(waktu+":"+menit+":"+detik+"");
    }
    };
    new Timer(1000, taskPerformer).start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        clPanelTransparan1 = new PanelTransparan.ClPanelTransparan();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tgl_lahir = new com.toedter.calendar.JDateChooser();
        no_telepon = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        nama = new javax.swing.JTextField();
        id_member = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        Add = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        Print = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Jam1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        bill.setBackground(new java.awt.Color(20, 26, 31));
        bill.setColumns(20);
        bill.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bill.setForeground(new java.awt.Color(255, 255, 255));
        bill.setRows(5);
        bill.setBorder(null);
        jScrollPane4.setViewportView(bill);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 270, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\member.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 300, 200));

        clPanelTransparan1.setBackground(new java.awt.Color(102, 102, 102));
        clPanelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id Member");
        clPanelTransparan1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        clPanelTransparan1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alamat");
        clPanelTransparan1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Telepon");
        clPanelTransparan1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Lahir");
        clPanelTransparan1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        clPanelTransparan1.add(tgl_lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 160, -1));

        no_telepon.setBackground(new java.awt.Color(32, 36, 39));
        no_telepon.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        no_telepon.setForeground(new java.awt.Color(255, 255, 255));
        no_telepon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(no_telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, 30));

        alamat.setColumns(20);
        alamat.setRows(5);
        alamat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(alamat);

        clPanelTransparan1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, 80));

        nama.setBackground(new java.awt.Color(32, 36, 39));
        nama.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, 30));

        id_member.setBackground(new java.awt.Color(32, 36, 39));
        id_member.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        id_member.setForeground(new java.awt.Color(255, 255, 255));
        id_member.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(id_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 30));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 100, 10));

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 110, 10));

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 180, -1));

        getContentPane().add(clPanelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 280));

        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 120, 40));

        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearMouseExited(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, 40));

        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveMouseExited(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 120, 40));

        Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrintMouseExited(evt);
            }
        });
        getContentPane().add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 100, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\MEMBER\\Option.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 590, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Back.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        Jam1.setBackground(new java.awt.Color(153, 153, 153));
        Jam1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Jam1.setForeground(new java.awt.Color(255, 255, 255));
        Jam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Jam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\data_order.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel13MouseDragged(evt);
            }
        });
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 550, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
bill.append(
        " Id Member    \t   : " + id_member.getText() + "\n\n" +
        " Nama         \t   : " + nama.getText() + "\n" 
        );
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/MEMBER/Option Add.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/MEMBER/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseExited

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        bill.setText("");
        id_member.setText("");
        nama.setText("");
        alamat.setText("");
        no_telepon.setText("");
        tgl_lahir.setDate(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseClicked

    private void ClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/MEMBER/Option Clear.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseEntered

    private void ClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/MEMBER/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseExited

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/MEMBER/Option Save.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/MEMBER/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseExited

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
         try {
            param.put("id_member",id_member.getText());
            File file = new File("src/Report/data_member.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, koneksi.conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PrintMouseClicked

    private void PrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/MEMBER/Option Print.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_PrintMouseEntered

    private void PrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/MEMBER/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_PrintMouseExited

    private void jLabel13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseDragged
        int mousex = evt.getXOnScreen();
        int mousey = evt.getYOnScreen();

        this.setLocation(mousex - x, mousey - y);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseDragged

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        x = evt.getX();
        y = evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Menu().setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
                    String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(tgl_lahir.getDate()));
        String sql = "insert into data_member values(?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id_member.getText());
            stat.setString(2, nama.getText());
            stat.setString(3, alamat.getText());
            stat.setString(4, no_telepon.getText());
            stat.setString(5, tanggal);
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            id_member.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseClicked

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
            java.util.logging.Logger.getLogger(input_data_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_data_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_data_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_data_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_data_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Jam1;
    private javax.swing.JLabel Print;
    private javax.swing.JLabel Save;
    private javax.swing.JTextArea alamat;
    private javax.swing.JTextArea bill;
    private PanelTransparan.ClPanelTransparan clPanelTransparan1;
    private javax.swing.JTextField id_member;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_telepon;
    private com.toedter.calendar.JDateChooser tgl_lahir;
    // End of variables declaration//GEN-END:variables
}