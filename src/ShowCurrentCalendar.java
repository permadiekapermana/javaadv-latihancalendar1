import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowCurrentCalendar{
    public static Calendar createCalendar() {        
		Calendar cal = new GregorianCalendar();
		return cal;		
	}

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
		System.out.println("Today is "+calendar.getTime());
    }
}