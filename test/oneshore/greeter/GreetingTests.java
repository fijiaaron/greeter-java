package oneshore.greeter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GreetingTests {
  @Test
  public void testGreetingByName() {
	  Locales locale = Locales.US;
	  Greeter greeter = new Greeter(locale);
	  Person person = new Person("John Smith");
	  Greeting greeting = greeter.greet(person);  
	 
	  System.out.println("greeting: " + greeting);
	  Assert.assertEquals(greeting.toString(), "Hello, John Smith!");
  }
  
  @Test
  public void testGreetingGroup() {
	  Locales locale = Locales.US;
	  Greeter greeter = new Greeter(locale);
	  Greeting greeting = greeter.greet();  
	 
	  System.out.println("greeting: " + greeting);
	  Assert.assertEquals(greeting.toString(), "Hello, World!");
  }
  
  @Test
  public void testGreetingAustralia() {
	  Locales locale = Locales.AU;
	  Greeter greeter = new Greeter(locale);
	  Greeting greeting = greeter.greet(new Person());  
	 
	  System.out.println("greeting: " + greeting);
	  Assert.assertEquals(greeting.toString(), "G'day, Mate!");
  }
}
