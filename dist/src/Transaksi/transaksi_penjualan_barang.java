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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class transaksi_penjualan_barang extends javax.swing.JFrame {
private final Connection conn = koneksi.connect();
private DefaultTableModel tabmode;
    int x;
    int y;
    int q;
    int w;
    int e;
    int t;
    int l;
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
                    TxtTanggal.setText(hari1 + "," + hari + " " + bulan + " " + nilai_tahun);
                 }
             };                                                                   
            new Timer(1000, taskPerformer).start();
         }
    /**
     * Creates new form transaksi_penjualan_barang
     */
    public transaksi_penjualan_barang() {
        initComponents();
        setLocationRelativeTo(null);
        setJam();
        setTanggal();
        waktu();
         
    }
    
    
    protected void kosong() {
        kode_barang.setText("");
        nama_barang.setText("");
        jenis_barang.setText("");
        harga.setText("");
        jumlah_barang.setText("");
        total_harga.setText("");
    }
        public void setTanggal(){
java.util.Date skrg = new java.util.Date();
java.text.SimpleDateFormat kal = new
java.text.SimpleDateFormat("dd-MM-yyyy");
TxtTanggal.setText(kal.format(skrg));
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

        clPanelTransparan1 = new PanelTransparan.ClPanelTransparan();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jumlah_barang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        kode_barang = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jenis_barang = new javax.swing.JLabel();
        nama_barang = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        clPanelTransparan2 = new PanelTransparan.ClPanelTransparan();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        Clear = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        Print = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Jam1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        total_harga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxtTanggal = new javax.swing.JTextField();
        clPanelTransparan3 = new PanelTransparan.ClPanelTransparan();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        clPanelTransparan4 = new PanelTransparan.ClPanelTransparan();
        jLabel11 = new javax.swing.JLabel();
        no_transaksi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clPanelTransparan1.setBackground(new java.awt.Color(51, 51, 51));
        clPanelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Barcode.png")); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        clPanelTransparan1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jenis Barang");
        clPanelTransparan1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 50));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga Barang");
        clPanelTransparan1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 50));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jumlah Barang");
        clPanelTransparan1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 40));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, -1));

        jumlah_barang.setBackground(new java.awt.Color(22, 26, 29));
        jumlah_barang.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jumlah_barang.setForeground(new java.awt.Color(255, 255, 255));
        jumlah_barang.setBorder(null);
        jumlah_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jumlah_barangKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlah_barangKeyTyped(evt);
            }
        });
        clPanelTransparan1.add(jumlah_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Barang");
        clPanelTransparan1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 50));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kode Barang");
        clPanelTransparan1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 50));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 10));

        kode_barang.setBackground(new java.awt.Color(22, 26, 29));
        kode_barang.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        kode_barang.setForeground(new java.awt.Color(255, 255, 255));
        kode_barang.setBorder(null);
        kode_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kode_barangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kode_barangMouseEntered(evt);
            }
        });
        kode_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kode_barangKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kode_barangKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kode_barangKeyTyped(evt);
            }
        });
        clPanelTransparan1.add(kode_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 140, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, -1));

        jenis_barang.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jenis_barang.setForeground(new java.awt.Color(255, 255, 255));
        clPanelTransparan1.add(jenis_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, 30));

        nama_barang.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        nama_barang.setForeground(new java.awt.Color(255, 255, 255));
        clPanelTransparan1.add(nama_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, 30));

        harga.setBackground(new java.awt.Color(255, 255, 255));
        harga.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        harga.setForeground(new java.awt.Color(255, 255, 255));
        harga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clPanelTransparan1.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, 30));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clPanelTransparan1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 100, 10));

        getContentPane().add(clPanelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 260));

        clPanelTransparan2.setBackground(new java.awt.Color(51, 51, 51));
        clPanelTransparan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane2.setViewportView(bill);

        clPanelTransparan2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 360, 230));

        getContentPane().add(clPanelTransparan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 380, 260));

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
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 120, 40));

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
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 120, 40));

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
        getContentPane().add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 110, 40));

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
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 120, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Transaksi Penjualan Barang\\Option.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 750, -1));

        Jam1.setBackground(new java.awt.Color(153, 153, 153));
        Jam1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Jam1.setForeground(new java.awt.Color(255, 255, 255));
        Jam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Jam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 110, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Back.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        total_harga.setBackground(new java.awt.Color(42, 46, 49));
        total_harga.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        total_harga.setForeground(new java.awt.Color(255, 255, 255));
        total_harga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_harga.setBorder(null);
        total_harga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                total_hargaMouseClicked(evt);
            }
        });
        total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 150, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Harga");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 110, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total Kembalian");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 120, 30));

        kembali.setBackground(new java.awt.Color(42, 46, 49));
        kembali.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kembali.setBorder(null);
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 150, 30));

        bayar.setBackground(new java.awt.Color(42, 46, 49));
        bayar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        bayar.setForeground(new java.awt.Color(255, 255, 255));
        bayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bayar.setBorder(null);
        bayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bayarMouseClicked(evt);
            }
        });
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        getContentPane().add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 160, 30));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Uang dibayar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 110, 30));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tgl Transaksi");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, 30));

        TxtTanggal.setBackground(new java.awt.Color(42, 46, 49));
        TxtTanggal.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        TxtTanggal.setForeground(new java.awt.Color(255, 255, 255));
        TxtTanggal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTanggal.setBorder(null);
        TxtTanggal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtTanggalMouseClicked(evt);
            }
        });
        TxtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTanggalActionPerformed(evt);
            }
        });
        getContentPane().add(TxtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 150, 30));

        clPanelTransparan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No Transaksi","Kode Barang", "Nama Barang", "Jenis Barang", "Harga Barang","Jumlah Barang"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        clPanelTransparan3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 420, 130));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Icon Tambah.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        clPanelTransparan3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 130));

        getContentPane().add(clPanelTransparan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 530, 150));

        clPanelTransparan4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("No Transaksi");
        clPanelTransparan4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        no_transaksi.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        clPanelTransparan4.add(no_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 40));

        getContentPane().add(clPanelTransparan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ridwan\\Documents\\NetBeansProjects\\Skripsi\\src\\Gambar\\Tester.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penjualan Barang/Option Add.png"));
jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penjualan Barang/Option.png"));
jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseExited

    private void PrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseEntered
ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penjualan Barang/Option Print.png"));
jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_PrintMouseEntered

    private void PrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseExited
ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penjualan Barang/Option.png"));
jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_PrintMouseExited

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penjualan Barang/Option Save.png"));
jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penjualan Barang/Option.png"));
jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseExited

    private void ClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseEntered
ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penjualan Barang/Option Clear.png"));
jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseEntered

    private void ClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseExited
ImageIcon AS = new ImageIcon(getClass().getResource("/Gambar/Transaksi Penjualan Barang/Option.png"));
jLabel10.setIcon(AS);        // TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseExited

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
            DefaultTableModel dataModel = (DefaultTableModel) tabelData.getModel();    
            if (tabelData.getRowCount() > 0) {
                for (int i = tabelData.getRowCount() - 1; i > -1; i--) {
                    dataModel.removeRow(i);
                }
            } 
bill.setText("");
kode_barang.setText("");
nama_barang.setText("");
jenis_barang.setText("");
jumlah_barang.setText("");
total_harga.setText("");
harga.setText("");
bayar.setText("");
kembali.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_ClearMouseClicked

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
         try {
            param.put("no_transaksi",no_transaksi.getText());
            File file = new File("src/Report/report3.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, koneksi.conn);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PrintMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
bill.append("\t\t Juanda Petshop \n" +
            "Jl. Ir H. Juanda No.2, Kemiri Muka, Beji, Kota Depok, Jawa Barat 16423 \n" +
        
        "\n=========================================================\n" +
        "Tanggal Transaksi : \t" + TxtTanggal.getText() + "\n\n" +
        "\n=========================================================\n" +
        "Kode Barang       : \t" + kode_barang.getText() + "\n\n" +
        "Nama Barang       : \t" + nama_barang.getText() + "\n\n" +
        "Jenis Barang      : \t" + jenis_barang.getText() + "\n\n" +
        "Harga Barang      : \t" + harga.getText() + "\n\n" +
        "Jumlah Barang     : \t" + jumlah_barang.getText() + "\n\n" +
        "\n=========================================================\n" +
        "Total Harga : \t\t\t" + total_harga.getText() + "\n" +
        "Uang Bayar : \t\t\t" + bayar.getText() + "\n" +
        "\n=========================================================\n" +
        "Kembali : \t\t\t" + kembali.getText() + "\n" +        
        "\n=========================================================\n" +
        "\t\t Terima Kasih \n" +
        "\t Kritik & Saran Hubungi Juanda Petshop \n" +
        "----------------------------------------------------------------------------------------------------\n" 
        );        // TODO add your handling code here:
    }//GEN-LAST:event_AddMouseClicked

    private void kode_barangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kode_barangKeyTyped
        if("".equals(kode_barang.getText())){
        }        // TODO add your handling code here:
    }//GEN-LAST:event_kode_barangKeyTyped

    private void kode_barangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kode_barangMouseEntered
             // TODO add your handling code here:
    }//GEN-LAST:event_kode_barangMouseEntered

    private void kode_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kode_barangMouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_kode_barangMouseClicked

    private void kode_barangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kode_barangKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)  
