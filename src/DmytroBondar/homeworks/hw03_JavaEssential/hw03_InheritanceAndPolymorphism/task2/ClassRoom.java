package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task2;

public class ClassRoom {
    private Pupil pupil1;
    private Pupil pupil2;
    private Pupil pupil3;
    private Pupil pupil4;

    ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
    }

    ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this(pupil1, pupil2);
        this.pupil3 = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this(pupil1, pupil2, pupil3);
        this.pupil4 = pupil4;
    }

    public static void main(String[] args) {
        Pupil pupil1 = new ExcellentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3);
        classRoom.pupil1.study();
        classRoom.pupil1.read();
        classRoom.pupil1.write();
        classRoom.pupil1.relax();
        classRoom.pupil2.study();
        classRoom.pupil2.read();
        classRoom.pupil2.write();
        classRoom.pupil2.relax();
        classRoom.pupil3.study();
        classRoom.pupil3.read();
        classRoom.pupil3.write();
        classRoom.pupil3.relax();
    }
}
