package XmlAnnotJBaseConfExample;

public class Main {

	public static void main(String[] args) {
		DatabaseManager manager=new DatabaseManager(new MySqlDatabase());
		manager.connection();
	}

}
