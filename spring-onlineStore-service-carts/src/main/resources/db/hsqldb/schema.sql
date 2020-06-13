DROP TABLE carts IF EXISTS;
DROP TABLE types IF EXISTS;

CREATE TABLE types (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX types_name ON types (name);

CREATE TABLE carts (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  price VARCHAR(255),
  amount VARCHAR(255)
  /*description VARCHAR(255)*/

);
/*ALTER TABLE carts ADD CONSTRAINT fk_pets_types  REFERENCES types (id);*/
/*CREATE INDEX payments_name ON carts (name);


