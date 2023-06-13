/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;
import Login.Menu;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import javax.swing.ImageIcon;

public class transaksi_penitipan extends javax.swing.JFrame {
        private String file;
private final Connection conn = koneksi.connect();
private DefaultTableModel tabmode;
    int x;
    int y;
    int q;
    int w;
    int e;
    int t;
    int l;
    int g;
    public String paket_penitipan;
    public long hasil;
        private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    private final Map<String, Object> param = new HashMap<>();
    private JasperDesign jasperDesign;
    public void waktu()
         {
             ActionListener taskPerformer = new ActionListener()
             {
                 public void actionPerformed(ActionEvent evt)
                 {
                    String nama_bulan = "";
                    String nama_hari = "";
                    String nol_hari = "";
                    String nol_jam = "";
                    String nol_menit = "";
                    String nol_detik = "";
                    Date dt = new Date();
                    int nilai_tahun = dt.getYear() + 1900;
                    int nilai_bulan = dt.getMonth() + 1;
                    int nilai_hari = dt.getDate();
                    int nilai_hari1 = dt.getDay();
                    int nilai_jam = dt.getHours();
                    int nilai_menit = dt.getMinutes();
                    int nilai_detik = dt.getSeconds();
 
                    if (nilai_hari1 == 1) {nama_hari = "Senin";}
                    else if (nilai_hari1 == 2) {nama_hari = "Selasa";}
                    else if (nilai_hari1 == 3) {nama_hari = "Rabu";}
                    else if (nilai_hari1 == 4) {nama_hari = "Kamis";}
                    else if (nilai_hari1 == 5) {nama_hari = "Jum'at";}
                    else if (nilai_hari1 == 6) {nama_hari = "Sabtu";}
                    else if (nilai_hari1 == 7) {nama_hari = "Minggu";}
 
                    if (nilai_bulan == 1) {nama_bulan = "Januari";}
                    else if (nilai_bulan == 2) {nama_bulan = "Februari";}
                    else if (nilai_bulan == 3) {nama_bulan = "Maret";}
                    else if (nilai_bulan == 4) {nama_bulan = "April";}
                    else if (nilai_bulan == 5) {nama_bulan = "Mei";}
                    else if (nilai_bulan == 6) {nama_bulan = "Juni";}
                    else if (nilai_bulan == 7) {nama_bulan = "Juli";}
                    else if (nilai_bulan == 8) {nama_bulan = "Agustus";}
                    else if (nilai_bulan == 9) {nama_bulan = "September";}
                    else if (nilai_bulan == 10) {nama_bulan = "Oktober";}
                    else if (nilai_bulan == 11) {nama_bulan = "November";}
                    else if (nilai_bulan == 12) {nama_bulan = "Desember";}
 
                    if (nilai_hari <= 9) {nol_hari = "0";}
                    if (nilai_jam <= 9) {nol_jam = "0";}
                    if (nilai_menit <= 9) {nol_menit = "0";}
                    if (nilai_detik <= 9) {nol_detik = "0";}
                    String bulan = nama_bulan;
                    String hari1 = nama_hari;
                    String hari = nol_hari + Integer.toString(nilai_hari);
                    String jam = nol_jam + Integer.toString(nilai_jam);
                    String menit = nol_menit + Integer.toString(nilai_menit);
                    String detik = nol_detik + Integer.toString(nilai_detik);
                    TxtTglDetail.setText(hari1 + "," + hari + " " + bulan + " " + nilai_tahun);
                 }
             };                                                                   
            new Timer(1000, taskPerformer).start();
         }
    
