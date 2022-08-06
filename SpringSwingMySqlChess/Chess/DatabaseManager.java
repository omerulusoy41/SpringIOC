package Chess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("manager")
public class DatabaseManager {
	private Database dat;
	
	@Autowired
	public DatabaseManager(Database dat) {
		this.dat=dat;
		//dat.connection();
	}
	
	public boolean girisKontrol(String kIsmi,String sifre) {
		if(dat.list(kIsmi,sifre)) {
			return true;
		}
		return false;
	}
	public boolean insert(String kIsmi,String sifre) {
		if(girisKontrol(kIsmi, sifre)) {
			if(dat.insert(kIsmi,sifre))
				return true;
			else return false;
		}else {
			
			return false;
		}
		
	}
}
