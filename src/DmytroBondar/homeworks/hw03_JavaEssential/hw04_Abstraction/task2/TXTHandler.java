package DmytroBondar.homeworks.hw03_JavaEssential.hw04_Abstraction.task2;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("TXT file is opened");
    }

    @Override
    public void create() {
        System.out.println("TXT file is created");
    }

    @Override
    public void change() {
        System.out.println("TXT file is changed");
    }

    @Override
    public void save() {
        System.out.println("TXT file is saved");
    }
}
