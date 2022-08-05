package XmlAnnotJBaseConfExample;


public abstract class AbsDatabase implements Database{
	public String name;
	public String connectWord;
	public String[] ports;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConnectWord() {
		return connectWord;
	}

	public void setConnectWord(String connectWord) {
		this.connectWord = connectWord;
	}

	public String[] getPorts() {
		return ports;
	}

	public void setPorts(String[] ports) {
		this.ports = ports;
	}

	@Override
	public void info() {
		System.out.println("name="+name);
		System.out.println("CoonectWord="+connectWord);
		System.out.print("ports:");
		for(String p:ports) {
			System.out.print(p+"-");
		}
	}
}
