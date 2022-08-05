package XmlAnnotJBaseConfExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("MySql")

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
