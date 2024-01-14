package moter.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoterMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		//System.out.println(context);
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car.hashCode());
		
		
		Car car2 = context.getBean("car", Car.class);
		System.out.println(car2.hashCode());
		
	}

}
