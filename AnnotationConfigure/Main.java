package AnnotationConfigure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/ikinci.xml");
		DatabaseManager manager=context.getBean("Manager",DatabaseManager.class);
		manager.yaz();
	}

}
