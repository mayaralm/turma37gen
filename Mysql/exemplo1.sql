CREATE database db_generation_game_online;

USE db_generation_game_online;
CREATE table tb_classe(
id int auto_increment,
nome varchar (255) not null,
codigo varchar (255) not null,
primary key (id)

);

CREATE table tb_personagem(
 id_personagem int auto_increment,
 nome varchar (255) not null,
 poder_defesa int,
 poder_ataque int,
 agilidade int,
 fk_id int,
 primary key (id_personagem),
 foreign key (fk_id) references tb_classe (id)
);

INSERT INTO tb_classe (nome,codigo) values
("Mago","psht"),
("cavaleiro","pthl"),
("curandeiro","bthg"),
("assasino","psmi");

select* from tb_classe;

insert into tb_personagem(nome,poder_defesa,poder_ataque,agilidade,fk_id) values 
("mayara",5000,10000,10,1),
("fada",89,25,99,2),
("Super Dev",300,600,69,3),
("Gnomo voador",1010,3500,200,4);

DROP TABLE  tb_personagem;

SELECT * FROM tb_personagem  where poder_ataque > 2000;
SELECT * FROM tb_personagem  where poder_defesa > 1000 and poder_defesa<2000;
insert into tb_personagem(nome,poder_defesa,poder_ataque,agilidade,fk_id) values 
("Cavaleiro Fantasma", 1000,10000,98,4);

select * from tb_personagem where nome like 'c%';
select * from tb_classe inner join tb_personagem on tb_personagem.fk_id - tb_classe.id;
select * from tb_classe inner join tb_personagem on tb_personagem.fk_id - tb_classe.id  where id = 3;




