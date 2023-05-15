-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2023 a las 05:09:05
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_calificaciones_kinder`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `nombre_materia` varchar(30) DEFAULT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  `nivel` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombre_materia`, `observaciones`, `nivel`) VALUES
(1, 'Lenguaje y comunicación', '', '1'),
(2, 'Pensamiento matemático', '', '1'),
(3, 'Exploración y comprensión del ', '', '1'),
(4, 'Artes', '', '1'),
(5, 'Educación física', '', '1'),
(6, 'Inglés', '', '1'),
(7, 'Educación socioemocional', '', '1'),
(8, 'Informática y robótica', '', '1'),
(9, 'Lenguaje y comunicación', '', '2'),
(10, 'Pensamiento matemático', '', '2'),
(11, 'Exploración y comprensión del ', '', '2'),
(12, 'Artes', '', '2'),
(13, 'Educación física', '', '2'),
(14, 'Inglés', '', '2'),
(15, 'Educación socioemocional', '', '2'),
(16, 'Informática y robótica', '', '2'),
(17, 'Lenguaje y comunicación', '', '3'),
(18, 'Pensamiento matemático', '', '3'),
(19, 'Exploración y comprensión del ', '', '3'),
(20, 'Artes', '', '3'),
(21, 'Educación física', '', '3'),
(22, 'Inglés', '', '3'),
(23, 'Educación socioemocional', '', '3'),
(24, 'Informática y robótica', '', '3');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
