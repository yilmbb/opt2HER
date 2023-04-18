import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZzperTest {

    @Test
    public void testMaandSalaris(){
        Zzper zzper1 = new Zzper("Gerard", 12, 2);
        Zzper zzper2 = new Zzper("Jacob", 16, 6);

        assertEquals(24.0, zzper1.maandSalaris());
        assertEquals(96.0, zzper2.maandSalaris());
    }

}
