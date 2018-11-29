import dao.Dao;
import model.Market;
import model.Product;
import utils.Queries;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Market market = Dao.getMarketByID(1);
//        Product product = Dao.getProductByID(2);
//        product.setMarketId(market.getId());

//        Dao.updateProduct(product);
        System.out.println(market.getNameMarket());
        market.setNameMarket("FORA");
        Dao.executeQuery(Queries.UPDATE_MARKET(market));
        System.out.println(Dao.getMarketByID(market.getId()).toString());

//        Dao.executeQuery(Queries.CREATE_MARKET(market));

//        Product product = Dao.getProductByID(2);
//
//        product.setName("Chicken2");
//
//        Dao.updateProduct(product);
//
//        Dao.executeQuery(Dao.CREATE_PRODUCT(product));

//        System.out.println(Dao.getProductByID(1).toString());
//        Dao.executeQuery(Queries.ADD_COLUMN_ID_MARKET); // add column id Market

//        for (Product productTmp : Dao.getProductList()) {
//            System.out.println(productTmp.toString());
//        }

// Table queries
//        Dao.executeQuery(Queries.CREATE_PRODUCT_TABLE);
//        Dao.executeQuery(Queries.CREATE_MARKET_TABLE);
//        Dao.executeQuery(Queries.DROP_PRODUCT_TABLE);
    }
}
