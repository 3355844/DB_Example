package utils;

public class Queries {



   public static final String CREATE_PRODUCT_TABLE = "CREATE TABLE mydb.products (\n" +
            "  ID INT NOT NULL AUTO_INCREMENT,\n" +
            "  NAME VARCHAR(45) NULL,\n" +
            "  PRIMARY KEY (ID));";

   public static final String DROP_PRODUCT_TABLE = "DROP TABLE mydb.products";



}
