package dao;

import model.Product;
import utils.Connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Dao {


    public static String createProductQuery(Product product) {
        String query = "INSERT INTO mydb.products (NAME) values ('" + product.getName() + "');";
        return query;
    }

    public static Product updateProduct(Product product) {

        String query = "UPDATE mydb.products SET NAME='" + product.getName() + "' WHERE ID='" + product.getId() + "'";

        try {
            Statement statement = Connector.getConnection().createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connector.closeConnection();
        }
        return getProductByID(product.getId());
    }

    public static ArrayList<Product> getProductList() {
        ArrayList<Product> products = new ArrayList<>();
        String query = "SELECT  * FROM mydb.products";
        try {
            Statement statement = Connector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                products.add(new Product(rs.getInt("ID"), rs.getString("NAME")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return products;
    }

    public static Product getProductByID(int id) {
        Product product = new Product();
        String query = "SELECT * FROM mydb.products where ID='" + id + "'";
        try {
            Statement statement = Connector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                product.setName(resultSet.getString("NAME"));
                product.setId(resultSet.getInt("ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return product;
    }

    public static void executeQuery(String query) {

        Statement statement;
        boolean result;
        {
            try {
                statement = Connector.getConnection().createStatement();
                result = statement.execute(query);
                System.out.println(query + ": " + result);

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Connector.closeConnection();
            }
        }
    }
}
