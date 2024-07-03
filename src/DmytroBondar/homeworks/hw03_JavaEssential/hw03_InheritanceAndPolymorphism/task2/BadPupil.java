package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task2;

public class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Bad pupil is studying bad");
    }

    @Override
    public void read() {
        System.out.println("Bad pupil is reading bad");
    }

    @Override
    public void write() {
        System.out.println("Bad pupil is writing bad");
    }

    @Override
    public void relax() {
        System.out.println("Bad pupil is relaxing bad");
    }
}
