package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("Document is saved in new format");
    }
}
