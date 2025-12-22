package Service.GrandPay;

public class OrderService {
    PaymentService paymentService;

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String placeOrder(int amount){
        return paymentService.pay(amount);
    }
}
