package deneme;

public class Car extends vehicle {
	    public String renk;
	    public String[] bilesenler;
		public Car() {
			System.out.println("i am singleton so you will see me once");
		}
		public String getRenk() {
			return renk;
		}
		public void setRenk(String renk) {
			this.renk = renk;
		}
		public void setBilesenler(String[] bilesenler) {
			this.bilesenler=bilesenler;
			System.out.println("Array injection="+bilesenler[0]+" "+bilesenler[1]);
		}
		
}
