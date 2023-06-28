import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PairWise {

    @Test
    void testTweeEuroVerhoging() {
        Werknemer werknemer = new Zzper("meerminman", 0.0, 40, true, 4, false, false);
        assertEquals(2.0, werknemer.getUurloon());
    }

    @Test
    void testVijfEuroVerhoging() {
        Werknemer werknemer = new Zzper("meerminman", 0.0, 40, false, 4, true, true);
        assertEquals(5.0, werknemer.getUurloon());
    }

    @Test
    void testVierEuroVerhoging() {
        Werknemer werknemer = new Zzper("meerminman", 0.0, 40, false, 5, true, false);
        assertEquals(4.0, werknemer.getUurloon());
    }

    @Test
    void testNegenEuroVerhoging() {
        Werknemer werknemer = new Zzper("meerminman", 0.0, 40, true, 5, false, true);
        assertEquals(9.0, werknemer.getUurloon());
    }

    @Test
    void testVijfEuroVerhoging2() {
        Werknemer werknemer = new Zzper("meerminman", 0.0, 40, false, 10, false, false);
        assertEquals(5.0, werknemer.getUurloon());
    }

    @Test
    void testVijftienEuroVerhoging() {
        Werknemer werknemer = new Zzper("meerminman", 0.0, 40, true, 10, true, true);
        assertEquals(12.0, werknemer.getUurloon());
    }
}