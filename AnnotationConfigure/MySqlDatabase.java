package AnnotationConfigure;

import org.springframework.stereotype.Component;

@Component
public class MySqlDatabase implements Database {
	
	@Override
	public void yaz() {
		System.out.println("MySql vetitabanina yazildi.");
	}
	
}
