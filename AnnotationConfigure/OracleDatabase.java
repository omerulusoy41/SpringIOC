package AnnotationConfigure;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OracleDatabase implements Database {

	@Override
	public void yaz() {
		System.out.println("Oracle Veri tabanina yazildi.");
	}

}
