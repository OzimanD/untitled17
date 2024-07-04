package DmytroBondar.homeworks.hw03_JavaEssential.hw04_Abstraction.task2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler xmlHandler = new XMLHandler();
        AbstractHandler txtHandler = new TXTHandler();
        AbstractHandler docHandler = new DOCHandler();

        AbstractHandler[] handlers = {xmlHandler, txtHandler, docHandler};

        for (AbstractHandler handler : handlers) {
            handler.open();
            handler.create();
            handler.change();
            handler.save();
            System.out.println();
        }
    }
}
