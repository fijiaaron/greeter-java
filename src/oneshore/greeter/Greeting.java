package oneshore.greeter;

import java.util.List;

import org.apache.commons.lang3.text.WordUtils;

public class Greeting {
	String salutation;
	String name;
	List<String>modifiers;
	
	String default_name = "World";
	String default_person_name = "Individual";
		
	///////////////////////////////////
	// Getters and Setters
	///////////////////////////////////
	
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getModifiers() {
		return modifiers;
	}
	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}
	
	///////////////////////////////////
	// Private methods
	///////////////////////////////////
	
	private static String getMessage(Greeting greeting) {		
		StringBuilder message = new StringBuilder();
		String punctuation = "!";
		
		message.append(WordUtils.capitalize(greeting.salutation) + ", ");
		
		if (greeting.modifiers != null) {
			for(String modifier : greeting.modifiers) {
				message.append(modifier + " ");
			}	
		}
		
		message.append(WordUtils.capitalize(greeting.name));

		message.append(punctuation);
		
		return message.toString();
	}
	
	
	public String toString() {
		return Greeting.getMessage(this);
	}
	
}
