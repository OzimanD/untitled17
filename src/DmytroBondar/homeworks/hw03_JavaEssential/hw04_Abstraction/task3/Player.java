package DmytroBondar.homeworks.hw03_JavaEssential.hw04_Abstraction.task3;

public class Player implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void record() {
        System.out.println("Recording");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}
