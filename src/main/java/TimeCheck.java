import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

public class TimeCheck {
    private static final Logger logger = Logger.getLogger(TimeCheck.class.getName());

    public int getLocalTime() {
        logger.info("checking the user's local time");
        return new GregorianCalendar().get(Calendar.HOUR_OF_DAY);
    }
}
