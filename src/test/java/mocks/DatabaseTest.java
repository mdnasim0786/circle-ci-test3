package mocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    Database database = new Database();

    @Test
    public void testIsAvailable() {
        boolean response = database.isAvailable();
        Assertions.assertFalse(response);
    }

    @Test
    public void testUniqueId() {
        int response = database.getUniqueId();
        Assertions.assertEquals(42, response);
    }
}
