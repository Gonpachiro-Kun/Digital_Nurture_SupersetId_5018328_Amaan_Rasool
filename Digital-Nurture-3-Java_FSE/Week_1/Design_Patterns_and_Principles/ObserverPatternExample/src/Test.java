public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("Lantern Corp", 250.0);
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);
        stockMarket.setStockPrice(150.0);
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(200.0);
    }
}