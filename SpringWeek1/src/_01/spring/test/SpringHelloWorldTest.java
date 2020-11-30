package _01.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _01.spring.model.Car;

public class SpringHelloWorldTest {

	public static void main(String[] args) {

		ApplicationContext appContext=new ClassPathXmlApplicationContext("01.applicationContext.xml");
	
		Car car=appContext.getBean("carId",Car.class);
		car.drive();
	}

}
