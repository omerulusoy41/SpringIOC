package XmlAnnotJBaseConfExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("manager")
public class DatabaseManager {
	private Database dat;
	
	@Autowired
	public DatabaseManager(@Qualifier("oracle")Database dat) {
		this.dat=dat;
	}
	public void connection() {
		dat.connect();
	}
	public void listele() {
		dat.liste();
	}
	public void info() {
		dat.info();
	}
}
