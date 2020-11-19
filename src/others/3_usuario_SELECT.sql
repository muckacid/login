SELECT * FROM tipo_usuario;
SELECT * FROM usuario;


SELECT
    usuario.name_user AS 'nombre',
    tipo_usuario.rango AS 'rango'
FROM
    usuario
INNER JOIN tipo_usuario ON usuario.type_user = tipo_usuario.id_tipo;

SELECT COUNT(rut_user) FROM usuario WHERE rut_user = '18646384' AND pass_user = SHA2('123',0);


SELECT 
    tipo_usuario.rango AS 'tipo'

FROM
    usuario
INNER JOIN tipo_usuario ON usuario.type_user = tipo_usuario.id_tipo
WHERE usuario.email_user = 'admin@gmail.com';

        