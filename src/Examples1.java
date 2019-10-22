import java.util.Date;


public class Examples1 {

	public int getLength(String str)
	{
		if (str == null)
			return str.length();
		
		return 0;
	}

	public int getLength2(String str)
	{
		return str.length();
	}
	

	public void complexMethod2(RequestObject request) {

	    String day = request.getWeekday();

	    if (day.equals("Tuesday")) {
	    	// processPayroll();
	    }
	}
	
	public void complexMethod(RequestObject request) {

	    String day = request.getWeekday();
	    Date date = request.getDate();

	    if (day.equals("Tuesday")) {
// NOSONAR
	    }

	
		if ((day != null && day.equals("Saturday")) || 
				(day != null && day.equals("Sunday")) || 
				isHoliday(date))
		{
			sleepLate();
		}

	}
	
	
	private void sleepLate()
	{}
	
	private boolean isHoliday(Date day)
	{
		return false;
	}
	private boolean isVacation(Date day) //NOSONAR
	{
		return false;
	}
	
}
