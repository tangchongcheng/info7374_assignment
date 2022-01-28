package assginment;

import java.util.ArrayList;

public class IBM extends StockAPI implements Tradable{

    int count;
    Double sum;

    public IBM(String id, String name, String description){
        super(id, name, description);
        metric = 0;
        price = 10.0;
        bids = new ArrayList<>();

        this.count = 0;
        this.sum = 0.0;
    }

    @Override
    public void setBid(double bid){
        bids.add(bid);
        count += 1;
        sum += bid;
        price = sum / count;
    }

    @Override
    public int getMetric(){
        metric = (int)(bids.get(bids.size()-1) - this.getPrice());
        return metric;
    }
}
