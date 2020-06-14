INSERT IGNORE INTO types VALUES (1, 'CASH');
INSERT IGNORE INTO types VALUES (2, 'Visa');
INSERT IGNORE INTO types VALUES (3, 'MasterCard');
INSERT IGNORE INTO types VALUES (4, 'UnionPay');
INSERT IGNORE INTO types VALUES (5, 'Mir');
INSERT IGNORE INTO types VALUES (6, 'China');

INSERT IGNORE INTO discounts VALUES (1, 'Iphone', '10 %', '630 $');
INSERT IGNORE INTO discounts VALUES (2, 'Iphone', '10 %', '630 $');
INSERT IGNORE INTO discounts VALUES (3, 'Iphone', '10 %', '630 $');
INSERT IGNORE INTO discounts VALUES (4, 'Iphone', '10 %', '750 $');
INSERT IGNORE INTO discounts VALUES (5, 'Iphone', '10 %', '750 $');

INSERT IGNORE INTO payments VALUES (1, 'MasterCard', '2000-09-07', 1, 1);
INSERT IGNORE INTO payments VALUES (2, 'Visa', '2002-08-06', 6, 2);
INSERT IGNORE INTO payments VALUES (3, 'Rosy', '2001-04-17', 2, 3);
INSERT IGNORE INTO payments VALUES (4, 'Jewel', '2000-03-07', 2, 3);
INSERT IGNORE INTO payments VALUES (5, 'Iggy', '2000-11-30', 3, 4);
INSERT IGNORE INTO payments VALUES (6, 'George', '2000-01-20', 4, 5);
INSERT IGNORE INTO payments VALUES (7, 'Samantha', '1995-09-04', 1, 6);
INSERT IGNORE INTO payments VALUES (8, 'Max', '1995-09-04', 1, 6);
INSERT IGNORE INTO payments VALUES (9, 'Lucky', '1999-08-06', 5, 7);
INSERT IGNORE INTO payments VALUES (10, 'Mulligan', '1997-02-24', 2, 8);
INSERT IGNORE INTO payments VALUES (11, 'Freddy', '2000-03-09', 5, 9);
INSERT IGNORE INTO payments VALUES (12, 'Lucky', '2000-06-24', 2, 10);
INSERT IGNORE INTO payments VALUES (13, 'Sly', '2002-06-08', 1, 10);
