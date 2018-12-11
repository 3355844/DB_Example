CREATE TABLE mydb.users
(
  ID BIGINT NOT NULL AUTO_INCREMENT,
  IS_BLOCK TINYINT,
  ID_ADDRESS BIGINT,
  PASSWORD VARCHAR(50),
  FIRST_NAME VARCHAR(50),
  LAST_NAME VARCHAR(50),
  EMAIL VARCHAR (50),
  PHONE VARCHAR (10),
  LOGIN VARCHAR (50),
  LAST_IP VARCHAR (50),
  REGISTER_DATE DATE ,
  LAST_LOGIN_DATE DATE,
  PRIMARY KEY (ID)
);