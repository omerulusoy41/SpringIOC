package AnnotationConfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Manager")
public class DatabaseManager {
	
//@Autowired
	private Database mySqlDatabase;
	
	public DatabaseManager() {
		System.out.println("Default Contructor");
	}
	
//@Autowired
//	public DatabaseManager(Database dat) {
//		System.out.println("Consturctor by Parameters");
//		this.dat=dat;
//	}
	
	@Autowired
	public void setDat(Database mySqlDatabase) {
		System.out.println("Setter injection");
		this.mySqlDatabase=mySqlDatabase;
	}
	public void yaz() {
		this.mySqlDatabase.yaz();
	}
}
