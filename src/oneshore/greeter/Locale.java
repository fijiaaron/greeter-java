package oneshore.greeter;

public enum Locale {
	US ("en-US"),
	AU ("en-AU"),
	ES ("es");
	
	String name;
	
	Locale(String name) {
		this.name = name;
	}
	
	public boolean equals(String name) {
		return (name == null) ? false : name.equals(this.name); 
	}
	
	public String toString() {
		return name;
	}
}