DROP TABLE carts IF EXISTS;
DROP TABLE types IF EXISTS;

CREATE TABLE types (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX types_name ON types (name);

CREATE TABLE carts (
  id         INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(255),
  price VARCHAR(255),
  description VARCHAR(255)
);

/*ALTER TABLE carts ADD CONSTRAINT fk_pets_types FOREIGN KEY (type_id) REFERENCES types (id);
/*CREATE INDEX payments_name ON payments (name);*/


