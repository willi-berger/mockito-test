package at.wberger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import at.wberger.service.IMyService;
import at.wberger.service.impl.MyServiceImpl;

/**
 * Hello world!
 * 
 */
@Configuration
@ComponentScan
public class App {
	
	@Bean
	IMyService myService() {
		return new MyServiceImpl();
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ApplicationContext context = 
		          new AnnotationConfigApplicationContext(App.class);

		ServiceClient client = new ServiceClient(new MyServiceImpl());
		System.out.println(client.useService(1, 2));
		
		AutoWiredServiceClient autoWiredServiceClient = context.getBean(AutoWiredServiceClient.class);
		System.out.println(autoWiredServiceClient.useMyService(2,3));
		
	}
}
