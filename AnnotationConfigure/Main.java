package AnnotationConfigure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("resource/ikinci.xml");
//		DatabaseManager manager=context.getBean("Manager",DatabaseManager.class);
//		manager.yaz();
		spelExample();
		
     }
	public static void spelExample() {
		ExpressionParser parser=new SpelExpressionParser();
		
		Expression exp=parser.parseExpression("10==10");
		boolean c=(Boolean)exp.getValue();
		System.out.println(c);
		
		exp=parser.parseExpression("new String('HELLO World').toUpperCase()");
		String name=(String)exp.getValue();
		System.out.println(name);

		exp=parser.parseExpression("T(java.lang.Math).random()*100");
		double sayi=(Double)exp.getValue();
		System.out.println(sayi);
		
		exp=parser.parseExpression("#{ systemProperties['user.name'] }");
		String userName=(String)exp.getValue();
		System.out.println(userName);
	}

}
