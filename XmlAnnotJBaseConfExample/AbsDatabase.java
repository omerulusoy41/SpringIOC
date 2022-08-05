package XmlAnnotJBaseConfExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:XmlAnnotJBaseConfExample/values.properties")
public abstract class AbsDatabase implements Database{
	
	@Value("${name}")
	public String name;
	@Value("${connectWord}")
	public String connectWord;
	@Value("${ports}")
	public String[] ports;
	
	@Override
	public void info() {
		System.out.println("name="+name);
		System.out.println("CoonectWord="+connectWord);
		System.out.print("ports:");
		for(String p:ports) {
			System.out.print(p+"-");
		}
	}
}
