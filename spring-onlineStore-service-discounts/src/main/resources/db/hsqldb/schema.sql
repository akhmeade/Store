DROP TABLE types IF EXISTS;
DROP TABLE discounts IF EXISTS;
DROP TABLE payments IF EXISTS;

CREATE TABLE discounts (
  id         INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(255),
  discount VARCHAR(255),
  new_price VARCHAR(255)
);
