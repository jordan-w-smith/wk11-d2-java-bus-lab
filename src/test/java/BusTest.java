import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before() {
        person = new Person();
        bus = new Bus("Waverley", 50);
    }

    @Test
    public void hasDestination() {
        assertEquals("Waverley", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, bus.getCapacity());
    }

    @Test
    public void isPassengerListEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }



}
