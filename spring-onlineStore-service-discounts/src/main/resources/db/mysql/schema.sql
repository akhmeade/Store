CREATE DATABASE IF NOT EXISTS onlinestore;
GRANT ALL PRIVILEGES ON onlinestore.* TO pc@localhost IDENTIFIED BY 'pc';

USE onlinestore;

CREATE TABLE IF NOT EXISTS discounts (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  discount VARCHAR(255),
  new_price VARCHAR(255)
) engine=InnoDB;
