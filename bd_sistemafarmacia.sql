-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-06-2022 a las 17:03:31
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- Volcando estructura de base de datos para bd_sistemafarmacia
CREATE DATABASE IF NOT EXISTS `bd_sistemafarmacia` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `bd_sistemafarmacia`;

--
-- Base de datos: `bd_sistemafarmacia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id` int(2) NOT NULL,
  `nombre_producto` varchar(100) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `cantidad` int(5) NOT NULL,
  `proveedor` varchar(100) NOT NULL,
  `sucursal` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id`, `nombre_producto`, `tipo`, `cantidad`, `proveedor`, `sucursal`) VALUES
  (1, 'Paracetamol', 'Tabletas', 2, 'Medley', 'Las Palmas'),
  (2, 'Omeprazol', 'Capsulas', 1, 'Biomep', 'Puerto México'),
  (3, 'Naproxeno', 'Inyectable', 3, 'Biomep', 'Las Palmas'),
  (4, 'Omeprazol', 'Capsulas', 3, 'Medley', 'Puerto México'),
  (5, 'Metamizol', 'Tabletas', 3, 'Biomep', 'Puerto México'),
  (6, 'Diclofenaco', 'Tabletas', 2, 'Medley', 'Puerto México'),
  (7, 'Loratadina', 'Tabletas', 1, 'Medley', 'Puerto México'),
  (8, 'Paracetamol', 'Tabletas', 2, 'Medley', 'Las Palmas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidostemporal`
--

CREATE TABLE `pedidostemporal` (
  `id` int(2) NOT NULL,
  `nombre_producto` varchar(100) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `cantidad` int(5) NOT NULL,
  `proveedor` varchar(100) NOT NULL,
  `sucursal` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidostemporal`
--

INSERT INTO `pedidostemporal` (`id`, `nombre_producto`, `tipo`, `cantidad`, `proveedor`, `sucursal`) VALUES
(1, 'YATERMINÉESTO', 'Tabletas', 111, 'Medley', 'Las Palmas'),
(2, 'ads', 'Tabletas', 123, 'Biomep', 'Las Palmas'),
(3, '123', 'Tabletas', 123, 'Biomep', 'Las Palmas'),
(4, '123', 'Solución', 132, 'Biomep', 'Las Palmas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(2) NOT NULL,
  `tipo_usuario` varchar(20) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `contrasena` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `tipo_usuario`, `usuario`, `contrasena`) VALUES
(1, 'administrador', 'Valeria', 'valeria'),
(2, 'administrador', 'Ricardo', 'ricardo'),
(3, 'empleado', 'Daniel', 'daniel'),
(5, 'empleado', 'Pavon', 'pavon ');


--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT de la tabla `pedidostemporal`
--
ALTER TABLE `pedidostemporal`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
