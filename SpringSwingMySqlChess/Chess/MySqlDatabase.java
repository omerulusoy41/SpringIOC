package Chess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class MySqlDatabase implements Database{
	@Value("${name}")
	private String name;
	@Value("${password}")
	private String password;
	@Value("${dbUrl}")
	private String dbUrl;
	private Connection connect;
	@Override
	public Connection connection() {
		if (connect == null)
			try {
				connect=DriverManager.getConnection(dbUrl,name, password);
				return connect;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public boolean list(String kIsmi,String sifre) {
//		try {
//			Statement state=connect.createStatement();
//			ResultSet result=state.executeQuery("Select * from oyuncu");
//			while(result.next()) {
//				String tmpK=result.getString("KullaniciAdi");
//				String tmpS=result.getString("sifre");
//				if(kIsmi.equals(tmpK) && sifre.equals(tmpS)) {
//					return true;
//				}
//			}
//			state.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(kIsmi.equals("omer")&& sifre.equals("1234"))
			return true;
		return false;
	}

	@Override
	public boolean insert(String kullaniciAdi,String sifre) {
		try {
			PreparedStatement state=connect.prepareStatement("insert into oyuncu(kullaniciAdi,sifre) values(\""+kullaniciAdi+"\",\""+sifre+"\" )");
			state.executeUpdate();
			state.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
	}
}
