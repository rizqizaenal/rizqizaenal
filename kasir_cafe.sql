-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Bulan Mei 2022 pada 16.27
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir_cafe`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `log_admin`
--

CREATE TABLE `log_admin` (
  `status` varchar(15) NOT NULL,
  `waktu` date NOT NULL,
  `nama_pegawai` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `log_admin`
--

INSERT INTO `log_admin` (`status`, `waktu`, `nama_pegawai`, `email`) VALUES
('ubah data', '2022-03-30', 'ab', 'sc'),
('ubah data', '2022-03-30', 'hh', 'ef'),
('ubah data', '2022-03-30', 'hh', 'ef'),
('ubah data', '2022-03-31', 'rizqi', 'rizqi@gmail.com'),
('ubah data', '2022-03-31', 'iponk', 'iponk@gmail.com'),
('ubah data', '2022-03-31', 'rizqi', 'rizqi@gmail.com'),
('ubah data', '2022-03-31', 'fahmi', 'fahmi@gmail.com'),
('ubah data', '2022-05-19', 'rizqi', 'rizqi@gmail.com'),
('ubah data', '2022-05-21', 'laode', 'laode@gmail.com'),
('ubah data', '2010-09-15', 'kasir', 'kasir@gmail.com'),
('ubah data', '2010-09-15', 'KASIR', 'kasir@gmail.com'),
('ubah data', '2010-09-15', 'kasir', 'kasir@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `log_detail`
--

CREATE TABLE `log_detail` (
  `status` varchar(50) NOT NULL,
  `waktu` date NOT NULL,
  `id_detail` int(15) NOT NULL,
  `id_menu` int(15) NOT NULL,
  `qty` int(15) NOT NULL,
  `total` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `log_detail`
--

INSERT INTO `log_detail` (`status`, `waktu`, `id_detail`, `id_menu`, `qty`, `total`) VALUES
('tambah order', '2022-03-30', 1, 2, 2, 24000),
('tambah order', '2022-03-30', 2, 3, 2, 20000),
('tambah order', '2022-03-30', 4, 4, 2, 46000),
('tambah order', '2022-05-21', 8, 1, 2, 30000),
('tambah order', '2022-05-21', 9, 4, 2, 50000),
('tambah order', '2022-05-21', 10, 4, 2, 50000),
('tambah order', '2010-09-15', 11, 1, 4, 60000),
('tambah order', '2010-09-15', 12, 2, 3, 54000),
('tambah order', '2022-05-23', 13, 2, 2, 36000),
('tambah order', '2022-05-23', 14, 3, 1, 14000),
('tambah order', '2022-05-23', 15, 1, 4, 60000),
('tambah order', '2022-05-23', 16, 3, 5, 70000),
('tambah order', '2010-09-15', 17, 5, 3, 45000),
('tambah order', '2010-09-15', 18, 4, 1, 25000),
('tambah order', '2010-09-15', 19, 3, 2, 28000),
('tambah order', '2010-09-15', 20, 4, 3, 75000),
('tambah order', '2022-05-24', 21, 1, 2, 30000),
('tambah order', '2022-05-24', 22, 2, 4, 72000),
('tambah order', '2022-05-24', 23, 1, -2, -30000),
('tambah order', '2022-05-24', 24, 3, 3, 42000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `log_master`
--

CREATE TABLE `log_master` (
  `status` varchar(50) NOT NULL,
  `waktu` date NOT NULL,
  `id_master` int(15) NOT NULL,
  `id_detail` int(15) NOT NULL,
  `id_pegawai` int(15) NOT NULL,
  `tgl_byr` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `log_master`
--

INSERT INTO `log_master` (`status`, `waktu`, `id_master`, `id_detail`, `id_pegawai`, `tgl_byr`) VALUES
('tambah bayar', '2022-03-30', 1, 1, 1, '2022-03-30'),
('tambah bayar', '2022-03-30', 3, 1, 1, '2022-03-30'),
('tambah bayar', '2022-03-30', 2, 2, 1, '2022-03-30'),
('tambah bayar', '2022-03-30', 4, 4, 1, '2022-03-30'),
('tambah bayar', '2022-05-22', 1, 8, 1, '2022-05-22'),
('tambah bayar', '2022-05-22', 2, 10, 3, '2022-05-22'),
('tambah bayar', '2022-05-23', 3, 14, 5, '2022-05-23'),
('tambah bayar', '2022-05-23', 4, 14, 5, '2022-05-23'),
('tambah bayar', '2022-05-23', 5, 14, 5, '2022-05-23'),
('tambah bayar', '2022-05-23', 6, 14, 5, '2022-05-23'),
('tambah bayar', '2022-05-23', 7, 14, 5, '2022-05-23'),
('tambah bayar', '2022-05-23', 8, 16, 2, '2022-08-16'),
('tambah bayar', '2022-05-23', 9, 16, 2, '2022-08-16'),
('tambah bayar', '2010-09-15', 8, 18, 4, '2010-04-15'),
('tambah bayar', '2010-09-15', 9, 18, 4, '2010-04-15'),
('tambah bayar', '2010-09-15', 10, 18, 4, '2010-04-15'),
('tambah bayar', '2010-09-15', 11, 18, 4, '2010-04-15'),
('tambah bayar', '2010-09-15', 2, 20, 1, '2022-02-17'),
('tambah bayar', '2010-09-15', 3, 20, 1, '2022-02-17'),
('tambah bayar', '2022-05-24', 4, 22, 1, '2022-03-17'),
('tambah bayar', '2022-05-24', 5, 22, 1, '2022-03-17');

-- --------------------------------------------------------

--
-- Struktur dari tabel `log_menu`
--

CREATE TABLE `log_menu` (
  `status` varchar(50) NOT NULL,
  `waktu` date NOT NULL,
  `nama_menu` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  `foto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `log_menu`
