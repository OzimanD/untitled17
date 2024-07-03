package DmytroBondar.homeworks.hw03_JavaEssential.hw07_Exceptions.task2;

public class Worker {
    private String lastNameAndInitials;
    private String jobTitle;
    private int yearOfEmployment;

    public Worker(String lastNameAndInitials, String jobTitle, int yearOfEmployment) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.jobTitle = jobTitle;
        this.yearOfEmployment = yearOfEmployment;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lastNameAndInitials='" + lastNameAndInitials + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", yearOfEmployment=" + yearOfEmployment +
                '}';
    }
}
