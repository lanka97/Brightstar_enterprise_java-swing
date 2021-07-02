-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 03, 2018 at 07:35 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mynewdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admint`
--

CREATE TABLE `admint` (
  `Aid` int(12) NOT NULL,
  `AFname` varchar(20) NOT NULL,
  `ALname` varchar(10) NOT NULL,
  `ADayofBirth` varchar(50) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Aemail` varchar(15) NOT NULL,
  `Aphone` varchar(10) NOT NULL,
  `Anic` varchar(10) NOT NULL,
  `Apass` varchar(10) NOT NULL,
  `type` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admint`
--

INSERT INTO `admint` (`Aid`, `AFname`, `ALname`, `ADayofBirth`, `Address`, `Aemail`, `Aphone`, `Anic`, `Apass`, `type`) VALUES
(1, 'admin', 'udana', '2018-10-12', 'nittabuwa', 'admin@gmail.com', '0722721133', '985425100v', 'admin', 'admin'),
(3, 'kalpa', 'tharanga', '2018-10-12', 'yakkaa', 'kalpa@gmail.com', '0784561235', '574125433v', 'admin', 'admin'),
(4, 'user', 'tharuka', '2018-10-12', 'gampaha', 'user@gmail.com', '0784561235', '879652411v', 'user', 'user'),
(5, 'dasun', 'tharanga', '2018-10-18', 'malabe', 'dasun@gmail.com', '0776677338', '971413700v', 'user', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `auditt`
--

CREATE TABLE `auditt` (
  `name` varchar(10) NOT NULL,
  `time` varchar(10) NOT NULL,
  `date` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `auditt`
--

INSERT INTO `auditt` (`name`, `time`, `date`, `status`) VALUES
('Admin', '15:31:12', '03-Oct-2018', 'logged in'),
('Admin', '15:31:50', '03-Oct-2018', 'logged in'),
('Admin', '15:31:57', '03-Oct-2018', 'logged in'),
('Admin', '15:32:04', '03-Oct-2018', 'logged in'),
('Admin', '15:32:16', '03-Oct-2018', 'logged in'),
('Admin', '15:33:06', '03-Oct-2018', 'logged in'),
('Admin', '15:36:04', '03-Oct-2018', 'logged in'),
('Admin', '15:37:30', '03-Oct-2018', 'logged in'),
('Admin', '15:40:16', '03-Oct-2018', 'logged in'),
('Admin', '15:43:19', '03-Oct-2018', 'logged in'),
('Admin', '15:46:37', '03-Oct-2018', 'logged in'),
('Admin', '15:49:56', '03-Oct-2018', 'logged in'),
('Admin', '16:01:38', '03-Oct-2018', 'logged in'),
('Admin', '16:12:07', '03-Oct-2018', 'logged in'),
('Admin', '16:18:28', '03-Oct-2018', 'logged in'),
('Admin', '16:19:49', '03-Oct-2018', 'logged in'),
('Admin', '16:21:23', '03-Oct-2018', 'logged in'),
('admin', '22:35:56', '03-Oct-2018', 'logged in'),
('admin', '22:36:21', '03-Oct-2018', 'logged in'),
('admin', '23:02:26', '03-Oct-2018', 'logged in'),
('admin', '23:02:37', '03-Oct-2018', 'logged in'),
('admin', '23:02:46', '03-Oct-2018', 'logged in'),
('admin', '23:02:56', '03-Oct-2018', 'logged in'),
('aruna', '21:49:45', '03-Oct-2018', 'logged in'),
('aruna', '21:50:35', '03-Oct-2018', 'logged in'),
('aruna', '21:52:22', '03-Oct-2018', 'logged in'),
('aruna', '21:53:13', '03-Oct-2018', 'logged in'),
('aruna', '21:54:56', '03-Oct-2018', 'logged in'),
('aruna', '21:55:24', '03-Oct-2018', 'logged in'),
('aruna', '21:56:54', '03-Oct-2018', 'logged in'),
('aruna', '21:59:41', '03-Oct-2018', 'logged in'),
('kasun', '10:13:51', '03-Oct-2018', 'logged in'),
('kasun', '10:15:30', '03-Oct-2018', 'logged in'),
('kasun', '10:16:43', '03-Oct-2018', 'logged in'),
('kasun', '10:18:53', '03-Oct-2018', 'logged in'),
('kasun', '10:19:44', '03-Oct-2018', 'logged in'),
('kasun', '10:25:31', '03-Oct-2018', 'logged in'),
('kasun', '10:28:00', '03-Oct-2018', 'logged in'),
('kasun', '10:28:52', '03-Oct-2018', 'logged in'),
('kasun', '10:37:30', '03-Oct-2018', 'logged in'),
('kasun', '10:37:58', '03-Oct-2018', 'logged in'),
('kasun', '10:41:42', '03-Oct-2018', 'logged in'),
('kasun', '10:50:23', '03-Oct-2018', 'logged in'),
('kasun', '10:59:00', '03-Oct-2018', 'logged in'),
('kasun', '11:21:54', '03-Oct-2018', 'logged in'),
('kasun', '11:24:25', '03-Oct-2018', 'logged in'),
('kasun', '11:26:14', '03-Oct-2018', 'logged in'),
('kasun', '11:31:17', '03-Oct-2018', 'logged in'),
('kasun', '11:33:16', '03-Oct-2018', 'logged in'),
('kasun', '11:36:31', '03-Oct-2018', 'logged in'),
('kasun', '11:37:29', '03-Oct-2018', 'logged in'),
('kasun', '11:40:13', '03-Oct-2018', 'logged in'),
('kasun', '11:42:31', '03-Oct-2018', 'logged in'),
('kasun', '11:45:56', '03-Oct-2018', 'logged in'),
('kasun', '11:48:24', '03-Oct-2018', 'logged in'),
('kasun', '11:51:54', '03-Oct-2018', 'logged in'),
('kasun', '11:55:08', '03-Oct-2018', 'logged in'),
('user', '15:32:31', '03-Oct-2018', 'logged in'),
('user', '15:32:36', '03-Oct-2018', 'logged in'),
('user', '15:32:42', '03-Oct-2018', 'logged in'),
('user', '22:36:07', '03-Oct-2018', 'logged in'),
('user', '22:41:19', '03-Oct-2018', 'logged in');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admint`
--
ALTER TABLE `admint`
  ADD PRIMARY KEY (`Aid`);

--
-- Indexes for table `auditt`
--
ALTER TABLE `auditt`
  ADD PRIMARY KEY (`name`,`time`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admint`
--
ALTER TABLE `admint`
  MODIFY `Aid` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
