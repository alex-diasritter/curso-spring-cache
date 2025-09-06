CREATE TABLE IF NOT EXISTS empresa (
    id INT PRIMARY KEY,
    nome VARCHAR(20)
);

INSERT INTO empresa (id, nome)
SELECT gen.id, 'Empresa ' || gen.id
FROM (
    SELECT X AS id
    FROM SYSTEM_RANGE(1, 300000)
) gen
WHERE NOT EXISTS (SELECT 1 FROM empresa);