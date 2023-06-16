import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerknemerTestEquiv {

    @Test
    void equivTest()
    {
        Werknemer werknemer = new Werknemer("Berkay", 2.0, 2, true, 4, true);
        String expected = "je krijgt geen verhoging";
        String result = werknemer.checkUurloon(4);
        assertEquals(expected, result);
    }

    @Test
    void equivTest1()
    {
        Werknemer werknemer = new Werknemer("Berkay", 2.0, 2, true, 5, true);
        String expected = "verhoging van 3 euro";
        String result = werknemer.checkUurloon(4);
        assertEquals(expected, result);
    }

    @Test
    void equivTest2()
    {
        Werknemer werknemer = new Werknemer("Berkay", 2.0, 2, true, 10, true);
        String expected = "verhoging van 5 euro";
        String result = werknemer.checkUurloon(4);
        assertEquals(expected, result);
    }


}