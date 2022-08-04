package AnnotationConfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Manager")
public class DatabaseManager {
	
//@Autowired
	private Database dat;
	
	public DatabaseManager() {
		System.out.println("Default Contructor");
	}
	
//@Autowired
//	public DatabaseManager(Database dat) {
//		System.out.println("Consturctor by Parameters");
//		this.dat=dat;
//	}
	
	@Autowired
	public void setDat(Database dat) {
		System.out.println("Setter injection");
		this.dat=dat;
	}
	public void yaz() {
		this.dat.yaz();
	}
}
