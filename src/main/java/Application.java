import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.osf.service.CustomerService;
import com.osf.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.findAll().get(0).toString());		
	}
}
