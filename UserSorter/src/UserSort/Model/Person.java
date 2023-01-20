package UserSort.Model;

import java.util.Objects;

public final class Person {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;

    public Person(long id, String firstName, String lastName, int age, String nationality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
    }
    public Person() {

    }

    public void setID(long id) {
        this.id = id;
    }
    public long getID() {
        return id;
    }

    public void setFirstName(String firstName) {
        boolean hasDigits = false;
        for(int i = 0; i < firstName.length() && !hasDigits; i++) {
            if(Character.isDigit(firstName.charAt(i))) {
                hasDigits = true;
            }
        }
        if(hasDigits == true) {
            System.out.println("Ошибка! Имя не может содержать цифры");
        } else {
            this.firstName = firstName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        boolean hasDigits = false;
        for(int i = 0; i < lastName.length() && !hasDigits; i++) {
            if(Character.isDigit(lastName.charAt(i))) {
                hasDigits = true;
            }
        }
        if(hasDigits == true) {
            System.out.println("Ошибка! Фамилия не может содержать цифры");
        } else {
            this.lastName = lastName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public long getAge() {
        return age;
    }

    public void setNationality(String nationality) {
        boolean hasDigits = false;
        for(int i = 0; i < nationality.length() && !hasDigits; i++) {
            if(Character.isDigit(nationality.charAt(i))) {
                hasDigits = true;
            }
        }
        if(hasDigits == true) {
            System.out.println("Ошибка! Национальность не может содержать цифры");
        } else {
            this.nationality = nationality;
        }
    }

    public String getNationality() {
        return nationality;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && getAge() == person.getAge() && getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName()) && getNationality().equals(person.getNationality());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getFirstName(), getLastName(), getAge(), getNationality());
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + nationality + " " + id;
    }
}
