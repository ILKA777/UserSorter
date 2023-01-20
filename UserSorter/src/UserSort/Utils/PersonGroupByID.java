package UserSort.Utils;

import UserSort.Model.Person;

import UserSort.Model.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonGroupByID {
    public static Map<Long, List<Person>> groupByID(List<Person> p) {
        Map<Long, List<Person>> map1 = p.stream()
                .collect(Collectors.groupingBy(Person::getID));
        return map1;
    }
}
