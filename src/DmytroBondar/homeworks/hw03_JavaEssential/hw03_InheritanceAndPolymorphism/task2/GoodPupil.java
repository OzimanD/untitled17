package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task2;

public class GoodPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Good pupil is studying good");
    }

    @Override
    public void read() {
        System.out.println("Good pupil is reading good");
    }

    @Override
    public void write() {
        System.out.println("Good pupil is writing good");
    }

    @Override
    public void relax() {
        System.out.println("Good pupil is relaxing good");
    }
}
