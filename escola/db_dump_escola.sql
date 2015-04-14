CREATE DATABASE  IF NOT EXISTS `unibh_tesp_escola` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `unibh_tesp_escola`;
-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: 127.0.0.1    Database: unibh_tesp_escola
-- ------------------------------------------------------
-- Server version	5.5.39-MariaDB-1~wheezy

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Member`
--

DROP TABLE IF EXISTS `Member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Member` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(25) NOT NULL,
  `phone_number` varchar(12) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_9qv6yhjqm8iafto8qk452gx8h` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Member`
--

LOCK TABLES `Member` WRITE;
/*!40000 ALTER TABLE `Member` DISABLE KEYS */;
/*!40000 ALTER TABLE `Member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TB_ALUNO`
--

DROP TABLE IF EXISTS `TB_ALUNO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TB_ALUNO` (
  `DATA_ANIVERSARIO` date NOT NULL,
  `MATRICULA` bigint(20) NOT NULL,
  `ID` bigint(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_bb5i9txqriuho8qfrojvhq7wl` (`MATRICULA`),
  KEY `FK_6rfemk1ppmaoxx9ph1pqdb1e2` (`ID`),
  CONSTRAINT `FK_6rfemk1ppmaoxx9ph1pqdb1e2` FOREIGN KEY (`ID`) REFERENCES `TB_PESSOA` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TB_ALUNO`
--

LOCK TABLES `TB_ALUNO` WRITE;
/*!40000 ALTER TABLE `TB_ALUNO` DISABLE KEYS */;
INSERT INTO `TB_ALUNO` VALUES ('1989-01-02',123,1),('1988-02-03',127,2),('1987-03-04',128,3);
/*!40000 ALTER TABLE `TB_ALUNO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TB_PESSOA`
--

DROP TABLE IF EXISTS `TB_PESSOA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TB_PESSOA` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CPF` char(14) NOT NULL,
  `NOME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_29q61rpxcuh0xf0p4xe8r3ae` (`CPF`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TB_PESSOA`
--

LOCK TABLES `TB_PESSOA` WRITE;
/*!40000 ALTER TABLE `TB_PESSOA` DISABLE KEYS */;
INSERT INTO `TB_PESSOA` VALUES (1,'22619333474','Ann Clair'),(2,'23525135700','Daphne'),(3,'75452086765','Deb'),(4,'35723498428','Harold'),(5,'80090764307','Laura'),(6,'43984469829','Emma');
/*!40000 ALTER TABLE `TB_PESSOA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TB_PROFESSOR`
--

DROP TABLE IF EXISTS `TB_PROFESSOR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TB_PROFESSOR` (
  `SALARIO` decimal(19,2) NOT NULL,
  `ID` bigint(20) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_bvnnxbfl8oni0xih7dp0urel6` (`ID`),
  CONSTRAINT `FK_bvnnxbfl8oni0xih7dp0urel6` FOREIGN KEY (`ID`) REFERENCES `TB_PESSOA` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TB_PROFESSOR`
--

LOCK TABLES `TB_PROFESSOR` WRITE;
/*!40000 ALTER TABLE `TB_PROFESSOR` DISABLE KEYS */;
INSERT INTO `TB_PROFESSOR` VALUES (10000.00,4),(11000.00,5),(12000.00,6);
/*!40000 ALTER TABLE `TB_PROFESSOR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-13 21:58:56
