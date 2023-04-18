import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoondienstTest {

    @Test
    public void testMaandSalaris(){
        Loondienst loondienst1 = new Loondienst("Tom", 12, 2);
        Loondienst loondienst2 = new Loondienst("Lodewijk", 16, 6);

        assertEquals(29.04, loondienst1.maandSalaris());
        assertEquals(116.16, loondienst2.maandSalaris());
    }

    @Test
    public void testGetBtwVerrekend(){
        Loondienst loondienst1 = new Loondienst("Arend", 12, 2);
        Loondienst loondienst2 = new Loondienst("Leguaan", 16, 6);

        assertEquals(5.04, loondienst1.getBtwVerrekend());
        assertEquals(20.16, loondienst2.getBtwVerrekend());
    }



}