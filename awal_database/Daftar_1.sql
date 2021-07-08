-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 08, 2021 at 11:13 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Daftar_1`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `KodeBarang` varchar(50) NOT NULL,
  `NamaBarang` varchar(100) NOT NULL,
  `Ukuran` float NOT NULL,
  `Satuan` varchar(10) NOT NULL,
  `HargaModal` float NOT NULL,
  `HargaJual` float NOT NULL,
  `IdMerk` int(10) NOT NULL,
  `IdPemasok` int(10) NOT NULL,
  `Keterangan` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`KodeBarang`, `NamaBarang`, `Ukuran`, `Satuan`, `HargaModal`, `HargaJual`, `IdMerk`, `IdPemasok`, `Keterangan`) VALUES
('ETLBM', 'Lem Bulu Mata', 5, 'gr', 9000, 10000, 3, 3, NULL),
('MKMES01', 'Matte Eyeshadow Set 01', 6.6, 'gr', 25474, 30000, 1, 1, NULL),
('MKMES02', 'Matte Eyeshadow Set 02', 6.6, 'gr', 25474, 30000, 1, 1, NULL),
('MKMES03', 'Matte Eyeshadow Set 03', 6.6, 'gr', 25474, 30000, 1, 1, NULL),
('SRBLGMP', 'Body Lotion Goat\'s Milk Pump', 250, 'ml', 20000, 23000, 2, 2, NULL),
('SRRDLP', 'Sabun RDL Papaya', 135, 'gr', 12000, 15000, 2, 2, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `merk`
--

CREATE TABLE `merk` (
  `IdMerk` int(10) NOT NULL,
  `NamaMerk` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `merk`
--

INSERT INTO `merk` (`IdMerk`, `NamaMerk`) VALUES
(1, 'MUKKA'),
(2, 'SARI'),
(3, 'Eye Talk');

-- --------------------------------------------------------

--
-- Table structure for table `pemasok`
--

CREATE TABLE `pemasok` (
  `IdPemasok` int(10) NOT NULL,
  `NamaPemasok` varchar(100) NOT NULL,
  `LokasiPemasok` longtext NOT NULL,
  `NoTelp` varchar(50) DEFAULT NULL,
  `KodePos` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemasok`
--

INSERT INTO `pemasok` (`IdPemasok`, `NamaPemasok`, `LokasiPemasok`, `NoTelp`, `KodePos`) VALUES
(1, 'PT Dargis Inti Sejahtera', 'Gold Coast Office Tower 2nd Floor, Unit GHJ, Pantai Indah Kapuk Street, Penjaringan, Jakarta Utara, Indonesia', '021-50208180', 14470),
(2, 'PT Star Abadi Ratu Indonesia', 'Jl. Intan II No. 168 Desa Curug, Kecamatan Gunung Sindur, Parung, Bogor', '0251-8604791', 16340),
(3, 'Anto PSG', 'Pasar Pagi', '089988776655', 12344);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`KodeBarang`),
  ADD KEY `IdMerk` (`IdMerk`),
  ADD KEY `IdPemasok` (`IdPemasok`);

--
-- Indexes for table `merk`
--
ALTER TABLE `merk`
  ADD PRIMARY KEY (`IdMerk`);

--
-- Indexes for table `pemasok`
--
ALTER TABLE `pemasok`
  ADD PRIMARY KEY (`IdPemasok`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `merk`
--
ALTER TABLE `merk`
  MODIFY `IdMerk` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pemasok`
--
ALTER TABLE `pemasok`
  MODIFY `IdPemasok` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`IdMerk`) REFERENCES `merk` (`IdMerk`),
  ADD CONSTRAINT `barang_ibfk_2` FOREIGN KEY (`IdPemasok`) REFERENCES `pemasok` (`IdPemasok`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
