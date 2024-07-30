public class AdapterPatternTest {
    public static void main(String[] args) {
        PayPalPayment paypalpayment = new PayPalPayment();
        StripePayment stripepayment = new StripePayment();
        PaymentProcessor paypaladapter = new PayPalAdapter(paypalpayment);
        PaymentProcessor stripeadapter = new StripeAdapter(stripepayment);
        
        System.out.println("Testing PayPal Adapter:");
        paypaladapter.processPayment(500.0);

        System.out.println("\nTesting Stripe Adapter:");
        stripeadapter.processPayment(20.0);
    }
}