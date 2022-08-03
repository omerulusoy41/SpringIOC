package deneme;

public class Injection {
	public Car car1;
	public Car car2;
	public int sayi;
	public Injection(Car car) {
		this.car1=car;
		System.out.println("Consturcor ve ref ile inject edildim :) "+car1.model);
	}
	public void setCar(Car car) {
		this.car2=car;
		System.out.println("setter ve ref ile inject edildim :) "+car2.model);
	}
	public void setSayi(int sayi) {
		this.sayi=sayi;
		System.out.println("setter ve Value ile inject edildim :) "+sayi);
	}
}
