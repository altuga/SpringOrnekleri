CREATE DATABASE `Garage` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci */;
CREATE TABLE `garage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accessory` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `licencePlate` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `garageID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_car_garageID` (`garageID`),
  CONSTRAINT `FK_car_garageID` FOREIGN KEY (`garageID`) REFERENCES `garage` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
