CREATE DATABASE FeeSlips_DB;
USE FeeSlips_DB;

CREATE TABLE FeeSlips(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	regNumber INT,
    firstName VARCHAR(20),
    lastName VARCHAR(20),
    feeMonth VARCHAR(10),
    currentDate VARCHAR(10)
);

INSERT INTO FeeSlips (regNumber, firstName, lastName, feeMonth, currentDate) VALUES (187330, "Shahzaib", "Waseem", "January", "17-11-2018")