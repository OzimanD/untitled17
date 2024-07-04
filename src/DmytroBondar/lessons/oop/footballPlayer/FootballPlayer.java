package DmytroBondar.lessons.oop.footballPlayer;

/*
Поля структуры

Фамилия
Амплуа
Возраст
Количество игр
Количество голов

Задача
Определить лучшего форварда, и вывести сведения о футболистах, сыгравших менее 5-ти игр.
*/
public class FootballPlayer {
    private String lastName;
    private String role;
    private int age;
    private int gamesCount;
    private int goalsCount;

    public FootballPlayer(){}

    public FootballPlayer(String lastName, String role, int age, int gamesCount, int goalsCount) {
        this.lastName = lastName;
        this.role = role;
        this.age = age;
        this.gamesCount = gamesCount;
        this.goalsCount = goalsCount;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    public int getGamesCount() {
        return gamesCount;
    }

    public int getGoalsCount() {
        return goalsCount;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", gamesCount=" + gamesCount +
                ", goalsCount=" + goalsCount +
                '}';
    }
}