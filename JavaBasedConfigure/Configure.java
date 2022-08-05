package JavaBasedConfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Configure {
	
	@Bean("class1")
	public Class1 getClass1() {
		return new Class1();
	}
	@Bean
	public Class2 getClass2() {
		return new Class2();
	}
}
