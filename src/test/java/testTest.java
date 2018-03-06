import org.junit.Test;

import static org.junit.Assert.*;

public class testTest {

    @Test
    public void testAdd1() {
        assertEquals (9, (new C()).add(6) );
    }
    @Test
    public void testAdd2() {
        assertEquals (-2, (new C()).add(-5) );
    }
    @Test
    public void testAdd3() {
        assertEquals (3, (new C()).add(0) );
    }
    @Test
    public void testAdd4() {
        assertEquals (9, (new C()).times(3));
    }


}