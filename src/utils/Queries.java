package utils;

import model.Market;
import model.Product;

public class Queries {

    public static final String GET_PRODUCTS_BY_ID(int id) {
        return "SELECT * FROM mydb.products where ID='" + id + "'";
    }

    public static final String GET_PRODUCTS = "SELECT  * FROM mydb.products";

    public static final String  GET_MARKETS= "SELECT * FROM mydb.markets";

    public static final String GET_MARKET_BY_ID_PARAM = "SELECT * FROM mydb.markets where ID=?"; // method is parameterized

    public static final String DELETE_MARKET(int id) {
        return "DELETE FROM mydb.markets WHERE ID='" + id + "'";
    }

    public static final String UPDATE_PRODUCT(Product product) {
        return "UPDATE mydb.products SET " +
                "NAME='" + product.getName() + "' " +
                ", ID_MARKET='"+product.getMarketId()+"'" +
                "WHERE ID='" + product.getId() + "'";
    }

    public static final String UPDATE_MARKET(Market market) {
        return "UPDATE mydb.markets SET " +
                "MARKET_NAME='" + market.getNameMarket() + "'" +
                "WHERE ID='" + market.getId() + "';";
    }

    public static final String ADD_COLUMN_ID_MARKET = "ALTER TABLE mydb.products ADD ID_MARKET varchar(255);";

    public static final String CREATE_MARKET(Market market) {
        return "INSERT INTO mydb.markets (MARKET_NAME) values ('" + market.getNameMarket() + "');";
    }

    public static final String CREATE_PRODUCT(Product product) {
        return "INSERT INTO mydb.products (NAME) values ('" + product.getName() + "');";
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
