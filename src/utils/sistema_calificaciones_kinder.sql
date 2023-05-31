-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-05-2023 a las 07:26:06
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
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `id_alumno` int(11) NOT NULL,
  `id_tutor` int(11) NOT NULL,
  `id_curso` int(11) NOT NULL,
  `nombre_alumno` varchar(20) DEFAULT NULL,
  `apellido_paterno` varchar(20) DEFAULT NULL,
  `apellido_materno` varchar(20) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `CURP` varchar(18) DEFAULT NULL,
  `edad` char(1) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `grupo` char(1) DEFAULT NULL,
  `grado` char(1) DEFAULT NULL,
  `id_salon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id_alumno`, `id_tutor`, `id_curso`, `nombre_alumno`, `apellido_paterno`, `apellido_materno`, `fecha_nacimiento`, `CURP`, `edad`, `sexo`, `grupo`, `grado`, `id_salon`) VALUES
(10, 24, 1, 'Ma', 'Ba', 'Pi', '0020-06-01', 'BAPM200601HGRXZRA4', '3', 'M', 'A', '1', 1),
(11, 26, 2, 'Mauricio', 'Banos', 'Piza', '0019-06-01', 'BAPM190601HGRXZRA4', '4', 'M', 'A', '2', 1),
(12, 27, 1, 'Mauricio', 'Ba', 'Piza', '0020-06-01', 'BAPM200601HGRXZRA4', '3', 'M', 'A', '1', 1),
(13, 28, 1, 'Mauricio', 'Banos', 'Piza', '0020-06-01', 'BAPM200601hgrxzra4', '3', 'M', 'A', '1', 1),
(14, 29, 3, 'Mauricio', 'Banos', 'Piza', '0018-06-01', 'BAPM180601hgrxzra4', '5', 'M', 'A', '3', 9),
(15, 30, 3, 'Vanessa Lizbeth', 'Magadan', 'Morales', '2018-09-19', 'MAMV180919MGRXZR90', '5', 'F', 'A', '3', 9),
(16, 31, 1, 'Miguel Angel', 'Rangel', 'Hernandez', '2020-08-19', 'RAHM200819HGRXZRA4', '3', 'M', 'A', '1', 1),
(17, 32, 2, 'Ximena', 'Banos', 'Piza', '2019-01-25', 'BAPX190125MGRXDC34', '4', 'F', 'A', '2', 5);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `alumno_salon_view`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `alumno_salon_view` (
`nombre` varchar(5)
,`id_salon` int(11)
,`id_alumno` int(11)
,`apellido_paterno` varchar(20)
,`apellido_materno` varchar(20)
,`nombre_alumno` varchar(20)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora`
--

CREATE TABLE `bitacora` (
  `id_registro` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `hora` time NOT NULL,
  `fecha_salida` date DEFAULT NULL,
  `fecha_entrada` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `id_curso` int(11) NOT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_final` date DEFAULT NULL,
  `calificacion_final` int(11) DEFAULT NULL,
  `nivel_materias` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`id_curso`, `fecha_inicio`, `fecha_final`, `calificacion_final`, `nivel_materias`) VALUES
