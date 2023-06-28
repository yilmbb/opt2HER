import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MCDC {

    // alles in 1 methode gezet om code smells te verminderen
    @Test
    public void testAlleBonussenTest() {
        Werknemer werknemer = new Zzper("berkay", 10.0, 40, false, 6, true, false);
        assertFalse(werknemer.getAlleBonussen());

        Werknemer werknemer1 = new Zzper("moray", 10.0, 40, true, 4, true, false);
        assertFalse(werknemer1.getAlleBonussen());

        Werknemer werknemer2 = new Zzper("steven", 10.0, 40, true, 6, false, false);
        assertFalse(werknemer2.getAlleBonussen());

        Werknemer werknemer3 = new Zzper("chiara", 10.0, 40, true, 6, true, false);
        assertTrue(werknemer3.getAlleBonussen());
    }
}

