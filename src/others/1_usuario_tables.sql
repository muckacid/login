CREATE TABLE tipo_usuario(
    id_tipo INT AUTO_INCREMENT,
    tipo VARCHAR(20) NOT NULL UNIQUE,
    rango INT NOT NULL UNIQUE,
    descripcion TEXT,
    PRIMARY KEY (id_tipo)
);

CREATE TABLE usuario(
    rut_user VARCHAR(8),
    name_user VARCHAR(50) NOT NULL,
    last_name_user VARCHAR(50) NOT NULL,
    pass_user VARCHAR(64) NOT NULL,
    email_user VARCHAR(50) NOT NULL UNIQUE,
    type_user INT,
    PRIMARY KEY (rut_user),
    FOREIGN KEY (type_user) REFERENCES tipo_usuario (id_tipo)
);

