import dao.Dao;
import model.Product;

public class Main {
    public static void main(String[] args) {

//        Product product = new Product("Meat");

//        Dao.executeQuery(Dao.createProductQuery(product));

        System.out.println(Dao.getProduct(1).toString());



// Table queries
//        Dao.executeQuery(Queries.CREATE_PRODUCT_TABLE);
//        Dao.executeQuery(Queries.DROP_PRODUCT_TABLE);
    }
}
