DROP TABLE `user`;

CREATE TABLE `user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `email` varchar(255) NOT NULL,
    `username` varchar(255) NOT NULL,
    `picture` varchar(255) DEFAULT NULL,
    `role` varchar(255) NOT NULL,
    `password` varchar(255) NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user`(email, username, role, password)
VALUES('test@gmail.com', 'user', 'USER', '{noop}pass');
INSERT INTO `user`(email, username, role, password)
VALUES('admin@gmail.com', 'admin', 'ADMIN', '{noop}pass');
