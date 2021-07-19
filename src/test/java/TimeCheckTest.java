import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class TimeCheckTest {

    @Test
    void testLocalTime() {
        //Given
        int expected = 9;
        TimeCheck timeCheck = Mockito.mock(TimeCheck.class);
        //When
        when(timeCheck.getLocalTime()).thenReturn(expected);
        int actual = timeCheck.getLocalTime();
        //Then
        assertEquals(expected, actual);
    }
}