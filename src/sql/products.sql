CREATE TABLE products (
  ID INT NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(45) NULL,
  ID_MARKET INT,
  FOREIGN KEY (ID_MARKET),
  PRIMARY KEY (ID));

ALTER TABLE mydb.products ADD ID_MARKET varchar(255);

INSERT INTO mydb.products (NAME) values ('name');

SELECT * FROM mydb.products where ID = 1;