CREATE TABLE mydb.addresses
(
  ID         BIGINT NOT NULL AUTO_INCREMENT,
  COUNTRY    VARCHAR(255),
  REGION     VARCHAR(255),
  CITY       VARCHAR(255),
  DISTRICT   VARCHAR(255),
  STREET     VARCHAR(255),
  HOUSE_NUMB VARCHAR(255),
  INDEX      VARCHAR(255),
  PRIMARY KEY (ID)
);