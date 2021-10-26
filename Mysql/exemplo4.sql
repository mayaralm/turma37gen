create database	db_cidade_das_frutas;
use db_cidade_das_frutas;
CREATE TABLE tb_categoria (
id_categoria int AUTO_INCREMENT,
fruta varchar(255) not null,
tipo_produto ENUM ('madura', 'verde'),
 PRIMARY KEY (id_categoria)
);
CREATE TABLE tb_produto(
id_produto int auto_increment,
nome varchar (255) not null,
quantidade int not null,
valor double not null,
fk_id_categoria INT,
PRIMARY KEY (id_produto),
FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria (Fruta, tipo_produto) VALUES 
("Frutas cítricas", "verde"),
("Frutas semi-ácidas", "verde"),
("Frutas doces", "madura"),
("Frutas hidricas", "madura");

INSERT INTO tb_produto (nome, quantidade,valor, fk_id_categoria) VALUES
("manga", 3, 4.00,1),
("maracuja", 6, 8.00,2),
("abacaxi", 2, 5.00,2),
("caqui", 3, 6.00,1),
("uva", 3, 5.00,2),
("melancia", 3, 4.00,1);

SELECT * FROM tb_produto ;
SELECT * FROM tb_produto WHERE valor > 50.00;
SELECT * FROM tb_produto WHERE valor > 3.00 AND valor < 60.00 ;

SELECT * FROM tb_produto WHERE nome LIKE 'c%';
 SELECT * FROM tb_categoria
	INNER JOIN tb_produto
	ON tb_produto.id_produto = tb_categoria.id_categoria;
SELECT * FROM tb_categoria
	INNER JOIN tb_produto
	ON tb_produto.id_produto = tb_categoria.id_categoria
	WHERE id_categoria = 2;
