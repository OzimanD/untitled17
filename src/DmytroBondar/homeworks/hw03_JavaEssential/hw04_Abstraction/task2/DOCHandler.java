package DmytroBondar.homeworks.hw03_JavaEssential.hw04_Abstraction.task2;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("DOC file is opened");
    }

    @Override
    public void create() {
        System.out.println("DOC file is created");
    }

    @Override
    public void change() {
        System.out.println("DOC file is changed");
    }

    @Override
    public void save() {
        System.out.println("DOC file is saved");
    }
}
