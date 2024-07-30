public class PayPalAdaptar implements PaymentProcessor
{
    private PayPal pp;
    public PayPalAdaptar(PayPal p)
    {
        this.pp=p;
    }
    public void processPayment(double amt)
    {
        pp.p1(amt);
    }
}