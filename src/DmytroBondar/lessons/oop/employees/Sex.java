package DmytroBondar.lessons.oop.employees;

public enum Sex {
    FEMALE("Female"),
    MALE("Male");

    private final String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
