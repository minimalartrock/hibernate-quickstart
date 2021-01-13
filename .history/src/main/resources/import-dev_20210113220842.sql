SELECT setval('"gift_id_seq"', 3);
CREATE TABLE gift
(
  id   INT,
  name VARCHAR(40)
);
INSERT INTO gift(id, name) VALUES (1, 'Cherry');
INSERT INTO gift(id, name) VALUES (2, 'Apple');
INSERT INTO gift(id, name) VALUES (3, 'Banana');
