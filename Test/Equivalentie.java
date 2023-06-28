import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Equivalentie {

    @Test
    void equivTest() {
        Werknemer werknemer = new Zzper("Berkay", 2.0, 2, true, 4, true, false);
        String expected = "je krijgt geen verhoging";
        String result = werknemer.checkUurloon(werknemer.getWerkervaring());
        assertEquals(expected, result);

        Werknemer werknemer1 = new Zzper("Moray", 2.0, 2, true, 5, true, false);
        String expected1 = "verhoging van 3 euro";
        String result1 = werknemer1.checkUurloon(werknemer1.getWerkervaring());
        assertEquals(expected1, result1);

        Werknemer werknemer2 = new Zzper("Steven", 2.0, 2, true, 6, true, false);
        String expected2 = "verhoging van 3 euro";
        String result2 = werknemer2.checkUurloon(werknemer2.getWerkervaring());
        assertEquals(expected2, result2);

        Werknemer werknemer3 = new Zzper("Kees", 2.0, 2, true, 9, true, false);
        String expected3 = "verhoging van 3 euro";
        String result3 = werknemer3.checkUurloon(werknemer3.getWerkervaring());
        assertEquals(expected3, result3);

        Werknemer werknemer4 = new Zzper("Meerminman", 2.0, 2, true, 10, true, false);
        String expected4 = "verhoging van 5 euro";
        String result4 = werknemer4.checkUurloon(werknemer4.getWerkervaring());
        assertEquals(expected4, result4);

        Werknemer werknemer5 = new Zzper("Mosseljongen", 2.0, 2, true, 11, true, false);
        String expected5 = "verhoging van 5 euro";
        String result5 = werknemer5.checkUurloon(werknemer5.getWerkervaring());
        assertEquals(expected5, result5);
    }
}
