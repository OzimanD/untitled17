package AnnaP.HomeWork5List;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private String name;
    private LocalDate birthDate;
    private int[] ses;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", ses=" + Arrays.toString(ses) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int[] getSes() {
        return ses;
    }

    public void setSes(int[] ses) {
        this.ses = ses;
    }

    public Group(String name, LocalDate birthDate, int[] ses) {
        this.name = name;
        this.birthDate = birthDate;
        this.ses = ses;
    }


}


//    Описать структуру с именем GROUP, содержащую поля: Name –
//        фамилия и инициалы, DAT – дата рождения (год, месяц, число), SES
//        – успеваемость (массив из трех элементов).
//        Написать программу, выполняющую:
//         ввод с клавиатуры данных в массив GR5,состоящий из 10 структур
//        типа GROUP;
//         вывод на экран записей, упорядоченных по возрастанию поля SES;
//         вывод списка студентов, возраст которых на 01.12.2010 года не
//        превышает 20 лет;
//         если таких студентов нет – выдать сообщение.