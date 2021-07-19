import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class MessagesTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(output));
    }

    @Test
    void testLocalLanguages() {
        //Given
        Locale expectedLocal = new Locale("en", "US");
        Messages messages = Mockito.mock(Messages.class);
        //When
        when(messages.localLanguages()).thenReturn(expectedLocal);
        Locale actualLocal = messages.localLanguages();
        //Then
        assertEquals(expectedLocal.getCountry(), actualLocal.getCountry());
        assertEquals(expectedLocal.getLanguage(), actualLocal.getLanguage());
    }

    @Test
    void testPrintHelloInMorning() {
        //Given
        Messages messages = new Messages();
        int morning = 7;
        //When
        messages.printHello(morning);
        //Then
        assertEquals("Доброе утро!", output.toString());
    }

    @Test
    void testPrintHelloInDay() {
        //Given
        Messages messages = new Messages();
        int day = 17;
        //When
        messages.printHello(day);
        //Then
        assertEquals("Добрый день!", output.toString());
    }

    @Test
    void testPrintHelloInEvening() {
        //Given
        Messages messages = new Messages();
        int evening = 21;
        //When
        messages.printHello(evening);
        //Then
        assertEquals("Добрый вечер!", output.toString());
    }

    @Test
    void testPrintHelloInNight() {
        //Given
        Messages messages = new Messages();
        int night = 4;
        //When
        messages.printHello(night);
        //Then
        assertEquals("Доброй ночи!", output.toString());
    }
}