package Service.GrandPay;

public class UPIPaymentService implements PaymentService{
    @Override
    public String pay(int amount) {
        return "Paid ₹" + amount + " using UPI ";
    }
}
