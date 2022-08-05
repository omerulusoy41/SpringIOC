package XmlAnnotJBaseConfExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configures {
	
	@Bean
	public MySqlDatabase getMySqlDatabase() {
		return new MySqlDatabase();
	}
	@Bean
	public OracleDatabase getOracleDatabase() {
		return new OracleDatabase();
	}
	@Bean
	public DatabaseManager getDatabaseManager () {
		return new DatabaseManager(getMySqlDatabase());
	}
}
