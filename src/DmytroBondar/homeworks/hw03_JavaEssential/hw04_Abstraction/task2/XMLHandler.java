package DmytroBondar.homeworks.hw03_JavaEssential.hw04_Abstraction.task2;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("XML file is opened");
    }

    @Override
    public void create() {
        System.out.println("XML file is created");
    }

    @Override
    public void change() {
        System.out.println("XML file is changed");
    }

    @Override
    public void save() {
        System.out.println("XML file is saved");
    }
}
