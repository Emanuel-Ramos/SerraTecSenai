create table cliente (
	id serial primary key,
	nome varchar(50) not null,
	CPF varchar(11) not null unique,
	email varchar(100) not null,
	telefone varchar(12) not null,
	habilitacao varchar unique
)



create table carro (
	id serial primary key,
	modelo varchar(20) not null,
	cor varchar(15) not null,
	ano int not null,
	placa varchar(20) unique not null
)

create table cliente_carro(
	id serial primary key,
	id_cliente bigint,
	id_carro bigint,
	criado_em date not null,
	devolucao_em date not null,
	valor bigint not null,
	constraint fk_cliente_carro foreign key (id_cliente) references cliente(id),
	constraint fk_carro_cliente foreign key (id_carro) references carro(id)
)



--alter table cliente_carro add constraint fk_cliente_carro foreign key (id_cliente) references cliente(id)
--
--
--insert into carro (modelo, cor, ano, placa)
--values ('seda', 'preto', 2019, 'knn-135')
--
--insert into cliente (nome, CPF, email, telefone, habilitacao)
--values('manel', '12345678910', 'manel@hotmail.com', '1234123', '123123')
--
--insert into cliente_carro(id_cliente, id_carro)
--values(1, 1)