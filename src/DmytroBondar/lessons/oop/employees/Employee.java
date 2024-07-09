package DmytroBondar.lessons.oop.employees;

import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private Sex sex;
    private Position position;
    private LocalDate birthDate;

    public Employee(String firstName, String lastName, Sex sex, Position position, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.position = position;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public Position getPosition() {
        return position;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("firstName=%s, lastName=%s, sex=%s, position=%s, birthDate=%s", firstName, lastName, sex.getSex(), position.getPosition(), birthDate);
    }
}
