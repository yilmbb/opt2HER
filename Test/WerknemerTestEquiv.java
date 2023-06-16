import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerknemerTestEquiv {

    @Test
    void equivTest() {
        Werknemer werknemer = new Werknemer("Berkay", 2.0, 2, true, 0, true);
        String expected = "je krijgt geen verhoging";
        String result = werknemer.checkUurloon(4);
        assertEquals(expected, result);

        Werknemer werknemer1 = new Werknemer("Berkay", 2.0, 2, true, 0, true);
        String expected1 = "verhoging van 3 euro";
        String result1 = werknemer1.checkUurloon(6);
        assertEquals(expected1, result1);

        Werknemer werknemer2 = new Werknemer("Berkay", 2.0, 2, true, 0, true);
        String expected2 = "verhoging van 5 euro";
        String result2 = werknemer2.checkUurloon(10);
        assertEquals(expected2, result2);

    }
}
