package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person, LocalTime currentTime) {
        if (currentTime.isBefore(person.getTicket().entryTime())) {
            throw new IllegalArgumentException("Can't get in!");
        }
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }
}