package model;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Market {
    private int id;
    private String nameMarket;
    public Map<String, ArrayList<Product>> services;

    public Market() {
    }

    public Market(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    public Market(int id, String nameMarket) {
        this.id = id;
        this.nameMarket = nameMarket;
    }

    @Override
    public String toString() {
        return "PointOfSale{" +
                "id=" + id +
                ", nameMarket='" + nameMarket + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Market market = (Market) o;
        return getId() == market.getId() &&
                Objects.equals(getNameMarket(), market.getNameMarket()) &&
                Objects.equals(services, market.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNameMarket(), services);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }
}
