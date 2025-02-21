-- V2: Migration para adicionar a coluna de Rank na tabela de cadastros

ALTER TABLE tb_ninja_register
    ADD COLUMN rankk2 VARCHAR(255);
