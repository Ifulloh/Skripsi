-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 05 Agu 2019 pada 04.01
-- Versi Server: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `skripsi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `antrian`
--

CREATE TABLE `antrian` (
  `no_antrian` varchar(100) NOT NULL,
  `nama_pelangggan` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `antrian`
--

INSERT INTO `antrian` (`no_antrian`, `nama_pelangggan`, `status`) VALUES
('1', 'asd', 's');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_barang`
--

CREATE TABLE `data_barang` (
  `kode_barang` varchar(100) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jenis_barang` varchar(50) NOT NULL,
  `jumlah` int(50) NOT NULL,
  `harga` int(50) NOT NULL,
  `expired` date NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_barang`
--

INSERT INTO `data_barang` (`kode_barang`, `nama_barang`, `jenis_barang`, `jumlah`, `harga`, `expired`, `keterangan`) VALUES
('45345777856345', 'Maxi', 'Makanan Hewan', 300, 150000, '2021-07-23', 'Ayam dan Tuna'),
('4902430563871 ', 'Tricat', 'Vaksin', 100, 80000, '2022-07-15', 'Lunas'),
('56777645687', 'Whiskas', 'Makanan Hewan', 30, 120000, '2021-07-16', 'Lunas'),
('88845654365', 'Friskies', 'Makanan Hewan', 300, 95000, '2023-11-17', 'Rasa Ikan Tuna 80 Gram'),
('8991002105485 ', 'Kepromec', 'Obat', 50, 163200, '2024-07-25', 'Obat kutu Cair'),
('8999909000971', 'PROPLAN', 'Makanan Hewan', 20, 320000, '2024-07-20', 'Lunas'),
('9956456344564', 'Vigantol E', 'Obat', 70, 97000, '2023-01-20', 'Antidefisiensi vitamin A, D3, dan E Pada Kucing'),
('995673543456', 'Baytril 10% Oral Solution', 'Obat', 60, 88000, '2023-07-04', 'Obat pilihan untuk mengatasi penyakit saluran pernafasan pada unggas'),
('9956754536556', 'Vaksin Rabies', 'Vaksin', 700, 65000, '2021-08-13', 'Kucing 10 Bulan+'),
('995677567885', 'Rintal Bolus', 'Obat', 50, 79000, '2022-07-09', 'Obat cacing');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_dokter`
--

CREATE TABLE `data_dokter` (
  `id_dokter` int(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenkel` varchar(100) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `email` varchar(100) NOT NULL,
  `no_telepon` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_dokter`
--

INSERT INTO `data_dokter` (`id_dokter`, `nama`, `jenkel`, `tgl_lahir`, `email`, `no_telepon`, `alamat`) VALUES
(101, 'Dr.Mita', 'Wanita', '1987-05-14', 'MitaAmalia@gmail.com', '08963394852', 'Depok Timur, Taman Merdeka No 114'),
(102, 'Dr.Indra', 'Pria', '1988-07-14', 'Indraroyko@gmail.com', '08977365273', 'Jaakarta Timur tebet dalam Timur'),
(103, 'Dr.Arif', 'Pria', '1986-07-18', 'arifarifin23@gmail.com', '089555763457', 'Depok'),
(104, 'Drs.Kartika', 'Wanita', '1989-02-14', 'kartika20@gmail.com', '089501788093', 'Jakarta Pengadegan, No 150'),
(105, 'Dr.Dimas', 'Pria', '1990-10-16', 'Dimas33@gmail.com', '089501788093', 'Cilangkap Timur, No 150'),
(106, 'Dr.Aditya ', 'Pria', '1987-12-11', 'aditya92@gmail.com', '089633345652', 'Jakarta Timur, Pesona Graha No 114');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_member`
--

CREATE TABLE `data_member` (
  `id_member` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_telpon` int(100) NOT NULL,
  `tgl_lahir` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_member`
--

INSERT INTO `data_member` (`id_member`, `nama`, `alamat`, `no_telpon`, `tgl_lahir`) VALUES
('1', 'asd', 'dsf', 23, '2019-07-16');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_order`
--

CREATE TABLE `data_order` (
  `nama_supplier` varchar(100) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `jenis_barang` varchar(100) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `no_order` int(100) NOT NULL,
  `harga` int(50) NOT NULL,
  `tgl_order` date NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_order`
--

INSERT INTO `data_order` (`nama_supplier`, `nama_barang`, `jenis_barang`, `jumlah`, `no_order`, `harga`, `tgl_order`, `keterangan`) VALUES
(' 588 FARM', 'Kornas', 'Makanan Hewan', 60, 734, 130000, '2019-07-16', '-'),
(' CV UNGGAS JAYA TERNAK', 'Friskies', 'Makanan Hewan', 700, 674, 120000, '2019-07-17', '-'),
(' CV. LEWI MANUNGGAL', 'Maxi', 'Makanan Hewan', 600, 556, 70000, '2019-07-19', '-'),
('AMIFIT', 'Vaksin Rabies', 'Vaksin', 60, 542, 96000, '2019-07-24', '-'),
('ANUGRAH FARM', 'PROPLAN', 'Makanan Hewan', 600, 634, 99000, '2019-07-10', '-'),
('MANDIRI JAYA FARMS', 'Friskies', 'Makanan Hewan', 100, 342, 79000, '2019-07-17', '-'),
('PT NIRWANA INTERNAR JAYA', 'Baytril 10% Oral Solution', 'Obat', 100, 774, 110000, '2019-07-25', '-'),
('PT PROCHEM MULIA SEJATI ', 'proplan', 'Makanan Hewan', 100, 203, 230000, '2019-07-18', 'Belum Lunas'),
('Pt. Jaya Utama Santikah', 'Scardix Cat & Kitten', 'Obat', 500, 192, 600000, '2019-07-20', 'Obat Anti Infeksi'),
('UNGGUL_ JAYAUNGGAS', 'Pur', 'Makanan Hewan', 700, 231, 10000, '2019-07-11', '-'),
('Vr Sanitary ', 'Dovenix 50 ml', 'Obat', 250, 102, 20000, '2019-07-10', 'Obat pilek cair untuk hewan reptil');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengobatan_hewan`
--

CREATE TABLE `pengobatan_hewan` (
  `no` int(100) NOT NULL,
  `tanggal` varchar(100) NOT NULL,
  `nama_pemilik` varchar(100) NOT NULL,
  `id_dokter` varchar(100) NOT NULL,
  `nama_dokter` varchar(100) NOT NULL,
  `jenis_hewan` varchar(100) NOT NULL,
  `keluhan` varchar(100) NOT NULL,
  `diagnosa` varchar(100) NOT NULL,
  `obat` varchar(100) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `jenis_obat` varchar(100) NOT NULL,
  `vaksin` varchar(100) NOT NULL,
  `nama_vaksin` varchar(100) NOT NULL,
  `jenis_vaksin` varchar(100) NOT NULL,
  `total_harga` int(100) NOT NULL,
  `bayar` varchar(100) NOT NULL,
  `kembali` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengobatan_hewan`
--

INSERT INTO `pengobatan_hewan` (`no`, `tanggal`, `nama_pemilik`, `id_dokter`, `nama_dokter`, `jenis_hewan`, `keluhan`, `diagnosa`, `obat`, `nama_obat`, `jenis_obat`, `vaksin`, `nama_vaksin`, `jenis_vaksin`, `total_harga`, `bayar`, `kembali`) VALUES
(341, '21-07-2019', 'Tasya', '103', 'Dr.Arif', 'Mamalia', 'Bulu Rontok', 'Kutu', '995677567885', 'Kepromec', 'Obat', '9995676764456', 'Vaksin Tetracat', 'Vaksin', 666400, '800000', 'Rp. 133600'),
(187, '21-07-2019', 'Adun', '105', 'Dr.Dimas', 'Amphibia', 'Pincang', 'Virus', '995673543456', 'Baytril 10% Oral Solution', 'Obat', '995673543456', 'Roocak', 'Vaksin', 352000, '709999', 'Rp. 357999'),
(374, '21-07-2019', 'Ridwan', '103', 'Dr.Arif', 'Unggas', 'Telapak Kaki Pucat', 'Trusia', '995677567885', 'Rintal Bolus', 'Obat', '9995676764456', 'Vaksin Tetracat', 'Vaksin', 258000, '300000', 'Rp. 42000'),
(192, '21-07-2019', 'Andy', '101', 'Dr.Mita', 'Mamalia', 'Susah Bernafas', 'Saluran Pencernaan', '995673543456', 'Baytril 10% Oral Solution', 'Obat', '9995676764456', 'Vaksin Tetracat', 'Vaksin', 258000, '700000', 'Rp. 442000'),
(142, '21-07-2019', 'Mega', '102', 'Dr.Indra', 'Reptil', 'Kulit Rontok', 'Kutu', '8991002105485', 'Kepromec', 'Obat', '4902430563871', 'Tricat', 'Vaksin', 507000, '560000', 'Rp. 53000'),
(162, '21-07-2019', 'Dicky', '104', 'Drs.Kartika', 'Mamalia', 'Kuku Patah', 'Trokasia', '-', '-', '-', '9956754536556', 'Vaksin Rabies', 'Vaksin', 735200, '800000', 'Rp. 64800'),
(132, '21-07-2019', 'Rico', '104', 'Drs.Kartika', 'Reptil', 'Susah Makan', 'Saluran Pencernaan', '995673543456', 'Baytril 10% Oral Solution', 'Obat', '995673543456', 'Roocak', 'Vaksin', 176000, '900000', 'Rp. 724000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan_barang`
--

CREATE TABLE `penjualan_barang` (
  `no_transaksi` varchar(100) NOT NULL,
  `kode_barang` varchar(100) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `jenis_barang` varchar(100) NOT NULL,
  `harga_barang` varchar(100) NOT NULL,
  `tgl_transaksi` varchar(100) NOT NULL,
  `jumlah_barang` int(100) NOT NULL,
  `total_harga` varchar(100) NOT NULL,
  `bayar` varchar(100) NOT NULL,
  `kembali` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penjualan_barang`
--

INSERT INTO `penjualan_barang` (`no_transaksi`, `kode_barang`, `nama_barang`, `jenis_barang`, `harga_barang`, `tgl_transaksi`, `jumlah_barang`, `total_harga`, `bayar`, `kembali`) VALUES
('23', '8999909000971', 'PROPLAN', 'Makanan Hewan', '320000', ',21 Juli 2019', 2, '640000', '700000', 'Rp. 60000'),
('26', '8999909000971', 'PROPLAN', 'Makanan Hewan', '320000', ',21 Juli 2019', 3, '1280000', '1390000', 'Rp. 110000'),
('34', '45345777856345', 'Maxi', 'Makanan Hewan', '150000', ',21 Juli 2019', 28, '4200000', '5000000', 'Rp. 800000'),
('45', '8999909000971', 'PROPLAN', 'Makanan Hewan', '320000', ',21 Juli 2019', 2, '640000', '6900000', 'Rp. 6260000'),
('52', '88845654365', 'Friskies', 'Makanan Hewan', '95000', ',21 Juli 2019', 2, '2430000', '3000000', 'Rp. 570000'),
('56', '995677567885', 'Rintal Bolus', 'Obat', '79000', ',21 Juli 2019', 5, '880000', '900000', 'Rp. 20000'),
('63', '9956456344564', 'Vigantol E', 'Obat', '97000', ',21 Juli 2019', 5, '485000', '5285000', 'Rp. 4800000'),
('94', '8999909000971', 'PROPLAN', 'Makanan Hewan', '320000', ',21 Juli 2019', 1, '320000', '330000', 'Rp. 10000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi_penitipan`
--

CREATE TABLE `transaksi_penitipan` (
  `no_penitipan` int(100) NOT NULL,
  `tgl_masuk` varchar(100) NOT NULL,
  `tgl_keluar` date NOT NULL,
  `hari` int(50) NOT NULL,
  `nama_pemilik` varchar(100) NOT NULL,
  `jenis_hewan` varchar(100) NOT NULL,
  `jenis_paket` varchar(100) NOT NULL,
  `keterangan` varchar(100) NOT NULL,
  `total_harga` varchar(100) NOT NULL,
  `bayar` varchar(100) NOT NULL,
  `kembali` varchar(100) NOT NULL,
  `tgl_transaksi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi_penitipan`
--

INSERT INTO `transaksi_penitipan` (`no_penitipan`, `tgl_masuk`, `tgl_keluar`, `hari`, `nama_pemilik`, `jenis_hewan`, `jenis_paket`, `keterangan`, `total_harga`, `bayar`, `kembali`, `tgl_transaksi`) VALUES
(34, 'Senin,22 Juli 2019', '2019-07-31', 11, 'sddff', 'Reptil', 'Paket 3', '-', '2790000', '3000000', 'Rp. 210000', 'Senin,22 Juli 2019'),
(105, '15-07-2019', '2019-07-25', 10, 'Aryawan', 'Amphibia', 'Paket 3', 'Lunas', '2540000', '3000000', 'Rp. 460000', '15-07-2019'),
(132, ',21 Juli 2019', '2019-07-17', 5, 'Adul', 'Mamalia', 'Paket 3', '-', '1290000', '1300000', 'Rp. 10000', ',21 Juli 2019'),
(223, '10-07-2019', '2019-07-17', 10, 'Rico', 'Mamalia', 'Paket 3', '-', '2540000', '7000000', 'Rp. 4460000', '10-07-2019'),
(243, ',21 Juli 2019', '2019-07-26', 6, 'Koras', 'Mamalia', 'Paket 5', '-', '2100000', '2200000', 'Rp. 100000', ',21 Juli 2019'),
(342, '16-07-2019', '2019-07-26', 10, 'Ridwan', 'Reptil', 'Paket 3', 'Sering dimandikan', '2540000', '3000000', 'Rp. 460000', '16-07-2019'),
(523, '07-07-2019', '2019-07-17', 10, 'andi', 'Unggas', 'Paket 3', '-', '2540000', '5000000', 'Rp. 2460000', '07-07-2019'),
(953, '16-07-2019', '2019-07-17', 11, 'Nijar', 'Amphibia', 'Paket 2', '-', '3050000', '9000000', 'Rp. 5950000', '16-07-2019');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `antrian`
--
ALTER TABLE `antrian`
  ADD PRIMARY KEY (`no_antrian`);

--
-- Indexes for table `data_barang`
--
ALTER TABLE `data_barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `data_dokter`
--
ALTER TABLE `data_dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `data_member`
--
ALTER TABLE `data_member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `data_order`
--
ALTER TABLE `data_order`
  ADD PRIMARY KEY (`nama_supplier`);

--
-- Indexes for table `pengobatan_hewan`
--
ALTER TABLE `pengobatan_hewan`
  ADD PRIMARY KEY (`kembali`);

--
-- Indexes for table `penjualan_barang`
--
ALTER TABLE `penjualan_barang`
  ADD PRIMARY KEY (`no_transaksi`);

--
-- Indexes for table `transaksi_penitipan`
--
ALTER TABLE `transaksi_penitipan`
  ADD PRIMARY KEY (`no_penitipan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
