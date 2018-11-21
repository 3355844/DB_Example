CREATE TABLE products (
  ID INT NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(45) NULL,
  PRIMARY KEY (ID));


INSERT INTO mydb.products (NAME) values ('name');

SELECT * FROM mydb.products where ID = 1;