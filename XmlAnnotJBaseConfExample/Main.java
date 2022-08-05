package XmlAnnotJBaseConfExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses =Configures.class)
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Main.class);
		DatabaseManager manager=context.getBean(DatabaseManager.class);
		manager.connection();
		manager.info();
	}

}
