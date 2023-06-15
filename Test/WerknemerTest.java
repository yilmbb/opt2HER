import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerknemerTest {

    @Test
    public void testAlleBonussenTrue() {
        Werknemer werknemer = new Werknemer("John Doe", 10.0, 40, false, 6, true);
        assertFalse(werknemer.getAlleBonussen());
    }

    @Test
    public void testAlleBonussenFalse1() {
        Werknemer werknemer = new Werknemer("Jane Smith", 10.0, 40, true, 4, true);
        assertFalse(werknemer.getAlleBonussen());
    }

    @Test
    public void testAlleBonussenFalse2() {
        Werknemer werknemer = new Werknemer("Mike Johnson", 10.0, 40, true, 6, false);
        assertFalse(werknemer.getAlleBonussen());
    }

    @Test
    public void testAlleBonussenFalse3() {
        Werknemer werknemer = new Werknemer("Emily Davis", 10.0, 40, true, 6, true);
        assertTrue(werknemer.getAlleBonussen());
    }
}