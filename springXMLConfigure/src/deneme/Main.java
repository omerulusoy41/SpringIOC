package deneme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context =new FileSystemXmlApplicationContext("file:E:\\springIntro\\src\\deneme\\ilk.xml");
		//appContextProporties(context);
		//parentChild(context);
		//factoryMethodOrnek(context);
		//injectionOrnek(context);
	}
	public static void injectionOrnek(ApplicationContext context) {
		context.getBean("car");//Array injection bilesen
		context.getBean("Inject");//Constructor,setter inject
	}
	public static void factoryMethodOrnek(ApplicationContext context) {
		context.getBean("vehicleFactoryOrnek");
		// ilk once static calistigini gor 
		//Design pattern
	}
	public static void parentChild(ApplicationContext context) {
		//child parentini belirtmezse degerler NULL gelir
		System.out.println("Suan Calistim.");
		Car car1=context.getBean("car",Car.class);
		System.out.println(car1.model);//Parent yoksa NULL
		System.out.println(car1.name);//Parent Yoksa NULL
		System.out.println(car1.renk);//Parent olmasa bile kendi attribute !NULL
		
	}
	public static void appContextProporties(ApplicationContext context) {
		Car car1=context.getBean("car",Car.class);
		Car car2=context.getBean("car",Car.class);
		System.out.print("Car1==Car2   => ");
		if(car1==car2) {
			System.out.println("Defaultda Singleton");
		}else{
			System.out.println("prototype");
		}
		System.out.println("XML contains id=\"Car\""+context.containsBean("car")); 
		String[] carAlliases=context.getAliases("car");
		System.out.println("Aliases:");
		for(String s:carAlliases) {
			System.out.print(s+',');
		}
		System.out.println("\napplicationName="+context.getDisplayName());
		System.out.println("is Id singleton ?"+context.isSingleton("car")); 
		
	}

}
