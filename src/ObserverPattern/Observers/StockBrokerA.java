package ObserverPattern.Observers;

import ObserverPattern.Interfaces.StockBroker;
import ObserverPattern.Interfaces.StockExchange;


public class StockBrokerA implements StockBroker {

    private StockExchange stockExchange;

    public StockBrokerA(StockExchange stockExchange) {
        this.stockExchange = stockExchange;
        stockExchange.registerForNotification(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName() + " has been notified of update");
    }

    @Override
    public void buySharesFor(String company, int sharesQuantity){
        stockExchange.buyStocksFor(company, sharesQuantity);
    }
}
