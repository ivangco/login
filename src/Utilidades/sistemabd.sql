/**
 * Author:  Ivan_
 * Created: 05/05/2020
 */
DROP database sistema;
CREATE DATABASE sistema; 
USE sistema;

CREATE TABLE ciudades(
    idciudad INT NOT NULL PRIMARY KEY,
    ciu_nombre VARCHAR(50)
);

CREATE TABLE personal(
    idpersonal INT NOT NULL PRIMARY KEY,
    per_nombre VARCHAR(30),
    per_apellido VARCHAR(30),
    per_ci VARCHAR(15),
    idciudad INT,
    FOREIGN KEY (idciudad) REFERENCES ciudades(idciudad)
);

CREATE TABLE usuarios(
    idusuario INT NOT NULL PRIMARY KEY,
    usu_nick VARCHAR(15) NOT NULL,
    usu_clave VARCHAR(15) NOT NULL,
    usu_tipo VARCHAR(20),
    usu_estado VARCHAR(8),
    idpersonal INT,
    FOREIGN KEY (idpersonal) REFERENCES personal(idpersonal)
);

insert into ciudades (idciudad,ciu_nombre) 
values               (1,'SAN LORENZO');

insert into personal (idpersonal,per_nombre,per_apellido,per_ci,idciudad) 
values               (1,'JUAN',' PEREZ','123457-8',1);

insert into usuarios (idusuario,usu_nick,usu_clave,usu_tipo,usu_estado,idpersonal) 
values               (1,'juanpe','12345','ADMINISTRADOR','ACTIVO',1);

CREATE TABLE cliente(
    idcliente INT NOT NULL PRIMARY KEY,
    cli_nombre VARCHAR(30),
    cli_apellido VARCHAR(30),
    cli_ci VARCHAR(15),
    cli_ruc varchar(15)
);

CREATE TABLE producto(
    idproducto INT NOT NULL PRIMARY KEY,
    pro_nombre VARCHAR(45),
    pro_precio INT,
    pro_cantidad INT,
    pro_iva varchar(7)
);

CREATE TABLE facturaVenta(
    idfacturaventa INT NOT NULL PRIMARY KEY,
    fac_numero VARCHAR(20),
    fac_fecha date,
    fac_condicion VARCHAR(10),
    fac_estado varchar(15),
    idcliente INT NOT NULL,
    idpersonal INT NOT NULL,
    FOREIGN KEY (idcliente) REFERENCES cliente(idcliente),
    FOREIGN KEY (idpersonal) REFERENCES personal(idpersonal)
);
CREATE TABLE facturaDetalle(
    idetalle INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    det_precio INT,
    det_cantidad INT,
    idproducto INT NOT NULL,
    idfacturaventa INT NOT NULL,
    FOREIGN KEY (idproducto) REFERENCES producto(idproducto),
    FOREIGN KEY (idfacturaventa) REFERENCES facturaVenta(idfacturaventa)
);