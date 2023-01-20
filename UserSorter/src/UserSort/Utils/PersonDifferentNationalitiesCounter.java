package UserSort.Utils;

import UserSort.Model.Person;

import java.util.Comparator;
import java.util.List;

public class PersonDifferentNationalitiesCounter {
    public static long nationalitiesCount(List<Person> p) {
        long differentNationalitiesCount = p.stream()
                .map(Person::getNationality)
                .distinct()
                .count();
        return differentNationalitiesCount;
    }
}
