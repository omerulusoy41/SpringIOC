package JavaBasedConfigure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		olusum1();
	}
	public static void olusum1() {
		//context e configure classini register edip refresh ederek beanlerin olusumu saglandi 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(Configure.class);
		context.refresh();
		Class1 c1= context.getBean("class1",Class1.class);
		System.out.println(c1);
	}

}
