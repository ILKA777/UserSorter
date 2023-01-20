package UserSort.Utils;

import UserSort.Model.*;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class PersonListGenerator {
    public static List<Person> getPersonList() {

        List<Person> Persons = new ArrayList<Person>();

        String[] firstNames = {"Ilya", "Ivan", "Michael", "Petr", "George", "Fedor", "Dmitry", "Alex"};
        String[] lastNames = {"Petrov", "Ivanov", "Sidorov", "Starodubcev", "Morin", "Kuchuk", "Smirnov"};
        String[] nationalities = {"Russian", "French", "Belarus", "Italy", "German"};

        int x = getRandomNumberUsingNextInt(5, 10);

        for (int i = 0; i < x; i++) {
            Persons.add(new Person(getRandomNumberUsingNextInt(10, 150),
                    firstNames[getRandomNumberUsingNextInt(0, 7)],
                    lastNames[getRandomNumberUsingNextInt(0, 6)],
                    getRandomNumberUsingNextInt(1, 99),
                    nationalities[getRandomNumberUsingNextInt(0, 4)]));
        }

        return Persons;
    }
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
