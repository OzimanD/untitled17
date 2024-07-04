package AnnaP.June18;

public class Student {
    private String surname;
    private String group;
    private int phyNote;
    private int InfNote;

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", phyNote=" + phyNote +
                ", InfNote=" + InfNote +
                ", HisNote=" + HisNote +
                '}';
    }

    public Student(String surname, String group, int phyNote, int infNote, int hisNote) {
        this.surname = surname;
        this.group = group;
        this.phyNote = phyNote;
        InfNote = infNote;
        HisNote = hisNote;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getPhyNote() {
        return phyNote;
    }

    public void setPhyNote(int phyNote) {
        this.phyNote = phyNote;
    }

    public int getInfNote() {
        return InfNote;
    }

    public void setInfNote(int infNote) {
        InfNote = infNote;
    }

    public int getHisNote() {
        return HisNote;
    }

    public void setHisNote(int hisNote) {
        HisNote = hisNote;
    }

    private int HisNote;

}


//    Фамилия
//            Группа
//    Физика
//            Информ
//История