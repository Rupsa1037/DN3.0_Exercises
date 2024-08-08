public class MobileApp implements Observer
{
    public void update(double amount)
    {
         System.out.println("Mobile App: Received update for stock market= "+amount);
    }
}