package UserSort.Utils;

import UserSort.Model.Person;

import java.util.Comparator;
import java.util.List;

public class PersonStrangeFilter {
    public static void strangeFilter(List<Person> persons) {
        persons.stream()
                .filter(p->p.getAge() > 10 && !p.getFirstName().startsWith("M"))
                .forEach(s->System.out.println(s));
    }

}
