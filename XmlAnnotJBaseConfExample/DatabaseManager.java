package XmlAnnotJBaseConfExample;

public class DatabaseManager {
	private Database dat;
	
	public DatabaseManager(Database dat) {
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
