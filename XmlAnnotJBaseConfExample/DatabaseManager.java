package XmlAnnotJBaseConfExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("manager")
public class DatabaseManager {
	private Database oracleDatabase;
	
	@Autowired
	public DatabaseManager(Database oracleDatabase) {
		this.oracleDatabase=oracleDatabase;
	}
	public void connection() {
		oracleDatabase.connect();
	}
	public void listele() {
		oracleDatabase.liste();
	}
	public void info() {
		oracleDatabase.info();
	}
}
