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
INSERT INTO `asignatura` VALUES (1,'2020103','Calculo1',5,'primero','2009','cuatro',1,2,3,0),(2,'20w0102','Calculo1',5,'primero','2015','cuatro',1,2,3,0),(3,'2020101','Introduccion a la computacion',5,'primero','2009','cuatro',1,0,3,2),(4,'20w0101','computacion',5,'primero','2015','cuatro',1,0,3,2),(5,'2020201','Programacion1',5,'segundo','2009','cuatro',1,0,3,2),(6,'20w0201','Algoritmica1',5,'segundo','2015','cuatro',1,0,3,2),(7,'2020301','Programacion2',5,'tercero','2009','cuatro',1,0,3,2),(8,'20w0301','Algoritmica2',5,'tercero','2015','cuatro',1,0,3,2),(9,'2020503','Base de Datos',5,'cuarto','2009','quinto',1,0,3,2),(10,'20w0503','Base de Datos',5,'quinto','2015','cuatro',1,0,3,2),(11,'2020603','Base de Datos 2',5,'sexto','2009','cuatro',1,0,3,2),(12,'20w0603','Base de Datos 2',5,'sexto','2015','cuatro',1,0,3,2),(13,'2020801','Prueba de Software',5,'octavo','2009','quinto',1,0,3,2),(14,'20w0802','Prueba de Software',5,'octavo','2015','cuatro',1,0,3,2),(15,'2020802','Calidad de Software',5,'octavo','2009','cuatro',1,0,3,2),(16,'20w0802','Calidad de Software',5,'octavo','2015','cuatro',1,0,3,2),(17,'2020801','Inteligencia Artificial',5,'octavo','2009','quinto',1,0,3,2),(18,'20w0801','Inteligencia Artificial',5,'octavo','2015','cuatro',1,0,3,2),(19,'2020104','Matematica Basica I',5,'primero','2009','cuatro',1,2,3,0),(20,'20w0104','Matematica Basica I',5,'primero','2015','cuatro',1,2,3,0),(21,'2020204','Matematica Basica II',5,'segundo','2009','quinto',1,2,3,0),(22,'20w0204','Matematica Basica II',5,'segundo','2015','cuatro',1,2,3,0),(23,'2020203','Calculo2',5,'segundo','2009','cuatro',1,2,3,0),(24,'20w203','Calculo2',5,'segundo','2015','cuatro',1,2,3,0),(25,'2020404','Metodos Numericos',5,'cuarto','2009','quinto',1,2,3,0),(26,'20w0404','Metodos Numericos',5,'cuarto','2015','cuatro',1,2,3,0),(27,'2020402','Estructura de Datos 1',5,'cuarto','2009','cuatro',1,0,3,2),(28,'20w0402','Estructura de Datos 1',5,'cuarto','2015','cuatro',1,0,3,2),(29,'2020502','Estructura de Datos 2',5,'cuarto','2009','quinto',1,0,3,2),(30,'20w0502','Estructura de Datos 2',5,'cuarto','2015','cuatro',1,0,3,2),(31,'2021001','Inteligencia de Nogocios',5,'decimo','2009','cuatro',1,0,3,0),(32,'2000902','Proyecto de tesis 1',5,'noveno','2009','cuatro',1,2,3,0),(33,'2021002','Proyecto de tesis 2',5,'decimo','2009','quinto',1,2,3,0),(34,'2000903','Sistemas Inteligentes',5,'noveno','2009','cuatro',1,2,3,0),(35,'2020701','Arquitectura de Software',5,'septimo','2009','cuatro',1,2,3,0),(36,'2000704','Redes y Transmision de datos',5,'septimo','2009','cuatro',1,2,3,0),(37,'2020703','Investigacion de operaciones 2',5,'septimo','2009','quinto',1,2,3,0),(38,'2000703','Investigacion de operaciones 2',5,'sexto','2015','cuatro',1,2,3,0),(39,'2020901','Etica Profesional',5,'noveno','2009','cuatro',1,2,3,0),(40,'2020107','Etica Profesional',5,'primero','2009','quinto',1,2,3,0),(41,'20w0102','Base de Datos 2',5,'sexto','2015','cuatro',1,2,3,0),(42,'20w0102','Base de Datos',5,'quinto','2015','cuatro',1,2,3,0),(43,'2020101','Base de Datos 2',5,'sexto','2009','cuatro',1,2,3,0),(44,'20w0102','Base de Datos 2',5,'sexto','2015','cuatro',1,2,3,0),(45,'2020101','Base de Datos',5,'cuarto','2009','quinto',1,2,3,0),(46,'20w0102','Base de Datos',5,'quinto','2015','cuatro',1,2,3,0),(47,'2020101','Base de Datos 2',5,'sexto','2009','cuatro',1,2,3,0),(48,'20w0102','Base de Datos 2',5,'sexto','2015','cuatro',1,2,3,0),(53,'20w0102','Base de Datos 2',5,'sexto','2015','cuatro',1,2,3,0);
/*!40000 ALTER TABLE `asignatura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `aula`
--

LOCK TABLES `aula` WRITE;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
INSERT INTO `aula` VALUES (1,'102','40','disponible','disponible','disponible','disponible','disponible','primero','1'),(2,'204','32','disponible','disponible','disponible','disponible','disponible','segundo','1'),(3,'302','30','disponible','disponible','disponible','disponible','disponible','tercero','2'),(4,'209','50','disponible','disponible','disponible','disponible','disponible','segundo','1'),(5,'206','35','disponible','disponible','disponible','disponible','disponible','segundo','1'),(6,'307','30','disponible','disponible','disponible','disponible','disponible','tercero','2'),(7,'105','35','disponible','disponible','no disponible','disponible','disponible','primero','1'),(8,'106','35','disponible','disponible','disponible','disponible','disponible','primero','0'),(9,'108','30','disponible','disponible','disponible','disponible','disponible','primero','1'),(10,'204','35','disponible','no disponible','no disponible','no disponible','disponible','segundo','1'),(11,'201','40','disponible','disponible','disponible','disponible','disponible','segundo','1'),(12,'202','45','disponible','disponible','disponible','disponible','no disponible','segundo','2'),(13,'203','35','disponible','disponible','disponible','no disponible','disponible','segundo','1'),(14,'205','35','disponible','disponible','disponible','disponible','disponible','segundo','0'),(15,'207','50','disponible','disponible','no disponible','disponible','disponible','segundo','1'),(16,'102','40','disponible','disponible','disponible','disponible','no disponible','primer','2'),(17,'104','40','no disponible','disponible','disponible','no disponible','disponible','primer','1'),(18,'105','40','disponible','disponible','disponible','disponible','disponible','primer','0'),(19,'108','40','disponible','no disponible','disponible','disponible','no disponible','primer','1'),(20,'110','40','disponible','disponible','disponible','disponible','disponible','primer','1');
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `carga`
--

LOCK TABLES `carga` WRITE;
/*!40000 ALTER TABLE `carga` DISABLE KEYS */;
/*!40000 ALTER TABLE `carga` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,1,1,1,'2:00pm','7:00pm','g1','lunes'),(2,5,1,2,'2:00pm','7:00pm','g3','martes'),(3,8,4,3,'2:00pm','7:00pm','g2','jueves'),(4,5,6,4,'2:00pm','7:00pm','g1','viernes'),(5,7,2,5,'2:00pm','7:00pm','g2','sabado'),(6,2,3,6,'8:00pm','1:00pm','g3','jueves'),(7,5,1,1,'2:00pm','7:00pm','g1','lunes'),(8,5,1,1,'2:00pm','7:00pm','g1','lunes'),(9,5,1,1,'2:00pm','7:00pm','g1','lunes'),(10,5,1,1,'2:00pm','7:00pm','g1','lunes');
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dictado`
--

LOCK TABLES `dictado` WRITE;
/*!40000 ALTER TABLE `dictado` DISABLE KEYS */;
INSERT INTO `dictado` VALUES (1,1,1),(2,2,2),(3,3,2),(4,4,1),(5,5,2),(6,6,2),(7,7,1),(8,8,13),(9,9,15);
/*!40000 ALTER TABLE `dictado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `disponibilidad`
--

LOCK TABLES `disponibilidad` WRITE;
/*!40000 ALTER TABLE `disponibilidad` DISABLE KEYS */;
INSERT INTO `disponibilidad` VALUES (1,1,'8:00am ','2:00pm','martes','2016-2'),(2,1,'2:00pm ','8:00pm','miercoles','2016-2'),(3,1,'8:00am ','6:00pm','jueves','2016-2'),(4,1,'10:00am ','1:00pm','lunes','2016-2'),(5,2,'11:00am ','2:00pm','martes','2016-2'),(6,2,'2:00pm ','8:00pm','viernes','2016-2'),(7,2,'9:00am ','5:00pm','jueves','2016-2'),(8,2,'10:00am ','6:00pm','lunes','2016-2'),(9,3,'8:00am ','8:00pm','martes','2016-2'),(10,3,'2:00pm ','8:00pm','viernes','2016-2'),(11,3,'8:00am ','6:00pm','jueves','2016-2'),(12,3,'10:00am ','3:00pm','lunes','2016-2'),(13,4,'8:00am ','2:00pm','martes','2016-2'),(14,4,'8:00am ','8:00pm','sabado','2016-2'),(15,4,'8:00am ','6:00pm','jueves','2016-2'),(16,4,'10:00am ','5:00pm','lunes','2016-2'),(17,5,'11:00am ','2:00pm','martes','2016-2'),(18,5,'2:00pm ','8:00pm','miercoles','2016-2'),(19,5,'8:00am ','8:00pm','sabado','2016-2'),(20,5,'8:00am ','7:00pm','lunes','2016-2'),(21,6,'8:00am ','2:00pm','jueves','2016-2'),(22,6,'1:00pm ','10:00pm','miercoles','2016-2'),(23,6,'10:00am ','6:00pm','martes','2016-2'),(24,6,'10:00am ','6:00pm','viernes','2016-2'),(25,7,'9:00am ','5:00pm','viernes','2016-2'),(26,7,'1:00pm ','10:00pm','sabado','2016-2'),(27,8,'8:00am ','8:00pm','sabado','2016-2'),(28,8,'9:00am ','6:00pm','martes','2016-2'),(29,9,'8:00am ','2:00pm','martes','2016-2'),(30,9,'2:00pm ','8:00pm','miercoles','2016-2'),(31,9,'8:00am ','6:00pm','jueves','2016-2'),(32,10,'10:00am ','9:00pm','lunes','2016-2'),(33,10,'8:00am ','2:00pm','sabado','2016-2'),(34,10,'4:00pm ','10:00pm','viernes','2016-2'),(35,10,'10:00am ','6:00pm','jueves','2016-2'),(36,11,'10:00am ','6:00pm','miercoles','2016-2'),(37,11,'8:00am ','2:00pm','martes','2016-2'),(38,11,'4:00pm ','10:00pm','viernes','2016-2'),(39,11,'10:00am ','6:00pm','jueves','2016-2'),(40,12,'10:00am ','6:00pm','miercoles','2016-2'),(41,12,'8:00am ','2:00pm','martes','2016-2'),(42,12,'4:00pm ','10:00pm','viernes','2016-2'),(43,12,'10:00am ','6:00pm','jueves','2016-2'),(44,13,'10:00am ','6:00pm','lunes','2016-2'),(45,13,'8:00am ','2:00pm','martes','2016-2'),(46,13,'4:00pm ','10:00pm','viernes','2016-2'),(47,13,'10:00am ','6:00pm','jueves','2016-2'),(48,14,'10:00am ','6:00pm','lunes','2016-2'),(49,14,'8:00am ','2:00pm','sabado','2016-2'),(50,14,'4:00pm ','10:00pm','viernes','2016-2'),(51,14,'10:00am ','6:00pm','jueves','2016-2'),(52,15,'10:00am ','6:00pm','sabado','2016-2'),(53,15,'8:00am ','2:00pm','martes','2016-2'),(54,15,'4:00pm ','10:00pm','viernes','2016-2'),(55,15,'10:00am ','6:00pm','miercoles','2016-2');
/*!40000 ALTER TABLE `disponibilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` VALUES
(1,'EMILIO','CASTILLO JIMENEZ','No','EMILIO@gmail.com','996666567','21034571',10,0),
(2,'GUSTAVO','ARREDONDO CASTILLO  ','No','GUSTAVO@gmail.com','978453658','53408643',10,0),
(3,'ROBERT','ESPINOZA DOMINGUEZ   ','No','ROBERT@gmail.com','679789055','78637672',10,0),
(4,'SANTIAGO','MOQUILLAZA','si','SANTIAGO@gmail.com','869357524','86732394',10,0),
(5,'AMELIA','VILLANUEVA YAYA','No',' AMELIA@gmail.com','996666567','21037771',10,0),
(6,'ROBERT','ESPINOZA DOMINGUEZ   ','No','ROBERT@gmail.com','753753788','60786700',10,0),
(7,'JI SOO','KIM','No','CHICHU@gmail.com','57375375','86723687',10,0),
(8,'LUIS','GUERRA ','No','LUIS@gmail.com','996666567','46407089',10,0),
(9,'JAVIER','CABRERA DIAZ ','No','JAVIER@gmail.com','527753753','25863974',10,0),
(10,'JUAN','GAMARRA MORENO ','No','JUAN2@gmail.com','978978603','45678708',10,0),
(11,'JUAN CARLOS','GONZALES SUAREZ ','Si','JUAN CARLOS@gmail.com','869879978','35378679',10,0),
(12,'JORGE','CHAVEZ SOTO ','No','JORGE@gmail.com','534453453','21050571',10,0),
(13,'ARTURO','BARTRA MORE ','No','ARTURO@gmail.com','978966536','44045786',10,0),
(14,'JORGE','DIAZ MUÑANTE ','Si','JORGE2@gmail.com','989706458','10253878',10,0),
(15,'FANY','SOBERO RODRIGUEZ ','No','FANY@gmail.com','978564569','37396787',10,0);
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users`
--

-- LOCK TABLES `users` WRITE;
-- /*!40000 ALTER TABLE `users` DISABLE KEYS */;
-- /*!40000 ALTER TABLE `users` ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Debra','chacaliaza','llamosa','unicornio','digimon',1,'abcggmal','123456789'),(2,'Maria','mato','ramirez','caballo','digimon',1,'abcggmal','951234786'),(3,'Juan','martines','llamosa','unicornio5','digimon',1,'abcggmal','159632478'),(4,'Pedro','oyola','llamosa','unicornio8','2145',1,'abcggmal','21876225'),(5,'jisoo','kim','sasa','caba','147852369',1,'abcggmal','155431543'),(6,'Cesar','Lupe','Pardave','lalisa','125s',1,'a@ad','31543549'),(7,'Debra','Borges','Boalños','nona','2335',2,'abcggmal','123456799'),(8,'Kathy','obama','Cabo','sempay','digimon',0,'abcggmal','28569713'),(9,'Eli','Romero','Cuadreo','loli','digimon',2,'abcggmal','17461234'),(10,'Eli','Chan','Chan','baymax','gerson',0,'abcggmal','187648753'),(11,'Debra','chacaliaza','llamosa','moon','digimon',1,'abcggmal','numero');
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

-- Dump completed on 2016-11-23  0:16:17
