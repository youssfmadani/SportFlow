CREATE DATABASE sportflow;
USE sportflow;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(255) not null,
    lastName VARCHAR(255) not null,
    email VARCHAR(255) not null,
    password VARCHAR(255) not null,
    role ENUM("trainer", "member") NOT NULL,
    isAdmin BOOLEAN DEFAULT FALSE
);

CREATE TABLE members (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id int not null,
    belongsTo int null,
    FOREIGN KEY(user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY(belongsTo) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE trainers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id int not null,
    specialty VARCHAR(255) not null,
    belongsTo INT NULL,
    FOREIGN KEY(user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY(belongsTo) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE session (
    id INT AUTO_INCREMENT PRIMARY KEY,
    trainers_id INT NOT NULL,
    date_heure DATETIME NOT NULL,
    description VARCHAR(255),
    lieu VARCHAR(150) NOT NULL,
    duree INT NOT NULL,
    capacite_max INT,
    FOREIGN KEY (trainers_id) REFERENCES trainers(id) ON DELETE CASCADE
);


























