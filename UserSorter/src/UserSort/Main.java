package UserSort;

import UserSort.Model.*;
import UserSort.Utils.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static UserSort.Utils.PersonAgeSorter.sortByAge;
import static UserSort.Utils.PersonDifferentNationalitiesCounter.nationalitiesCount;
import static UserSort.Utils.PersonGroupByID.groupByID;
import static UserSort.Utils.PersonListGenerator.getPersonList;
import static UserSort.Utils.PersonStrangeFilter.strangeFilter;


public class Main {
    public static void main(String[] args) {
        List<Person> Persons = getPersonList();

        sortByAge(Persons);

        System.out.println("");

        Map<Long, List<Person>> map1 = groupByID(Persons);

        strangeFilter(Persons);

        long differentNationalitiesCount = nationalitiesCount(Persons);

        System.out.println("");
        System.out.println("Кол-во разных национальностей " + differentNationalitiesCount);
    }
}