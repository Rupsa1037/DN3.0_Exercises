public class FinancialForecasting
 {
    public static double calcFutureValue(double currValue, double growthRate, int periods) {
        if (periods == 0) {
            return currValue;
        }
        return calcFutureValue(currValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double currentValue = 2500; 
        double growthRate = 0.015;    
        int periods = 5;           

        double futureValue = calcFutureValue(currentValue, growthRate, periods);

        System.out.println("Future Value after " + periods + " periods: " + Math.round(futureValue));
    }
}
