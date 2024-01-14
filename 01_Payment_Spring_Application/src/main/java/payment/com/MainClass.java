package payment.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) throws Exception{
		 ApplicationContext applicationContext= 
				 new ClassPathXmlApplicationContext("BeanFile.xml");
		 PaymentBroker pb=applicationContext.getBean("payment",PaymentBroker.class);
		 pb.collectPayment(1400.00);
	}

}
