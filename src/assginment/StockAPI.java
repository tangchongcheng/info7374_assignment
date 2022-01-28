package assginment;

import java.util.List;

public class StockAPI {
    String id;
    String name;
    String description;
    double price;
    int metric;
    List<Double> bids;

    public StockAPI(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this. description = description;
    }

    @Override
    public String toString(){
        String output = "";
        for(Double bid:bids){
            output += "Bid: " + bid + " ";
        }
        output += "\n metric: "+metric;
        return output;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMetric(int metric) {
        this.metric = metric;
    }

    public List<Double> getBids() {
        return bids;
    }
}
