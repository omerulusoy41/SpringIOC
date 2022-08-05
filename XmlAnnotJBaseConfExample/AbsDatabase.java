package XmlAnnotJBaseConfExample;

public abstract class AbsDatabase implements Database{
	public String name;
	public String connectWord;
	@Override
	public void info() {
		System.out.println("name="+name);
		System.out.println("CoonectWord="+connectWord);
	}
}
