DROP TABLE users;
DROP TABLE userRelations;
DROP TABLE post;
DROP TABLE user_group;
DROP TABLE groupRelations;
DROP TABLE files;
DROP TABLE userProfile;
DROP TABLE userChat;

CREATE TABLE users (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    username VARCHAR(32) NOT NULL UNIQUE ,
    identificator VARCHAR(64) NOT NULL UNIQUE ,
    email VARCHAR(64) NOT NULL UNIQUE,
    password VARCHAR(250) NOT NULL ,
    role VARCHAR(10) NOT NULL
);

CREATE TABLE userRelations (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    requester INT NOT NULL ,
    requestee INT NOT NULL ,
    relation VARCHAR(10)
);

CREATE TABLE post (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    origin VARCHAR(10) ,
    origin_id INT NOT NULL ,
    post_date date NOT NULL ,
    files VARCHAR(250) ,
    text VARCHAR(250)
);

CREATE TABLE user_group (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    group_name VARCHAR(250) ,
    identificator VARCHAR(64) NOT NULL UNIQUE ,
    group_owner INT NOT NULL
);

CREATE TABLE groupRelations (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    subscriber INT NOT NULL ,
    role VARCHAR(10) ,
    relation VARCHAR(10)
);

CREATE TABLE userProfile(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    user INT NOT NULL ,
    description VARCHAR(500) ,
    photo VARCHAR(500) ,
    poststory VARCHAR(500)
);

CREATE TABLE files(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    path VARCHAR(250) ,
    name VARCHAR(250) ,
    type VARCHAR(250)
);


CREATE TABLE userChat(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    user1 INT NOT NULL,
    user2 INT NOT NULL ,
    path VARCHAR(250)
);