    /**
     * Creates new form transaksi_penitipan
     */
    public transaksi_penitipan() {
        initComponents();
        setLocationRelativeTo(null);
        setJam();
        setTanggal();
        waktu();
        harga_paket.setVisible(true);
        jenis_hewan.setSelectedItem(null);
jenis_paket.setSelectedItem(null);
tgl_keluar.setDate(null);
    }
    
    
            public void setTanggal(){
java.util.Date skrg = new java.util.Date();
java.text.SimpleDateFormat kal = new
java.text.SimpleDateFormat("dd-MM-yyyy");
TxtTglDetail.setText(kal.format(skrg));
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

        harga_paket = new javax.swing.JTextField();
        jFileChooser1 = new javax.swing.JFileChooser();
        Clear = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        Print = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Jam1 = new javax.swing.JLabel();
        clPanelTransparan1 = new PanelTransparan.ClPanelTransparan();
        no_penitipan = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        clPanelTransparan2 = new PanelTransparan.ClPanelTransparan();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        clPanelTransparan3 = new PanelTransparan.ClPanelTransparan();
        TxtTglDetail = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        tgl_keluar = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        hari = new javax.swing.JTextField();
        clPanelTransparan4 = new PanelTransparan.ClPanelTransparan();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jenis_hewan = new javax.swing.JComboBox<>();
        jenis_paket = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        nama_pemilik = new javax.swing.JTextField();
        clPanelTransparan5 = new PanelTransparan.ClPanelTransparan();
        jLabel25 = new javax.swing.JLabel();
        total_harga = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        clPanelTransparan6 = new PanelTransparan.ClPanelTransparan();
        gambar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tampil_gambar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 630, 120, 50));

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
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 120, 50));

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
        getContentPane().add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 110, 50));

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
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 120, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Transaksi Penitipan Hewan\\Option.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 635, 750, -1));

        Jam1.setBackground(new java.awt.Color(153, 153, 153));
        Jam1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Jam1.setForeground(new java.awt.Color(255, 255, 255));
        Jam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Jam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 210, 40));

        clPanelTransparan1.setBackground(new java.awt.Color(204, 204, 204));
        clPanelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        no_penitipan.setBackground(new java.awt.Color(72, 79, 79));
        no_penitipan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        no_penitipan.setForeground(new java.awt.Color(255, 255, 255));
        no_penitipan.setBorder(null);
        clPanelTransparan1.add(no_penitipan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 170, 30));

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 170, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("No Penitipan");
        clPanelTransparan1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        getContentPane().add(clPanelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 350, 60));

        clPanelTransparan2.setBackground(new java.awt.Color(204, 204, 204));
        clPanelTransparan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane1.setViewportView(bill);

        clPanelTransparan2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, 510));

        getContentPane().add(clPanelTransparan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 310, 530));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Back.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        clPanelTransparan3.setBackground(new java.awt.Color(204, 204, 204));
        clPanelTransparan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtTglDetail.setBackground(new java.awt.Color(255, 255, 255));
        TxtTglDetail.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        TxtTglDetail.setForeground(new java.awt.Color(255, 255, 255));
        TxtTglDetail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clPanelTransparan3.add(TxtTglDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 170, 30));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 100, 10));
        clPanelTransparan3.add(tgl_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, 30));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tanggal Keluar");
        clPanelTransparan3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 40));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Masuk");
        clPanelTransparan3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Hari");
        clPanelTransparan3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 40, 40));

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 40, -1));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Jumlah");
        clPanelTransparan3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 40));

        hari.setBackground(new java.awt.Color(72, 79, 79));
        hari.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        hari.setForeground(new java.awt.Color(255, 255, 255));
        hari.setBorder(null);
        clPanelTransparan3.add(hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 40, 30));

        getContentPane().add(clPanelTransparan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 350, 170));

        clPanelTransparan4.setBackground(new java.awt.Color(204, 204, 204));
        clPanelTransparan4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nama Pemilik");
        clPanelTransparan4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Jenis Hewan");
        clPanelTransparan4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 40));

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan4.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        jenis_hewan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unggas", "Mamalia", "Reptil", "Amphibia" }));
        clPanelTransparan4.add(jenis_hewan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, 30));

        jenis_paket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paket 1", "Paket 2", "Paket 3", "Paket 4", "Paket 5" }));
        jenis_paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_paketActionPerformed(evt);
            }
        });
        clPanelTransparan4.add(jenis_paket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, 30));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Jenis Paket");
        clPanelTransparan4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 40));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Keterangan");
        clPanelTransparan4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 40));

        keterangan.setColumns(20);
        keterangan.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        keterangan.setRows(5);
        jScrollPane2.setViewportView(keterangan);

        clPanelTransparan4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, 90));

        nama_pemilik.setBackground(new java.awt.Color(72, 79, 79));
        nama_pemilik.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        nama_pemilik.setForeground(new java.awt.Color(255, 255, 255));
        nama_pemilik.setBorder(null);
        clPanelTransparan4.add(nama_pemilik, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 170, 30));

        getContentPane().add(clPanelTransparan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 350, 280));

        clPanelTransparan5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 102, 102));
        jLabel25.setText("Total Harga");
        clPanelTransparan5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 40));

        total_harga.setBackground(new java.awt.Color(102, 102, 102));
        total_harga.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        total_harga.setForeground(new java.awt.Color(255, 255, 255));
        total_harga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_harga.setBorder(null);
        total_harga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                total_hargaMouseClicked(evt);
            }
        });
        clPanelTransparan5.add(total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, 30));

        bayar.setBackground(new java.awt.Color(102, 102, 102));
        bayar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        bayar.setForeground(new java.awt.Color(255, 255, 255));
        bayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bayar.setBorder(null);
        clPanelTransparan5.add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 170, 30));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 102, 102));
        jLabel28.setText("Uang Bayar");
        clPanelTransparan5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 90, 40));

        kembali.setBackground(new java.awt.Color(102, 102, 102));
        kembali.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kembali.setBorder(null);
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        clPanelTransparan5.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 170, 30));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 102, 102));
        jLabel29.setText("Uang Kembalian");
        clPanelTransparan5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 120, 40));

        getContentPane().add(clPanelTransparan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 270, 310));

        clPanelTransparan6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gambar.setEditable(false);
        gambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambarActionPerformed(evt);
            }
        });
        clPanelTransparan6.add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, -1));

        jButton1.setText("Browse");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        clPanelTransparan6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        tampil_gambar.setBackground(new java.awt.Color(153, 153, 153));
        clPanelTransparan6.add(tampil_gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 120));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clPanelTransparan6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 120));

        getContentPane().add(clPanelTransparan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 270, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\bg peniitpan 3.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penitipan Hewan/Option Clear.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseEntered

    private void ClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penitipan Hewan/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseExited

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penitipan Hewan/Option Save.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penitipan Hewan/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseExited

    private void PrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penitipan Hewan/Option Print.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_PrintMouseEntered

    private void PrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penitipan Hewan/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_PrintMouseExited

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penitipan Hewan/Option Add.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penitipan Hewan/Option.png"));
        jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Menu().setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
    l = Integer.parseInt(bayar.getText());
    e = Integer.parseInt(total_harga.getText());
    
    t = l - e;
    kembali.setText("Rp. "+t);        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliMouseClicked

    private void jenis_paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_paketActionPerformed
paket_penitipan = (String) jenis_paket.getSelectedItem();
 if (paket_penitipan == "Paket 1") {
     hasil = 200000;
 } else if (paket_penitipan == "Paket 2") {
     hasil = 300000;
 } else if (paket_penitipan == "Paket 3") {
     hasil = 40000;
 } else if (paket_penitipan == "Paket 4") {
     hasil = 500000;
 } else if (paket_penitipan == "Paket 5") {
     hasil = 600000;
 } 
 harga_paket.setText(String.valueOf(hasil));// TODO add your handling code here:
    }//GEN-LAST:event_jenis_paketActionPerformed

    private void total_hargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_hargaMouseClicked
    l = Integer.parseInt(harga_paket.getText());
    q = Integer.parseInt(hari.getText());
    
    w = q * 250000;
    g = w + l;
    total_harga.setText(""+g);        // TODO add your handling code here:
    }//GEN-LAST:event_total_hargaMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
