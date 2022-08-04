package AnnotationConfigure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Oracle")
@Scope("prototype") //ile singleton ozellig kalkar
public class OracleDatabase implements Database {

	@Override
	public void yaz() {
		System.out.println("Oracle Veri tabanina yazildi.");
	}

}
