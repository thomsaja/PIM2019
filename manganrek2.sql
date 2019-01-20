-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 18, 2019 at 11:29 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manganrek2`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `CEK` int(11) DEFAULT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `NAMA` varchar(100) DEFAULT NULL,
  `ALAMAT` varchar(100) DEFAULT NULL,
  `NO_TELEPON` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`CEK`, `USERNAME`, `PASSWORD`, `NAMA`, `ALAMAT`, `NO_TELEPON`) VALUES
(2, '', '111111111111', '', '', ''),
(1, 'admin', 'admin', 'deni', 'pasuruan', '08937003001'),
(2, 'aswin', 'aswin112233', 'Nurcahyo Aswin Damasworo', 'Jl Jenggolo 1 blok G/4', '082133655115'),
(2, 'deni', 'deni', 'deni aprianto', 'pasuruan', '081937003001'),
(2, 'denni', '12345', 'deny', 'saldkjsal', '213'),
(2, 'dens', 'deni12345', '', '', ''),
(2, 'dsad', '12345678', '', '', ''),
(2, 'dsahdsajkdh', 'Denideni', '', '', ''),
(2, 'jiki', 'deni12345', '', '', ''),
(2, 'suman', 'suman', 'sumanto', 'malang', '1290321903'),
(2, 'syarul', 'syarul123', 'syarul aditya', 'jl sukun malang', '081937003001'),
(2, 'varian', 'varian999', 'varian gradianta', 'malang', '08999999');

-- --------------------------------------------------------

--
-- Table structure for table `makanan`
--

CREATE TABLE `makanan` (
  `ID_MAKANAN` int(11) NOT NULL,
  `NAMA_MAKANAN` varchar(100) DEFAULT NULL,
  `JENIS` varchar(20) DEFAULT NULL,
  `HARGA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `makanan`
--

INSERT INTO `makanan` (`ID_MAKANAN`, `NAMA_MAKANAN`, `JENIS`, `HARGA`) VALUES
(1, 'nasi', 'makanan', 5000),
(2, 'nasi goreng cap jempol', 'Makanan', 20000),
(3, 'liquid', 'Minuman', 10000),
(4, 'liquid', 'Minuman', 10000),
(5, 'pisang', 'Snack', 5000),
(6, 'mie kuah', 'Makanan', 5000),
(8, 'coca cola', 'Minuman', 5000),
(9, 'piscok', 'Snack', 7000);

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `ID_PEMBELI` int(11) NOT NULL,
  `ID_MAKANAN` int(11) DEFAULT NULL,
  `USERNAME` varchar(50) DEFAULT NULL,
  `JUMLAH` int(11) DEFAULT NULL,
  `JUMLAHHARGA` int(11) DEFAULT NULL,
  `TANGGAL` varchar(20) NOT NULL,
  `HASIL` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`ID_PEMBELI`, `ID_MAKANAN`, `USERNAME`, `JUMLAH`, `JUMLAHHARGA`, `TANGGAL`, `HASIL`) VALUES
(1, 1, 'admin', 5, 25000, '0000-00-00', ''),
(2, 1, 'admin', 8, 40000, '0000-00-00', ''),
(4, 1, 'varian', 2, 10000, '0000-00-00', ''),
(5, 1, 'varian', 5, 25000, '0000-00-00', ''),
(6, 1, 'deni', 6, 30000, '0000-00-00', ''),
(9, 4, 'deni', 4, 54000, '0000-00-00', ''),
(10, 4, 'deni', 5, 64000, '0000-00-00', ''),
(12, 3, 'deni', 5, 64000, '0000-00-00', 'Sudah Diterima'),
(13, 4, 'deni', 4, 54000, '2018-12-18', 'Sudah Diterima'),
(14, 5, 'deni', 4, 34000, '2018-12-19', 'Sudah Diterima'),
(15, 3, 'deni', 3, 44000, '2018/12/19', 'Belum Diterima'),
(16, 2, 'aswin', 2, 54000, '2018/12/19', 'Sudah Diterima'),
(17, 5, 'deni', 7, 49000, '2018/12/19', 'Belum Diterima'),
(18, 6, 'deni', 4, 34000, '2018/12/20', 'Belum Diterima'),
(19, 3, 'deni', 3, 30000, '2019/01/13', 'Belum Diterima'),
(20, 3, 'deni', 2, 20000, '2019/01/13', 'Belum Diterima'),
(21, 5, 'deni', 3, 15000, '2019/01/13', 'Belum Diterima'),
(22, 5, 'syarul', 5, 25000, '2019/01/14', 'Sudah Diterima'),
(23, 9, 'deni', 4, 28000, '2019/01/17', 'Belum Diterima'),
(24, 9, 'deni', 2, 14000, '2019/01/17', 'Sudah Diterima');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`USERNAME`);

--
-- Indexes for table `makanan`
--
ALTER TABLE `makanan`
  ADD PRIMARY KEY (`ID_MAKANAN`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`ID_PEMBELI`),
  ADD KEY `USERNAME` (`USERNAME`),
  ADD KEY `ID_MAKANAN` (`ID_MAKANAN`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `makanan`
--
ALTER TABLE `makanan`
  MODIFY `ID_MAKANAN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `pembeli`
--
ALTER TABLE `pembeli`
  MODIFY `ID_PEMBELI` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD CONSTRAINT `pembeli_ibfk_2` FOREIGN KEY (`USERNAME`) REFERENCES `login` (`USERNAME`),
  ADD CONSTRAINT `pembeli_ibfk_3` FOREIGN KEY (`ID_MAKANAN`) REFERENCES `makanan` (`ID_MAKANAN`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
