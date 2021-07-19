import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Messages {
    private static final Logger logger = Logger.getLogger(TimeCheck.class.getName());

    public Locale localLanguages() {
        logger.info("region and language check");
        return Locale.getDefault();
    }

    public void printHello(int time) {
        ResourceBundle bundle = ResourceBundle.getBundle("Message", localLanguages());
        if (time >= 6 && time < 9) {
            System.out.print(bundle.getString("message.morning"));
            logger.info("print message, morning time");
        } else if (time >= 9 && time < 19) {
            System.out.print(bundle.getString("message.day"));
            logger.info("print message, daytime");
        } else if (time >= 19 && time < 23) {
            System.out.print(bundle.getString("message.evening"));
            logger.info("print message, evening time");
        } else {
            System.out.print(bundle.getString("message.night"));
            logger.info("print message, night time");
        }
    }
}
