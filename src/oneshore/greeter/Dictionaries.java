package oneshore.greeter;

import java.util.HashMap;

public class Dictionaries {

	public static Dictionary dictionary_US = new Dictionary() {{
		salutation = "hello";
		morning_salutation = "hello";
		farewell = "goodbye";
		epithet = "cruel";
		group = "world";
		individual = "individual";
	}};
	
	public static Dictionary dictionary_AU = new Dictionary() {{
		salutation = "g'day";
		morning_salutation = "g'day";
		farewell = "cheerio";
		epithet = "bloody";
		group = "world";
		individual = "mate";
	}};
	
	public static Dictionary dictionary_ES = new Dictionary() {{
		salutation = "hola";
		morning_salutation = "buenas dias";
		farewell = "adios";
		epithet = "cruel";
		group = "todo el mundo";
		individual = "amigo";
	}};
	
	public static HashMap<Locales,Dictionary> dictionary =  new HashMap<Locales, Dictionary>() {{
		put(Locales.US, dictionary_US);
		put(Locales.AU, dictionary_AU);
		put(Locales.ES, dictionary_ES);
	}};
}
