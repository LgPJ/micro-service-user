INSERT INTO users (username, password, is_active, name, email) VALUES('@andres', '159753', 1, 'Andres', 'andres@gmail.com');
INSERT INTO users (username, password, is_active, name, email) VALUES('@Luis', '123456', 1, 'Luis', 'luis@gmail.com');

INSERT INTO role (name) VALUES('ROLE_USER');
INSERT INTO role (name) VALUES('ROLE_ADMIN');

INSERT INTO usser_to_role (users_id, role_id) VALUES(1, 1);
INSERT INTO usser_to_role (users_id, role_id) VALUES(2, 2);
INSERT INTO usser_to_role (users_id, role_id) VALUES(2, 1);