-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: horarios
-- ------------------------------------------------------
-- Server version	5.7.12-log

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
-- Dumping data for table `asignatura`
--

LOCK TABLES `asignatura` WRITE;
/*!40000 ALTER TABLE `asignatura` DISABLE KEYS */;
INSERT INTO `asignatura` VALUES (1,'2020101','introduccion a la computacion',5,'primero','2015','4',1,0,3,2),(2,'2020105','calculo I',5,'primero','2015','4',1,2,3,0),(3,'2020112','estructura de datos',5,'cuarto','2015','4',1,0,3,2),(4,'2020501','base de datos',5,'quinto','2009','4',1,0,3,2),(5,'2020504','modelamiento y requisitos de software',5,'quinto','2009','4',1,0,3,2),(6,'2020602','modelamiento de software',5,'sexto','2009','4',1,0,3,2),(7,'2020302','series y ecuaciones diferenciales',5,'tercero','2015','4',1,2,3,0),(8,'2020205','fisica I',5,'segundo','2015','4',1,2,1,2),(9,'2020703','investigacion y operaciones',5,'setimo','2009','4',1,2,3,0),(10,'2020803','calidad de software',5,'octavo','2009','4',1,2,3,0);
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `aula`
--

LOCK TABLES `aula` WRITE;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
INSERT INTO `aula` VALUES (1,'102','40','disponible','disponible','disponible','disponible','disponible','primero','1'),(2,'204','32','disponible','disponible','disponible','disponible','disponible','segundo','1'),(3,'302','30','disponible','disponible','disponible','disponible','disponible','tercero','2'),(4,'209','50','disponible','disponible','disponible','disponible','disponible','segundo','1'),(5,'206','35','disponible','disponible','disponible','disponible','disponible','segundo','1'),(6,'307','30','disponible','disponible','disponible','disponible','disponible','tercero','2'),(7,'105','35','disponible','disponible','no disponible','disponible','disponible','primero','1'),(8,'106','35','disponible','disponible','disponible','disponible','disponible','primero','1'),(9,'108','30','disponible','disponible','disponible','disponible','disponible','primero','1'),(10,'204','35','disponible','no disponible','no disponible','no disponible','disponible','segundo','1');
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,5,1,1,'8:00am','1:00pm','g1'),(2,5,1,1,'2:00pm','6:00pm','g1'),(3,5,3,1,'9:00am','1:00pm','g2'),(4,5,2,1,'10:00am','1:00pm','g3'),(5,5,1,1,'2:00pm','7:00pm','g2'),(6,5,1,1,'8:00am','1:00pm','g1'),(7,1,1,5,'11:00am','2:00pm','g1'),(8,2,5,8,'8:00am','1:00pm','g2'),(9,3,3,9,'2:00pm','7:00pm','g1'),(10,4,1,6,'8:00am','1:00pm','g3'),(11,6,2,4,'12:00am','1:00pm','g1'),(12,7,7,2,'2:00pm','4:00pm','g4'),(13,8,8,3,'7:00pm','10:00pm','g1'),(14,5,9,7,'2:00pm','8:00pm','g2');
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dictado`
--

LOCK TABLES `dictado` WRITE;
/*!40000 ALTER TABLE `dictado` DISABLE KEYS */;
INSERT INTO `dictado` VALUES (1,9,1),(2,2,1),(3,4,10),(4,4,7),(5,1,5),(6,3,8),(7,2,1),(8,8,4),(9,6,3),(10,4,1),(11,5,2);
/*!40000 ALTER TABLE `dictado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `disponibilidad`
--

LOCK TABLES `disponibilidad` WRITE;
/*!40000 ALTER TABLE `disponibilidad` DISABLE KEYS */;
INSERT INTO `disponibilidad` VALUES (1,2,'inicio','final','miercoles','2016-2'),(2,2,'inicio','final','miercoles','2016-2'),(3,2,'inicio','final','miercoles','2016-2'),(4,3,'inicio','final','miercoles','2016-2'),(6,3,'inicio','final','miercoles','2016-2'),(7,4,'inicio','final','martes','2016-2'),(8,4,'inicio','final','martes','2016-2');
/*!40000 ALTER TABLE `disponibilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` VALUES (1,'Cesar','Tineo','Si','tineo@live.jp','996666567'),(2,'Carlos','Vaca','No','Carlos@live.jp','996666567'),(3,'Juan','Vasques','Si','tito@live.jp','545395630'),(4,'Lucas','Chavez','Si','lucas@lotto.com','223321333'),(5,'Mariel','Tineo','No','mariel@redy','999856471'),(6,'Angelica','Tineo','No','angy@unmsm','955221375'),(7,'Estefania','Kim','No','tefa@pucp','996332145'),(8,'Jacky','Tineo','Si','jacky@hotmail','9978521230'),(9,'Cesar','Tineo','No','tineo@live.jp','99932100'),(10,'Karol','Tineo','No','tineo@live.jp','996666567'),(11,'Angela','Tineo','Si','tineo@live.jp','996666567'),(12,'Paola','Tineo','No','tineo@live.jp','996666567');
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Debra','chacaliaza','llamosa','unicornio','digimon',1,'abcggmal','123456789'),(2,'Maria','mato','ramirez','caballo','digimon',1,'abcggmal','951234786'),(3,'Juan','martines','llamosa','unicornio','digimon',1,'abcggmal','159632478'),(4,'Pedro','oyola','llamosa','unicornio','2145',1,'abcggmal','21876225'),(5,'Robert','vargas','llamosa','unicornio','785',1,'abcggmal','155431543'),(6,'Cesar','Lupe','Pardave','lalisa','125s',1,'a@ad','31543549'),(7,'Debra','Borges','Boalños','nona','2335',2,'abcggmal','123456799'),(8,'Kathy','obama','Cabo','sempay','digimon',0,'abcggmal','28569713'),(9,'Eli','Romero','Cuadreo','loli','digimon',2,'abcggmal','17461234'),(10,'Eli','Chan','Chan','baymax','gerson',0,'abcggmal','187648753');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-19 22:24:59
