CREATE TABLE mydb.roles
(
  ID         BIGINT NOT NULL AUTO_INCREMENT,
  IS_DEFAULT TINYINT,
  NAME       VARCHAR(50),
  PRIMARY KEY (ID)
);