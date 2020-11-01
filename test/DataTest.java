import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void randomName() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(2);
        assertEquals("Jazz", a.randomName());
    }
}