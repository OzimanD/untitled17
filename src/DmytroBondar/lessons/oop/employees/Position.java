package DmytroBondar.lessons.oop.employees;

public enum Position {
    BUSINESS_ANALYST("Business Analyst"),
    SOFTWARE_ENGINEER("Software Engineer"),
    QA_ENGINEER("QA Engineer"),
    MANAGER("Manager"),
    HR("HR"),
    ACCOUNTANT("Accountant");

    private final String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
