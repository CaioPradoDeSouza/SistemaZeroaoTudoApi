INSERT INTO CPS_USUARIO (ID,NOME,LOGIN,SENHA,EMAIL) VALUES (1,'caio', 'cps405','123456','cps@gmail.com');

ALTER SEQUENCE CPS_USUARIO_ID_SEQ RESTART with 2;

INSERT INTO CPS_PERFIL (ID,DESCRICAO) VALUES (1,'dev');

ALTER SEQUENCE CPS_PERFIL_SEQ RESTART with 2;