-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.22-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para bd_sistemafarmacia
CREATE DATABASE IF NOT EXISTS `bd_sistemafarmacia` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `bd_sistemafarmacia`;

-- Volcando estructura para tabla bd_sistemafarmacia.pedidos
CREATE TABLE IF NOT EXISTS `pedidos` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(100) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `cantidad` int(5) NOT NULL,
  `proveedor` varchar(100) NOT NULL,
  `sucursal` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla bd_sistemafarmacia.pedidos: ~8 rows (aproximadamente)
/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
INSERT INTO `pedidos` (`id`, `nombre_producto`, `tipo`, `cantidad`, `proveedor`, `sucursal`) VALUES
	(1, 'Paracetamol', 'Tabletas', 2, 'Medley', 'Las Palmas'),
	(2, 'Omeprazol', 'Capsulas', 1, 'Biomep', 'Puerto México'),
	(3, 'Naproxeno', 'Inyectable', 3, 'Biomep', 'Las Palmas'),
	(4, 'Omeprazol', 'Capsulas', 3, 'Medley', 'Puerto México'),
	(5, 'Metamizol', 'Tabletas', 3, 'Biomep', 'Puerto México'),
	(6, 'Diclofenaco', 'Tabletas', 2, 'Medley', 'Puerto México'),
	(7, 'Loratadina', 'Tabletas', 1, 'Medley', 'Puerto México'),
	(8, 'Paracetamol', 'Tabletas', 2, 'Medley', 'Las Palmas');
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
