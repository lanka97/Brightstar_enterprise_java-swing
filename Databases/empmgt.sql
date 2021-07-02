-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: empmgt
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
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (27,'Hiruni ','Pabasara','1997-04-02','No.2890 , Stage 3 , Anuradhapura','hiru@gmail.com','+94718779855','975930599V'),(28,'Hasini ','Punsara','1990-10-17','No.21/1 , kaduwele Road , Malabe','hasi@yahoo.com','+94775889633','905963242V'),(29,'Ajith','Perera','1968-10-18','No.2650 , Waliwite Road , Malabe ','aji@gmail.com','+94715443255','687954122V'),(30,'Nuwani','Silva','1978-10-21','No.568  , Araliye Road , Galle','nu@yahoo.com','+94258776935','785469322V'),(31,'Namal','Dias','1983-08-17','No.25/4 , Temple Road , Mathara','dias2@gmail.com','+94719887845','835689477V'),(32,'Nimal','Gunewardhana','1986-06-17','No.8907 , Stage 2 , Anuradhapura','nimalg@yahoo.com','+94716554899','869741521V'),(33,'Sandali','Nethsari','1974-10-18','No.576/5 , Kaduwele Road , Malabe','sandali@gmail.com','+94114523147','749856255V'),(34,'Aruna','kamara','1988-07-13','No.5678 , Vijerama Road , Colombo 7','arun@yahoo.com','+94778996532','889654712V'),(35,'Madhu','Roxx','1970-05-19','No.258/4 , Palace Road , Rajagiriya','roxx@yahoo.com','+94257889632','709865411V'),(36,'Pasindu','Senarathna','1983-12-14','No.7890 , Stage 3 , Kurunagala','pasi@yahoo.com','+94112459865','867894574V'),(37,'Amal','Perera','1972-12-20','No.909 , Hospital Road , Kaluthara','amal@gmail.com','+94718779658','725698555V'),(38,'Harsha','Perera','1986-10-17','No.2890 , Stage 3 , Anuradhapura','harsha@gmail.com','+94718779855','655930599V');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `paysheet`
--

LOCK TABLES `paysheet` WRITE;
/*!40000 ALTER TABLE `paysheet` DISABLE KEYS */;
INSERT INTO `paysheet` VALUES (1,'27','Hiruni ','2018-10-13','October','Employee','29','1000','1500','2500','28','3821800'),(2,'28','Hasini ','2018-10-13','October','Employee','50','1000','1200','2500','20','3602000'),(3,'29','Ajith','2018-10-13','October','Admin','52','2000','1000','1000','22','3765200'),(4,'30','Nuwani','2018-10-13','October','Secretary','53','1400','1200','1500','25','3589200'),(5,'31','Namal','2018-10-13','October','Employee','23','100','120','2500','25','259300'),(6,'32','Nimal','2018-10-13','October','Employee','39','25','20','100','25','13975'),(7,'33','Sandali','2018-10-13','October','Admin','24','1000','2000','1025','14','2945400'),(8,'34','Aruna','2018-10-13','October','Employee','20','1000','1000','2000','28','2812800'),(9,'35','Madhu','2018-10-13','October','Employee','20','1000','1050','2000','20','2922000'),(10,'36','Pasindu','2018-10-13','October','Employee','20','1000','1050','2050','28','2912800'),(11,'34','Aruna','2018-10-19','August','Employee','20','1000','1000','2000','28','2812800');
/*!40000 ALTER TABLE `paysheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (12,'Hema Printers','No.233 , Temple Road , Panadura','hemap@gmail.com','+94115522639'),(13,'Gunarathna Bookshop','No.765/1 , Waliwite Road , Kaduwele','gunar@yahoo.com','+94112254789'),(14,'Dammika Bookshop','No.456 , Galle Road , Colombo','dammika@yahoo.com','+94114569328'),(15,'Star Printers','No.456 , Araliya Uyane Road , Kaduwele','Star@yahoo.com','+94112654879'),(16,'Mahanama Printers','No.567 , Jaffna Road , Jaffna','mhanama@yahoo.com','+94115487987'),(17,'Helakuru Bookshop','No.234 , Stage 3 , Anuradhapura','helakuru@yahoo.com','+94252224159'),(18,'Gamini Books','No.147/58 , Senanayaka Road , Mathara','gami@yahoo.com','+94254578965'),(19,'Bookstar','No.234 , Galle Road , Colombo','bookstar@yahoo.com','+94112456987'),(20,'Bookshelf','No.456/25 , Maliga Road , Kiribathgoda','bookshelf@yahoo.com','+94115478963'),(21,'Sara Printers','No.456 , Eppawele Road , Anuradhapura','sarap@gmail.com','+94114578963');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-05 10:09:44
