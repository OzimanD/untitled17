package AnnaP.OOPlesson3;

public class Student {
    private String surname;
    private String group;
    private int markPh;
    private int markInf;
    private int hist;

    public Student(String surname, String group, int markPh, int markInf, int hist) {
        this.surname = surname;
        this.group = group;
        this.markPh = markPh;
        this.markInf = markInf;
        this.hist = hist;
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

    public int getMarkPh() {
        return markPh;
    }

    public void setMarkPh(int markPh) {
        this.markPh = markPh;
    }

    public int getMarkInf() {
        return markInf;
    }

    public void setMarkInf(int markInf) {
        this.markInf = markInf;
    }

    public int getHist() {
        return hist;
    }

    public void setHist(int hist) {
        this.hist = hist;
    }
}
