CREATE DATABASE control_alumnos;

USE control_alumnos;

CREATE TABLE direccion(
id_direccion INT auto_increment primary key,
calle VARCHAR(30),
numero INT,
ciudad VARCHAR(20),
tipo ENUM ('casa', 'trabajo', 'otro')
);

CREATE TABLE alumno(
id_alumno INT auto_increment primary key,
rut VARCHAR(20),
nombre VARCHAR(20),
apellido VARCHAR(30),
email VARCHAR(50),
edad INT,
fecha_ingreso DATE,
id_direccion INT,
foreign key (id_direccion) references direccion(id_direccion)
);
