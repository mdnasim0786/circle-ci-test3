package mocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;

public class ServiceTest {

    Database database = mock(Database.class);
    Service service = new Service(database);

//    @BeforeEach
//    void setup()
//    {
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    void testIsAvailableRanOneTime() {
        service.query("ok");
        Mockito.verify(database, Mockito.times(1)).isAvailable();
    }

    @Test
    void testGetUniqueId() {
        service.toString();
        Mockito.verify(database, Mockito.times(1)).getUniqueId();
    }
}
