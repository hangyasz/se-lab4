package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_trove() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1, 1.0);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            // Act
            store.fire(0);
        });
        // Assert
        assertEquals("numberOfTorpedos", exception.getMessage());
    }
}
