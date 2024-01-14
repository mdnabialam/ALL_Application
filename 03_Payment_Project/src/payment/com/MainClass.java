package payment.com;

public class MainClass {
	public static void main(String[] args) {
		PaymentBroker  broker= new PaymentBroker();
		broker.setiPayment(new UPIPayment());
		broker.collectPayment(3200.00);
		
		
		PaymentBroker broker2= new PaymentBroker(new DebitCard());
		
		broker2.collectPayment(3300.00);
	}

}
