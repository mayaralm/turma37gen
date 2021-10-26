create database	db_farmacia_do_bem;
use db_farmacia_do_bem;

CREATE TABLE tb_categoria (
    id_categoria INT AUTO_INCREMENT,
    cliente VARCHAR(255) NOT NULL,
    tipo_produto ENUM ('Cosmético', 'Remédio'),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
    id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    marca VARCHAR(255) NOT NULL,
    valor DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria (id_categoria)
    );
    
INSERT INTO tb_categoria (cliente, tipo_produto) VALUES
("Barbara", "Cosmético"),
("Maria Luiza", "Remédio"),
("Mayara", "Remédio"),
("Danillo", "Cosmético"),
("Cecilia", "Remédio");

SELECT * FROM tb_categoria;
INSERT INTO tb_produto(nome, quantidade, marca, valor, fk_id_categoria) VALUES
("Neosaldina",30,"Nycomed",25.11,2),
("Dramin",30,"Nycomed",20.90,3),
("Kit Shampoo",2,"Pantene",30.00,1),
("desodorante",1,"Dove",14.90,4),
("Ibuprofeno",10,"Neo química",10.00,5);

SELECT * FROM tb_produto;
select * from tb_produto where valor> 50.00;
select * from tb_produto where valor> 03.00 and valor< 60.00;
select * from tb_produto where nome like 'b%';
SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria - tb_categoria.id_categoria;

SELECT * FROM tb_categoria
INNER JOIN tb_produto
ON tb_produto.fk_id_categoria - tb_categoria.id_categoria
WHERE id_categoria = 5;
