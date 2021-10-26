CREATE database db_pizzaria_legal;
use db_pizzaria_legal;
create table tb_categoria(
id_categoria int auto_increment,
tamanho enum ('Pequena', 'Média','Grande'),
tipo_massa enum ('Tradicional', 'Fina'),
primary key (id_categoria)
);

create table tb_pizza(
id_pizza int auto_increment,
sabor varchar(255) not null,
borda enum('Catupiry','Cheddar', 'Sem Borda'),
recheio_adicional boolean not null,
valor double not null,
fk_id_categoria int,
primary key (id_pizza),
foreign key (fk_id_categoria) references tb_categoria(id_categoria)
);

insert into tb_categoria(tamanho,tipo_massa) value 
("Pequena", "Fina"),
("Média", "tradicional"),
("Grande", "Fina");

select * from tb_categoria;
drop table tb_pizza;

insert into tb_pizza (sabor,borda,recheio_adicional,valor,fk_id_categoria) values
("Calabresa","Catupiry",1,10.50,1),
("Nordestina","Cheddar",0,60.50,2),
("Frango com Bacon","Cheddar",1,20.50,3),
("Peperroni","Catupiry",1,45.90,3),
("Brigadeiro","Sem borda",0,11.50,1);

select * from tb_pizza;

drop table tb_pizza;

select * from tb_pizza where valor> 45.00;
select * from tb_pizza where valor> 29.00 and valor< 60.00;

select * from tb_pizza where sabor like 'c%';

SELECT * FROM tb_categoria
INNER JOIN tb_pizza
ON tb_pizza.fk_id_categoria - tb_categoria.id_categoria;

SELECT * FROM tb_categoria
INNER JOIN tb_pizza
ON tb_pizza.fk_id_categoria - tb_categoria.id_categoria
WHERE id_categoria = 2;
