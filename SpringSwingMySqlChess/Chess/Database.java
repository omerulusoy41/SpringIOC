package Chess;
import java.sql.Connection;

public interface Database {
	public Connection connection();
	public boolean list(String kIsmi,String sifre);
	public boolean insert(String kIsmi,String sifre);

}
