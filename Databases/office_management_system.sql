-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: office_management_system
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
-- Dumping data for table `available_machines`
--

LOCK TABLES `available_machines` WRITE;
/*!40000 ALTER TABLE `available_machines` DISABLE KEYS */;
INSERT INTO `available_machines` VALUES ('7812345673','Toshiba','Color','0','Brand New','New Machine'),('7871236789','Toshiba','Color','1000','Good Condition','Used Machine,Available For 2nd User'),('7872347890','Toshiba','Color','0','Brand New','New Machine'),('8812344567','Ricoh','Black','2000','Good Condition','Used Machine,Available For 2nd User'),('8812389021','Ricoh','Black','0','Brand New','New Machine'),('8912456789','Ricoh','Color','3000','Good Condition','Used Machine,Available For 2nd User'),('8912789087','Ricoh','Color','500','Good Condition','Used Machine,Available For 2nd User'),('8990919293','Ricoh','Color','0','Brand New','New Machine'),('Ricoh','Color','8971236540','400','Brand New','Brand New Machine');
/*!40000 ALTER TABLE `available_machines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `rent`
--

LOCK TABLES `rent` WRITE;
/*!40000 ALTER TABLE `rent` DISABLE KEYS */;
INSERT INTO `rent` VALUES ('689012349V','Toshiba','7623120987','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('689012349V','Ricoh','8990919489','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('689076531V','Toshiba','7624119832','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('741258963V','Ricoh','7898521470','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('741258963V','Ricoh','3698521470','September',NULL,NULL,NULL,NULL,NULL,'Pending'),('781234098V','Ricoh','8976120985','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('897654123V','Toshiba','7669871230','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('897654123V','Toshiba','4569871230','September',NULL,NULL,NULL,NULL,NULL,'Pending'),('899076234V','Ricoh','7632109876','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('919076723V','Toshiba','2345670981','March ',325,'Cash Payment','2018-09-28','No','No','Completed'),('919076723V','Toshiba','8945670981','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('919076723V','Toshiba','2345670981','September',NULL,NULL,NULL,NULL,NULL,'Pending'),('951100374V','Ricoh','8945210981','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('962791790V','Toshiba','7687213456','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('962890712V','Ricoh','9871236540','May',5000,'Cash Payment','2018-10-01','No','No','Completed'),('962890712V','Toshiba','7687172731','October',NULL,NULL,NULL,NULL,NULL,'Pending'),('962890712V','Toshiba','7654321098','September',250,'Cash Payment','2018-09-30','No','No','Completed'),('962890712V','Ricoh','9871236540','September',5000,'Cash Payment','2018-10-01','No','No','Completed'),('971290456V','Toshiba','7823123456','October',NULL,NULL,NULL,NULL,NULL,'Pending');
/*!40000 ALTER TABLE `rent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `rented_customers`
--

LOCK TABLES `rented_customers` WRITE;
/*!40000 ALTER TABLE `rented_customers` DISABLE KEYS */;
INSERT INTO `rented_customers` VALUES ('689012349V','Customer Two','No 2,Street 2,City 2','+94761234560','usertwo@gmail.com','20000','Cash Payment','No','No'),('689076531V','Customer Two','No 2,Street 2,City 2','+94125678901','customer2@gmail.com','10000','Cash Payment','No','No'),('741258963V','User Four','Address','+94766218901','userfour@gmail.com','10000','Cash Payment','No','No'),('781234098V','Customer Test','No 3,Street 3,City 3','+94768902341','user3@gamil.com','20000','Cash Payment','No','No'),('897654123V','Customer Test Test','No 1,Street 1,City 1','+94112345098','testemail@gmail.com','10000','Cash Payment','No','No'),('899076234V','Customer Eight','Address','+94112890765','pasindubahagya@outlook.com','20000','Cash Payment','No','No'),('919076723V','User Test','12/A , Main Street , Nugegoda.','+94112751918','usertest@gmail.com','20000','Cash Payment','No','No'),('951100374V','Naveen','Address','+94779090433','naveenb@gmail.com','10000','Cash Payment','No','No'),('962791790V','Pasindu','No 1,Street 1,City 1,Postal Code','+94112987654','pasindubahagya@gmail.com','40000','Cheque Payment','Peoples Bank','234098'),('962890712V','Customer Five','No 5,Street 5,City 5','+94766121660','pasindubahagya@gmail.com','10000','Cheque Payment','Peoples Bank','258741'),('971290456V','Customer Four','No 4,Street 4,City 4','+94112890876','customerfour@gmail.com','20000','Cash Payment','No','No');
/*!40000 ALTER TABLE `rented_customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `rented_machine_records`
--

LOCK TABLES `rented_machine_records` WRITE;
/*!40000 ALTER TABLE `rented_machine_records` DISABLE KEYS */;
INSERT INTO `rented_machine_records` VALUES ('689012349V','Toshiba','Black','7623120987',200,'Brand New','New Machine','2018-09-21'),('689012349V','Ricoh','Color','8990919489',0,'Brand New','New Machine','2018-10-03'),('689076531V','Toshiba','Black','7624119832',2000,'Good Condition','Used Machine','2018-09-22'),('741258963V','Ricoh','Color','7898521470',0,'Brand New','New Machine','2018-09-05'),('781234098V','Ricoh','Color','8976120985',2000,'Brand New','New Machine','2018-10-03'),('897654123V','Toshiba','Black','7669871230',1000,'Brand New','Used','2018-09-30'),('899076234V','Ricoh','Black','7632109876',1000,'Good Condition','Used Machine','2018-10-01'),('919076723V','Toshiba','Color','8945670981',200,'Good Condition','New','2018-09-05'),('951100374V','Ricoh','Color','8945210981',1000,'Brand New','Brand New Machine','2018-09-24'),('962791790V','Toshiba','Black','7687213456',5000,'Brand New','Used Machine,Available For 2nd User','2018-10-04'),('962890712V','Toshiba','Black','7687172731',0,'Brand New','New Machine','2018-10-04'),('971290456V','Toshiba','Color','7823123456',0,'Brand New ','New Machine','2018-10-02');
/*!40000 ALTER TABLE `rented_machine_records` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-05 10:10:14
