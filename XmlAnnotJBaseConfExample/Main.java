package XmlAnnotJBaseConfExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resource/example.xml");
		DatabaseManager manager=context.getBean("manager",DatabaseManager.class);
		manager.connection();
		manager.info();
	}

}
