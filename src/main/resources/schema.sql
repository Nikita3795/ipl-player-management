CREATE DATABASE IF NOT EXISTS ipl;
USE ipl;

CREATE TABLE IF NOT EXISTS players (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    jerseyNumber INT NOT NULL,
    team VARCHAR(50) NOT NULL,
    role VARCHAR(50) NOT NULL
);
