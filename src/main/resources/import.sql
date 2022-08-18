INSERT INTO users (username, password, is_active, name, email) VALUES('@andres', '2a$10$Kcgp1fmpUQkWN0okwQ15Wua31yCfPQg32haXk7uAZ9omt/EFe5j5O', 1, 'Andres', 'andres@gmail.com');
INSERT INTO users (username, password, is_active, name, email) VALUES('@Luis', '2a$10$S6twYMXEN7nt031i5/e.t.rtshc7SAleOfcmWop9BKCQnx3pVgGTq', 1, 'Luis', 'luis@gmail.com');

INSERT INTO role (name) VALUES('ROLE_USER');
INSERT INTO role (name) VALUES('ROLE_ADMIN');

INSERT INTO usser_to_role (users_id, role_id) VALUES(1, 1);
INSERT INTO usser_to_role (users_id, role_id) VALUES(2, 2);
INSERT INTO usser_to_role (users_id, role_id) VALUES(2, 1);