bill.setText("");
no_penitipan.setText("");
tgl_keluar.setDate(null);
hari.setText("");
nama_pemilik.setText("");
jenis_hewan.setSelectedItem(null);
jenis_paket.setSelectedItem(null);
keterangan.setText("");
total_harga.setText("");
bayar.setText("");
kembali.setText("");
harga_paket.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
bill.append("\t\t Juanda Petshop \n" +
            "Jl. Ir H. Juanda No.2, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423 \n" +
        
        "\n=========================================================\n" +
        "Tanggal Transaksi : \t" + TxtTglDetail.getText() + "\n\n" +
        "\n=========================================================\n" +
        "No Penitipan      : \t" + no_penitipan.getText() + "\n\n" +
        "Tanggal Masuk     : \t" + TxtTglDetail.getText() + "\n\n" +
        "Tanggal Keluar    : \t" + tgl_keluar.getDate() + "\n\n" +
        "Nama Pemilik      : \t" + nama_pemilik.getText() + "\n\n" +
        "Jenis hewan       : \t" + jenis_hewan.getSelectedItem() + "\n\n" +
        "Jenis Paket       : \t" + jenis_paket.getSelectedItem() + "\n\n" +        
        "\n=========================================================\n" +
        "Total Harga : \t\t\t" + total_harga.getText() + "\n" +
        "Uang Bayar : \t\t\t" + bayar.getText() + "\n" +
        "\n=========================================================\n" +
        "Kembali : \t\t\t" + kembali.getText() + "\n" +        
        "\n=========================================================\n" +
        "\t\t Terima Kasih \n" +
        "\t Kritik & Saran Hubungi Juanda Petshop \n" +
        "----------------------------------------------------------------------------------------------------\n" 
        );         // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
                String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(tgl_keluar.getDate()));
        
        String sql = "insert into transaksi_penitipan values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, no_penitipan.getText());
            stat.setString(2, TxtTglDetail.getText());
            stat.setString(3, tanggal);
            stat.setString(4, hari.getText());
            stat.setString(5, nama_pemilik.getText());
            stat.setString(6, (String)jenis_hewan.getSelectedItem());
            stat.setString(7, (String)jenis_paket.getSelectedItem());
            stat.setString(8, keterangan.getText());
            stat.setString(9, total_harga.getText());
            stat.setString(10, bayar.getText());
            stat.setString(11, kembali.getText());
            stat.setString(12, TxtTglDetail.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            no_penitipan.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseClicked

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
         try {
            param.put("no_penitipan",no_penitipan.getText());
            File file = new File("src/Report/penitipan.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, koneksi.conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_PrintMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

        //cari gambar
        jFileChooser1.setSelectedFile(null);
        jFileChooser1.showOpenDialog(this);
        file = jFileChooser1.getSelectedFile().toString();

        file = file.replace('\\', '/');
        gambar.setText(file);

        ImageIcon icon = new ImageIcon(file); // jangan lupa import class ImageIcon
        tampil_gambar.setIcon(icon);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gambarActionPerformed

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
            java.util.logging.Logger.getLogger(transaksi_penitipan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi_penitipan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi_penitipan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi_penitipan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi_penitipan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Jam1;
    private javax.swing.JLabel Print;
    private javax.swing.JLabel Save;
    private javax.swing.JLabel TxtTglDetail;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextArea bill;
    private PanelTransparan.ClPanelTransparan clPanelTransparan1;
    private PanelTransparan.ClPanelTransparan clPanelTransparan2;
    private PanelTransparan.ClPanelTransparan clPanelTransparan3;
    private PanelTransparan.ClPanelTransparan clPanelTransparan4;
    private PanelTransparan.ClPanelTransparan clPanelTransparan5;
    private PanelTransparan.ClPanelTransparan clPanelTransparan6;
    private javax.swing.JTextField gambar;
    private javax.swing.JTextField harga_paket;
    private javax.swing.JTextField hari;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jenis_hewan;
    private javax.swing.JComboBox<String> jenis_paket;
    private javax.swing.JTextField kembali;
    private javax.swing.JTextArea keterangan;
    private javax.swing.JTextField nama_pemilik;
    private javax.swing.JTextField no_penitipan;
    private javax.swing.JLabel tampil_gambar;
    private com.toedter.calendar.JDateChooser tgl_keluar;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables
}
