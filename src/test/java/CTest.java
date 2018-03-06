import org.junit.Test;

import static org.junit.Assert.*;

public class CTest {

    @Test
    public void testC1() {
        assertNotNull (new C());
    }

    @Test
    public void testC2() {
        assertEquals (3, (new C()).a);
    }

}