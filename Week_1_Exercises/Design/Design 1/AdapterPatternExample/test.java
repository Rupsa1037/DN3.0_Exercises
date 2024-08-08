public class test
{
    public static void main(String args[])
    {
        PaymentProcessor paypal1=new PayPalAdaptar(new PayPal());
        paypal1.processPayment(1011.0);
        PaymentProcessor stripe1=new StripeAdaptar(new Stripe());
        stripe1.processPayment(37.0);
    }
}