use qatar2022;
punto 1
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('1','Pablo','Rodriguez','Arg','1');


cargamos la tabla departamentos

insert into departamento(NroDep,NomDep,PrepDep) values ('2','RRHH','5.000'); 
insert into departamento(NroDep,NomDep,PrepDep) values ('3','Logistica','5.000'); 
insert into departamento(NroDep,NomDep,PrepDep) values ('4','Sistemas','5.000'); 
insert into departamento(NroDep,NomDep,PrepDep) values ('5','Diseño','5.000'); 
insert into departamento(NroDep,NomDep,PrepDep) values ('6','Ingenieria','5.000'); 
insert into departamento(NroDep,NomDep,PrepDep) values ('7','Legal','5.000'); 

cargamos los empleados


insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('2','Jose','Perez','Arg','1');
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('3','Juan','Gonzalez','Arg','5');
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('4','Alvaro','Rodriguez','Arg','6');
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('5','Ariel','Galvez','Arg','1');
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('6','Belen','Rodriguez','Arg','2');
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('7','Lucas','Vargas','Arg','3');
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('8','Facundo','Rodriguez','Arg','6');
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('9','Belen','Perez','Arg','7');
insert into empleados(DniEmp,NomEmp,ApeEmp,NacEmp,DepEmp) values ('10','Belen','Rodriguez','Arg','1');

punto 2

update empleados set NacEmp = 'Brasil' where DniEmp=7;

punto 3

delete from departamento where NroDep=4;

punto 4
Conocer los empleados que trabajan en el departamento de “logística” 

select * from empleados  where DepEmp=1;


5. Mostrar todos los departamentos ordenados alfabéticamente.

select * from departamento
order by NomDep asc;

