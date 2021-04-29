create table professor (
	id serial primary key,
	nome varchar(50),
	matricula bigint,
	documento varchar(11)
)

create table disciplina (
	id serial primary key,
	nome varchar(20)
)

create table disciplinaProfessor (
	id_professor bigint,
	id_disciplina bigint,
	constraint fk_professor_disciplina foreign key (id_professor) references professor(id),
	constraint fk_disciplina_professor foreign key (id_disciplina) references disciplina(id) 
)



create table aluno (
	id serial primary key,
	nome varchar(50) NOT null,
	matricula bigint,
	documento varchar(11) NOT NULL unique,
	id_turma bigint,
	constraint fk_aluno_turma foreign key (id_turma) references turma(id)
)

create table alunoDisciplina (
	id serial primary key,
	id_aluno bigint,
	id_disciplina bigint,
	constraint fk_aluno_disciplina foreign key (id_aluno) references aluno(id),
	constraint fk_disciplina_aluno foreign key (id_disciplina) references disciplina(id)
)

create table nota (
	id serial primary key,
	descricao varchar(200),
	valor smallint,
	id_aluno bigint,
	id_disciplina bigint,
	constraint fk_nota_aluno foreign key (id_aluno) references aluno(id),
	constraint fk_nota_disciplina foreign key (id_disciplina) references disciplina(id)
)
