import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(TimeCheck.class.getName());

    public static void main(String[] args) {
        // я не стала выносить эту логику в отдельный метод и класс так как программа не подразумевает расширений
        logger.info("start of the program");
        Messages printMessage = new Messages();
        printMessage.printHello(new TimeCheck().getLocalTime());

    }
}
