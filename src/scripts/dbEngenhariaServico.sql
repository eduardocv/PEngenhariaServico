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
  `status` VARCHAR(10) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `perfil` INT(11) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
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
  `status` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idProduto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Remetente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Remetente` (
  `idRemetente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `tipo` VARCHAR(10) NULL,
  `email` VARCHAR(45) NULL,  
  `telefone` VARCHAR(15) NULL,
  `status` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idRemetente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Tecnico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Tecnico` (
  `idTecnico` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NULL,
  `status` VARCHAR(10) NOT NULL,
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
  `defeitoApresentado` VARCHAR(15) NOT NULL,
  `data` VARCHAR(10) NOT NULL,
  `chamadoOat` VARCHAR(5) NULL,
  `descricaoAtividades` VARCHAR(45) NOT NULL,
  `componenteUtilizado` VARCHAR(45) NULL,
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
  `status` VARCHAR(10) NOT NULL,
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

-- ---------------------------- INSERT no Banco ---------------------------------------------------
-- USUARIO --
INSERT INTO `dbEngenhariaServico`.`usuario` (`idUsuario`, `status`, `nome`, `CPF`, `perfil`, `email`, `senha`) VALUES ('1', 'Ativo', 'Administrador', '80295312068', '0', 'admin', 'admin');
INSERT INTO `dbEngenhariaServico`.`usuario` (`idUsuario`, `status`, `nome`, `CPF`, `perfil`, `email`, `senha`) VALUES ('2', 'Ativo', 'Usuario', '12345678900', '1', 'user', 'user');

-- PRODUTO --
insert into produto values(1,'I07PLA046','Placa Transceptora RF2','Ativo');
insert into produto values(2,'I07PLA055','Placa Mtouch (flat)','Ativo');
insert into produto values(3,'I07PLA060','Placa Mtouch (usb)','Ativo');
insert into produto values(4,'I12IMP013','Impressora DAS 6 Botões','Ativo');
insert into produto values(5,'I12DSP011','Painel GAS OFF 5D','Ativo');
insert into produto values(6,'I12IMP013','Impressora DAS 6 Botões','Ativo');
insert into produto values(7,'ImpMecafAd','Impressora Mecaf','Ativo');
insert into produto values(8,'I07PLA254','Placa PIC 4.1.2','Ativo');
insert into produto values(9,'P00071','Placa CPU 3.0.2','Ativo');
insert into produto values(10,'I12IMP009','Impressora DAS 3 Botões','Ativo');
insert into produto values(11,'I12DSP023','Painel Contact Light 5D','Ativo');
insert into produto values(12,'I12IMP000','Impressora DAS Triagem','Ativo');

-- TÉCNICO EM LABORATORIO --
insert into tecnico values(1,'José da Silva','josesilva@email.com.br','Ativo');
insert into tecnico values(2,'Maria José','mariajose@email.com.br','Ativo');
insert into tecnico values(3,'João Correa','jcorrea@email.com.br','Ativo');
insert into tecnico values(4,'Carlos Santos','csantos@email.com.br','Ativo');
insert into tecnico values(5,'Fernando Costa','fcosta@email.com.br','Ativo');
insert into tecnico values(6,'Ana Silveira','anasilveira@email.com.br','Ativo');
-- COMPONENTE --
insert into componente values(1,'BAT001','BATERIA NICD 3,6 V / 60 M A H  2T','Ativo');
insert into componente values(2,'Z10200','CONECTOR MINI MODUL 1X10 180G','Ativo');
insert into componente values(3,'U03203','CI 14C232 ADM / HARRIS','Ativo');
insert into componente values(4,'U03202','CI 75176 - DRIVER','Ativo');
insert into componente values(5,'U03001','CI 62256 - RAM','Ativo');
insert into componente values(6,'U03004','CI DS1307P - RTC','Ativo');
insert into componente values(7,'U00005','CI CD4046','Ativo');
insert into componente values(8,'F00000','CRISTAL OSC. 32,768 KHZ - 2 TERMINAIS','Ativo');
insert into componente values(9,'D00003','DIODO ZENER 3V3/1W - 1N4728','Ativo');
insert into componente values(10,'R00038','RESISTOR CR25 5K6','Ativo');
insert into componente values(11,'K00008','CAPACITOR CERAMICO 100NF/50V','Ativo');
insert into componente values(12,'I07ACR012','ACRILICO P/ PAINEL CONTACT - V1.0.0','Ativo');
insert into componente values(13,'Z10021','CONECTOR RJ11 6P 6C 6 x 6 MACHO','Ativo');
insert into componente values(14,'Z10020','CONECTOR RJ11 6P 6C 6 x 6 FEMEA 90G','Ativo');
insert into componente values(15,'Z10018','CONECTOR P4 FEMEA 90G P/ PCI-PINO INT. 2,1 MM-DJK2','Ativo');
insert into componente values(16,'I07SUP055','ESTRUTURA METALICA PAINEL CONTACT - V2.2.0','Ativo');
insert into componente values(17,'I07MOD010','MODULO RC1140-RC232','Ativo');
insert into componente values(18,'I07LCD003','DISPLAY LCD OPINE','Ativo');
insert into componente values(19,'PON00006','CABO USB A MACHO X USB B MACHO 1,80M','Ativo');
insert into componente values(20,'Z00405','CABO IMPRESSORA DASS1 <> CPU ( SPEC03 )','Ativo');
insert into componente values(21,'I07POL010','POLICARBONATO P/ TES CONTACT 5 BOTOES','Ativo');
insert into componente values(22,'U03362','CI DS1511W-RELOGIO DE TEMPO REAL c/Y2K-MOD28-PTH','Ativo');
insert into componente values(23,'P00012','PLACA DISPLAY 3 DIGITOS','Ativo');
insert into componente values(24,'I07CAP048','Capac. Elet, Radial Unilat 2200uF/ 16vF00020','Ativo');
insert into componente values(25,'I07ABR003','Abraçadeira 20 cm (k22)','Ativo');
insert into componente values(26,'Z00674','Abraçadeira preta 10 cm(k8)','Ativo');
insert into componente values(27,'U00404','CI MICROCONTROLADOR P80C32-16 TEMIC','Ativo');
insert into componente values(28,'I12KIT001','KIT BASE MT212 GUILHOTINA ( REPARO TES DAS)','Ativo');
insert into componente values(29,'K00042','Capacitor eletrolítico 1000uF/25v','Ativo');
insert into componente values(30,'U00305','SMD Max232','Ativo');
insert into componente values(31,'I07ANT002','ANTENA AÇO 1/8 REBAIXO E ROSCA M3 C/ PONTEIRA-COR PRETA','Ativo');
insert into componente values(32,'I07PLA271','PLACA BGO V2.0.1','Ativo');
insert into componente values(33,'U03105','CI 27C512 12NS OU 15NS - EPROM','Ativo');
insert into componente values(34,'I07PLA203','PLACA DECODER 14P V2.0.1','Ativo');
insert into componente values(35,'I07ACR025','ACRILICO FRONTAL TES TOUCH – V1.1.0','Ativo');
insert into componente values(36,'I07CAL005','CALCOS DE PAPELAO P/ TES TOUCH - V1.0.0','Ativo');
insert into componente values(37,'I07CAX109','CAIXA DE PAPELAO P/ TES TOUCH – V1.1.0','Ativo');
insert into componente values(38,'I07COJ058','ESTRUTURA METALICA TES TOUCH INOX – V6.0.0','Ativo');
insert into componente values(39,'I07COJ059','CONJUNTO DE ISOPORES P/ TES TOUCH – V1.1.0','Ativo');

-- REMETENTE --
insert into remetente values(1,'Não Identificado','--','  ','(00)0000-0000','Ativo');
insert into remetente values(2,'Maintenance','RT','suporte@maintenance.com.br','(21)2215-6354','Ativo');
insert into remetente values(3,'Ricardo Souto','TR','ricardo@spectp.com.br','(11)1111-1111','Ativo');

-- select * from dbEngenhariaServico.usuario;
-- select * from dbEngenhariaServico.tecnico;
-- select * from dbEngenhariaServico.componente;
-- select * from dbEngenhariaServico.produto;
-- select * from dbEngenhariaServico.remetente;

-- -------------------------------------------------------------------------------------------------
