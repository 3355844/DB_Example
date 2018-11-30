import dao.Dao;
import model.Market;
import model.Product;
import utils.Queries;

public class Main {
    public static void main(String[] args) {

        Market market = new Market("WellMart2");

        Dao.execute(Queries.CREATE_MARKET(market));

        for (Market market1 : Dao.getMarketList()) {
            System.out.println(market1.toString());
        }
    }
}
