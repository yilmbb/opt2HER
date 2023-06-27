import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerknemerTestEquiv {

    @Test
    void equivTest() {
        Werknemer werknemer = new Zzper("Berkay", 2.0, 2, true, 0, true);
        String expected = "je krijgt geen verhoging";
        String result = werknemer.checkUurloon(werknemer.getWerkervaring());
        assertEquals(expected, result);

        Werknemer werknemer1 = new Zzper("Moray", 2.0, 2, true, 6, true);
        String expected1 = "verhoging van 3 euro";
        String result1 = werknemer1.checkUurloon(werknemer1.getWerkervaring());
        assertEquals(expected1, result1);

        Werknemer werknemer2 = new Zzper("Steven", 2.0, 2, true, 11, true);
        String expected2 = "verhoging van 5 euro";
        String result2 = werknemer2.checkUurloon(werknemer2.getWerkervaring());
        assertEquals(expected2, result2);
    }
}
