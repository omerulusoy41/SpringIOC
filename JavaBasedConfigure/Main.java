package JavaBasedConfigure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan(basePackages = "JavaBasedConfigure")
@Import(JavaBasedConfigure.Configure.class)
public class Main {

	public static void main(String[] args) {
		//olusum1();
		//olusum2();
		//olusum3();
		olusum4();
	}
	public static void olusum1() {
		//context e configure classini register edip refresh ederek beanlerin olusumu saglandi 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(Configure.class);
		context.refresh();
		Class1 c1= context.getBean("class1",Class1.class);
		System.out.println(c1);
	}
	public static void olusum2() {
		// Xml dosyasinda verilen component-scan ile package altindaki configure dosyasini taradi.
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/ucuncu.xml");
		Class2 c2=context.getBean(Class2.class);//isim verilmeden de cagrilabilir.
		System.out.println(c2);
	}
	public static void olusum3() {
		//AnnotationConfige direkt configure classi inject edilerek olusturuldu
		ApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
		Class1 c1=context.getBean(Class1.class);
		System.out.println(c1);
	}
	public static void olusum4() {
		//Bu classda @ComponentScan anotasyonu ile taranacak classi belirterek olusturuldu
		ApplicationContext context=new AnnotationConfigApplicationContext(Main.class);
		Class1 c1=context.getBean(Class1.class);
		System.out.println(c1);
	}

}
