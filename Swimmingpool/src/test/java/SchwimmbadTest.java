import org.junit.Test;

import static org.junit.Assert.*;
public class SchwimmbadTest {
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSchwimmbad(){
        Schwimmbad schwimmbad = new Schwimmbad(5);
        assertEquals(true, schwimmbad.betreten(1));
    }
}
