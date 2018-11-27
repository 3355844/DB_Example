package utils;

import model.Market;
import model.Product;

public class Queries {

    public static final String ADD_COLUMN_ID_MARKET = "ALTER TABLE mydb.products ADD ID_MARKET varchar(255);";

    public static String CREATE_MARKET(Market market){
        String query = "INSERT INTO mydb.markets (MARKET_NAME) values ('" + market.getNameMarket() + "');";
        return query;
    }


    public static String CREATE_PRODUCT(Product product) {
        String query = "INSERT INTO mydb.products (NAME) values ('" + product.getName() + "');";
        return query;
    }

    public static final String CREATE_PRODUCT_TABLE = "CREATE TABLE mydb.products (\n" +
            "  ID INT NOT NULL AUTO_INCREMENT,\n" +
            "  NAME VARCHAR(45) NULL,\n" +
            "  PRIMARY KEY (ID));";

    public static final String CREATE_MARKET_TABLE = "CREATE TABLE mydb.markets (\n" +
            " ID INT NOT NULL AUTO_INCREMENT,\n" +
            " MARKET_NAME VARCHAR (255),\n" +
            " PRIMARY KEY (ID)\n" +
            ");";

//    public static final String DROP_PRODUCT_TABLE = "DROP TABLE mydb.products";


}
