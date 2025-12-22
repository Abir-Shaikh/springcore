package Service.GrandPay;

public class CreditCardPaymentService implements PaymentService{
    @Override
    public String pay(int amount) {
        return "Paid ₹" + amount + " using Credit Card";
    }
}
