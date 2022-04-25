--DROP TABLE flyway_schema_history

CREATE TABLE turno
(
    id INT NOT NULL KEY AUTO_INCREMENT,
    fecha    DATETIME
)

CREATE TABLE paciente
(
    id INT NOT NULL KEY AUTO_INCREMENT,
    dni VARCHAR(10),
    nombre VARCHAR(255),
    email VARCHAR(255),
    telefono VARCHAR(15)
)

INSERT INTO paciente (dni, nombre, email, telefono) VALUES
    (1230, 'Jose Martinez', 'j.martinez@imael.com', '1234-0000'),
    (2231, 'Jorge Vega', 'j.vega@imael.com', '1234-0001'),
    (3210, 'Emanuel Cozetti', 'm.cozetti@imael.com', '1234-0002'),
    (4251, 'Martin Gutierrez', 'martingutierrez@imael.com', '15 2442-0000')
    (5123, 'Damian Martinez', 'dami12@imael.com', '15 4000-1234');