public class StockMarket implements Stock {
    private static final int INITIAL_SIZE = 10;
    private Observer[] observers;
    private int observerCount;
    private String stockName;
    private double stockPrice;

    public StockMarket(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.observers = new Observer[INITIAL_SIZE];
        this.observerCount = 0;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    public String getStockName() {
        return stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observerCount >= observers.length) {
            resizeArray();
        }
        observers[observerCount++] = observer;
    }

    @Override
    public void deregisterObserver(Observer observer) {
        for (int i = 0; i < observerCount; i++) {
            if (observers[i].equals(observer)) {
                observers[i] = observers[observerCount - 1];
                observers[observerCount - 1] = null;
                observerCount--;
                return;
            }
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerCount; i++) {
            observers[i].update(stockName, stockPrice);
        }
    }

    private void resizeArray() {
        int newSize = observers.length * 2;
        Observer[] newArray = new Observer[newSize];
        System.arraycopy(observers, 0, newArray, 0, observers.length);
        observers = newArray;
    }
}