try
            {
                String sql ="select * from data_barang where kode_barang='"+kode_barang.getText()+"'";
                 java.sql.Statement stat = conn.createStatement();
                 ResultSet hasil = stat.executeQuery(sql);

                while(hasil.next())
                {
                    nama_barang.setText(hasil.getString("nama_barang"));
                    jenis_barang.setText(hasil.getString("jenis_barang"));
                    harga.setText(hasil.getString("harga"));
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"GAGAL");
            }        // TODO add your handling code here:
    }//GEN-LAST:event_kode_barangKeyPressed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Menu().setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked

        String sql = "insert into penjualan_barang values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, no_transaksi.getText());
            stat.setString(2, kode_barang.getText());
            stat.setString(3, nama_barang.getText());
            stat.setString(4, jenis_barang.getText());
            stat.setString(5, harga.getText());
            stat.setString(6, TxtTanggal.getText());
            stat.setString(7, jumlah_barang.getText());
            stat.setString(8, total_harga.getText());
            stat.setString(9, bayar.getText());
            stat.setString(10, kembali.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kembali.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseClicked

    private void total_hargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_hargaMouseClicked
    int jumlahBaris = tabelData.getRowCount();
    int totalBiaya = 0;
    int jumlahBarang, hargaBarang ;
    TableModel tabelModel;
    tabelModel = tabelData.getModel();
    for (int i=0; i<jumlahBaris; i++){
        jumlahBarang = Integer.parseInt(tabelModel.getValueAt(i, 4).toString());
        hargaBarang = Integer.parseInt(tabelModel.getValueAt(i, 5).toString());
        totalBiaya = totalBiaya + (jumlahBarang*hargaBarang);
    };
total_harga.setText(String.valueOf(totalBiaya));
    }//GEN-LAST:event_total_hargaMouseClicked

    private void total_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_hargaActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_total_hargaActionPerformed

    private void jumlah_barangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah_barangKeyPressed
      // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_barangKeyPressed

    private void jumlah_barangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah_barangKeyTyped
     // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_barangKeyTyped

    private void kode_barangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kode_barangKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_barangKeyReleased

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked

    l = Integer.parseInt(bayar.getText());
    e = Integer.parseInt(total_harga.getText());
    
    t = l - e;
    kembali.setText("Rp. "+t);        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliMouseClicked

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliActionPerformed

    private void bayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bayarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarMouseClicked

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void TxtTanggalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtTanggalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTanggalMouseClicked

    private void TxtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTanggalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel dataModel = (DefaultTableModel) tabelData.getModel();
            List list = new ArrayList<>();
            tabelData.setAutoCreateColumnsFromModel(true);
            list.add(no_transaksi.getText());
            list.add(kode_barang.getText());
            list.add(nama_barang.getText());
            list.add(jenis_barang.getText());
            list.add(harga.getText());
            list.add(jumlah_barang.getText());
            dataModel.addRow(list.toArray());
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelDataMouseClicked

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
            java.util.logging.Logger.getLogger(transaksi_penjualan_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi_penjualan_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi_penjualan_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi_penjualan_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi_penjualan_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Jam1;
    private javax.swing.JLabel Print;
    private javax.swing.JLabel Save;
    private javax.swing.JTextField TxtTanggal;
    private javax.swing.JTextField bayar;
    private javax.swing.JTextArea bill;
    private PanelTransparan.ClPanelTransparan clPanelTransparan1;
    private PanelTransparan.ClPanelTransparan clPanelTransparan2;
    private PanelTransparan.ClPanelTransparan clPanelTransparan3;
    private PanelTransparan.ClPanelTransparan clPanelTransparan4;
    private javax.swing.JLabel harga;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jenis_barang;
    private javax.swing.JTextField jumlah_barang;
    private javax.swing.JTextField kembali;
    private javax.swing.JTextField kode_barang;
    private javax.swing.JLabel nama_barang;
    private javax.swing.JTextField no_transaksi;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables
}
