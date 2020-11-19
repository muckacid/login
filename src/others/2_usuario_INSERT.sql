INSERT INTO tipo_usuario VALUES(null, 'Administrador', 0, 'Poder rango 0');
INSERT INTO tipo_usuario VALUES(null, 'Usuario', 1, 'Poder rango 1');

INSERT INTO usuario VALUES('11111111', 'admin', 'user', SHA2('123',0), 'admin@gmail.com', 1);
INSERT INTO usuario VALUES('22222222', 'user', 'user', SHA2('123',0), 'user@gmail.com', 2);


DELETE FROM usuario WHERE name_user = 'Maximiliano';