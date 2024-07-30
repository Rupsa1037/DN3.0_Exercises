public class test 
{
    public static void main(String[] args) 
    {
        StockMarket obj = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        obj.register(mobileApp);
        obj.register(webApp);
        obj.setStockPrice(100.0);
        obj.setStockPrice(105.5);
        obj.deregister(webApp);
        obj.setStockPrice(110.0);
    }
}
