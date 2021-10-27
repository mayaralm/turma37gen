-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS `db_aprochegue` ;
USE `db_aprochegue` ;


CREATE TABLE IF NOT EXISTS `db_aprochegue`.`tb_temas` (
  `id_temas` BIGINT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(1000) NOT NULL,
  `titulo` VARCHAR(255) NOT NULL,
  `assunto` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_temas`))
ENGINE = InnoDB;



CREATE TABLE IF NOT EXISTS `db_aprochegue`.`tb_usuarios` (
  `id_usuarios` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `senha` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_usuarios`))
ENGINE = InnoDB;



CREATE TABLE IF NOT EXISTS `db_aprochegue`.`tb_postagem` (
  `id_postagem` BIGINT NOT NULL AUTO_INCREMENT,
  `data_postagem` TIMESTAMP NOT NULL,
  `texto` VARCHAR(1500) NOT NULL,
  `foto` BLOB NULL,
  `video` BLOB NULL,
  `documento` BLOB NULL,
  `tb_usuarios_id_usuarios` INT NOT NULL,
  `tb_temas_id_temas` BIGINT NOT NULL,
  PRIMARY KEY (`id_postagem`, `tb_usuarios_id_usuarios`, `tb_temas_id_temas`),
  INDEX `fk_tb_usuarios_has_tb_temas_tb_temas1_idx` (`tb_temas_id_temas` ASC) VISIBLE,
  INDEX `fk_tb_usuarios_has_tb_temas_tb_usuarios_idx` (`tb_usuarios_id_usuarios` ASC) VISIBLE,
  CONSTRAINT `fk_tb_usuarios_has_tb_temas_tb_usuarios`
    FOREIGN KEY (`tb_usuarios_id_usuarios`)
    REFERENCES `db_aprochegue`.`tb_usuarios` (`id_usuarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_usuarios_has_tb_temas_tb_temas1`
    FOREIGN KEY (`tb_temas_id_temas`)
    REFERENCES `db_aprochegue`.`tb_temas` (`id_temas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
