package day01;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {
    @Test
    void dateTestWithValidTime() {
        Person person = new Person(new Ticket("KISS",
                LocalDateTime.of(2021, 12, 22, 14, 0), 1000));

        Concert concert = new Concert();
        concert.addPerson(person, LocalTime.of(15, 1));
        assertEquals(1000, concert.getPersonList().get(0).getTicket().getPrice());
    }

    @Test
    void dateTestWithInvalidTime() {
        Person person1 = new Person(new FrontOfStageTicket("KISS",
                LocalDateTime.of(2021, 12, 22, 14, 0), 2000, "ABC123"));

        Concert concert = new Concert();
        assertThrows(IllegalArgumentException.class, () -> concert.addPerson(person1, LocalTime.of(10, 20)));
    }
}