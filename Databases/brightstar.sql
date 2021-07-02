-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: brightstar
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `customer_details`
--

LOCK TABLES `customer_details` WRITE;
/*!40000 ALTER TABLE `customer_details` DISABLE KEYS */;
INSERT INTO `customer_details` VALUES ('11','Naveen','51, Walpitamulla, Devalapola','0779090424','12','2018-09-05','qwertyuiop','2345rreewss','Toshiba',100000),('13','Chamanthi','Nittambuwa, Gampaha','0714739045','06','2018-09-02','qwertyuiop','2345rreewss','Ricoh',150000),('14','Ravindu','Bandarakoswatta,Kurunagala','0716749523','0','2018-09-19','qwertyuide','234reewss','Ricoh',130000),('15','Nipun','Mawanalla','0757849320','3','2018-09-02','cvbnjnkk','zxcvfdwe','Toshiba',200000),('16','Pramudhitha','mawanalla ','0781245637','04','2018-09-05','sdfghjk','poiuytre','Toshiba',200000),('17','Amasha','Horagolla Waththa, Nittambuwa','0779090424','24','2018-09-06','zxcvbnmk','asdfgg','Toshiba',2500000),('18','muhafil munas','thihariya','0762345671','24','2018-09-06','zvxbcnj','mnhdu','Toshiba',275000),('21','Naveen','12,Niwala,Veyangoda.','0712548632','12','2018-09-28','12ed3dqdq','qwdqqwqw2','Toshiba',1750000),('22','Bimsara','23,Gampaha','0712947173','5','2018-09-28','asdwd23e3','d323d23e','Toshiba',250000),('23','Dilan','Kegalle','075258963','20','2018-09-28','12ddhchcj','mxksmijsqi','Toshiba',75000),('24','Chathuranga','45.udugama','075247896','12','2018-09-28','1dwdwuhd','323fdsas','Toshiba',25000),('27','Janaka','Dewalapola','0773156577','6','2018-09-30','casxasxcax','xsxasxscsc','RICOH',1000000),('31','Nimal','Malabe','0718023698','6','2018-10-03','dwd2e3r3','3r2r2r3','RICOH',125000),('32','Vihan','Kiribathgoda','0752369874','6','2018-10-03','cwqfdqwdq','21d2q12d','RICOH',250090),('33','Ranjith','Naiwala','0332291514','6','2018-10-03','234567','evefeef','RICOH',125000),('34','Gamage','Galkissa','0752365478','0','2018-10-03','qwd2112','12e12d12','Toshiba',75000),('35','Pasan','Pittugala','071452368','0','2018-10-03','acqwdqwdq','dqwqdqwdq','Toshiba',500000),('37','A.C. Mahawela','Veyangoda','0752369841','0','2018-10-03','hbnxqwudnun','h db32uyd28','RICOH',175000),('39','Lanka','Badulla','0782365478','0','2018-10-03','dqwww','wdqaw','Toshiba',50000),('40','Ruwin','Gampaha','0332289614','0','2018-10-03','xwxwcxac','wcacawa','Toshiba',120000),('41','yasith','horana','071311311','0','2018-10-04','toshiba','737637','RICOH',1233),('45','name','malabe','0779090424','0','2018-10-04','toshiba1323','255','Toshiba',10000);
/*!40000 ALTER TABLE `customer_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `expenditure`
--

LOCK TABLES `expenditure` WRITE;
/*!40000 ALTER TABLE `expenditure` DISABLE KEYS */;
INSERT INTO `expenditure` VALUES ('E4','maintenance','2018-09-25','main building',NULL,'somapala',452,5200,0,NULL),('E5','other','2018-09-13','air Ticket',NULL,'amarabandu',500,50000,0,NULL),('E6','other','2018-11-14','good bye party',NULL,'Mr.Perera',45000,45000,0,NULL),('E7','electricity','2018-09-21','10000',2225,NULL,100,100,0,'October'),('E9','maintenance','2018-09-10','Store',NULL,'Mr. Rathnayake',5000,5000,0,NULL),('E1009','phone','2018-09-26','0568954762',32,NULL,250,500,0,'September'),('E1010','other','2018-09-14','45245',NULL,'5254',542452,5424,0,NULL),('E15','water','2018-09-19','452',45254,NULL,452,425,0,'September'),('E16','water','2018-10-04','1242',54,NULL,10000,10000,0,'October'),('E17','electricity','2018-10-18','12345',452136987,NULL,100,100,123456,'September'),('E18','rent','2018-10-01','Store',NULL,'Mr.De Silva',1000,1000,0,NULL),('E19','water','2018-10-01','123456',4521,NULL,1000,1000,0,'October'),('E20','other','2018-10-01','Truck 60-4356 repair',NULL,'Mr.De Silva',1000,1000,0,NULL),('E21','other','2018-10-01','Truck 60-4356 repair',NULL,'Mr.De Silva',1000,1000,0,NULL),('E22','other','2018-10-01','Truck 60-4356 repair',NULL,'Mr.De Silva',1000,1000,0,NULL),('E23','other','2018-10-01','Truck 60-4356 repair',NULL,'Mr.De Silva',1000,1000,0,NULL),('E24','rent','2018-10-01','Store',NULL,'Mr.De Silva',1000,1000,0,NULL),('E25','water','2018-10-01','123456',45,NULL,1000,1000,0,'October'),('E1020','water','2018-10-18','156489',25,NULL,595,595,0,'October');
/*!40000 ALTER TABLE `expenditure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `machinemaintenancenew`
--

LOCK TABLES `machinemaintenancenew` WRITE;
/*!40000 ALTER TABLE `machinemaintenancenew` DISABLE KEYS */;
INSERT INTO `machinemaintenancenew` VALUES (35,'Yasith','Horana','0713116722','yasith@gmail.com','not working','Toshiba','Black','Pending','Pending','2018-10-04','Pending'),(36,'Pasindu','Malabe','0713225622','pasidu@gmail.com','not working','Toshiba','Black','Pending','Pending','2018-10-04','Pending'),(37,'lanka ','Nuwwara','0712222233','lanka@gmaill.com','not working','Ricoh','Black','Pending','Pending','2018-10-04','Pending'),(38,'ruwin','yakkala','0713332213','lanka@gmail.com','not working','Ricoh','Black','Pending','Pending','2018-10-04','Pending'),(39,'Modith','Badulla','0711321321','Moditha@gmail.com','not working','Toshiba','Black','Done','Pending','2018-10-04','2018-10-04'),(40,'Naween ','Yakkkala','0714255252','Naween@gamail.com','not working','Toshiba','Black','Pending','Pending','2018-10-05','Pending'),(41,'Hiruni ','Malabe','0713311111','hiruni@gmail.com','not working','Toshiba','Black','Done','Pending','2018-10-04','2018-10-05'),(42,'yasith','horana','0713111111','ya@gmail.com','jj','Toshiba','Colour','Pending','Pending','2018-10-04','Pending');
/*!40000 ALTER TABLE `machinemaintenancenew` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `machinemg`
--

LOCK TABLES `machinemg` WRITE;
/*!40000 ALTER TABLE `machinemg` DISABLE KEYS */;
INSERT INTO `machinemg` VALUES (26,'Samsung','Samsung','Toshiba','Item 1','E33333','RS.25000','1'),(25,'Select Machine Name','Select Brand','Acer','Select Type','eqeqe','Rs.10000','1'),(20,'Toshiba','Toshiba','Asus','Item 3','10','Rs.15000','30'),(21,'Lenovo','Toshiba','Toshiba','Item 2','5','Rs.5000','50'),(24,'Samsung','Lenovo','Asus','Item 2','se234','Rs.15000','1'),(22,'Samsung','Toshiba','Asus','Item 1','0','Rs.15000','30'),(23,'Toshiba','Toshiba','Lenovo','Item 3','se1','Rs.10000','25'),(27,'Samsung','Toshiba','Lenovo','Item 2','e44444','Rs.15000','1'),(28,'Toshiba','Richo','Black','Select Type','w234443','Rs.15000','1');
/*!40000 ALTER TABLE `machinemg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `maintenancepaymentnew`
--

LOCK TABLES `maintenancepaymentnew` WRITE;
/*!40000 ALTER TABLE `maintenancepaymentnew` DISABLE KEYS */;
INSERT INTO `maintenancepaymentnew` VALUES (43,35,'Yasith','1200.0','2018-10-05','Cash','Done','yasith@gmail.com','2018-10-12'),(44,36,'Pasan','1300.0','2018-10-05','Cash','Done','Pasan@gmail.com','2018-10-06'),(45,37,'modith','12333.0','2018-10-05','------','Pending','modith@gmail.com','Pending');
/*!40000 ALTER TABLE `maintenancepaymentnew` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sparepart_buyer`
--

LOCK TABLES `sparepart_buyer` WRITE;
/*!40000 ALTER TABLE `sparepart_buyer` DISABLE KEYS */;
INSERT INTO `sparepart_buyer` VALUES ('C101','963643159V','Pasan Godamune','0767198400','Malabe','SLIIT','pasanjg@sliit.lk'),('C102','988845362V','John Doe','0754123654','Kaduwela','DFRE','john@mail.com'),('C103','972345675V','Sri Nipun','0784213654','Malabe	','FDEW','dri@mail.com'),('C104','897653749V','Kamal Neil','0785412300','Pittugala','FVCDS','kamal@mail.com'),('C105','897654329V','Nimal John','0756321400','Colombo','VFDE','nimal@mail.com'),('C106','887452140V','Yasith Athukorala','0754123650','Malabe','RFDE','yasith@mail.com');
/*!40000 ALTER TABLE `sparepart_buyer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sparepart_sale`
--

LOCK TABLES `sparepart_sale` WRITE;
/*!40000 ALTER TABLE `sparepart_sale` DISABLE KEYS */;
INSERT INTO `sparepart_sale` VALUES ('S53','I1035','2018-10-04','Toshiba','Duo','Toshiba','P1',3,200,600),('S54','I1035','2018-10-04','Samsung','LED','Toshiba','P2',3,458,1374),('S55','I1036','2018-10-04','Toshiba','Duo','Toshiba','P1',3,200,600),('S56','I1036','2018-10-04','Samsung','LED','Toshiba','P2',3,458,1374),('S57','I1036','2018-10-04','Samsung','LED','Toshiba','P2',3,458,1374),('S58','I1036','2018-10-04','Samsung','LED','Toshiba','P2',1,458,458),('S7','I1025','2018-10-04','Samsung','LED','Toshiba','P2',2,458,916),('S8','I1025','2018-10-04','Samsung','LED','Toshiba','P2',0,458,0);
/*!40000 ALTER TABLE `sparepart_sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sparepart_sale_invoice`
--

LOCK TABLES `sparepart_sale_invoice` WRITE;
/*!40000 ALTER TABLE `sparepart_sale_invoice` DISABLE KEYS */;
INSERT INTO `sparepart_sale_invoice` VALUES ('I1011','Pasan Godamune','963643159V','2018-09-30','Cash','Paid','-','-',2250),('I1012','Pasan Godamune','963643159V','2018-10-01','Cash','Paid','-','-',1250),('I1013','Pasan Godamune','963643159V','2018-10-01','Cash','Paid','-','-',1250),('I1015','Pasan Godamune','963643159V','2018-10-02','Cash','Paid','-','-',1000),('I1016','pasan','238956850V','2018-10-02','Cash','Paid','-','-',500),('I1019','Pasan Godamune','963643159V','2018-10-02','Cheque','Pending','BOC','3552453',1000),('I1020','Pasan Godamune','963643159V','2018-10-02','Cheque','Pending','Sampath Bank','E334FR4',750),('I1021','Pasan Godamune','963643159V','2018-10-02','Cash','Paid','-','-',500),('I1022','Jay','968874521V','2018-10-02','Cash','Paid','-','-',250),('I1023','Jay','968874521V','2018-10-02','Cheque','Pending','Commercial Bank','23e23',250),('I1024','Pasan Godamune','963643159V','2018-10-02','Cash','Paid','-','-',500),('I1025','Pasan Godamune','963643159V','2018-10-02','Cash','Paid','-','-',500),('I1026','Pasan Godamune','963643159V','2018-10-02','Cash','Paid','-','-',500),('I1027','Pasan Godamune','963643159V','2018-10-02','Cash','Paid','-','-',500),('I1028','Pasan Godamune','963643159V','2018-10-02','Cash','Paid','-','-',750),('I1029','Pasan Godamune','963643159V','2018-10-03','Cheque','Pending','Sampath Bank','C33EW1',450),('I1030','Pasan Godamune','963643159V','2018-10-03','Cash','Paid','-','-',250),('I1031','Pasan Godamune','963643159V','2018-10-03','Cash','Paid','-','-',200),('I1032','Pasan Godamune','963643159V','2018-10-03','Cash','Paid','-','-',100),('I1035','Kamal Neil','897653749V','2018-10-04','Cash','Paid','-','-',1974),('I1036','Pasan Godamune','963643159V','2018-10-04','Cheque','Pending','Commercial Bank','EE333DD',3806),('I104','Jay','968874521V','2018-09-29','Cash','Paid','-','-',750),('I109','Pasan Godamune','963643159V','2018-09-30','Cheque','Paid','Commercial Bank','3422er33',1500);
/*!40000 ALTER TABLE `sparepart_sale_invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sparepart_stock`
--

LOCK TABLES `sparepart_stock` WRITE;
/*!40000 ALTER TABLE `sparepart_stock` DISABLE KEYS */;
INSERT INTO `sparepart_stock` VALUES ('Toshiba','P2','Samsung','LED','458','25','8'),('Toshiba','P1','Toshiba','Duo','200','8','1'),('Ricoh','P3','Select Brand ','White','544','4','3'),('Ricoh','P4','Richo','Black','125','7','10');
/*!40000 ALTER TABLE `sparepart_stock` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-05 10:09:08
