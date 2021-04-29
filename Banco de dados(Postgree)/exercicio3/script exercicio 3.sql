---------------- NORMALIZACAO DA TABELA CONTA -----------------

begin;

alter table conta rename to conta_backup;

create table planos (
	id serial primary key,
	nome_plano varchar(20) unique not null,
	descricao_plano varchar(300) not null
);

insert into planos (nome_plano, descricao_plano)
values('Ilimitado', 'Descricao do plano'),
('Limitado','Descricao do plano');

create table conta(
	id serial primary key,
	email varchar(30) not null,
	senha varchar(256) not null,
	cod_plano int not null,
	constraint fk_cod_plano foreign key (cod_plano) references planos(id)
);


insert into conta(email, senha, cod_plano)
values('familiazimbrao@hotmail.com', 'MTIzNDU2c2VuaGE=', 1),
('familiasilva@hotmail.com', 'ZmxhbWVuZ29zZW5oYQ==', 1),
('familiagomes@gmail.com','dW1hc2VuaGFxdWFscXVlcg==', 1);

create table perfil(
	id serial primary key,
	nome varchar(20) unique not null,
	id_conta int not null,
	constraint fk_id_conta foreign key (id_conta) references conta(id)
);

insert into perfil(nome, id_conta)
values('Pai', 1), ('Mae', 1), ('Filho', 1) ,('Antonio', 2), ('Marta', 2), ('Carlos', 2) ,('Ariel', 3), ('Paloma', 3), ('Ester', 3);

drop table conta_backup cascade;

-------------------------------------------------------------------
------------------- Normalizacao da tabela filme_serie ---------------------

alter table filme_serie rename to filme_serie_backup;

create table genero(
	id serial primary key,
	nome varchar(20) unique not null	
);

insert into genero (nome)
values('Comedia'),('Terror'),('Drama'),('Acao');

create table filme(
	id serial primary key,
	nome varchar(50) not null,
	descricao varchar(500),
	id_genero bigint not null,
	constraint fk_id_genero foreign key(id_genero) references genero(id)
);


insert into filme (nome, id_genero, descricao) 
values(
	'Curtindo a vida adoidado',
	1,
	'Lorem Ipsum is'
),
(
	'Clube dos 5',
	3,
	'Lorem Ipsum is'
),
(
	'Caça fantasmas',
	1,
	'Lorem Ipsum is'
),
(
	'Jogos mortais',
	2,
	'Lorem Ipsum is'
);

create table serie (
	id serial primary key,
	nome varchar(50) not null,
	descricao varchar(500),
	id_genero bigint not null,
	constraint fk_id_genero foreign key(id_genero) references genero(id)
);


insert into serie (nome, descricao, id_genero) 
values(
	'the boys',
	'Lorem Ipsum',
	3
),
(
	'Game of Thornes',
	'Lorem Ipsum',
	3
),
(
	'American Gods',
	'Lorem Ipsum',
	3
);

create table temporada(
	id serial primary key,
	nome varchar(50),
	descricao varchar(500),
	id_serie int,
	constraint fk_id_serie foreign key (id_serie) references serie(id)
);



insert into temporada(nome, descricao, id_serie)
values(
	'Temporada 1',
	'Descricao da temporada',
	1
),
(
	'Temporada 2',
	'Descricao da temporada',
	1
),
(
	'Temporada 3',
	'Descricao da temporada',
	1
),
(
	'Temporada 1',
	'Descricao da temporada',
	2
),
(
	'Temporada 2',
	'Descricao da temporada',
	2
),
(
	'Temporada 3',
	'Descricao da temporada',
	2
),
(
	'Temporada 1',
	'Descricao da temporada',
	3
),
(
	'Temporada 2',
	'Descricao da temporada',
	3
),
(
	'Temporada 3',
	'Descricao da temporada',
	3
);



create table epsodios(
	id serial primary key,
	nome varchar(50),
	descricao varchar(500),
	link varchar(250),
	id_temporada int,
	constraint fk_id_temporada foreign key (id_temporada) references temporada(id)
);

insert into epsodios (nome, descricao, link, id_temporada)
values(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	1
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	1
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	1
),
(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	2
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	2
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	2
),
(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	3
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	3
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	3
),
(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	4
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	4
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	4
),
(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	5
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	5
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	5
),
(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	6
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	6
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	6
),
(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	7
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	7
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	7
),
(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	8
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	8
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	8
),
(
	'Epsódio piloto',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	9
),
(
	'O moçinho quase morre',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	9
),
(
	'Final feliz??',
	'Descricao epsodio',
	'https://www.youtube.com/watch?v=HmZKgaHa3Fg&ab_channel=LoungeVFilms-RelaxingMusicandNatureSounds',
	9
);

drop table filme_serie_backup;

----------------------------------------------------------------------------
---------------------Normalizacao  filme_serie assistido--------------------

alter table filme_serie_assistido rename to filme_serie_assistido_backup;

create table serie_assistido(
	id serial primary key,
	id_perfil int,
	id_serie int,
	constraint fk_id_perfil foreign key (id_perfil) references perfil(id),
	constraint fk_id_serie_assistido foreign key (id_serie) references serie(id)
);


insert into serie_assistido (id_perfil, id_serie)
values(1, 1), (5, 2), (3, 1);

create table filme_assistido(
	id serial primary key,
	id_perfil int,
	id_filme int,
	constraint fk_id_perfil foreign key (id_perfil) references perfil(id),
	constraint fk_id_filme_assistido foreign key (id_filme) references filme(id)
);

insert into filme_assistido (id_perfil, id_filme)
values(1, 2),(3, 4);

drop table filme_serie_assistido_backup;

commit ;
--------------------------------------------------------------------------------