(1, '2023-03-19', '2023-06-03', NULL, '1'),
(2, '2023-03-19', '2023-06-03', NULL, '2'),
(3, '2023-03-19', '2023-06-03', NULL, '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `nombre_materia` varchar(60) DEFAULT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  `nivel` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombre_materia`, `observaciones`, `nivel`) VALUES
(1, 'Lenguaje y comunicación', '', '1'),
(2, 'Pensamiento matemático', '', '1'),
(3, 'Exploración y comprensión del mundo natural y social', '', '1'),
(4, 'Artes', '', '1'),
(5, 'Educación física', '', '1'),
(6, 'Inglés', '', '1'),
(7, 'Educación socioemocional', '', '1'),
(8, 'Informática', '', '1'),
(9, 'Lenguaje y comunicación', '', '2'),
(10, 'Pensamiento matemático', '', '2'),
(11, 'Exploración y comprensión del mundo natural y social', '', '2'),
(12, 'Artes', '', '2'),
(13, 'Educación física', '', '2'),
(14, 'Inglés', '', '2'),
(15, 'Educación socioemocional', '', '2'),
(16, 'Informática', '', '2'),
(17, 'Lenguaje y comunicación', '', '3'),
(18, 'Pensamiento matemático', '', '3'),
(19, 'Exploración y comprensión del mundo natural y social', '', '3'),
(20, 'Artes', '', '3'),
(21, 'Educación física', '', '3'),
(22, 'Inglés', '', '3'),
(23, 'Educación socioemocional', '', '3'),
(24, 'Informática', '', '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil_usuario`
--

CREATE TABLE `perfil_usuario` (
  `id_tipo_usuario` int(11) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `perfil_usuario`
--

INSERT INTO `perfil_usuario` (`id_tipo_usuario`, `descripcion`) VALUES
(0, 'Secretaria'),
(1, 'Director-administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salon`
--

CREATE TABLE `salon` (
  `id` int(11) NOT NULL,
  `nombre` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `salon`
--

INSERT INTO `salon` (`id`, `nombre`) VALUES
(1, '1-A'),
(2, '1-B'),
(3, '1-C'),
(4, '1-D'),
(5, '2-A'),
(6, '2-B'),
(7, '2-C'),
(8, '2-D'),
(9, '3-A'),
(10, '3-B'),
(11, '3-C'),
(12, '3-D');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tutor`
--

CREATE TABLE `tutor` (
  `id_tutor` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido_paterno` varchar(20) DEFAULT NULL,
  `apellido_materno` varchar(20) DEFAULT NULL,
  `correo_electronico` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tutor`
--

INSERT INTO `tutor` (`id_tutor`, `nombre`, `apellido_paterno`, `apellido_materno`, `correo_electronico`) VALUES
(19, 'A', 'okpokop', 'kopkp', 'okpokoomk'),
(20, 'A', 'okpokop', 'kopkp', 'okpokoomk'),
(21, 'UIHUIUH', 'IUHIUHIU', 'HUHIUHUI', 'UHIU'),
(22, 'UIHUIUH', 'IUHIUHIU', 'HUHIUHUI', 'UHIU'),
(23, 'ygugiuwiuchuih', 'ijoijoij', 'jijojojijio', 'ijjojojijoij'),
(24, 'ygugiuwiuchuih', 'ijoijoij', 'jijojojijio', 'ijjojojijoij'),
(25, 'Adolfo', 'ijoijoij', 'jijojojijio', 'ijjojojijoij'),
(26, 'Adolfo', 'ijoijoij', 'jijojojijio', 'ijjojojijoij'),
(27, 'Adolfo', 'Baños', 'Moran', 'firou30@hotmai.com'),
(28, 'Maria', 'Piza', 'Muñoz', 'xxxx'),
(29, 'Maria', 'Piza', 'Muñoz', 'xxxx'),
(30, 'Alicia', 'Magadan', 'Carrasco', 'amagadan@gmail.com'),
(31, 'Mariana', 'Echeverría', 'Hernández', 'example@example2.com'),
(32, 'Adolfo', 'Baños', 'Moran', 'firou30@lb.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `perfil` int(11) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido_paterno` varchar(30) DEFAULT NULL,
  `apellido_materno` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `perfil`, `nombre`, `apellido_paterno`, `apellido_materno`, `username`, `password`) VALUES
(1, 1, 'Angel Gabriel', 'Mena', 'Suastegui', 'amena_dir@lb.com', 'dir123'),
(14, 0, 'Carolina', 'Arzeta', 'Navarro', 'caro_arzeta@lb.com', '123456'),
(15, 0, 'Vanessa Lizbeth', 'Magadan', 'Morales', 'vmagadan_sec@lb.com', 'chocolate'),
(18, 0, 'Sofia', 'Herrera', 'Vizcaino', 'sherrera_sec@lb.com', 'prueba');

-- --------------------------------------------------------

--
-- Estructura para la vista `alumno_salon_view`
--
DROP TABLE IF EXISTS `alumno_salon_view`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `alumno_salon_view`  AS SELECT `s`.`nombre` AS `nombre`, `a`.`id_salon` AS `id_salon`, `a`.`id_alumno` AS `id_alumno`, `a`.`apellido_paterno` AS `apellido_paterno`, `a`.`apellido_materno` AS `apellido_materno`, `a`.`nombre_alumno` AS `nombre_alumno` FROM (`salon` `s` join `alumno` `a` on(`s`.`id` = `a`.`id_salon`)) ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`id_alumno`),
  ADD KEY `id_tutor` (`id_tutor`),
  ADD KEY `id_curso` (`id_curso`),
  ADD KEY `id_salon` (`id_salon`);

--
-- Indices de la tabla `bitacora`
--
ALTER TABLE `bitacora`
  ADD PRIMARY KEY (`id_registro`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id_curso`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`);

--
-- Indices de la tabla `perfil_usuario`
--
ALTER TABLE `perfil_usuario`
  ADD PRIMARY KEY (`id_tipo_usuario`);

--
-- Indices de la tabla `salon`
--
ALTER TABLE `salon`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tutor`
--
ALTER TABLE `tutor`
  ADD PRIMARY KEY (`id_tutor`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `perfil` (`perfil`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `id_alumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `bitacora`
--
ALTER TABLE `bitacora`
  MODIFY `id_registro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `id_curso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `salon`
--
ALTER TABLE `salon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `tutor`
--
ALTER TABLE `tutor`
  MODIFY `id_tutor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD CONSTRAINT `alumno_ibfk_1` FOREIGN KEY (`id_tutor`) REFERENCES `tutor` (`id_tutor`),
  ADD CONSTRAINT `alumno_ibfk_2` FOREIGN KEY (`id_curso`) REFERENCES `curso` (`id_curso`),
  ADD CONSTRAINT `alumno_ibfk_3` FOREIGN KEY (`id_salon`) REFERENCES `salon` (`id`);

--
-- Filtros para la tabla `bitacora`
--
ALTER TABLE `bitacora`
  ADD CONSTRAINT `bitacora_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`perfil`) REFERENCES `perfil_usuario` (`id_tipo_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
