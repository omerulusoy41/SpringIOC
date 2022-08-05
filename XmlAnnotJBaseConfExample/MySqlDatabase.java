package XmlAnnotJBaseConfExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("MySql")
@Primary
public class MySqlDatabase extends AbsDatabase{
	@Override
	public void connect() {
		System.out.println("MySql database servise baglandi");
		
	}

	@Override
	public void liste() {
		System.out.println("Veriler listelendi");
	}

}
