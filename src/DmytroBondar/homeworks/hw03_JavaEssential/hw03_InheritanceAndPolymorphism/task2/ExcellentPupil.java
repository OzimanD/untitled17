package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task2;

public class ExcellentPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Excellent pupil is studying excellent");
    }

    @Override
    public void read() {
        System.out.println("Excellent pupil is reading excellent");
    }

    @Override
    public void write() {
        System.out.println("Excellent pupil is writing excellent");
    }

    @Override
    public void relax() {
        System.out.println("Excellent pupil is relaxing excellent");
    }
}
