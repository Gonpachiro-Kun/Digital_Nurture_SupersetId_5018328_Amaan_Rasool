public class WebApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Web App: Stock " + stockName + " updated to $" + stockPrice);
    }
}
