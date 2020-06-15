/*DROP TABLE account IF EXISTS;

CREATE TABLE account (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);*/

DROP TABLE accounts IF EXISTS;
DROP TABLE types IF EXISTS;

CREATE TABLE types (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX types_name ON types (name);

CREATE TABLE accounts (
  id         INTEGER IDENTITY PRIMARY KEY,
  firstname VARCHAR(255),
  name VARCHAR(255),
  gender VARCHAR(255),
  --someDate DATE
);
