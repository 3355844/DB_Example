package dao;

import model.Product;
import utils.Connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {

    public static String createProductQuery(Product product) {
        String query = "INSERT INTO mydb.products (NAME) values ('" + product.getName() + "');";
        return query;
    }

    public static Product getProduct(int id) {
        String name;
        int idTmp;
        Product product = new Product();
        Statement statement;
        ResultSet resultSet;
        String query = "SELECT * FROM mydb.products where ID='" + id + "'";
        try {
            statement = Connector.getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next() && resultSet != null) {
                name = resultSet.getString("name");
                idTmp = resultSet.getInt("ID");
                product.setName(name);
                product.setId(idTmp);
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
        {
            try {
                statement = Connector.getConnection().createStatement();
                statement.execute(query);

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Connector.closeConnection();
            }
        }
    }
}
