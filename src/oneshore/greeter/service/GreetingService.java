package oneshore.greeter.service;

import oneshore.greeter.*;

public class GreetingService {

	public Greeting greet(Person person, Locale locale) {
		Greeter greeter = new Greeter(locale);
		Greeting greeting = greeter.greet(person, locale);
		return greeting;
	}
}
