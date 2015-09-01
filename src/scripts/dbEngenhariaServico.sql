-- MySQL Script generated by MySQL Workbench
-- 05/06/15 13:11:08
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering
drop database if exists dbEngenhariaServico;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbEngenhariaServico` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `dbEngenhariaServico` ;

-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`usuario` (
  `idUsuario` INT(11) NOT NULL AUTO_INCREMENT,
  `status` VARCHAR(15) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `CPF` VARCHAR(45) NOT NULL,
  `perfil` INT(11) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(240) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `codProduto` VARCHAR(25) NOT NULL,
  `produto` VARCHAR(45) NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProduto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Remetente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Remetente` (
  `idRemetente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `tipo` VARCHAR(2) NULL,
  `telefone` VARCHAR(15) NULL,
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRemetente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Tecnico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Tecnico` (
  `idTecnico` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTecnico`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`ManutencaoLaboratorio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`ManutencaoLaboratorio` (
  `idManutencaoLaboratorio` INT NOT NULL AUTO_INCREMENT,
  `numSerie` VARCHAR(5) NULL,
  `produto` VARCHAR(45) NOT NULL,
  `remetente` VARCHAR(15) NOT NULL,
  `defeitoRelatado` VARCHAR(15) NULL,
  `parecerTecnico` VARCHAR(15) NOT NULL,
  `data` VARCHAR(10) NOT NULL,
  `camadoOat` VARCHAR(5) NULL,
  `descricaoAtividades` VARCHAR(45) NOT NULL,
  `materialUtilizado` VARCHAR(45) NULL,
  `tempoReparo` VARCHAR(10) NOT NULL,
  `Remetente_idRemetente` INT NOT NULL,
  `Tecnico_idTecnico` INT NOT NULL,
  PRIMARY KEY (`idManutencaoLaboratorio`),
  INDEX `fk_ManutencaoLaboratorio_Remetente1_idx` (`Remetente_idRemetente` ASC),
  INDEX `fk_ManutencaoLaboratorio_Tecnico1_idx` (`Tecnico_idTecnico` ASC),
  CONSTRAINT `fk_ManutencaoLaboratorio_Remetente1`
    FOREIGN KEY (`Remetente_idRemetente`)
    REFERENCES `mydb`.`Remetente` (`idRemetente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ManutencaoLaboratorio_Tecnico1`
    FOREIGN KEY (`Tecnico_idTecnico`)
    REFERENCES `mydb`.`Tecnico` (`idTecnico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Componente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Componente` (
  `idComponente` INT NOT NULL AUTO_INCREMENT,
  `codComponente` VARCHAR(25) NOT NULL,
  `componente` VARCHAR(45) NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idComponente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Produto_has_ManutencaoLaboratorio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Produto_has_ManutencaoLaboratorio` (
  `Produto_idProduto` INT NOT NULL,
  `ManutencaoLaboratorio_idManutencaoLaboratorio` INT NOT NULL,
  `Componente_idComponente` INT NOT NULL,
  PRIMARY KEY (`Produto_idProduto`, `ManutencaoLaboratorio_idManutencaoLaboratorio`, `Componente_idComponente`),
  INDEX `fk_Produto_has_ManutencaoLaboratorio_ManutencaoLaboratorio1_idx` (`ManutencaoLaboratorio_idManutencaoLaboratorio` ASC),
  INDEX `fk_Produto_has_ManutencaoLaboratorio_Produto1_idx` (`Produto_idProduto` ASC),
  INDEX `fk_Produto_has_ManutencaoLaboratorio_Componente1_idx` (`Componente_idComponente` ASC),
  CONSTRAINT `fk_Produto_has_ManutencaoLaboratorio_Produto1`
    FOREIGN KEY (`Produto_idProduto`)
    REFERENCES `mydb`.`Produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_ManutencaoLaboratorio_ManutencaoLaboratorio1`
    FOREIGN KEY (`ManutencaoLaboratorio_idManutencaoLaboratorio`)
    REFERENCES `mydb`.`ManutencaoLaboratorio` (`idManutencaoLaboratorio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_ManutencaoLaboratorio_Componente1`
    FOREIGN KEY (`Componente_idComponente`)
    REFERENCES `mydb`.`Componente` (`idComponente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- INSERT no Banco --
-- USUARIO --
INSERT INTO `dbEngenhariaServico`.`usuario` (`idUsuario`, `status`, `nome`, `CPF`, `perfil`, `email`, `senha`) VALUES ('1', 'Ativo', 'Adm', '999999', '0', 'adm', '123');
INSERT INTO `dbEngenhariaServico`.`usuario` (`idUsuario`, `status`, `nome`, `CPF`, `perfil`, `email`, `senha`) VALUES ('2', 'Ativo', 'Usuario', '123654', '1', 'user', '123');



-- PRODUTO --
insert into produto values(1,'I07PLA046','Placa Transceptora RF2','Ativo');
insert into produto values(2,'I07PLA055','Placa Mtouch (flat)','Ativo');
insert into produto values(3,'I07PLA060','Placa Mtouch (usb)','Ativo');
insert into produto values(4,'I12IMP013','Impressora DAS 6 Botões','Ativo');
insert into produto values(5,'I12DSP011','Painel GAS OFF 5D','Ativo');
insert into produto values(6,'I12IMP013','Impressora DAS 6 Botões','Ativo');
-- TÉCNICO EM LABORATORIO --
insert into tecnico values(1,'Eduardo C. Vieira','eduardo.vieira@specto.com.br','Ativo');
insert into tecnico values(2,'Joel J. Lopes','joel.lopes@specto.com.br','Ativo');
-- COMPONENTE --
insert into componente values(1,'U03008','CI Max 232','Ativo');
insert into componente values(2,'I07BAT02','Bateria 3,6V','Ativo');
insert into componente values(3,'Z0099','SMD PIC','Ativo');
-- REMETENTE --
insert into remetente values(1,'Não Identificado','--------','  ','(00) 0000-0000','Ativo');
insert into remetente values(2,'Maintenance','suporte@maintenance.com.br','RT','(21) 2215-6354','Ativo');
insert into remetente values(3,'Ricardo Souto','ricardo@spectp.com.br','TR','(11) 1111-1111','Ativo');

