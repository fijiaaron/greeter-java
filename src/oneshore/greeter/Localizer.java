package oneshore.greeter;

import java.util.Arrays;

public class Localizer {

	Locales locale;
	Locales default_locale = Locales.US;
	Locales[] supported_locales = { Locales.US, Locales.AU, Locales.ES };
	
	
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
	public Localizer(Locales locale) {		
		if (! isSupported(locale)) {
			locale = default_locale;
		}
	}
	
	/**
	 * 
	 * @param locale
	 */
	public Localizer(String localeName) {
		Locales locale = Locales.valueOf(localeName);
		
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
	
	public Dictionary getDictionary(Locales locale) throws Exception {
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
	 * @param locales
	 * @return
	 */
	public boolean isSupported(Locales locales) {
		return Arrays.asList(supported_locales).contains(locales);
	}
}
