--DROP TABLE flyway_schema_history

CREATE TABLE turnos
(
    id INT NOT NULL KEY AUTO_INCREMENT,
    dni VARCHAR(10),
    nombre VARCHAR(255),
    email VARCHAR(255),
    telefono VARCHAR(15),
    fecha    DATETIME
);