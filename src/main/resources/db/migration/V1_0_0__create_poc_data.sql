--DROP TABLE flyway_schema_history;

CREATE TABLE turnos
(
    id       INT NOT NULL KEY AUTO_INCREMENT,
    paciente INT,
    fecha    DATETIME
)

CREATE TABLE paciente
(
    id INT NOT NULL KEY AUTO_INCREMENT
        nombre VARCHAR
);