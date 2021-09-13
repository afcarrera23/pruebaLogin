// USUARIO
INSERT INTO usuario (user_name, password, estado, tipo_usuario) VALUES ('admin', '12345', 'A', 'admin');
INSERT INTO usuario (user_name, password, estado, tipo_usuario) VALUES ('andres', '12345', 'A', 'public');

// CLIENTE
INSERT INTO cliente (num_doc_cliente, nombre_cliente) VALUES ('123', 'cliente uno');
INSERT INTO cliente (num_doc_cliente, nombre_cliente) VALUES ('1234', 'cliente dos');
INSERT INTO cliente (num_doc_cliente, nombre_cliente) VALUES ('12345', 'cliente tres');

// PRODUCTO
INSERT INTO producto (nombre, tipo, cantidad, valor, estado) VALUES ('Teclado', 'Periferico', 10, 20000, 'A');
INSERT INTO producto (nombre, tipo, cantidad, valor, estado) VALUES ('Mouse', 'Periferico', 12, 15000, 'A');
INSERT INTO producto (nombre, tipo, cantidad, valor, estado) VALUES ('Pad mouse', 'Periferico', 14, 5000, 'A');
INSERT INTO producto (nombre, tipo, cantidad, valor, estado) VALUES ('Base refrigerante', 'Periferico', 16, 25000, 'A');
INSERT INTO producto (nombre, tipo, cantidad, valor, estado) VALUES ('Monitor 24"', 'Periferico', 18, 650000, 'A');