package deneme;

public class vehicle {
	public String name;
	public String model;
	public vehicle() {
		System.out.println("Suan Constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public static void create() {
		System.out.println("Suan Static");
		new vehicle();
	}
}
