package AnnotationConfigure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Oracle")
public class OracleDatabase implements Database {

	@Override
	public void yaz() {
		System.out.println("Oracle Veri tabanina yazildi.");
	}

}
