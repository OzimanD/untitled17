package DmytroBondar.homeworks.hw03_JavaEssential.hw03_InheritanceAndPolymorphism.task4;

public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument() {
        System.out.println("Document is edited");
    }

    @Override
    public void saveDocument() {
        System.out.println("Document is saved in old format, saving in other formats is available in Expert version");
    }
}
