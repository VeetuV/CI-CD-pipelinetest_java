package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaskinTest {
    @Test
    void Laskintest() {
        assertAll(
                () -> assertEquals(5, Laskin.laskin(3, 2)),
                () -> assertEquals(2, Laskin.laskin(0, 2)),
                () -> assertEquals(0, Laskin.laskin(-2, 2)));
    }
}