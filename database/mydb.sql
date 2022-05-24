-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2022 at 04:54 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `absence`
--

CREATE TABLE `absence` (
  `IDÉtudiant` int(11) NOT NULL,
  `IDSéance` int(11) NOT NULL,
  `Justificatif` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `accès`
--

CREATE TABLE `accès` (
  `IDAccès` int(11) NOT NULL,
  `NomAccès` varchar(45) NOT NULL,
  `TypeAccès` varchar(45) NOT NULL,
  `DuréeAccès` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `classe`
--

CREATE TABLE `classe` (
  `IDClasse` int(11) NOT NULL,
  `NomClasse` varchar(45) DEFAULT NULL,
  `NiveauClasse` varchar(45) DEFAULT NULL,
  `Num_Classe` varchar(45) DEFAULT NULL,
  `IDEmploi` int(11) DEFAULT NULL,
  `IDSpécialité` int(11) DEFAULT NULL,
  `IDDépartement` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `crédit`
--

CREATE TABLE `crédit` (
  `IDÉtudiant` int(11) NOT NULL,
  `IDGM` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `diplome`
--

CREATE TABLE `diplome` (
  `IDDiplome` int(11) NOT NULL,
  `NomDiplome` varchar(45) NOT NULL,
  `nbNiveaux` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `département`
--

CREATE TABLE `département` (
  `IDDépartement` int(11) NOT NULL,
  `NomDépartement` varchar(45) DEFAULT NULL,
  `IDChef` int(11) DEFAULT NULL,
  `IDDiplome` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emploi`
--

CREATE TABLE `emploi` (
  `IDEmploi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `enseignant`
--

CREATE TABLE `enseignant` (
  `IDEnseignant` int(11) NOT NULL,
  `Établissement` varchar(45) NOT NULL,
  `TypeE` varchar(45) NOT NULL,
  `IDEmploi` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `enseigne_matière`
--

CREATE TABLE `enseigne_matière` (
  `IDEnseignant` int(11) NOT NULL,
  `IDMatière` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `groupemodule`
--

CREATE TABLE `groupemodule` (
  `IDGM` int(11) NOT NULL,
  `NomGM` varchar(45) NOT NULL,
  `CoefficientGM` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `matière`
--

CREATE TABLE `matière` (
  `IDMatière` int(11) NOT NULL,
  `NomMatière` varchar(45) DEFAULT NULL,
  `Coefficient` int(11) DEFAULT NULL,
  `Semestre` varchar(45) DEFAULT NULL,
  `IDGM` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `module`
--

CREATE TABLE `module` (
  `IDModule` int(11) NOT NULL,
  `NomModule` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `note`
--

CREATE TABLE `note` (
  `IDMatière` int(11) NOT NULL,
  `IDÉtudiant` int(11) NOT NULL,
  `TypeNote` varchar(45) DEFAULT NULL,
  `Valeur` double DEFAULT NULL,
  `CoefficientNote` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `personne`
--

CREATE TABLE `personne` (
  `IDP` int(11) NOT NULL,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `CIN` int(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  `tel` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `personne`
--

INSERT INTO `personne` (`IDP`, `nom`, `prenom`, `CIN`, `email`, `tel`) VALUES
(1, 'Bessaad', 'Khalil', 14501241, 'bessaadkhalil@gmail.com', '28660755'),
(14, 'Bessaad', 'Khalil', 78945612, 'khalil@bessaad.com', '28660755'),
(15, 'Lazghab', 'Rayen', 85274103, 'rayen@lazghab.com', '98653210'),
(16, 'Sediri', 'Ahmed', 95175300, 'a.sediri19156@pi.tn', '58621473'),
(17, 'Khatteli', 'Wassim', 74859632, 'w.khatteli19028@pi.tn', '25369874'),
(20, 'Mehrez', 'Ichrak', 14965278, 'i.mehrez@pi.tn', '25252525'),
(22, 'Bessaad', 'Khalil', 14501242, 'k.bessaad19019@pi.tn', '28660755'),
(23, 'Ben Mahmoud', 'Ali', 14360798, 'ali@pi.tn', '98754210');

-- --------------------------------------------------------

--
-- Table structure for table `personnel`
--

CREATE TABLE `personnel` (
  `IDPersonnel` int(11) NOT NULL,
  `CNSS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `peut_enseigner`
--

CREATE TABLE `peut_enseigner` (
  `IDEnseignant` int(11) NOT NULL,
  `IDModule` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `spécialité`
--

CREATE TABLE `spécialité` (
  `IDSpécialité` int(11) NOT NULL,
  `NomSpécialité` varchar(45) DEFAULT NULL,
  `IDDiplome` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `séance`
--

CREATE TABLE `séance` (
  `IDSéance` int(11) NOT NULL,
  `Date` date DEFAULT NULL,
  `Heure` time DEFAULT NULL,
  `Duréé` time DEFAULT NULL,
  `Salle` varchar(45) DEFAULT NULL,
  `TypeSéance` varchar(45) DEFAULT NULL,
  `IDEmploi` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `IDUtilisateur` int(11) NOT NULL,
  `mdp` varchar(500) NOT NULL,
  `role` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `utilisateur`
--

INSERT INTO `utilisateur` (`IDUtilisateur`, `mdp`, `role`) VALUES
(1, '$argon2id$v=19$m=12,t=20,p=2$$4K6ojZRRnY9nMpNvLdtfyDuiBCpIlnnb+iZoYB7M2x8', 'Administrateur'),
(20, '$argon2id$v=19$m=12,t=20,p=2$$BPloFYG0nP/wHPYKweSfH3Wtdt/kvBWjgLu7M5Q6Sng', 'Chef Département'),
(22, '$argon2id$v=19$m=12,t=20,p=2$$yd3nUFuqCT0ArMmxrGLd9HY05iwiixbx8+o2p3IM8nc', 'Chef Département');

-- --------------------------------------------------------

--
-- Table structure for table `utilisateur_a_accès`
--

CREATE TABLE `utilisateur_a_accès` (
  `Accès_IDAccès` int(11) NOT NULL,
  `Utilisateur_IDUtilisateur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_agentsscolarité`
-- (See below for the actual view)
--
CREATE TABLE `v_agentsscolarité` (
`IDP` int(11)
,`nom` varchar(45)
,`prenom` varchar(45)
,`CIN` int(11)
,`email` varchar(45)
,`tel` varchar(11)
,`IDPersonnel` int(11)
,`CNSS` int(11)
,`IDUtilisateur` int(11)
,`mdp` varchar(500)
,`role` varchar(45)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_chefsdépartements`
-- (See below for the actual view)
--
CREATE TABLE `v_chefsdépartements` (
`IDP` int(11)
,`nom` varchar(45)
,`prenom` varchar(45)
,`CIN` int(11)
,`email` varchar(45)
,`tel` varchar(11)
,`IDUtilisateur` int(11)
,`mdp` varchar(500)
,`role` varchar(45)
,`IDPersonnel` int(11)
,`CNSS` int(11)
,`IDEnseignant` int(11)
,`Établissement` varchar(45)
,`TypeE` varchar(45)
,`IDEmploi` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_utilisateurs`
-- (See below for the actual view)
--
CREATE TABLE `v_utilisateurs` (
`ID` int(11)
,`nom` varchar(45)
,`prenom` varchar(45)
,`email` varchar(45)
,`mdp` varchar(500)
,`role` varchar(45)
);

-- --------------------------------------------------------

--
-- Table structure for table `étudiant`
--

CREATE TABLE `étudiant` (
  `IDÉtudiant` int(11) NOT NULL,
  `numInsc` int(11) NOT NULL,
  `IDClasse` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `étudiant`
--

INSERT INTO `étudiant` (`IDÉtudiant`, `numInsc`, `IDClasse`) VALUES
(14, 19019, NULL),
(15, 211167, NULL),
(16, 19156, NULL),
(17, 19028, NULL),
(23, 19236, NULL);

-- --------------------------------------------------------

--
-- Structure for view `v_agentsscolarité`
--
DROP TABLE IF EXISTS `v_agentsscolarité`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_agentsscolarité`  AS SELECT `personne`.`IDP` AS `IDP`, `personne`.`nom` AS `nom`, `personne`.`prenom` AS `prenom`, `personne`.`CIN` AS `CIN`, `personne`.`email` AS `email`, `personne`.`tel` AS `tel`, `personnel`.`IDPersonnel` AS `IDPersonnel`, `personnel`.`CNSS` AS `CNSS`, `utilisateur`.`IDUtilisateur` AS `IDUtilisateur`, `utilisateur`.`mdp` AS `mdp`, `utilisateur`.`role` AS `role` FROM ((`personne` join `personnel`) join `utilisateur`) WHERE `personne`.`IDP` = `personnel`.`IDPersonnel` AND `personne`.`IDP` = `utilisateur`.`IDUtilisateur` AND `utilisateur`.`role` = 'Scolarité' ;

-- --------------------------------------------------------

--
-- Structure for view `v_chefsdépartements`
--
DROP TABLE IF EXISTS `v_chefsdépartements`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_chefsdépartements`  AS SELECT `personne`.`IDP` AS `IDP`, `personne`.`nom` AS `nom`, `personne`.`prenom` AS `prenom`, `personne`.`CIN` AS `CIN`, `personne`.`email` AS `email`, `personne`.`tel` AS `tel`, `utilisateur`.`IDUtilisateur` AS `IDUtilisateur`, `utilisateur`.`mdp` AS `mdp`, `utilisateur`.`role` AS `role`, `personnel`.`IDPersonnel` AS `IDPersonnel`, `personnel`.`CNSS` AS `CNSS`, `enseignant`.`IDEnseignant` AS `IDEnseignant`, `enseignant`.`Établissement` AS `Établissement`, `enseignant`.`TypeE` AS `TypeE`, `enseignant`.`IDEmploi` AS `IDEmploi` FROM (((`personne` join `utilisateur`) join `personnel`) join `enseignant`) WHERE `personne`.`IDP` = `utilisateur`.`IDUtilisateur` AND `personne`.`IDP` = `enseignant`.`IDEnseignant` AND `personne`.`IDP` = `personnel`.`IDPersonnel` AND `utilisateur`.`role` = 'Chef Département' ;

-- --------------------------------------------------------

--
-- Structure for view `v_utilisateurs`
--
DROP TABLE IF EXISTS `v_utilisateurs`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_utilisateurs`  AS SELECT `personne`.`IDP` AS `ID`, `personne`.`nom` AS `nom`, `personne`.`prenom` AS `prenom`, `personne`.`email` AS `email`, `utilisateur`.`mdp` AS `mdp`, `utilisateur`.`role` AS `role` FROM (`personne` join `utilisateur`) WHERE `personne`.`IDP` = `utilisateur`.`IDUtilisateur` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `absence`
--
ALTER TABLE `absence`
  ADD PRIMARY KEY (`IDÉtudiant`,`IDSéance`),
  ADD KEY `IDSéance_idx` (`IDSéance`);

--
-- Indexes for table `accès`
--
ALTER TABLE `accès`
  ADD PRIMARY KEY (`IDAccès`),
  ADD UNIQUE KEY `NomAccès_UNIQUE` (`NomAccès`);

--
-- Indexes for table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`IDClasse`),
  ADD UNIQUE KEY `IDClasse_UNIQUE` (`IDClasse`),
  ADD UNIQUE KEY `IDemploi_UNIQUE` (`IDEmploi`),
  ADD UNIQUE KEY `IDspécialité_UNIQUE` (`IDSpécialité`),
  ADD UNIQUE KEY `IDdept_UNIQUE` (`IDDépartement`);

--
-- Indexes for table `crédit`
--
ALTER TABLE `crédit`
  ADD PRIMARY KEY (`IDÉtudiant`,`IDGM`),
  ADD KEY `IDGM_idx` (`IDGM`);

--
-- Indexes for table `diplome`
--
ALTER TABLE `diplome`
  ADD PRIMARY KEY (`IDDiplome`),
  ADD UNIQUE KEY `NomDiplome_UNIQUE` (`NomDiplome`),
  ADD UNIQUE KEY `IDDiplome_UNIQUE` (`IDDiplome`);

--
-- Indexes for table `département`
--
ALTER TABLE `département`
  ADD PRIMARY KEY (`IDDépartement`),
  ADD UNIQUE KEY `Départementcol_UNIQUE` (`IDChef`),
  ADD UNIQUE KEY `IDDiplome_UNIQUE` (`IDDiplome`);

--
-- Indexes for table `emploi`
--
ALTER TABLE `emploi`
  ADD PRIMARY KEY (`IDEmploi`),
  ADD UNIQUE KEY `IDEmploi_UNIQUE` (`IDEmploi`);

--
-- Indexes for table `enseignant`
--
ALTER TABLE `enseignant`
  ADD PRIMARY KEY (`IDEnseignant`),
  ADD KEY `IDEmploi_idx` (`IDEmploi`);

--
-- Indexes for table `enseigne_matière`
--
ALTER TABLE `enseigne_matière`
  ADD PRIMARY KEY (`IDEnseignant`,`IDMatière`),
  ADD KEY `IDMatière_idx` (`IDMatière`);

--
-- Indexes for table `groupemodule`
--
ALTER TABLE `groupemodule`
  ADD PRIMARY KEY (`IDGM`),
  ADD UNIQUE KEY `IDGM_UNIQUE` (`IDGM`),
  ADD UNIQUE KEY `NomGM_UNIQUE` (`NomGM`);

--
-- Indexes for table `matière`
--
ALTER TABLE `matière`
  ADD PRIMARY KEY (`IDMatière`),
  ADD UNIQUE KEY `IDMatière_UNIQUE` (`IDMatière`),
  ADD KEY `IDGM_idx` (`IDGM`);

--
-- Indexes for table `module`
--
ALTER TABLE `module`
  ADD PRIMARY KEY (`IDModule`),
  ADD UNIQUE KEY `IDModule_UNIQUE` (`IDModule`),
  ADD UNIQUE KEY `NomModule_UNIQUE` (`NomModule`);

--
-- Indexes for table `note`
--
ALTER TABLE `note`
  ADD PRIMARY KEY (`IDMatière`,`IDÉtudiant`),
  ADD KEY `IDÉtudiant_idx` (`IDÉtudiant`);

--
-- Indexes for table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`IDP`),
  ADD UNIQUE KEY `CIN_UNIQUE` (`CIN`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`),
  ADD UNIQUE KEY `IDP_UNIQUE` (`IDP`);

--
-- Indexes for table `personnel`
--
ALTER TABLE `personnel`
  ADD PRIMARY KEY (`IDPersonnel`),
  ADD UNIQUE KEY `CNSS_UNIQUE` (`CNSS`);

--
-- Indexes for table `peut_enseigner`
--
ALTER TABLE `peut_enseigner`
  ADD PRIMARY KEY (`IDEnseignant`,`IDModule`),
  ADD KEY `IDModule_idx` (`IDModule`);

--
-- Indexes for table `spécialité`
--
ALTER TABLE `spécialité`
  ADD PRIMARY KEY (`IDSpécialité`),
  ADD UNIQUE KEY `NomSpécialité_UNIQUE` (`NomSpécialité`),
  ADD KEY `IDDiplome_idx` (`IDDiplome`);

--
-- Indexes for table `séance`
--
ALTER TABLE `séance`
  ADD PRIMARY KEY (`IDSéance`),
  ADD UNIQUE KEY `IDSéance_UNIQUE` (`IDSéance`),
  ADD KEY `IDEmploi_idx` (`IDEmploi`);

--
-- Indexes for table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`IDUtilisateur`),
  ADD UNIQUE KEY `IDUtilisateur_UNIQUE` (`IDUtilisateur`),
  ADD KEY `IDUtilisateur_idx` (`IDUtilisateur`);

--
-- Indexes for table `utilisateur_a_accès`
--
ALTER TABLE `utilisateur_a_accès`
  ADD PRIMARY KEY (`Accès_IDAccès`,`Utilisateur_IDUtilisateur`),
  ADD KEY `fk_Accès_has_Utilisateur_Utilisateur1_idx` (`Utilisateur_IDUtilisateur`),
  ADD KEY `fk_Accès_has_Utilisateur_Accès1_idx` (`Accès_IDAccès`);

--
-- Indexes for table `étudiant`
--
ALTER TABLE `étudiant`
  ADD PRIMARY KEY (`IDÉtudiant`),
  ADD UNIQUE KEY `numInsc_UNIQUE` (`numInsc`),
  ADD KEY `idÉtudiant_idx` (`IDÉtudiant`),
  ADD KEY `IDClasse_idx` (`IDClasse`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `classe`
--
ALTER TABLE `classe`
  MODIFY `IDClasse` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `diplome`
--
ALTER TABLE `diplome`
  MODIFY `IDDiplome` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `département`
--
ALTER TABLE `département`
  MODIFY `IDDépartement` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `emploi`
--
ALTER TABLE `emploi`
  MODIFY `IDEmploi` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `groupemodule`
--
ALTER TABLE `groupemodule`
  MODIFY `IDGM` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `matière`
--
ALTER TABLE `matière`
  MODIFY `IDMatière` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `module`
--
ALTER TABLE `module`
  MODIFY `IDModule` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `personne`
--
ALTER TABLE `personne`
  MODIFY `IDP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `spécialité`
--
ALTER TABLE `spécialité`
  MODIFY `IDSpécialité` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `séance`
--
ALTER TABLE `séance`
  MODIFY `IDSéance` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `absence`
--
ALTER TABLE `absence`
  ADD CONSTRAINT `IDSéanceAbsence` FOREIGN KEY (`IDSéance`) REFERENCES `séance` (`IDSéance`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `IDÉtudiantAbsence` FOREIGN KEY (`IDÉtudiant`) REFERENCES `étudiant` (`IDÉtudiant`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `classe`
--
ALTER TABLE `classe`
  ADD CONSTRAINT `IDDépartementClasse` FOREIGN KEY (`IDDépartement`) REFERENCES `département` (`IDDépartement`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `IDEmploiClasse` FOREIGN KEY (`IDEmploi`) REFERENCES `emploi` (`IDEmploi`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `IDSpécialitéClasse` FOREIGN KEY (`IDSpécialité`) REFERENCES `spécialité` (`IDSpécialité`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `crédit`
--
ALTER TABLE `crédit`
  ADD CONSTRAINT `IDGMCrédit` FOREIGN KEY (`IDGM`) REFERENCES `groupemodule` (`IDGM`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `IDÉtudiantCrédit` FOREIGN KEY (`IDÉtudiant`) REFERENCES `étudiant` (`IDÉtudiant`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `département`
--
ALTER TABLE `département`
  ADD CONSTRAINT `IDChef` FOREIGN KEY (`IDChef`) REFERENCES `utilisateur` (`IDUtilisateur`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `IDDiplomeDépartement` FOREIGN KEY (`IDDiplome`) REFERENCES `diplome` (`IDDiplome`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `enseignant`
--
ALTER TABLE `enseignant`
  ADD CONSTRAINT `IDEmploiEnseignant` FOREIGN KEY (`IDEmploi`) REFERENCES `emploi` (`IDEmploi`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `IDEnseignant` FOREIGN KEY (`IDEnseignant`) REFERENCES `personnel` (`IDPersonnel`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `enseigne_matière`
--
ALTER TABLE `enseigne_matière`
  ADD CONSTRAINT `IDEnseignantEM` FOREIGN KEY (`IDEnseignant`) REFERENCES `enseignant` (`IDEnseignant`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `IDMatièreEM` FOREIGN KEY (`IDMatière`) REFERENCES `matière` (`IDMatière`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `matière`
--
ALTER TABLE `matière`
  ADD CONSTRAINT `IDGM` FOREIGN KEY (`IDGM`) REFERENCES `groupemodule` (`IDGM`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `note`
--
ALTER TABLE `note`
  ADD CONSTRAINT `IDMatièreNote` FOREIGN KEY (`IDMatière`) REFERENCES `matière` (`IDMatière`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `IDÉtudiantNote` FOREIGN KEY (`IDÉtudiant`) REFERENCES `étudiant` (`IDÉtudiant`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `personnel`
--
ALTER TABLE `personnel`
  ADD CONSTRAINT `idPersonnel` FOREIGN KEY (`IDPersonnel`) REFERENCES `personne` (`IDP`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `peut_enseigner`
--
ALTER TABLE `peut_enseigner`
  ADD CONSTRAINT `IDEnseignantPE` FOREIGN KEY (`IDEnseignant`) REFERENCES `enseignant` (`IDEnseignant`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `IDModulePE` FOREIGN KEY (`IDModule`) REFERENCES `module` (`IDModule`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `spécialité`
--
ALTER TABLE `spécialité`
  ADD CONSTRAINT `IDDiplomeSpécialité` FOREIGN KEY (`IDDiplome`) REFERENCES `diplome` (`IDDiplome`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `séance`
--
ALTER TABLE `séance`
  ADD CONSTRAINT `IDEmploiSéance` FOREIGN KEY (`IDEmploi`) REFERENCES `emploi` (`IDEmploi`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD CONSTRAINT `IDUtilisateur` FOREIGN KEY (`IDUtilisateur`) REFERENCES `personne` (`IDP`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `utilisateur_a_accès`
--
ALTER TABLE `utilisateur_a_accès`
  ADD CONSTRAINT `fk_Accès_has_Utilisateur_Accès1` FOREIGN KEY (`Accès_IDAccès`) REFERENCES `accès` (`IDAccès`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Accès_has_Utilisateur_Utilisateur1` FOREIGN KEY (`Utilisateur_IDUtilisateur`) REFERENCES `utilisateur` (`IDUtilisateur`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `étudiant`
--
ALTER TABLE `étudiant`
  ADD CONSTRAINT `IDClasseÉtudiant` FOREIGN KEY (`IDClasse`) REFERENCES `classe` (`IDClasse`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `IDÉtudiant` FOREIGN KEY (`IDÉtudiant`) REFERENCES `personne` (`IDP`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
