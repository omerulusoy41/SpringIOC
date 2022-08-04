package AnnotationConfigure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySql") //plpymorphism kafa karisikligini onler
@PropertySource("classpath:AnnotationConfigure/app.properties") //value injection yapilacak dosya yolu
public class MySqlDatabase implements Database {
	
	@Value("${ConnectionWord}") //Value injectionu yapar.
	private String conenctWord;
	
	@Override
	public void yaz() {
		System.out.println("MySql vetitabanina yazildi."+conenctWord);
	}
	
}
