begin;

create table cliente(
id serial primary key,
email varchar(100) not null,
cpf bigint not null unique,
data_nascimento date,
nome varchar(50),
sobrenome varchar(50)
);



insert into cliente (cpf, email, data_nascimento, nome, sobrenome)
values
(12345678912,
'guilhermesantos@hotmail.com',
'22-09-1999',
'Guilherme',
' Santos'
),
(98765432198,
'gustavoxavier@gmail.com',
'15-05-2000',
'Gustavo',
' Xavier'
),
(12312312312,
'gabrielgalhardo@bol.com',
'14-08-2003',
'Gabriel',
'Galhardo'
),
(45645645645,
'gabrielaragao@gmail.com',
'18-03-1997',
'Gabriel',
' Aragão'
),
(78978978978,
'joaostael@yahoo.com',
'01-04-1835',
'João',
' Stael'
),
(98765432158,
'victormafort@bol.com',
'03-03-1993',
'Victor',
' Mafort'
);

---------------------------------------------------------------------------------------------

create table tipo_telefone(
id serial primary key,
tipo varchar(20) not null
);

insert into tipo_telefone(tipo)
values
('fixo'),
('celular');

-------------------------------------------------------------------------------------------
create table telefone(
id serial primary key,
telefone varchar(30) not null,
id_tipo_telefone bigint,
constraint fk_telefone_tipo_telefone foreign key (id_tipo_telefone) references tipo_telefone(id),
id_cliente bigint,
constraint fk_telefone_cliente foreign key (id_cliente) references cliente(id)
);


insert into telefone(telefone, id_tipo_telefone, id_cliente)
values
('(22) 996456456',2, 4),
('(22) 989898989', 2, 2),
('(24) 979797979', 2, 1), 
('(24) 969696969', 2, 5),
('(22) 25252525', 1, 3),
('(21) 25268752',1, 6);


-------------------------------------------------------------------------------------------

create table endereco(
id serial primary key,
rua varchar(50) not null,
bairro varchar(50) not null,
numero smallint not null,
complemento varchar(60) not null,
cep bigint not null,
tel_entrega varchar(13)
);

insert into endereco (rua, bairro, numero, CEP, complemento, tel_entrega )
values
('Bahia', 'Bela Vista', 17, 28222222,  'ao lado da casa verde', '22999999999' ),
('Amazonas', 'Bela Vista', 22, 28622222,  'em frente a padaria','21999999999'),
('São Paulo', 'Bela Vista',33, 28633333,  'atrás do mercado feliz', '21888888888'),
('Av Manoel Alves Mesquita', 'Banquete', 3, 22233456, 'casa amarela', '22999887654'),
('Nova Friburgo', 'Jardim Mariléa', 38, 22763406, 'última rua da casa', '22989878462'),
('Nova Friburgo', 'Jardim Mariléa', 26, 22763886, 'portão azul', '22987878762');

---------------------------------------------------------------------------------------------
create table endereco_cliente (
id serial primary key,
id_cliente bigint not null,
id_endereco bigint not null,
constraint fk_endereco_cliente_cliente foreign key(id_cliente) references cliente(id),
constraint fk_endereco_cliente_endereco foreign key(id_endereco) references endereco(id)
);

insert into endereco_cliente(id_cliente, id_endereco)
values(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6);

------------------------------------------------------------------------------------------

create table funcionario(
id serial primary key,
nome varchar(50) not null,
cpf bigint not null
);

insert into funcionario (nome, cpf)
values ('Catarina', 98765432101),
('Thais', 01234567890),
('Ariel', 98765432102),
('Weberson', 98765432103);


-----------------------------------------------------------------------------------------
create table categoria(
id serial primary key,
nome varchar(50) not null,
descricao bigint not null
);

ALTER TABLE categoria ALTER COLUMN descricao TYPE varchar(60);

insert into categoria (nome, descricao)
values
('Salgado', 'lorem ipsum'),
('Petiscos', 'lorem ipsum'),
('Bebidas', 'lorem ipsum'),
('Doces', 'lorem ipsum'),
('Frios', 'lorem ipsum'),
('Picole', 'lorem ipsum');

delete from categoria where nome = 'Picole';

------------------------------------------------------------------------------------------

create table produto(
id serial primary key,
nome varchar(60) not null,
descricao varchar(60) not null,
valor smallint not null,
id_categoria bigint,
constraint fk_produto_categoria foreign key (id_categoria) references categoria(id),
id_funcionario bigint,
constraint fk_produto_funcionario foreign key (id_funcionario) references funcionario(id)
);


insert into produto (nome, descricao, id_categoria, valor, id_funcionario)
values
('Biscoito de polvilho',
'Biscoito de polvilho sem acucar',
2,
2.50,
1
),
('Geleia de Goiaba',
'Feita naturalmente com os pedaços da fruta',
4,
10.00,
2
),
('Iogurte de morango',
'Iogurte de morango brabo',
4,
5.00,
3
),
('Queijo frescal',
'Queijo muito bom',
5,
9.00,
4
),
('Casadinho',
'Biscoito amanteigado delicioso!',
2,
10.00,
1
),
('Pao doce',
'Pao doce com goiaba',
2,
3.50,
2);

