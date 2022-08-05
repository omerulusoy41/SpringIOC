package XmlAnnotJBaseConfExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("oracle")
@Qualifier("oracle")
public class OracleDatabase extends  AbsDatabase{

	@Override
	public void connect() {
		System.out.println("Oracle database servise baglandi");
	}

	@Override
	public void liste() {
		System.out.println("Veriler listelendi");
	}


}
