package oneshore.greeter;

import java.util.Arrays;

public class Localizer {

	Locale locale;
	Locale default_locale = Locale.US;
	Locale[] supported_locales = { Locale.US, Locale.AU, Locale.ES };
	
	
	///////////////////////////////////
	// Constructors
	///////////////////////////////////
	
	/**
	 * 
	 */
	public Localizer() {
		locale = default_locale;
	}
	
	/**
	 * 
	 * @param locale
	 */
	public Localizer(Locale locale) {		
		if (! isSupported(locale)) {
			locale = default_locale;
		}
	}
	
	
	
	///////////////////////////////////
	// Getters and Setters
	///////////////////////////////////
	
	/**
	 * return the dictionary for the specified locale
	 * 
	 * @return
	 * @throws Exception
	 */
	public Dictionary getDictionary() throws Exception {
		return getDictionary(locale);
	}
	
	public Dictionary getDictionary(Locale locale) throws Exception {
		if (! isSupported(locale)) {
			throw new Exception("Locale is not supported: " + locale);
		}
		
		Dictionary dictionary = Dictionaries.dictionary.get(locale);
		return dictionary;
	}
	
	
	
	///////////////////////////////////
	// Helpers
	///////////////////////////////////
	
	/**
	 * Check to see if there is a dictionary supported for the given locale
	 * 
	 * @param locale
	 * @return
	 */
	public boolean isSupported(Locale locale) {
		return Arrays.asList(supported_locales).contains(locale);
	}
}