--

INSERT INTO `log_menu` (`status`, `waktu`, `nama_menu`, `harga`, `foto`) VALUES
('tambah menu', '2022-03-29', 'thaitea', 10000, ''),
('tambah menu', '2022-03-30', 'thaitea', 10000, ''),
('tambah menu', '2022-03-30', 'dimsum', 20000, ''),
('update menu', '2022-03-30', 'dimsumku', 23000, ''),
('update menu', '2022-03-30', 'pisang coklat', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('tambah menu', '2022-03-30', 'pisang coklat', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang coklat', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('tambah menu', '2022-03-30', 'pisang arab', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang arab', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang coklat', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang coklat', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang arab', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang arab', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang arab', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang arab', 25000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'pisang coklat', 15000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'dimsum', 23000, ''),
('update menu', '2022-03-30', 'pisang keju', 15000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-30', 'burger', 12000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\burger.jpg'),
('update menu', '2022-03-30', 'thaitea', 10000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\thaitea.jpg'),
('update menu', '2022-03-30', 'dimsum', 23000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\dimsum.jpg'),
('update menu', '2010-09-15', 'pisang keju', 15000, 'C:\\Users\\rimamalika\\OneDrive\\Gambar\\cafe\\pisang coklat.jpg'),
('update menu', '2022-03-31', 'piscok', 15000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\photo.jpg'),
('update menu', '2022-03-31', 'piscok', 15000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\photo.jpg'),
('tambah menu', '2022-03-31', 'coffe lata', 18000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\shutterstock_223511062.jpg'),
('update menu', '2022-03-31', 'coffe late', 18000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\shutterstock_223511062.jpg'),
('tambah menu', '2022-03-31', 'kentang goreng', 15000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\hw8cwcj9j49rgm4kpifw.jpg'),
('tambah menu', '2022-03-31', 'chicken breast', 25000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\chicken breast.jpg'),
('tambah menu', '2022-03-31', 'coffe', 2500, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\shutterstock_223511062.jpg'),
('update menu', '2022-03-31', 'black coffe', 2500, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\hw8cwcj9j49rgm4kpifw.jpg'),
('update menu', '2022-05-19', 'piscok', 15000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\photo.jpg'),
('update menu', '2022-05-19', 'kentang goreng', 14000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\hw8cwcj9j49rgm4kpifw.jpg'),
('tambah menu', '2022-05-21', 'banana', 3000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\photo.jpg'),
('update menu', '2022-05-21', 'banana seres', 4000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\photo.jpg'),
('tambah menu', '2022-05-23', 'black coffe', 15000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\black coffe.jpg'),
('tambah menu', '2010-09-15', 'grape', 5000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\french fries.jpg'),
('update menu', '2010-09-15', 'grape', 10000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\french fries.jpg'),
('update menu', '2022-05-24', 'coffe late', 18000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\cuppocino.jpg'),
('update menu', '2022-05-24', 'kentang goreng', 14000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\french fries.jpg'),
('tambah menu', '2022-05-24', '', -10000, '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_detailpesan`
--

CREATE TABLE `tbl_detailpesan` (
  `id_detail` int(15) NOT NULL,
  `id_menu` int(15) NOT NULL,
  `qty` int(5) NOT NULL,
  `status` varchar(20) NOT NULL,
  `total` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_detailpesan`
--

INSERT INTO `tbl_detailpesan` (`id_detail`, `id_menu`, `qty`, `status`, `total`) VALUES
(8, 1, 2, 'Lunas', 30000),
(9, 4, 2, 'Lunas', 50000),
(10, 4, 2, 'Lunas', 50000),
(11, 1, 4, 'Lunas', 60000),
(12, 2, 3, 'Lunas', 54000),
(13, 2, 2, 'Lunas', 36000),
(14, 3, 1, 'Lunas', 14000),
(15, 1, 4, 'Lunas', 60000),
(16, 3, 5, 'Lunas', 70000),
(17, 5, 3, 'Lunas', 45000),
(18, 4, 1, 'Lunas', 25000),
(19, 3, 2, 'Lunas', 28000),
(20, 4, 3, 'Lunas', 75000),
(21, 1, 2, 'Lunas', 30000),
(22, 2, 4, 'Lunas', 72000),
(23, 1, -2, 'Belum Lunas', -30000),
(24, 3, 3, 'Belum Lunas', 42000);

--
-- Trigger `tbl_detailpesan`
--
DELIMITER $$
CREATE TRIGGER `addorder` AFTER INSERT ON `tbl_detailpesan` FOR EACH ROW INSERT INTO log_detail(status,waktu,id_detail,id_menu,qty,total) VALUES ('tambah order',now(),new.id_detail,new.id_menu,new.qty,new.total)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_masterpesan`
--

CREATE TABLE `tbl_masterpesan` (
  `id_master` int(15) NOT NULL,
  `id_detail` int(15) NOT NULL,
  `id_pegawai` int(15) NOT NULL,
  `tgl_byr` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_masterpesan`
--

INSERT INTO `tbl_masterpesan` (`id_master`, `id_detail`, `id_pegawai`, `tgl_byr`) VALUES
(1, 8, 1, '2022-05-22'),
(2, 20, 1, '2022-02-17'),
(3, 20, 1, '2022-02-17'),
(4, 22, 1, '2022-03-17'),
(5, 22, 1, '2022-03-17');

--
-- Trigger `tbl_masterpesan`
--
DELIMITER $$
CREATE TRIGGER `addbayar` AFTER INSERT ON `tbl_masterpesan` FOR EACH ROW INSERT INTO log_master(status,waktu,id_master,id_detail,id_pegawai,tgl_byr) VALUES ('tambah bayar',now(),new.id_master,new.id_detail,new.id_pegawai,new.tgl_byr)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `updatebayar` AFTER INSERT ON `tbl_masterpesan` FOR EACH ROW update tbl_detailpesan set status='Lunas'
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_menu`
--

CREATE TABLE `tbl_menu` (
  `id_menu` int(15) NOT NULL,
  `nama_menu` varchar(50) NOT NULL,
  `harga` int(15) NOT NULL,
  `foto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_menu`
--

INSERT INTO `tbl_menu` (`id_menu`, `nama_menu`, `harga`, `foto`) VALUES
(-6, '', -10000, ''),
(1, 'piscok', 15000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\photo.jpg'),
(2, 'coffe late', 18000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\cuppocino.jpg'),
(3, 'kentang goreng', 14000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\french fries.jpg'),
(4, 'chicken breast', 25000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\chicken breast.jpg'),
(5, 'black coffe', 15000, 'C:\\Users\\DELL\\Documents\\NetBeansProjects\\kasircafe_rizqi\\src\\cafe\\black coffe.jpg');

--
-- Trigger `tbl_menu`
--
DELIMITER $$
CREATE TRIGGER `tambah` AFTER INSERT ON `tbl_menu` FOR EACH ROW INSERT INTO log_menu(status,waktu,nama_menu,harga,foto) VALUES ('tambah menu',now(),new.nama_menu,new.harga,new.foto)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update` AFTER UPDATE ON `tbl_menu` FOR EACH ROW INSERT INTO log_menu(status,waktu,nama_menu,harga,foto) VALUES ('update menu',now(),new.nama_menu,new.harga,new.foto)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_pegawai`
--

CREATE TABLE `tbl_pegawai` (
  `id_pegawai` int(15) NOT NULL,
  `nama_pegawai` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` int(8) NOT NULL,
  `handphone` varchar(15) NOT NULL,
  `level` enum('admin','kasir','manager','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_pegawai`
--

INSERT INTO `tbl_pegawai` (`id_pegawai`, `nama_pegawai`, `email`, `password`, `handphone`, `level`) VALUES
(1, 'rizqi', 'rizqi@gmail.com', 456, '0857937655', 'admin'),
(2, 'admin', 'admin@gmail.com', 123, '08995656', 'admin'),
(3, 'kasir', 'kasir@gmail.com', 123, '09876875', 'kasir'),
(4, 'manager', 'manager@gmail.com', 123, '087976354', 'manager'),
(5, '', '', 123, '', 'admin');

--
-- Trigger `tbl_pegawai`
--
DELIMITER $$
CREATE TRIGGER `ubah` AFTER UPDATE ON `tbl_pegawai` FOR EACH ROW INSERT INTO log_admin(status,waktu,nama_pegawai,email)VALUES ('ubah data',now(),new.nama_pegawai,new.email)
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbl_detailpesan`
--
ALTER TABLE `tbl_detailpesan`
  ADD PRIMARY KEY (`id_detail`),
  ADD KEY `id_menu` (`id_menu`);

--
-- Indeks untuk tabel `tbl_masterpesan`
--
ALTER TABLE `tbl_masterpesan`
  ADD PRIMARY KEY (`id_master`),
  ADD KEY `id_detail` (`id_detail`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indeks untuk tabel `tbl_menu`
--
ALTER TABLE `tbl_menu`
  ADD PRIMARY KEY (`id_menu`);

--
-- Indeks untuk tabel `tbl_pegawai`
--
ALTER TABLE `tbl_pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tbl_detailpesan`
--
ALTER TABLE `tbl_detailpesan`
  ADD CONSTRAINT `tbl_detailpesan_ibfk_1` FOREIGN KEY (`id_menu`) REFERENCES `tbl_menu` (`id_menu`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `tbl_masterpesan`
--
ALTER TABLE `tbl_masterpesan`
  ADD CONSTRAINT `tbl_masterpesan_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `tbl_pegawai` (`id_pegawai`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_masterpesan_ibfk_2` FOREIGN KEY (`id_detail`) REFERENCES `tbl_detailpesan` (`id_detail`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
