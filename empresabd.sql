create table Departamento (id bigint not null auto_increment, nombre varchar(255), primary key (id));
create table Empleado (id bigint not null auto_increment, nombre varchar(255), departamento_id bigint, primary key (id));
alter table Empleado add constraint fk_departamento foreign key (departamento_id) references Departamento (id);
