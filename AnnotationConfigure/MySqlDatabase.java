package AnnotationConfigure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySql")
public class MySqlDatabase implements Database {
	
	@Override
	public void yaz() {
		System.out.println("MySql vetitabanina yazildi.");
	}
	
}
