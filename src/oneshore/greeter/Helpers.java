package oneshore.greeter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Helpers {
	public static boolean isMorning() {
		Calendar cal=GregorianCalendar.getInstance();
	    int hour = cal.get(Calendar.HOUR);
	    
	    if (hour > 12) {
	    	return true;
	    }
	    
	    return false;
	}
	
	public static boolean isSame(Object a, Object b) {
		// not implemented yet
	
		//TODO: check name and IP address from request
		return false;
	}
}
