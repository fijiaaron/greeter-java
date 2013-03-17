package oneshore.greeter;

public enum Locales {
	US ("en-US"),
	AU ("en-AU"),
	ES ("es");
	
	String name;
	
	Locales(String name) {
		this.name = name;
	}
	
	public boolean equals(String name) {
		return (name == null) ? false : name.equals(this.name); 
	}
	
	public String toString() {
		return name;
	}
}