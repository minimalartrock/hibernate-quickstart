SELECT setval('hibernate_db."gift_id_seq"', 3);
CREATE TABLE hibernate_db.known_fruits
(
  id   INT,
  name VARCHAR(40)
);
INSERT INTO hibernate_db.known_fruits(id, name) VALUES (1, 'Cherry');
INSERT INTO hibernate_db.known_fruits(id, name) VALUES (2, 'Apple');
INSERT INTO hibernate_db.known_fruits(id, name) VALUES (3, 'Banana');
