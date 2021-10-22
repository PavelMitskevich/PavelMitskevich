import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {

    List<Person> people = new ArrayList<>();

    public void addPersonsToRegistry(Person person) {
        people.add(person);
    }

}