---------------------------------------------------------------------------------------------


create table lote(
id serial primary key,
data_fabricao date,
qtd_produto bigint,
id_funcionario bigint,
constraint fk_lote_funcionario foreign key (id_funcionario) references funcionario(id)
);


insert into lote(data_fabricao, qtd_produto, id_funcionario)
values('2021-04-10', 12, 1),
('2021-04-18', 12, 2),
('2021-04-19', 15, 3),
('2021-04-17', 11, 1),
('2021-04-18', 14, 2),
('2021-04-19', 16, 3);

------------------------------------------------------------------------------------------------
create table estoque(
id serial primary key,
id_lote bigint,
constraint fk_estoque_lote foreign key (id_lote) references lote(id),
id_produto bigint,
constraint fk_estoque_produto foreign key (id_produto) references produto(id)
);


insert into estoque(id_lote, id_produto)
values(1, 4),
(2, 1),
(3, 3),
(4, 4),
(5, 5),
(6, 6);

--------------------------------------------------------------------------------------------------
create table pedido(
id serial primary key,
data_pedido date,
total_pedido int,
id_endereco_cliente bigint,
id_cliente bigint,
constraint fk_endereco_cliente foreign key (id_endereco_cliente) references endereco_cliente(id),
constraint fk_pedido_cliente foreign key (id_cliente) references cliente(id)
);

insert into pedido (id_cliente,total_pedido, data_pedido, id_endereco_cliente)
values
(1, 12, '2021-04-20',1),
(3, 52, '2021-04-20',4),
(2, 57, '2021-04-20',3),
(5, 11, '2021-04-20',6),
(3, 120, '2021-04-20',5);
-------------------------------------------------------------------------------------------------

create table pedido_produto(
id serial primary key,
id_produto bigint,
constraint fk_pedido_produto_produto foreign key (id_produto) references produto(id),
id_pedido bigint,
constraint fk_pedido_produto_pedido foreign key (id_pedido) references pedido(id)
);

alter table pedido_produto add column quantidade bigint;

insert into pedido_produto (id_pedido, id_produto, quantidade)
values
(1, 6, 3),
(2, 1, 1),
(2, 2, 2),
(2, 4, 1),
(2, 5, 2),
(3, 4, 3),
(3, 5, 3),
(4, 6, 2),
(4, 1, 1),
(5, 2, 10),
(5, 3, 1),
(5, 1, 5);

create table nota_fiscal(
	id  serial primary key,
	nome_cliente varchar(100) not null,
	preco_total int not null,
	endereco_entrega varchar(300) not null,
	telefone_entrega varchar(15),
	cpf_cliente varchar(13) not null,
	id_pedido bigint,
	constraint fk_pedido_nota foreign key (id_pedido) references pedido(id)
);



create table produtos_nota(
	id serial primary key,
	nome_produto varchar(30) not null,
	valor_produto int not null,
	quantidade_produto int not null,
	id_nota_fiscal bigint,
	constraint fk_id_nota_produto foreign key (id_nota_fiscal) references nota_fiscal(id)
);



commit;


---------Saber qual cliente mais comprou-----------------

select id_cliente , count(*) from pedido p
group by id_cliente

---------- SQL DE CRIACAO DE NOTA FISCAL -----------------

select * from telefone t 
where t.id_cliente = (select c.id from cliente c
inner join pedido p on p.id_cliente = c.id where p.id = 2)

select c.nome, c.cpf from cliente c 
inner join pedido p on c.id = p.id_cliente
where p.id = 2

select * from endereco e
where id = (select ec.id_endereco from endereco_cliente ec 
inner join pedido p on p.id_endereco_cliente = ec.id 
where p.id = 3)

-------Valor e quantidade de cada produto da compra-------

select p.nome, p.valor, pp.quantidade from pedido_produto pp
join produto p on pp.id_produto = p.id
where id_pedido = 2

-------Valor Total da compra-------

select sum(p.valor * pp.quantidade) from pedido_produto pp
join produto p on pp.id_produto = p.id
where id_pedido = 1

---------------Produtos/Valor/Quantidade--------------

select po.nome, po.descricao, po.valor, pp.quantidade, (po.valor * pp.quantidade) as Valor_total_produto from cliente c
inner join pedido p on p.id_cliente = c.id 
inner join pedido_produto pp on pp.id_pedido = p.id 
inner join produto po on po.id = pp.id_produto 
where p.id = 2

--------------Nome/CPF/Total/Telefone/Endereco---------

select c.nome, c.cpf, p.total_pedido, t.telefone, e.rua, e.bairro, e.numero, e.complemento , e.cep from cliente c 
inner join pedido p on c.id = p.id_cliente
inner join telefone t on t.id_cliente = p.id_cliente 
inner join endereco_cliente ec on ec.id_cliente = p.id_cliente 
inner join endereco e on ec.id_endereco = e.id
where p.id = 1
group by c.nome, c.cpf, p.total_pedido, t.telefone, e.rua, e.bairro, e.numero, e.complemento , e.cep



