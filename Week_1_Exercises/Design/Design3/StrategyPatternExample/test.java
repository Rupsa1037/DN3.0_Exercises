public class test
 {
    public static void main(String[] args) 
    {
        PaymentContext context = new PaymentContext();
        PaymentStrategy creditCardPayment =new CreditCardPayment("Rupsa","9876-5432-1597-3547");
        context.setPaymentContext(creditCardPayment);
        context.makepayment(1000.0);
        PaymentStrategy payPalPayment=new PayPalPayment("rupsanandy2@gmail.com");
        context.setPaymentContext(payPalPayment);
        context.makepayment(1005.0);
    }
}
