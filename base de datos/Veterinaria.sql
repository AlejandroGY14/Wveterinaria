CREATE DATABASE veterinaria;
USE veterinaria;

CREATE TABLE clientes
(
	idcliente 		INT AUTO_INCREMENT PRIMARY KEY,
	apellidos		VARCHAR(40) NOT NULL,
    nombres 		VARCHAR(40) NOT NULL,
	dni				CHAR(8) NOT NULL,
    claveacceso 	VARCHAR(100) NOT NULL,
	CONSTRAINT uk_dni_cli UNIQUE (dni)
)ENGINE = INNODB;

INSERT INTO clientes (apellidos, nombres, dni, claveacceso) VALUES
		('Gallardo Yañez','Alejandro','60302109','123456'),
        ('Cusi Savedra','Luis David','70302109','123456'),
        ('Quispe Campos','Fabrizio','70302108','123456');

CREATE TABLE animales
(
	idanimal	INT AUTO_INCREMENT PRIMARY KEY,
	nombreanimal	VARCHAR(40) NOT NULL
)ENGINE = INNODB;

INSERT INTO animales (nombreanimal) VALUES
		('Pepito'), 
        ('Tom'), 
        ('Jerry');

CREATE TABLE razas
(
	idraza 			INT AUTO_INCREMENT PRIMARY KEY,
    idanimal 		INT NOT NULL,
    nombreraza 		VARCHAR(40),
    CONSTRAINT fk_idanimal_raz FOREIGN KEY (idanimal) REFERENCES animales(idanimal)
)ENGINE = INNODB;

select * from animales;

INSERT INTO razas (idanimal, nombreraza) VALUES
		('1', 'Dálmata'),
        ('2', 'Pastor Alemán'),
        ('3', 'Siberiano');

CREATE TABLE mascotas
(
	idmascota INT AUTO_INCREMENT PRIMARY KEY,
	idcliente INT NOT NULL,
    idraza INT NOT NULL,
    nombre	VARCHAR(40) NOT NULL,
    fotografia VARCHAR(200) NOT NULL,
	color VARCHAR(30) NOT NULL,
    genero	 VARCHAR(30) NOT NULL,
	CONSTRAINT fk_idcliente_mas FOREIGN KEY (idcliente) REFERENCES clientes(idcliente),
	CONSTRAINT fk_idraza_mas FOREIGN KEY (idraza) REFERENCES razas(idraza)
)ENGINE = INNODB;

INSERT INTO mascotas (idcliente, idraza, nombre, fotografia, color, genero) VALUES
	('1', '1', 'Perro', 'perro1.jpg', 'Negro', 'Masculino'),
    ('2', '1', 'Perro', 'perro2.jpg', 'Marron', 'Masculino'),
    ('3', '3', 'Gato', 'gato.jpg', 'Gris', 'Femenino');
    
    
DELIMITER $$
CREATE PROCEDURE spu_registrar_cliente
(
	IN _apellidos		VARCHAR(40),
    IN _nombres 		VARCHAR(40),
	IN _dni				CHAR(8),
    IN _claveacceso 	VARCHAR(100)
)BEGIN
	INSERT INTO clientes(apellidos, nombres, dni, claveacceso)
	VALUES(_apellidos, _nombres, _dni, _claveacceso);
END $$

CALL spu_registrar_cliente('Molina Yañez', 'Neyser', '70257482', '123456');
    

    
    
    
    
    
    
    
    
    