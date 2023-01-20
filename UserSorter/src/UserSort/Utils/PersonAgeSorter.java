package UserSort.Utils;

import UserSort.Model.*;
import java.util.Comparator;
import java.util.List;

public class PersonAgeSorter {
    public static void sortByAge(List<Person> p) {
        p.stream ()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(s->System.out.println(s));
    }
}
