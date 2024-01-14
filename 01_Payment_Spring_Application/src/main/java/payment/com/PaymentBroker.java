package payment.com;

public class PaymentBroker {
	
 private IPayment iPayment;
 
 
 public void setiPayment(IPayment iPayment) {
	this.iPayment = iPayment;
 }
 		public PaymentBroker() {
 		}
 			public PaymentBroker(IPayment iPayment) {
 			this.iPayment= iPayment;
 			}
 			
 		public void collectPayment(double amount) {
			String status = iPayment.pay(amount);
			System.out.println(status);
		}

}
