package dao;

import model.*;
import utils.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Dao {

    public static ArrayList<Market> getMarketList() {
        ArrayList<Market> markets = new ArrayList<>();
        try {
            Statement statement = Connector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(Queries.GET_MARKETS);
            while (rs.next()) {
                markets.add(new Market(rs.getInt("ID"), rs.getString("MARKET_NAME")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return markets;
    }

    public static Market getMarketByID(int id) {
        Market market = new Market();
        try {
            PreparedStatement ps = Connector.getConnection().prepareStatement(Queries.GET_MARKET_BY_ID_PARAM);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                market.setId(resultSet.getInt("ID"));
                market.setNameMarket(resultSet.getString("MARKET_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return market;
    }

    public static ArrayList<Product> getProductList() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Statement statement = Connector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(Queries.GET_PRODUCTS);
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt("ID"),
                        rs.getString("NAME"),
                        rs.getInt("ID_MARKET")));
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

        try {
            Statement statement = Connector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(Queries.GET_PRODUCTS_BY_ID(id));
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

    public static void execute(String query) {

        try {
            Statement statement = Connector.getConnection().createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
    }
}
