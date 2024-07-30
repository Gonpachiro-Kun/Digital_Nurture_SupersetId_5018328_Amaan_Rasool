package FinancialForecastingss;

public class FinancialForecast {
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
       
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        FinancialForecast forecaster = new FinancialForecast();
        
        double presentValue = 2000;
        double growthRate = 0.24;
        int periods = 14;           
        
        double futureValue = forecaster.calculateFutureValue(presentValue, growthRate, periods);
        System.out.printf("The future value after %d periods is: %.2f\n", periods, futureValue);
    }
    
    
}


