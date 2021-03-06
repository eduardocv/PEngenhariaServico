-- MySQL Script generated by MySQL Workbench
-- 05/10/15 13:11:08
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering
drop database if exists dbEngenhariaServico;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

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
  `nome` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `perfil` INT(11) NOT NULL,
  `status` BOOLEAN NOT NULL,
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
  `produto` VARCHAR(100) NOT NULL,
  `status` BOOLEAN NOT NULL,
  PRIMARY KEY (`idProduto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Remetente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Remetente` (
  `idRemetente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `tipo` VARCHAR(10) NULL,
  `email` VARCHAR(45) NULL,  
  `telefone` VARCHAR(15) NULL,
  `status` BOOLEAN NOT NULL,
  `outrasInfo` VARCHAR(500) NULL,
  PRIMARY KEY (`idRemetente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`ManutencaoLaboratorio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`ManutencaoLaboratorio` (
  `idManut` INT NOT NULL AUTO_INCREMENT,
  `remetente` VARCHAR(100) NOT NULL,
  `produto` VARCHAR(100) NOT NULL,
  `defRelatado` VARCHAR(100) NULL,
  `defApresentado` VARCHAR(100) NULL,
  `data` VARCHAR(10) NULL,
  `numSerie` VARCHAR(10) NULL,
  `chamadoOat` VARCHAR(10) NULL,
  `corrigidoEmCampo` BOOLEAN NULL,
  `descAtividades` VARCHAR(500) NOT NULL,
  `componentes` VARCHAR(500) NULL,
  `tempoReparo` VARCHAR(10) NULL,
  `tecnico`VARCHAR(100) NULL,
    PRIMARY KEY (`idManut`))
 ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Componente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Componente` (
  `idComponente` INT NOT NULL AUTO_INCREMENT,
  `codComponente` VARCHAR(25) NOT NULL,
  `componente` VARCHAR(55) NOT NULL,
  `status` BOOLEAN NOT NULL,
  PRIMARY KEY (`idComponente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbEngenhariaServico`.`Produto_has_ManutencaoLaboratorio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbEngenhariaServico`.`Produto_has_ManutencaoLaboratorio` (
  `Produto_idProduto` INT NOT NULL,
  `ManutencaoLaboratorio_idManut` INT NOT NULL,
  `Componente_idComponente` INT NOT NULL,
  PRIMARY KEY (`Produto_idProduto`, `ManutencaoLaboratorio_idManut`, `Componente_idComponente`),
  INDEX `fk_Produto_has_ManutencaoLaboratorio_ManutencaoLaboratorio1_idx` (`ManutencaoLaboratorio_idManut` ASC),
  INDEX `fk_Produto_has_ManutencaoLaboratorio_Produto1_idx` (`Produto_idProduto` ASC),
  INDEX `fk_Produto_has_ManutencaoLaboratorio_Componente1_idx` (`Componente_idComponente` ASC),
  CONSTRAINT `fk_Produto_has_ManutencaoLaboratorio_Produto1`
    FOREIGN KEY (`Produto_idProduto`)
    REFERENCES `mydb`.`Produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_ManutencaoLaboratorio_ManutencaoLaboratorio1`
    FOREIGN KEY (`ManutencaoLaboratorio_idManut`)
    REFERENCES `mydb`.`ManutencaoLaboratorio` (`idManut`)
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


-- ---------------------------- INSERT no Banco ---------------------------------------------------------------------------------------------------------------------------------------
-- USUARIO --
INSERT INTO `dbEngenhariaServico`.`usuario` (`idUsuario`, `nome`, `CPF`, `perfil`, `status`, `email`, `senha`) VALUES ('1', 'Administrador', '80295312068', '0', true, 'admin', 'admin');
INSERT INTO `dbEngenhariaServico`.`usuario` (`idUsuario`, `nome`, `CPF`, `perfil`, `status`, `email`, `senha`) VALUES ('2', 'Usuario', '12345678900', '1', true, 'user', 'user');
INSERT INTO `dbEngenhariaServico`.`usuario` (`idUsuario`, `nome`, `CPF`, `perfil`, `status`, `email`, `senha`) VALUES ('3', 'Eduardo C.V.', '80295312068', '0', true, 'ed', '1');

-- PRODUTO -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into produto values(1,'I07PLA046','Placa Transceptora RF2',true);
insert into produto values(2,'I07PLA055','Placa Mtouch (flat)',true);
insert into produto values(3,'I07PLA060','Placa Mtouch (usb)',true);
insert into produto values(4,'I12IMP013','Impressora DAS 6 Botões',true);
insert into produto values(5,'I12DSP011','Painel GAS OFF 5D',true);
insert into produto values(6,'I12IMP013','Impressora DAS 6 Botões',true);
insert into produto values(7,'ImpMecafAd','Impressora Mecaf',true);
insert into produto values(8,'I07PLA254','Placa PIC 4.1.2',true);
insert into produto values(9,'P00071','Placa CPU 3.0.2',true);
insert into produto values(10,'I12IMP009','Impressora DAS 3 Botões',true);
insert into produto values(11,'I12DSP023','Painel Contact Light 5D',true);
insert into produto values(12,'I12IMP000','Impressora DAS Triagem',true);

-- COMPONENTE ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into componente values(1,'BAT001','BATERIA NICD 3,6 V / 60 M A H  2T',true);
insert into componente values(2,'Z10200','CONECTOR MINI MODUL 1X10 180G',true);
insert into componente values(3,'U03203','CI 14C232 ADM / HARRIS',true);
insert into componente values(4,'U03202','CI 75176 - DRIVER',true);
insert into componente values(5,'U03001','CI 62256 - RAM',true);
insert into componente values(6,'U03004','CI DS1307P - RTC',true);
insert into componente values(7,'U00005','CI CD4046',true);
insert into componente values(8,'F00000','CRISTAL OSC. 32,768 KHZ - 2 TERMINAIS',true);
insert into componente values(9,'D00003','DIODO ZENER 3V3/1W - 1N4728',true);
insert into componente values(10,'R00038','RESISTOR CR25 5K6',true);
insert into componente values(11,'K00008','CAPACITOR CERAMICO 100NF/50V',true);
insert into componente values(12,'I07ACR012','ACRILICO P/ PAINEL CONTACT - V1.0.0',true);
insert into componente values(13,'Z10021','CONECTOR RJ11 6P 6C 6 x 6 MACHO',true);
insert into componente values(14,'Z10020','CONECTOR RJ11 6P 6C 6 x 6 FEMEA 90G',true);
insert into componente values(15,'Z10018','CONECTOR P4 FEMEA 90G P/ PCI-PINO INT. 2,1 MM-DJK2',true);
insert into componente values(16,'I07SUP055','ESTRUTURA METALICA PAINEL CONTACT - V2.2.0',true);
insert into componente values(17,'I07MOD010','MODULO RC1140-RC232',true);
insert into componente values(18,'I07LCD003','DISPLAY LCD OPINE',true);
insert into componente values(19,'PON00006','CABO USB A MACHO X USB B MACHO 1,80M',true);
insert into componente values(20,'Z00405','CABO IMPRESSORA DASS1 <> CPU ( SPEC03 )',true);
insert into componente values(21,'I07POL010','POLICARBONATO P/ TES CONTACT 5 BOTOES',true);
insert into componente values(22,'U03362','CI DS1511W-RELOGIO DE TEMPO REAL c/Y2K-MOD28-PTH',true);
insert into componente values(23,'P00012','PLACA DISPLAY 3 DIGITOS',true);
insert into componente values(24,'I07CAP048','Capac. Elet, Radial Unilat 2200uF/ 16vF00020',true);
insert into componente values(25,'I07ABR003','Abraçadeira 20 cm (k22)',true);
insert into componente values(26,'Z00674','Abraçadeira preta 10 cm(k8)',true);
insert into componente values(27,'U00404','CI MICROCONTROLADOR P80C32-16 TEMIC',true);
insert into componente values(28,'I12KIT001','KIT BASE MT212 GUILHOTINA ( REPARO TES DAS)',true);
insert into componente values(29,'K00042','Capacitor eletrolítico 1000uF/25v',true);
insert into componente values(30,'U00305','SMD Max232',true);
insert into componente values(31,'I07ANT002','ANTENA AÇO 1/8 REBAIXO E ROSCA M3 C/ PONTEIRA-COR PRETA',true);
insert into componente values(32,'I07PLA271','PLACA BGO V2.0.1',true);
insert into componente values(33,'U03105','CI 27C512 12NS OU 15NS - EPROM',true);
insert into componente values(34,'I07PLA203','PLACA DECODER 14P V2.0.1',true);
insert into componente values(35,'I07ACR025','ACRILICO FRONTAL TES TOUCH – V1.1.0',true);
insert into componente values(36,'I07CAL005','CALCOS DE PAPELAO P/ TES TOUCH - V1.0.0',true);
insert into componente values(37,'I07CAX109','CAIXA DE PAPELAO P/ TES TOUCH – V1.1.0',true);
insert into componente values(38,'I07COJ058','ESTRUTURA METALICA TES TOUCH INOX – V6.0.0',true);
insert into componente values(39,'I07COJ059','CONJUNTO DE ISOPORES P/ TES TOUCH – V1.1.0',true);

-- REMETENTE ---------------------------------------------------------------------------------------------------------------------------------------------------------
insert into remetente values(1,'INFORSERVICE - RIO BRANCO','RT','coordenacao-ac@assistecnica.com.br','(68)3224-0100',false,'');
insert into remetente values(2,'FABIO ROGERIO MOURA MAIA','RT','fabiomaiaeng@gmail.com','(92)8228-5628',false,'');
insert into remetente values(3,'TECNOPOINT','RT','fabio@portaltecnopoint.com.br','(85)3046-1100',false,'');
insert into remetente values(4,'FÊNIX SERVIÇOS E COMÉRCIO','RT','anderson@latecnologia.com.br','(27)3033-8486',true,'');
insert into remetente values(5,'MAQPECAS INFORMÁTICA','RT','maqinfo@terra.com.br','(62)3225-9877',true,'');
insert into remetente values(6,'TELEBRAE TELECOM','RT','telebrae@telebrae.com.br','(98)3231-3821',true,'');
insert into remetente values(7,'CONECTAR','RT','suporte@conectar.inf.br','(31)3821-0966',false,'');
insert into remetente values(8,'F4TI','RT','suporte.f4ti@f4ti.com.br','(38)3083-1744',false,'');
insert into remetente values(9,'BELAITECH AUTOMAÇÃO','RT','assistencia@belaitech.com.br','(67)3383-1270',true,'');
insert into remetente values(10,'TELETRON TELECOM','RT','vendas@teletron.com.br','(65)3623-2679',true,'');
insert into remetente values(11,'COMPUSERVIS INFORMÁTICA','RT','adelton@compuservis.com.br','(86)3223-0619',true,'');
insert into remetente values(12,'DICOREL','RT','dicorel@onda.com.br','(41)3022-7686',false,'');
insert into remetente values(13,'HARDTEC','RT','hardtec@onda.com.br','(41)3027-6603',true,'');
insert into remetente values(14,'AUTOMATEQ','RT','cleber@automateq.com.br','(43)3356-3133',true,'');
insert into remetente values(15,'RB SYSTEM','RT','suporte@rbsystem.com.br','(45)3035-5622',true,'');
insert into remetente values(16,'MAINTENANCE','RT','suporte@maintenance.com.br','(21)2215-6354',true,'');
insert into remetente values(17,'HENDRIK RAMMI','RT','hendrikrammi@gmail.com','(21)3576-0127',true,'');
insert into remetente values(18,'EXPRESSOINFO','RT','contato@expressoinfo.com.br','(24)3337-5312',true,'');
insert into remetente values(19,'NOVA ASSISTÊNCIA','RT','mariano@assistecnica.com.br','(69)3229-3620',true,'');
insert into remetente values(20,'N&B AUTOMAÇÃO','RT','adm@nbautomacao.com.br','(49)3322-1243',true,'');
insert into remetente values(21,'INOVEE INFORMATICA','RT','renan@inovee.com.br','(47)3804-3132',true,'');
insert into remetente values(22,'TOP INFORMÁTICA','RT','alisson@top.inf.br','(48)3045-1166',true,'');
insert into remetente values(23,'FHORTEC DO BRASIL INF.','RT','fhortec@iscc.com.br','(49)3251-6112',true,'');
insert into remetente values(24,'YAMASOFT AUTOMACAO','RT','yamasoft@yamasoft.com.br','(14)3413-2107',true,'');
insert into remetente values(25,'TECHNOEASY','RT','jvalderio@technoeasy.com.br','(18)3903-3139',true,'');
insert into remetente values(26,'BBS INFORMATICA','RT','comercial@bbsinformatica.com.br','(34)3236-9080',true,'');
insert into remetente values(27,'RIOPREMAC INFORMATICA','RT','riopremac@hotmail.com','(17)3235-3831',false,'');
insert into remetente values(28,'SMART SYSTEMS','RT','financeiro@ssystems.com.br','(12)3923-4183',true,'');
insert into remetente values(29,'SANTANA SEGURANÇA','RT','suportebh@santanaseguranca.com.br','(31)3492-1330',true,'');
insert into remetente values(30,'CS COMPUTADORES','RT','csassistenciatecnica@cscomputadores.com.br','(55)3025-7070',true,'');
insert into remetente values(31,'SUPORTE INFORMÁTICA','RT','tmariani@suporteprime.com.br','(54)3601-2930',false,'');
insert into remetente values(32,'INTEREX TEC','RT','interex@interex.com.br','(51)3303-9444',false,'');
insert into remetente values(33,'ALTEC TELECOM','RT','larissa.nunes@altectelecom.com.br','(91)4008-6700',true,'');
insert into remetente values(34,'VELIT SOLUÇÕES PUBLICITÁRIAS','RT','producao@velitmidia.com.br','(55)3402-3536',false,'');
insert into remetente values(35,'INSTALE','RT','sac@instale.com.br','(71)2106-4200',true,'');
insert into remetente values(36,'Renato da Silva Godoi','TR','renato.godoi@specto.com.br','(11)9815-77214',true,'');
insert into remetente values(37,'Fabio Eduardo Paiva','TR','fabio.eduardo@specto.com.br','(19)9813-43592',true,'');
insert into remetente values(38,'Helio Rubens Soliano','TR','helio.soliano@specto.com.br','(11)9825-14685',true,'');
insert into remetente values(39,'Jaime Cruz Gouveia Filho','TR','jaime.gouveia@specto.com.br','(81)9647-7800',true,'');
insert into remetente values(40,'José Eduardo Pedreira Nunes','TR','jose.eduardo@specto.com.br','(71)9109-0381',true,'');
insert into remetente values(41,'Juliano de Oliveira Bitencourt','TR','juliano.oliveira@specto.com.br','(51)8574-7006',false,'');
insert into remetente values(42,'Leandro dos Santos Honorato','TR','leandro.santos@specto.com.br','(11)9828-82370',true,'');
insert into remetente values(43,'Leonardo Goudinho Colares','TR','leonardo.goudinho@specto.com.br','(51)8131-4855',true,'');
insert into remetente values(44,'Fernando Souza de Alexandria','TR','fernando.souza@specto.com.br','(11)9827-1154',false,'');
insert into remetente values(45,'Marcus Vinicius Jorge','TR','marcus.jorge@specto.com.br','(11)9828-82339',false,'');
insert into remetente values(46,'Orlando Maraccini Neto','TR','orlando.maraccini@specto.com.br','(21)9811-25305',true,'');
insert into remetente values(47,'Reinaldo Alexandre Avelino de Souza','TR','reinaldo.avelino@specto.com.br','(11)9825-14161',true,'');
insert into remetente values(48,'Ricardo Souto da Silva','TR','ricardo@specto.com.br','(14)9811-25305',true,'');
insert into remetente values(49,'Geraldo Lopes dos Santos','TR','geraldo.santos@specto.com.br','(11)9823-30789',false,'');
insert into remetente values(50,'Vanderlei Pereira do Nascimento','TR','vanderlei.nascimento@specto.com.br','(11)9825-14689',true,'');
insert into remetente values(51,'Wagner Jorge Pimentel','TR','wagner.pimentel@specto.com.br','(31)6963-4075',true,'');

-- Manutenção --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
insert into manutencaolaboratorio values(1,'TR Wagner Jorge Pimentel','I12IMP000 Impressora DAS Triagem','não corta papel','sujeira na guilhotina','06/11/2015','1254','33874',true,'limpeza de guilhotina','componentes','00:20','João da Silva'); 
insert into manutencaolaboratorio values(2,'RT BBS INFORMATICA','I12IMP013 Impressora DAS 6 Botões','não imprime','não imprime','06/11/2015','157','32873',false,'ci de comunicação queimado','componentes','00:25','Maria José'); 
insert into manutencaolaboratorio values(3,'TR Ricardo Souto','I07PLA055 Placa Mtouch(flat)','não reconhece toque','solda fria','07/11/2015','1234','44125',false,'ressolda em componentes','componentes','00:40','Camila Philippi');
insert into manutencaolaboratorio values(4,'TR Orlando Maraccini Neto','I12IMP013 Impressora DAS 6 Botões','não salva data/hora','bateria fraca','07/11/2015','2154','38554',true,'troca da bateria da CPU','componentes','00:10','Eduardo C.V.');
insert into manutencaolaboratorio values(5,'TR Orlando Maraccini Neto','ImpMecafAd Impressora Mecaf','não puxa papel','baud rate','07/11/2015','2154','38554',true,'configuração de baud rate','componentes','00:10','Eduardo C.V.');





-- SELECT --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- select * from dbEngenhariaServico.usuario;
-- select * from dbEngenhariaServico.tecnico;
-- select * from dbEngenhariaServico.componente;
-- select * from dbEngenhariaServico.produto;
-- select * from dbEngenhariaServico.remetente;
-- select * from dbengenhariaservico.ManutencaoLaboratorio;

-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

