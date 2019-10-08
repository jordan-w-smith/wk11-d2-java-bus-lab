import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Haymarket");
        person = new Person();
    }

    @Test
    public void busStopHasName() {
        assertEquals("Haymarket", busStop.getName());
    }

    @Test
    public void isQueueEmpty() {
        assertEquals(0, busStop.queueCount());
    }


}
