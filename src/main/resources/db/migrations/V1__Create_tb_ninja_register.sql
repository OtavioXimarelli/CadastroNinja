CREATE TABLE tb_ninja_register (
                                   id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                   name VARCHAR(255) NOT NULL,
                                   email VARCHAR(255) UNIQUE NOT NULL,
                                   age INT NOT NULL
);
