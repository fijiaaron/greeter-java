package oneshore.greeter;

public class Greeter {

	Locale locale;
	Locale default_locale = Locale.US;
	
	
	
	///////////////////////////////////
	// Constructors
	///////////////////////////////////
	
	/**
	 * 
	 */
	public Greeter() {}
	
	/**
	 * 
	 * @param locale
	 */
	public Greeter(Locale locale) {		
		setLocale(locale);
	}
	
	/**
	 * 
	 * @param locale
	 */
	public Greeter(String localeName) {	
		Locale locale = Locale.valueOf(localeName);
		setLocale(locale);
	}
	
	
	
	///////////////////////////////////
	// Actions
	///////////////////////////////////
	
	/**
	 * 
	 * @return
	 */
	public Greeting greet() {
		return greet(null);
	}
	
	/**
	 * 
	 * @param person
	 * @return
	 */
	public Greeting greet(Person person) {
		if (locale == null) {			
			locale = default_locale;
		}
		
		return greet(person, locale);
	}
	
	/**
	 * 
	 * @param person
	 * @param locale
	 * @return
	 */
	public Greeting greet(Person person, Locale locale) {
		return greet(person, locale, false);
	}
	
	/**
	 * 
	 * @param person
	 * @param locale
	 * @param isSame
	 * @return
	 */
	public Greeting greet(Person person, Locale locale, boolean isSame) {
		Greeting greeting = new Greeting();

		try {
			Localizer localizer  = new Localizer(locale);
			Dictionary dictionary = localizer.getDictionary(locale);
			
			// set salutation
			greeting.setSalutation(dictionary.salutation);
			
			if (Helpers.isMorning()) {
				greeting.setSalutation(dictionary.morning_salutation);
			}
			
			if (isSame) {
				greeting.salutation = dictionary.farewell;
			}
			
			// set name
			if (person == null) {
				greeting.name = dictionary.group;
				
				// set modifiers
				if(isSame) {
					greeting.modifiers.add(dictionary.epithet);
				}
			} 
			else if (person.name == null) {
				greeting.name = dictionary.individual;
			} 
			else if (person.name.equals("")) {
				greeting.name = dictionary.individual;
			}
			else {
				greeting.name = person.name;
			}	
		} 
		catch (Exception e) {
			// TODO send error message
			e.printStackTrace();
		}
		
		return greeting;
	}
	
	
	
	///////////////////////////////////
	// Getters and Setters
	///////////////////////////////////
	
	/**
	 * 
	 * @param locale
	 */
	public void setLocale(Locale locale) {		
		this.locale = locale;
	}

	/**
	 * 
	 * @param person
	 * @param locale
	 * @return
	 */
	public Greeting greet(Person person, String locale) {
		return greet(person, Locale.valueOf(locale));
	}
}
