package AnnaP.July4;

public class Workers {
    private String name;
    private String sureName;
    private String fathersName;
    private String workType;
    private int year;
    private String sex;

    public Workers(String name, String sureName, String fathersName, String workType, int year, String sex) {
        this.name = name;
        this.sureName = sureName;
        this.fathersName = fathersName;
        this.workType = workType;
        this.year = year;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", workType='" + workType + '\'' +
                ", year=" + year +
                ", sex='" + sex + '\'' +
                '}';
    }
}


//    Фамилия
//            Имя
//    Отчество
//            Пол
//Должность
//        Дата рождения
//
//        Вывести данные об инженерах, пенсионно-
//        го возраста (мужчинам больше 65-ти лет,
//
//        женщинам 60).
