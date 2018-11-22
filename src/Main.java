import dao.Dao;
import model.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product = Dao.getProductByID(2);

        product.setName("Chicken2");

        Dao.updateProduct(product);

//        Dao.executeQuery(Dao.createProductQuery(product));

//        System.out.println(Dao.getProductByID(1).toString());

        for (Product productTmp : Dao.getProductList()) {
            System.out.println(productTmp.toString());
        }

// Table queries
//        Dao.executeQuery(Queries.CREATE_PRODUCT_TABLE);
//        Dao.executeQuery(Queries.DROP_PRODUCT_TABLE);
    }
}
