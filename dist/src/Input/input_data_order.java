/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;
import Login.Menu;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import koneksi.koneksi;
/**
 *
 * @author Ridwan
 */
public class input_data_order extends javax.swing.JFrame {
    private final Connection conn = koneksi.connect();
private DefaultTableModel tabmode;
int x;
    int y;
    /**
     * Creates new form input_data_order
     */
    public input_data_order() {
        initComponents();
        setLocationRelativeTo(null);
        datatable();
        jenis_barang.setSelectedItem (null);
    }
protected void kosong() {
        nama_supplier.setText("");
        nama_barang.setText("");
        jenis_barang.setSelectedItem (null);
        jumlah.setText("");
        no_order.setText("");
        harga.setText("");
        tgl_order.setDate(null);
        keterangan.setText("");
    }
protected void datatable(){
    Object [] Baris = {"Nama Supplier","Nama Barang","Jenis Barang","Jumlah","No Order","Harga","Tanggal Order","Keterangan"};
        tabmode = new DefaultTableModel(null, Baris);
        order.setModel(tabmode);
        String sql = "select * from data_order";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
            String a = hasil.getString("nama_supplier");
            String s = hasil.getString("nama_barang");
            String d = hasil.getString("jenis_barang");
            String f = hasil.getString("jumlah");
            String g = hasil.getString("no_order");
            String h = hasil.getString("harga");
            String i = hasil.getString("tgl_order");
            String l = hasil.getString("keterangan");
            
            String[] data={a,s,d,f,g,h,i,l};
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

        jSeparator1 = new javax.swing.JSeparator();
        nama_supplier = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nama_barang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        no_order = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        harga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        jenis_barang = new javax.swing.JComboBox<>();
        tgl_order = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        order = new javax.swing.JTable();
        Delete = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        New = new javax.swing.JLabel();
        Edit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 210, -1));

        nama_supplier.setBackground(new java.awt.Color(3, 53, 50));
        nama_supplier.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        nama_supplier.setForeground(new java.awt.Color(255, 255, 255));
        nama_supplier.setBorder(null);
        getContentPane().add(nama_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 210, 30));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Nama Supplier");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 120, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 210, -1));

        nama_barang.setBackground(new java.awt.Color(3, 53, 50));
        nama_barang.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        nama_barang.setForeground(new java.awt.Color(255, 255, 255));
        nama_barang.setBorder(null);
        getContentPane().add(nama_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 210, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 120, 50));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Jenis Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 120, 50));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 210, 10));

        jumlah.setBackground(new java.awt.Color(3, 53, 50));
        jumlah.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jumlah.setForeground(new java.awt.Color(255, 255, 255));
        jumlah.setBorder(null);
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 210, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Jumlah");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 120, 50));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 200, -1));

        no_order.setBackground(new java.awt.Color(3, 53, 50));
        no_order.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        no_order.setForeground(new java.awt.Color(255, 255, 255));
        no_order.setBorder(null);
        getContentPane().add(no_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 200, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("No Order");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 110, 50));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 200, -1));

        harga.setBackground(new java.awt.Color(3, 53, 50));
        harga.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        harga.setForeground(new java.awt.Color(255, 255, 255));
        harga.setBorder(null);
        getContentPane().add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 200, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Harga");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 110, 50));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Tanggal Order");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 110, 60));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Keterangan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 110, 60));

        keterangan.setColumns(20);
        keterangan.setRows(5);
        jScrollPane1.setViewportView(keterangan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 270, 50));

        jenis_barang.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jenis_barang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mainan Hewan", "Makanan Hewan", "Minuman Hewan", "Vaksin", "Obat", " " }));
        getContentPane().add(jenis_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 170, 30));

        tgl_order.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(tgl_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 170, -1));

        order.setModel(new javax.swing.table.DefaultTableModel(
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
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(order);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 70, 780, 240));

        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, 30));

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
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, 30));

        New.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewMouseExited(evt);
            }
        });
        getContentPane().add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 30));

        Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditMouseExited(evt);
            }
        });
        getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 140, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Order\\Option.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 170, 200));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Back.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Order\\Bg.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Order/Option Delete.png"));
        jLabel10.setIcon(AS);       // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Order/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMouseExited

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Order/Option Save.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Order/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseExited

    private void NewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Order/Option New.png"));
        jLabel10.setIcon(AS);       // TODO add your handling code here:
    }//GEN-LAST:event_NewMouseEntered

    private void NewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Order/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_NewMouseExited

    private void EditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Order/Option Edit.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_EditMouseEntered

    private void EditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Order/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_EditMouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Menu().setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(tgl_order.getDate()));
        String sql = "insert into data_order values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama_supplier.getText());
            stat.setString(2, nama_barang.getText());
            stat.setString(3, (String)jenis_barang.getSelectedItem());
            stat.setString(4, jumlah.getText());
            stat.setString(5, no_order.getText());
            stat.setString(6, harga.getText());
            stat.setString(7, tanggal);
            stat.setString(8, keterangan.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            nama_supplier.requestFocus();
            datatable();
            kosong();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(tgl_order.getDate()));
        String query;
        query = "UPDATE data_order SET nama_supplier = ?, nama_barang = ?, jenis_barang = ?, jumlah = ?, no_order = ?, harga = ?, tgl_order = ?, keterangan = ? WHERE nama_supplier='"+nama_supplier.getText()+"'";
        PreparedStatement statement;
        Connection connection;
        try{
            connection = koneksi.connect();
            statement = connection.prepareStatement(query);
            statement.setString(1, nama_supplier.getText());
            statement.setString(2, nama_barang.getText());
            statement.setString(3, (String)jenis_barang.getSelectedItem());
            statement.setString(4, jumlah.getText());
            statement.setString(5, no_order.getText());
            statement.setString(6, harga.getText());
            statement.setString(7, tanggal);
            statement.setString(8, keterangan.getText());

            int hasil = statement.executeUpdate();
            if (hasil==1) {
                JOptionPane.showMessageDialog(this, "DATA SUKSES DIUBAH");
                nama_supplier.requestFocus();
                datatable();
                kosong();
            }
        }catch(SQLException e) {
            JOptionPane.showInternalMessageDialog(this, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_EditMouseClicked

    private void NewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMouseClicked
kosong();         // TODO add your handling code here:
    }//GEN-LAST:event_NewMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if(ok==0){
            String sql = "delete from data_order where nama_supplier='"+nama_supplier.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                nama_supplier.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus "+e);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
        int i = order.getSelectedRow();
   TableModel model = order.getModel();
   nama_supplier.setText(model.getValueAt(i,0).toString());
   nama_barang.setText(model.getValueAt(i,1).toString());
   jenis_barang.setSelectedItem(model.getValueAt(i,2).toString());
   jumlah.setText(model.getValueAt(i,3).toString());
   no_order.setText(model.getValueAt(i,4).toString());
   harga.setText(model.getValueAt(i,5).toString());
   keterangan.setText(model.getValueAt(i,7).toString());      // TODO add your handling code here:
    }//GEN-LAST:event_orderMouseClicked

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
            java.util.logging.Logger.getLogger(input_data_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_data_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_data_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_data_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_data_order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Edit;
    private javax.swing.JLabel New;
    private javax.swing.JLabel Save;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> jenis_barang;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextArea keterangan;
    private javax.swing.JTextField nama_barang;
    private javax.swing.JTextField nama_supplier;
    private javax.swing.JTextField no_order;
    private javax.swing.JTable order;
    private com.toedter.calendar.JDateChooser tgl_order;
    // End of variables declaration//GEN-END:variables
}
